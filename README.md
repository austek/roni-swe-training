# Roni SWE Training

A private mentorship repo for Roni's software-engineering practice, aimed at internship /
placement / degree-apprenticeship readiness.

## Structure

- `project/` — the flagship project: a Library Management System API (Spring Boot). Grows
  feature-by-feature via issues and PRs, same as a real job.
- `drills/` — a small set of "hardening" exercises: take an algorithm problem tied to what's
  coming up in `project/`, and turn it into reviewable, production-shaped code (idiomatic
  Java, edge cases, a unit test, a complexity note). Bulk LeetCode/NeetCode-style practice
  happens on those platforms directly, not here.

See [ROADMAP.md](ROADMAP.md) for the phased curriculum.

## Workflow

1. Pick an issue from the [project board](../../projects).
2. Branch off `main`: `feat/<issue-slug>`.
3. Open a PR referencing the issue (`Closes #N`).
4. Address review comments.
5. Reviewer merges — no self-merge.

CI runs a build, the test suite, and a lint check (`spotlessCheck`) on every PR.
