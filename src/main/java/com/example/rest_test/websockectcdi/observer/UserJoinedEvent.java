package com.example.rest_test.websockectcdi.observer;

import javax.inject.Inject;

public class UserJoinedEvent extends ChatEvent {

    @Inject
    public UserJoinedEvent(User user) {
        super(user);
    }
}
