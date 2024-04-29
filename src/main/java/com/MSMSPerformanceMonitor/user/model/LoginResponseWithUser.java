package com.MSMSPerformanceMonitor.user.model;

import com.MSMSPerformanceMonitor.dto.LoginResponse;

public class LoginResponseWithUser {
    private User user;
    private LoginResponse loginDetails;
    
    public LoginResponseWithUser() {
    	
    }

    public LoginResponseWithUser(User user, LoginResponse loginDetails) {
        this.user = user;
        this.loginDetails = loginDetails;
    }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LoginResponse getLoginDetails() {
		return loginDetails;
	}

	public void setLoginDetails(LoginResponse loginDetails) {
		this.loginDetails = loginDetails;
	}

    
}
