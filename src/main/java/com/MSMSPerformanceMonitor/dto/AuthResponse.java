package com.MSMSPerformanceMonitor.dto;

public class AuthResponse {
	private String token;
	private boolean message;
	public AuthResponse() {
		
	}
	public AuthResponse(String token, boolean message) {
		this.token = token;
		this.message = message;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public boolean getMessage() {
		return message;
	}
	public void setMessage(boolean message) {
		this.message = message;
	}
	
	
}
