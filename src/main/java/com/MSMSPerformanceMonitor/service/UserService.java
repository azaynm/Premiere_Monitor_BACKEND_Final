package com.MSMSPerformanceMonitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.MSMSPerformanceMonitor.esms_realtime.repository.SMSRealtimeQueueRepository;
import com.MSMSPerformanceMonitor.user.model.User;
import com.MSMSPerformanceMonitor.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepository;

	public List<Object[]> fetchAllUsers() {
		return userRepository.fetchAllUsers();
	}
	
	public User checkUser(String username, String password) {
		return userRepository.checkUser(username, password);
	}
	
	public User fetchRole(String username) {
		return userRepository.fetchRole(username);
	}
}
