# Contributing (solo learning project)

1. One task = one branch: `feature/<feature>-<task>` (example: `feature/expense-create-endpoint`).
2. Red → Green → Refactor. Write the failing test first, see it fail for the right reason, then implement.
3. Commit messages use Conventional Commits: `feat(expense): add create endpoint`, `test(budget): cover near-limit threshold`, `docs: update api-contract`, `chore: bump dependency`.
4. Before merging to `main`: `./mvnw verify` passes in the project(s) you touched, README/CHANGELOG/docs updated.
5. Bug fix = regression test first, then the fix.
6. Never commit: build output, IDE files, local databases, secrets.
7. Tags mark phase checkpoints only (see `docs/git-workflow.md`).
