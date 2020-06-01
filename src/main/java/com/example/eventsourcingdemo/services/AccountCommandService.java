package com.example.eventsourcingdemo.services;

import com.example.eventsourcingdemo.dto.AccountCreateDTO;
import com.example.eventsourcingdemo.dto.MoneyCreditDTO;
import com.example.eventsourcingdemo.dto.MoneyDebitDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {

    public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}
