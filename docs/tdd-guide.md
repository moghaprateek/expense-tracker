# TDD Guide

## The cycle for every task

Red (write a failing test, see it fail for the **right** reason) → Green (smallest code that passes) → Refactor (clean up, rerun).

## The 12 steps per task

1 requirement · 2 concept · 3 files · 4 test first · 5 expected failure · 6 minimal code · 7 run command · 8 expected result · 9 refactor · 10 rerun · 11 edge cases and alternatives · 12 interview question.

## Test layers

| Layer | Tool | Starts Spring? | Use for |
|---|---|---|---|
| Unit | JUnit 5, AssertJ, Mockito | No | domain rules, calculators, budget checker |
| Web slice | `@WebMvcTest` + MockMvc | Web only | status codes, validation, JSON shape, error handling |
| Repository | `@DataJpaTest` | JPA only | queries, JPQL aggregation |
| Integration | `@SpringBootTest` | Everything | wiring, transactions, end-to-end in one JVM |
| Frontend client | `MockRestServiceServer` | Minimal | `ExpenseApiClient` against fake backend responses |
| End to end | manual checklist | Both apps | final check across both applications |

Annotation names and packages for Boot 4 slice tests are confirmed on first use against real compiler output.

## Rules

- Do not mock everything. Pure logic uses real objects.
- A bug fix starts with a failing regression test.
- A test is "passed" only when it was run and the output seen.
