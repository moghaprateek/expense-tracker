package com.prateek.expensetracker.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Smoke test: the whole Spring context (web + JPA + H2) must start.
 * If this fails, dependency or configuration setup is wrong. Nothing else matters yet.
 */
@SpringBootTest
class ExpenseTrackerBackendApplicationTests {

    @Test
    void contextLoads() {
        // Intentionally empty: a failure here means the application context did not start.
    }
}
