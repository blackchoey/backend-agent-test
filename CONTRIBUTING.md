# Contributing to Backend Agent Test

Thank you for your interest in contributing to the Backend Agent Test project! This document provides guidelines and information for contributors.

## Table of Contents

- [Code of Conduct](#code-of-conduct)
- [Getting Started](#getting-started)
- [Development Workflow](#development-workflow)
- [Coding Standards](#coding-standards)
- [Testing Guidelines](#testing-guidelines)
- [Submitting Changes](#submitting-changes)
- [Issue Reporting](#issue-reporting)
- [Community](#community)

## Code of Conduct

By participating in this project, you agree to abide by our community standards:

- Be respectful and inclusive
- Welcome newcomers and help them learn
- Focus on constructive feedback
- Respect different viewpoints and experiences

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Git
- A Java IDE (IntelliJ IDEA, Eclipse, or VS Code recommended)
- Basic understanding of Java programming

### Setting Up Your Development Environment

1. **Fork the Repository**
   ```bash
   # Go to https://github.com/blackchoey/backend-agent-test
   # Click the "Fork" button in the top right
   ```

2. **Clone Your Fork**
   ```bash
   git clone https://github.com/YOUR_USERNAME/backend-agent-test.git
   cd backend-agent-test
   ```

3. **Set Up Remote**
   ```bash
   # Add the original repository as upstream
   git remote add upstream https://github.com/blackchoey/backend-agent-test.git
   
   # Verify remotes
   git remote -v
   ```

4. **Verify Setup**
   ```bash
   # Test that everything works
   javac src/Main.java
   java -cp src Main
   ```

## Development Workflow

### 1. Stay Updated
```bash
# Before starting new work, sync with upstream
git checkout main
git pull upstream main
git push origin main
```

### 2. Create a Feature Branch
```bash
# Use descriptive branch names
git checkout -b feature/add-user-input
git checkout -b bugfix/fix-output-formatting
git checkout -b docs/update-readme
```

### 3. Make Changes
- Keep changes focused and atomic
- Write clear, self-documenting code
- Follow the coding standards below
- Test your changes thoroughly

### 4. Commit Your Work
```bash
# Stage specific files (preferred over git add .)
git add src/Main.java
git add README.md

# Write meaningful commit messages
git commit -m "Add user input functionality

- Implement Scanner for user interaction
- Add input validation
- Update documentation with new features"
```

## Coding Standards

### Java Style Guide

#### Naming Conventions
- **Classes**: `PascalCase` (e.g., `UserInputHandler`, `Main`)
- **Methods**: `camelCase` (e.g., `getUserInput()`, `processData()`)
- **Variables**: `camelCase` (e.g., `userName`, `inputScanner`)
- **Constants**: `UPPER_CASE` (e.g., `MAX_ATTEMPTS`, `DEFAULT_MESSAGE`)
- **Packages**: `lowercase` (e.g., `com.example.utils`)

#### Code Formatting
- **Indentation**: 4 spaces (no tabs)
- **Line Length**: Maximum 100 characters
- **Braces**: Opening brace on same line
```java
// Good
if (condition) {
    doSomething();
}

// Bad
if (condition)
{
    doSomething();
}
```

#### Comments
- Use `//` for single-line comments
- Use `/* */` for multi-line comments
- Use `/** */` for JavaDoc documentation
- Comment complex logic, not obvious code

```java
// Good: Explains the why, not the what
// Calculate fibonacci using dynamic programming to avoid recursion overhead
int fibonacci = calculateFibonacci(n);

// Bad: States the obvious
// Increment i by 1
i++;
```

#### Method Structure
- Keep methods small and focused (prefer < 20 lines)
- Use descriptive method names
- Minimize method parameters (prefer < 4)

### Project Structure
```
backend-agent-test/
├── src/
│   ├── Main.java              # Entry point
│   ├── utils/                 # Utility classes (if needed)
│   └── models/                # Data models (if needed)
├── docs/                      # Additional documentation
├── .gitignore
├── README.md
├── CONTRIBUTING.md
└── test.iml
```

## Testing Guidelines

### Manual Testing
Since this is a simple console application, manual testing is currently sufficient:

1. **Compilation Test**
   ```bash
   javac src/Main.java
   # Should compile without errors
   ```

2. **Execution Test**
   ```bash
   java -cp src Main
   # Should produce expected output
   ```

3. **Edge Cases** (when applicable)
   - Test with different inputs
   - Test error conditions
   - Verify output formatting

### Future Testing Considerations
As the project grows, consider adding:
- Unit tests with JUnit
- Integration tests
- Automated testing pipeline

## Submitting Changes

### Pull Request Process

1. **Pre-submission Checklist**
   - [ ] Code compiles without errors
   - [ ] Code runs and produces expected output
   - [ ] Code follows project style guidelines
   - [ ] Documentation updated if necessary
   - [ ] Commit messages are clear and descriptive

2. **Create Pull Request**
   - Go to your fork on GitHub
   - Click "New Pull Request"
   - Select the appropriate base branch (usually `main`)
   - Fill out the PR template (if available)

3. **Pull Request Description**
   Include:
   - **What**: Brief description of changes
   - **Why**: Reason for the changes
   - **How**: Approach taken
   - **Testing**: Steps to verify the changes
   - **Screenshots**: For UI changes (if applicable)

### Example Pull Request Template
```markdown
## Description
Brief description of what this PR does.

## Type of Change
- [ ] Bug fix
- [ ] New feature
- [ ] Documentation update
- [ ] Refactoring

## How Has This Been Tested?
- [ ] Manual testing steps performed
- [ ] All existing functionality still works

## Checklist
- [ ] Code follows project style guidelines
- [ ] Self-review completed
- [ ] Documentation updated
- [ ] No new warnings introduced
```

## Issue Reporting

### Before Creating an Issue
1. Check existing issues to avoid duplicates
2. Update to the latest version
3. Gather relevant information

### Bug Reports
Include:
- **Environment**: OS, Java version, IDE
- **Steps to Reproduce**: Clear, step-by-step instructions
- **Expected Behavior**: What should happen
- **Actual Behavior**: What actually happens
- **Error Messages**: Full error text (if any)
- **Code Samples**: Minimal example demonstrating the issue

### Feature Requests
Include:
- **Problem Statement**: What problem does this solve?
- **Proposed Solution**: Your suggested approach
- **Alternatives**: Other approaches considered
- **Use Cases**: Real-world scenarios where this would be helpful

## Community

### Getting Help
- Create an issue for bugs or feature requests
- Check existing documentation
- Review closed issues for similar problems

### Recognition
Contributors will be acknowledged in:
- README.md contributors section
- Release notes for significant contributions
- GitHub contributors page

### Communication Guidelines
- Be patient and respectful
- Provide context and details
- Follow up on your contributions
- Help others when possible

## Development Tips

### IDE Setup
**IntelliJ IDEA:**
- Import as existing project
- Set JDK version in Project Settings
- Configure code style to match project standards

**VS Code:**
- Install Java Extension Pack
- Configure formatting settings
- Use integrated terminal for compilation

### Git Best Practices
```bash
# Keep commits atomic and focused
git add src/specific-file.java
git commit -m "Fix null pointer exception in input handler"

# Write good commit messages
# Format: <type>: <subject>
# Types: feat, fix, docs, style, refactor, test
git commit -m "feat: add user input validation"
git commit -m "fix: resolve output formatting issue"
git commit -m "docs: update installation instructions"
```

### Common Issues

**Compilation Problems:**
- Ensure JDK version compatibility
- Check classpath settings
- Verify file encoding (UTF-8 recommended)

**Git Issues:**
```bash
# Sync with upstream before making changes
git fetch upstream
git rebase upstream/main

# If you need to update your PR
git commit --amend  # For last commit
git push --force-with-lease origin your-branch
```

## Questions?

If you have questions not covered in this guide:
1. Check the [README.md](README.md)
2. Search existing issues
3. Create a new issue with the "question" label

Thank you for contributing to Backend Agent Test!