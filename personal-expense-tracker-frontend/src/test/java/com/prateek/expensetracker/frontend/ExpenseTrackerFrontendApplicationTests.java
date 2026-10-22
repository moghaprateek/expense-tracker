package com.prateek.expensetracker.frontend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Smoke test: the frontend context (web + Thymeleaf + RestClient) must start
 * without the backend running.
 */
@SpringBootTest
class ExpenseTrackerFrontendApplicationTests {

    @Test
    void contextLoads() {
        // Intentionally empty: a failure here means the application context did not start.
    }
}
