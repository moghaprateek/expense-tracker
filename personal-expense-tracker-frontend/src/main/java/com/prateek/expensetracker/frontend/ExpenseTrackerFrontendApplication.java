package com.prateek.expensetracker.frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point of the Thymeleaf frontend. It never touches a database;
 * all data comes from the backend over HTTP.
 */
@SpringBootApplication
public class ExpenseTrackerFrontendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpenseTrackerFrontendApplication.class, args);
    }
}
