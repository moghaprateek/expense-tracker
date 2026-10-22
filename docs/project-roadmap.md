# Project Roadmap

| Phase | Content | Tag (suggested, not yet created) |
|---|---|---|
| 0 Skeleton | poms, wrapper, apps start, smoke tests, docs | `v0.1.0-skeleton` |
| 1 Java 8 style | A Expense CRUD · B Monthly summary · C Budget · D Thymeleaf UI · E Transactions/persistence | `v1.0.0-java8-style` |
| 2 Java 17 | explicit release 17; records, text blocks, pattern `instanceof`, switch expressions where they help; migration report | `v2.0.0-java17` |
| 3 Java 21 | sealed `BudgetStatus` vs enum, pattern switch, sequenced collections, virtual threads as a measured experiment | `v3.0.0-java21` |
| Optional | H2 → PostgreSQL (driver, Flyway, Testcontainers if Docker available) | `v3.1.0-postgresql` |

## Phase 1 exit criteria

All features work; tests pass; both apps start independently; API documented; README and CHANGELOG updated; committed; checkpoint review.

## Phase 1 source restrictions

No `var`, records, sealed types, pattern-matching switch, sequenced collections, virtual threads, text blocks.
