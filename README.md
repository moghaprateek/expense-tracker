# Personal Expense Tracker

A two-application learning project: a REST + JPA **backend** and a Thymeleaf **frontend**, built with strict TDD and evolved through three Java stages (Java 8 style → Java 17 → Java 21).

**Current phase:** Phase 0, skeleton (unverified until you run the checks below).

| Part | Port | Tech |
|---|---|---|
| `personal-expense-tracker-backend` | 8081 | Spring Boot 4.1.1, Spring MVC, Spring Data JPA (Hibernate), H2 (PostgreSQL later) |
| `personal-expense-tracker-frontend` | 8082 | Spring Boot 4.1.1, Thymeleaf, `RestClient`. No database access. |

## Prerequisites

- **JDK 21** (an LTS). Phase 1 compiles with `maven.compiler.release` 17, so you get Java 17's API surface and Java 8-style source.
- **Maven** only once, to generate the wrapper. After that use `./mvnw`.
- Git.

Check your machine: `./scripts/check-env.sh`

macOS install (if missing): `brew install --cask temurin@21` and `brew install maven`.

## One-time setup: Maven Wrapper

Run in **each** project directory (wrapper files are then committed):

```bash
cd personal-expense-tracker-backend  && mvn -N wrapper:wrapper && cd ..
cd personal-expense-tracker-frontend && mvn -N wrapper:wrapper && cd ..
```

Record the wrapper's Maven version: `cat personal-expense-tracker-backend/.mvn/wrapper/maven-wrapper.properties`.
Boot 4.1 needs Maven 3.6.3 or later.

## Build and test

```bash
cd personal-expense-tracker-backend  && ./mvnw verify
cd personal-expense-tracker-frontend && ./mvnw verify
```

## Run (two terminals)

```bash
./scripts/run-backend.sh      # http://localhost:8081  (H2 console: /h2-console)
./scripts/run-frontend.sh     # http://localhost:8082
```

The frontend starts even if the backend is down. Friendly error handling arrives with Feature D.

## Database

H2 in-memory for Phase 1 (`ddl-auto: create-drop`). A PostgreSQL profile is a later optional exercise (`docs/h2-to-postgresql.md`).

## API reference

Defined feature by feature in `docs/api-contract.md`, before each endpoint is implemented.

## Troubleshooting

- **`release version 17 not supported`**: your JDK is older than 17. Use JDK 21.
- **Artifact not found when resolving a `spring-boot-starter-*` dependency**: copy the full error and share it. Boot 4 renamed several starters and I verified names from the migration guide only. Do not guess replacements.
- **Port already in use**: `lsof -i :8081` (or 8082), stop the other process.
- **Mockito warning about dynamic agent loading on JDK 21**: a warning, not a failure. We will deal with it when it matters.

## Documentation

`docs/`: architecture, project-roadmap, dependency-compatibility, tdd-guide, git-workflow, time-estimates (written); api-contract, java8-style-baseline, java17-migration, java21-migration, h2-to-postgresql, interview-questions (created when their topic starts). See also `CHANGELOG.md` and `CONTRIBUTING.md`.
