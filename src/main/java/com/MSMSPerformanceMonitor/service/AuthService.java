package com.MSMSPerformanceMonitor.service;

import java.util.Date;
import java.util.List;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.MSMSPerformanceMonitor.dto.AuthResponse;
import com.MSMSPerformanceMonitor.dto.LoginResponse;
import com.MSMSPerformanceMonitor.user.model.LoginResponseWithUser;
import com.MSMSPerformanceMonitor.user.model.RefreshToken;
import com.MSMSPerformanceMonitor.user.model.User;
import com.MSMSPerformanceMonitor.user.repository.RefreshTokenRepository;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Service
public class AuthService {

	@Autowired
	RefreshTokenRepository refreshTokenRepository;
	
	@Autowired
	UserService userService;
	

	
	private static final String SECRET_KEY = "secret";
	SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
	
	public ResponseEntity<LoginResponseWithUser> login(String username, String password) {
		
		User user = userService.checkUser(username, password);
		if (user != null) {
		    if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
		        Date now = new Date();
		        Date expiration = new Date(now.getTime() + 3600000);

		        String token = Jwts.builder()
		                .setSubject(username)
		                .setIssuedAt(now)
		                .setExpiration(expiration)
		                .signWith(SignatureAlgorithm.HS256, key)
		                .compact();

		        RefreshToken refreshToken = new RefreshToken(username, token);
		        refreshTokenRepository.save(refreshToken);

		        LoginResponse loginDetails = new LoginResponse(token);
		        LoginResponseWithUser responseWithUser = new LoginResponseWithUser(user, loginDetails);

		        return ResponseEntity.ok(responseWithUser);
		    } else {
		        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		    }
		} else {
		    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}

		  
		}

	public List<RefreshToken> getAllTokens() {
		return refreshTokenRepository.findAllRefreshToken();
	}
	
	public RefreshToken addToken(String username, String token) {
		return refreshTokenRepository.save(new RefreshToken(username, token));
		
	}

	public ResponseEntity<AuthResponse> checkLogin(String token) {
		String validationResponse = refreshTokenRepository.validate(token);
		
		boolean isValid = validationResponse != null && !validationResponse.isEmpty();
		if (isValid) {
	        AuthResponse loginResponse = new AuthResponse(token, true);
	        return ResponseEntity.ok(loginResponse);
	    } else {
	    	AuthResponse loginResponse = new AuthResponse(null, false);
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(loginResponse);
	    }
	}
	
	public void logout(String token) {
		refreshTokenRepository.logout(token);
	}
	
	public User fetchRole(String username){
		return userService.fetchRole(username);
	}
	
	


	

}
