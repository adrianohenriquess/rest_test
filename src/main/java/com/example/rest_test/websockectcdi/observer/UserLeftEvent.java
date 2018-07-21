package com.example.rest_test.websockectcdi.observer;

import javax.inject.*;

public class UserLeftEvent extends ChatEvent {

    @Inject
    public UserLeftEvent(User user) {
        super(user);
    }
}
