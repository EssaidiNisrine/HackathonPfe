package com.pfe.HackathonBackend.dto;


public class RequestCompte {

    private String username;
    private String password;
	
	public RequestCompte() {
		// TODO Auto-generated constructor stub
	}

	public RequestCompte(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
