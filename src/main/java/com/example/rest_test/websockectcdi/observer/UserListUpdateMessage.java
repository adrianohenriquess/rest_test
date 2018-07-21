package com.example.rest_test.websockectcdi.observer;

import java.util.List;

public class UserListUpdateMessage extends StructuredMessage {

	public UserListUpdateMessage(List<String> usernames) {
		super(ChatMessage.USERLIST_UPDATE, usernames);
	}
	
	public List<String> getUserList() {
		return this.dataList;
	}

}
