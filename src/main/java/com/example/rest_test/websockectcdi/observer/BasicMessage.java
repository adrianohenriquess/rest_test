package com.example.rest_test.websockectcdi.observer;

abstract class BasicMessage extends ChatMessage {
	
	protected String dataString;

	protected BasicMessage(String type, String dataString) {
		super(type);
		this.dataString = dataString;
	}
	
	String getData() {
		return this.dataString;
	}

}
