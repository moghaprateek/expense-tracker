# Git Workflow

- Branches: `main` plus short-lived `feature/<feature>-<task>`.
- Commits: Conventional Commits.
- Tags (suggestions): `v0.1.0-skeleton`, `v1.0.0-java8-style`, `v2.0.0-java17`, `v3.0.0-java21`, optional `v3.1.0-postgresql`.
- A tag is created only after `./mvnw verify` passes in both projects and CHANGELOG is updated.

## Phase 0 commands

```bash
cd personal-expense-tracker
git init -b main
git add .
git status                      # expect: no target/, no IDE files
git commit -m "chore: add Phase 0 project skeleton"
# only after both ./mvnw verify runs pass:
git tag v0.1.0-skeleton
```

Pushing to GitHub is done by you (`git remote add origin ...`, `git push -u origin main --tags`). I do not have access to your GitHub.
