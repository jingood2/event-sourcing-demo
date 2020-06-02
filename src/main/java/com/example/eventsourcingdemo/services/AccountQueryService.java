package com.example.eventsourcingdemo.services;

import com.example.eventsourcingdemo.entities.AccountQueryEntity;

import java.util.List;

public interface AccountQueryService {

    public List<Object> listEventsForAccount(String accountNumber);
    public AccountQueryEntity getAccount(String accountNumber);

}
