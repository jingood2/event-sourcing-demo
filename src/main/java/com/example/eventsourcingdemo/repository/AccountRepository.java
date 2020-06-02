package com.example.eventsourcingdemo.repository;

import com.example.eventsourcingdemo.entities.AccountQueryEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountQueryEntity,String> {
}
