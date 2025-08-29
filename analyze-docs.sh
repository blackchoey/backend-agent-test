#!/bin/bash

# Documentation Analyzer Script
# This script compiles and runs the DocumentationAnalyzer tool
# Usage: ./analyze-docs.sh [project-directory]

PROJECT_DIR=${1:-.}
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

echo "Compiling DocumentationAnalyzer..."
javac -cp "$SCRIPT_DIR/src" "$SCRIPT_DIR/src/DocumentationAnalyzer.java"

if [ $? -eq 0 ]; then
    echo "Running documentation analysis on: $PROJECT_DIR"
    echo ""
    java -cp "$SCRIPT_DIR/src" DocumentationAnalyzer "$PROJECT_DIR"
else
    echo "Error: Failed to compile DocumentationAnalyzer"
    exit 1
fi