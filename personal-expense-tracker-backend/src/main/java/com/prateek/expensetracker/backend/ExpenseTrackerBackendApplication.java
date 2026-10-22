package com.prateek.expensetracker.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point of the backend. Java 8-style source on purpose (Phase 1):
 * no var, records, text blocks or pattern matching.
 */
@SpringBootApplication
public class ExpenseTrackerBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpenseTrackerBackendApplication.class, args);
    }
}
