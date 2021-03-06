package com.example.eventsourcingdemo.events;

import com.example.eventsourcingdemo.enums.Status;

public class AccountActivatedEvent extends BaseEvent<String> {

    public final Status status;

    public AccountActivatedEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
