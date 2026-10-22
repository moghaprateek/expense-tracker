# Architecture

```
Browser ──HTTP──> Frontend (8082, Thymeleaf) ──HTTP/JSON──> Backend (8081, REST) ──JPA──> H2 (PostgreSQL later)
```

- The frontend has **no database access**. It only calls the backend through `ExpenseApiClient`.
- The backend returns DTOs, never JPA entities.
- Packaged by feature, not by technical layer.

## Planned structure (Phase 1)

Backend base package `com.prateek.expensetracker.backend`:
`expense/`, `summary/`, `budget/`, `error/`.
Frontend base package `com.prateek.expensetracker.frontend`:
`client/`, `web/`, `dto/`, templates under `resources/templates`.

## File register

| File | Responsibility | Why it exists | Used by | Tests | Changes in migration |
|---|---|---|---|---|---|
| backend `pom.xml` | dependencies, Java release | single place for versions | build | `mvnw verify` | release 17 → 21 (Phase 3) |
| `ExpenseTrackerBackendApplication` | start Spring | entry point | JVM | `contextLoads` | none |
| backend `application.yml` | port 8081, H2, JPA | configuration separate from code | Spring | `contextLoads` | + PostgreSQL profile |
| frontend `pom.xml` | dependencies, Java release | same | build | `mvnw verify` | release 17 → 21 |
| `ExpenseTrackerFrontendApplication` | start Spring | entry point | JVM | `contextLoads` | none |
| frontend `application.yml` | port 8082, backend URL | change URL without recompiling | `ExpenseApiClient` | `contextLoads` | none |

New files are added to this table as each feature lands, with responsibility, dependents, covering tests and migration impact.

## Rules

- Constructor injection only.
- `@Primary` / `@Qualifier` only if two beans of one type are genuinely needed (the budget checkers, Feature C).
- Money is `BigDecimal`. Never `double`.
- No abstraction unless a second use exists today.
