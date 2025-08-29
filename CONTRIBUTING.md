# Contributing to Backend Agent Test

We love your input! We want to make contributing to this project as easy and transparent as possible, whether it's:

- Reporting a bug
- Discussing the current state of the code
- Submitting a fix
- Proposing new features
- Becoming a maintainer

## Development Process

We use GitHub to host code, to track issues and feature requests, as well as accept pull requests.

## Pull Requests

Pull requests are the best way to propose changes to the codebase. We actively welcome your pull requests:

1. Fork the repo and create your branch from `main`.
2. If you've added code that should be tested, add tests.
3. If you've changed APIs, update the documentation.
4. Ensure the test suite passes.
5. Make sure your code follows the existing style.
6. Issue that pull request!

## Any contributions you make will be under the MIT Software License

In short, when you submit code changes, your submissions are understood to be under the same [MIT License](http://choosealicense.com/licenses/mit/) that covers the project. Feel free to contact the maintainers if that's a concern.

## Report bugs using GitHub's [issue tracker](https://github.com/blackchoey/backend-agent-test/issues)

We use GitHub issues to track public bugs. Report a bug by [opening a new issue](https://github.com/blackchoey/backend-agent-test/issues/new); it's that easy!

## Write bug reports with detail, background, and sample code

**Great Bug Reports** tend to have:

- A quick summary and/or background
- Steps to reproduce
  - Be specific!
  - Give sample code if you can
- What you expected would happen
- What actually happens
- Notes (possibly including why you think this might be happening, or stuff you tried that didn't work)

## Development Setup

1. Clone the repository
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. Ensure you have Java 17+ and Maven installed
   ```bash
   java -version
   mvn -version
   ```

3. Build and test the project
   ```bash
   mvn clean compile
   mvn test
   ```

## Code Style

- Use standard Java naming conventions
- Follow existing code formatting
- Add comments for complex logic
- Keep methods small and focused
- Write meaningful commit messages

## Testing

- Write unit tests for new functionality
- Ensure all tests pass before submitting PR
- Include integration tests where appropriate
- Aim for good test coverage

## Commit Message Format

Use clear and meaningful commit messages:

```
feat: add new feature X
fix: resolve issue with Y
docs: update README with Z
test: add tests for feature X
refactor: improve code structure in Y
```

## Questions?

Feel free to open an issue with the "question" label if you have any questions about contributing!