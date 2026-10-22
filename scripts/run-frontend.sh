#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/../personal-expense-tracker-frontend"
./mvnw spring-boot:run
