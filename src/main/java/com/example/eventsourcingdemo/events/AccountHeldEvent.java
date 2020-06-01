package com.example.eventsourcingdemo.events;

import com.example.eventsourcingdemo.enums.Status;

public class AccountHeldEvent extends BaseEvent<String> {

    public final Status status;

    public AccountHeldEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
