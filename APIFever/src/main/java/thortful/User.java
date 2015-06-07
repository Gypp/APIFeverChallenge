package main.java.thortful;

import java.util.Arrays;

public class User {
	private String username;
	private String hobby;

	public User(String theUsername, String theHobby){
		this.username = theUsername;
		this.hobby = theHobby;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	
	
}
