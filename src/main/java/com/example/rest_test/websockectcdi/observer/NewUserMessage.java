package com.example.rest_test.websockectcdi.observer;

public class NewUserMessage extends BasicMessage {

	public NewUserMessage(String username) {
		super(USERNAME_MESSAGE, username);
	}
	
	public String getUsername() {
		return super.getData();
	}

}
