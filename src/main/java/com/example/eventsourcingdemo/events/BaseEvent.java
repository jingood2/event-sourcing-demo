package com.example.eventsourcingdemo.events;

import org.axonframework.modelling.command.AggregateIdentifier;

public class BaseEvent<T> {

    @AggregateIdentifier
    public final T id;

    public BaseEvent(T id) {
        this.id = id;
    }
}
