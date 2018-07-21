package com.example.rest_test.websockectcdi.observer;

public class UserSignoffMessage extends BasicMessage {

	public UserSignoffMessage(String username) {
		super(SIGNOFF_REQUEST, username);
	}
	
	public String getUsername() {
        return super.getData();
    }
	

}