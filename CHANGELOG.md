# Changelog

All notable changes to this project are documented here.
Format: [Keep a Changelog](https://keepachangelog.com/en/1.1.0/). Versions follow the phase tags in `docs/git-workflow.md`.
Entries are appended; history is not rewritten.

## [Unreleased]

### Added
- Phase 0 skeleton: backend (port 8081) and frontend (port 8082) Maven projects on Spring Boot 4.1.1, release 17.
- Smoke tests (`contextLoads`) for both applications.
- Documentation set: README, CONTRIBUTING, architecture, roadmap, dependency compatibility, TDD guide, Git workflow, time estimates.

### Notes
- Status: **skeleton not yet verified locally.** It becomes `0.1.0-skeleton` only after `./mvnw verify` passes in both projects (output shared and reviewed).
