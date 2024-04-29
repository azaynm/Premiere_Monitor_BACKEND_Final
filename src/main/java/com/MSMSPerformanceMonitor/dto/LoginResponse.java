package com.MSMSPerformanceMonitor.dto;

public class LoginResponse {
	  private String refreshToken;
	  
	public LoginResponse() {
	}

	public LoginResponse(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	
	}
