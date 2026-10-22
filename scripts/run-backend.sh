#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/../personal-expense-tracker-backend"
./mvnw spring-boot:run
