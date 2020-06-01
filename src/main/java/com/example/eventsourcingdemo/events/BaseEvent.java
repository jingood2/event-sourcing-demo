package com.example.eventsourcingdemo.events;

import org.axonframework.commandhandling.model.AggregateIdentifier;

public class BaseEvent<T> {

    @AggregateIdentifier
    public final T id;

    public BaseEvent(T id) {
        this.id = id;
    }
}
