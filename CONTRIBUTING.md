# Contributing to Backend Agent Test

Thank you for your interest in contributing to Backend Agent Test! We welcome contributions from everyone.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- Git

### Setting Up Development Environment

1. Fork the repository on GitHub
2. Clone your fork locally:
   ```bash
   git clone https://github.com/YOUR_USERNAME/backend-agent-test.git
   cd backend-agent-test
   ```
3. Build the project:
   ```bash
   mvn compile
   ```
4. Run the application to verify setup:
   ```bash
   mvn exec:java -Dexec.mainClass="Main"
   ```

## How to Contribute

### Reporting Issues

- Use GitHub Issues to report bugs or request features
- Provide clear description and steps to reproduce for bugs
- Include system information (Java version, OS, etc.) when relevant

### Submitting Changes

1. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
2. Make your changes
3. Test your changes:
   ```bash
   mvn compile
   mvn exec:java -Dexec.mainClass="Main"
   ```
4. Commit your changes with clear commit messages:
   ```bash
   git commit -m "Add: brief description of your change"
   ```
5. Push to your fork:
   ```bash
   git push origin feature/your-feature-name
   ```
6. Create a Pull Request on GitHub

### Code Style

- Use Java naming conventions
- Keep methods focused and concise
- Add comments for complex logic
- Ensure code compiles without warnings

### Commit Message Guidelines

- Use present tense ("Add feature" not "Added feature")
- Keep first line under 50 characters
- Reference issues and pull requests when applicable

## Code Review Process

- All submissions require review before merging
- Reviewers will check for code quality, functionality, and adherence to project standards
- Address feedback promptly and professionally

## Community Guidelines

Please note that this project follows our [Code of Conduct](CODE_OF_CONDUCT.md). By participating, you agree to uphold these standards.

## Questions?

Feel free to open an issue for any questions about contributing!