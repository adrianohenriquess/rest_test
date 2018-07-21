package com.example.rest_test.websockectcdi.observer;

import java.util.Date;

public class ChatEvent {

    User user;
    Date timestamp;

    public ChatEvent(User user) {
        this.user = user;
        this.timestamp = new Date();
    }

    public User getUser() {
        return this.user;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }
}
