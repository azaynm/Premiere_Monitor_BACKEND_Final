package com.MSMSPerformanceMonitor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MSMSPerformanceMonitor.esms_realtime.model.SMSRealtimeQueueModel;
import com.MSMSPerformanceMonitor.service.SMSRealtimeQueueService;
import com.MSMSPerformanceMonitor.service.UserService;
import com.MSMSPerformanceMonitor.user.model.User;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
    private UserService userService;
	
	@GetMapping("/fetch-all-users")
    public ResponseEntity<List<Object[]>> getAllUsers() {
    	
        List<Object[]> queueData = userService.fetchAllUsers();
        return ResponseEntity.ok().body(queueData);
    }
	
	
	@GetMapping("/check-user")
    public ResponseEntity<User> getAllBulkSms(@RequestParam("username") String username, @RequestParam("password") String password) {
    	
        User queueData = userService.checkUser(username, password);
        return ResponseEntity.ok().body(queueData);
    }
}
