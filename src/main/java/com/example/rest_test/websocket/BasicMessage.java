package com.example.rest_test.websocket;

abstract class BasicMessage extends ChatMessage {
    protected String dataString;

    BasicMessage(String type, String dataString) {
        super(type);
        this.dataString = dataString;
    }

    String getData() {
        return this.dataString;
    }
    
}
