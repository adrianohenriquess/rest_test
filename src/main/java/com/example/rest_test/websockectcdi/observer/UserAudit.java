package com.example.rest_test.websockectcdi.observer;

import java.text.SimpleDateFormat;
import javax.enterprise.event.*;
import java.util.*;

public class UserAudit {

    void userJoined(@Observes UserJoinedEvent e) {
        System.out.println(e.getUser().getName() + " joined the chat at " + this.format(e.getTimestamp()));
    }

    void userLeft(@Observes UserLeftEvent e) {
        System.out.println(e.getUser().getName() + " left the chat at " + this.format(e.getTimestamp()));
    }

    String format(Date d) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss z");
        String formatted = sdf.format(d);
        return formatted;
    }

}
