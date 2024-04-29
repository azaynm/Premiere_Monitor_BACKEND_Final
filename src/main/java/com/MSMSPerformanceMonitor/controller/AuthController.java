package com.MSMSPerformanceMonitor.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.MSMSPerformanceMonitor.dto.AuthResponse;
import com.MSMSPerformanceMonitor.dto.LoginRequest;
import com.MSMSPerformanceMonitor.dto.LoginResponse;
import com.MSMSPerformanceMonitor.service.AuthService;
import com.MSMSPerformanceMonitor.user.model.LoginResponseWithUser;
import com.MSMSPerformanceMonitor.user.model.RefreshToken;
import com.MSMSPerformanceMonitor.user.model.User;


@Controller
public class AuthController {
	 	@Autowired
	    private AuthService authService;
	 	
	 	@PostMapping("/auth/token/addToken")
	    public ResponseEntity<RefreshToken> addToken(@RequestParam("username") String username, @RequestParam("password") String password) {
	 		RefreshToken token = authService.addToken(username, password);
	        return ResponseEntity.ok().body(token);
	    }
	 	
	 	@PostMapping("/auth/checkLogin")
	    public ResponseEntity<AuthResponse> checkLogin(@RequestBody AuthResponse authResponse) {
	 		String token = authResponse.getToken();
	        return authService.checkLogin(token);
	    }
	 	
	 	@DeleteMapping("/{token}")
	    public ResponseEntity<String> deleteRefreshToken(@PathVariable("token") String token) {
	        authService.logout(token);
	        return ResponseEntity.ok("Refresh token deleted successfully");
	    }
	 	

	    @PostMapping("/auth/login")
	    public ResponseEntity<LoginResponseWithUser> checkLogin(@RequestBody LoginRequest loginRequest) {
	    	String username = loginRequest.getUsername();
	        String password = loginRequest.getPassword();
	        return authService.login(username, password);
	    }
	    
	    @GetMapping("/fetchTokens")
	    public ResponseEntity<List<RefreshToken>> getAllTokens() {
	    	
	        List<RefreshToken> tokens = authService.getAllTokens();
	        return ResponseEntity.ok().body(tokens);
	    }
	    
	    @GetMapping("/fetchRole")
	    public ResponseEntity<User> fetchRole(@RequestParam("username") String username){
	    	User user = authService.fetchRole(username);
	    	return ResponseEntity.ok().body(user);
	    }
	    
	
	    
	    
	    
	    
	    
	}


	
