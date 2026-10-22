#!/usr/bin/env bash
# Prints the tool versions the project needs. Changes nothing.
echo "== java =="; java -version 2>&1 || echo "java NOT found"
echo "== javac =="; javac -version 2>&1 || echo "javac NOT found (install a JDK, not a JRE)"
echo "== mvn (only needed once, to create the wrapper) =="; mvn -v 2>&1 | head -n 3 || echo "mvn NOT found"
echo "== git =="; git --version 2>&1 || echo "git NOT found"
