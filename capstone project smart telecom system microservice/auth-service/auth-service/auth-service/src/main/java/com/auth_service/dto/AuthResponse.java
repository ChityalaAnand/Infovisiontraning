package com.auth_service.dto;


public class AuthResponse {
	 private String token;
	    private String role;
		public String getToken() {
			return token;
		}
		public void setToken(String token) {
			this.token = token;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public AuthResponse(String token, String role) {
			super();
			this.token = token;
			this.role = role;
		}
	    public AuthResponse() {} 
	    
	  
	

	
}  