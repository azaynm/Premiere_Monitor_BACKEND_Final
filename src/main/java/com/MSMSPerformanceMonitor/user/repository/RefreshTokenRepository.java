package com.MSMSPerformanceMonitor.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.MSMSPerformanceMonitor.user.model.RefreshToken;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface RefreshTokenRepository extends CrudRepository<RefreshToken, Long> {
    @Query(value = "SELECT * FROM refresh_token", nativeQuery = true)
    List<RefreshToken> findAllRefreshToken();
    
    @Query(value = "SELECT * FROM refresh_token WHERE token = :token", nativeQuery = true)
    List<RefreshToken> checkTokenExist(@Param("token") String token);

	
	@Query(value = "SELECT * FROM refresh_token WHERE token = :token", nativeQuery = true)
    String validate(@Param("token") String token);
	
	void deleteByToken(String token);
	

	@Modifying
	@Query(value = "DELETE FROM refresh_token WHERE token LIKE :token", nativeQuery = true)
	void logout(@Param("token") String token);



}

