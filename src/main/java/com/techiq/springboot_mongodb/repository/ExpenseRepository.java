package com.techiq.springboot_mongodb.repository;

import com.techiq.springboot_mongodb.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface ExpenseRepository extends MongoRepository<Expense, String> {

    @Query("{'name': ?0}")
    Optional<Expense> findByName(String name);
}
