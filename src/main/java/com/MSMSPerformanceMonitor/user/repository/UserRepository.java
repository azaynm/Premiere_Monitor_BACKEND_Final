package com.MSMSPerformanceMonitor.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.MSMSPerformanceMonitor.user.model.RefreshToken;
import com.MSMSPerformanceMonitor.user.model.User;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query(value = "SELECT username, role FROM user_table", nativeQuery = true)
    List<Object[]> fetchAllUsers();
    
    @Query(value = "SELECT * FROM user_table WHERE username = :username AND password = :password", nativeQuery = true)
    User checkUser(@Param("username") String username, @Param("password") String password);
    
    @Query(value = "SELECT * FROM user_table WHERE username = :username", nativeQuery = true)
    User fetchRole(@Param("username") String username);

}


