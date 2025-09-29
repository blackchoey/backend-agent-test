# Contributing to Backend Agent Test

Thank you for your interest in contributing to the Backend Agent Test project! This document provides guidelines and instructions for contributing to this Java learning repository.

## Table of Contents

- [Getting Started](#getting-started)
- [Development Setup](#development-setup)
- [Making Changes](#making-changes)
- [Code Style Guidelines](#code-style-guidelines)
- [Testing](#testing)
- [Submitting Changes](#submitting-changes)
- [Reporting Issues](#reporting-issues)
- [Code of Conduct](#code-of-conduct)

## Getting Started

This is a simple Java application designed for testing and learning purposes. The project demonstrates fundamental Java programming concepts and serves as a sandbox for experimentation.

### Prerequisites

Before contributing, ensure you have the following installed:

- **Java Development Kit (JDK) 8 or higher**
  - Verify installation: `java -version` and `javac -version`
- **Git** for version control
- **Text editor or IDE** (IntelliJ IDEA is recommended as the project includes IDEA configuration)

## Development Setup

### 1. Fork and Clone the Repository

```bash
# Fork the repository on GitHub, then clone your fork
git clone https://github.com/YOUR_USERNAME/backend-agent-test.git
cd backend-agent-test
```

### 2. Set Up Remote Upstream

```bash
# Add the original repository as upstream
git remote add upstream https://github.com/blackchoey/backend-agent-test.git

# Verify remotes
git remote -v
```

### 3. Build and Test the Project

```bash
# Compile the Java code
javac src/Main.java

# Run the program
java -cp src Main

# Expected output:
# Hello and welcome!i = 1
# i = 2
# i = 3
# i = 4
# i = 5
```

### 4. IDE Setup (Optional but Recommended)

#### IntelliJ IDEA
1. Open IntelliJ IDEA
2. Select "Open" and choose the project directory
3. The IDE will automatically recognize the module configuration (`test.iml`)
4. You can run the `Main` class directly from the IDE

#### Other IDEs
- **Eclipse**: Import as existing Java project
- **VS Code**: Install Java Extension Pack and open the folder
- **Command Line**: Use any text editor with `javac` and `java` commands

## Making Changes

### 1. Create a Feature Branch

```bash
# Create and switch to a new branch
git checkout -b feature/your-feature-name
# or for bug fixes
git checkout -b fix/issue-description
```

### 2. Make Your Changes

- Keep changes focused and atomic
- Write clear, descriptive commit messages
- Test your changes locally before committing

### 3. Commit Guidelines

Follow conventional commit format:

```bash
git commit -m "type: brief description"

# Examples:
git commit -m "feat: add method for calculating factorial"
git commit -m "fix: correct binary search loop condition"
git commit -m "docs: update README with new examples"
git commit -m "refactor: improve variable naming in main method"
```

**Commit Types:**
- `feat`: New feature
- `fix`: Bug fix
- `docs`: Documentation changes
- `style`: Code style/formatting (no logic changes)
- `refactor`: Code refactoring
- `test`: Adding or updating tests
- `chore`: Maintenance tasks

## Code Style Guidelines

### Java Coding Standards

1. **Naming Conventions**
   - Classes: `PascalCase` (e.g., `Main`, `BinarySearch`)
   - Methods: `camelCase` (e.g., `binarySearch`, `calculateSum`)
   - Variables: `camelCase` (e.g., `targetValue`, `arrayLength`)
   - Constants: `UPPER_SNAKE_CASE` (e.g., `MAX_SIZE`, `DEFAULT_VALUE`)

2. **Code Formatting**
   - Use 4 spaces for indentation (no tabs)
   - Maximum line length: 120 characters
   - Always use braces for control structures, even single statements
   - Add blank lines to separate logical sections

3. **Comments and Documentation**
   - Write JavaDoc comments for public methods and classes
   - Use inline comments sparingly, only when necessary
   - Keep comments up-to-date with code changes

4. **Example of Good Code Style**

```java
/**
 * Performs binary search on a sorted array.
 * 
 * @param arr the sorted array to search
 * @param target the value to find
 * @return the index of target if found, -1 otherwise
 */
public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    
    return -1;
}
```

## Testing

### Manual Testing

Since this is a learning project, manual testing is currently the primary method:

1. **Compile and Run Tests**
   ```bash
   # Compile
   javac src/Main.java
   
   # Run with different inputs (if applicable)
   java -cp src Main
   ```

2. **Test Different Scenarios**
   - Test with valid inputs
   - Test edge cases
   - Verify expected output matches actual output

### Adding Automated Tests (Future Enhancement)

If you want to add unit tests:
1. Create a `test` directory
2. Add JUnit or similar testing framework
3. Write test cases for new functionality
4. Update this guide with testing instructions

## Submitting Changes

### 1. Prepare Your Branch

```bash
# Update your fork with latest changes
git fetch upstream
git checkout main
git merge upstream/main
git push origin main

# Rebase your feature branch (optional but recommended)
git checkout feature/your-feature-name
git rebase main
```

### 2. Push Your Changes

```bash
git push origin feature/your-feature-name
```

### 3. Create a Pull Request

1. Go to your fork on GitHub
2. Click "New pull request"
3. Select your feature branch
4. Fill out the PR template with:
   - **Title**: Clear, descriptive title
   - **Description**: What changes you made and why
   - **Testing**: How you tested the changes
   - **Screenshots**: If applicable (for output changes)

### 4. PR Review Process

- Maintain a respectful and constructive tone
- Be open to feedback and suggestions
- Make requested changes promptly
- Keep the PR updated with the main branch if needed

## Reporting Issues

### Before Creating an Issue

1. **Search existing issues** to avoid duplicates
2. **Try the latest version** to see if the issue persists
3. **Gather information** about your environment

### Creating a Good Issue Report

Use the following template:

```markdown
**Bug Description**
A clear description of what the bug is.

**Steps to Reproduce**
1. Compile with: `javac src/Main.java`
2. Run with: `java -cp src Main`
3. See error

**Expected Behavior**
What you expected to happen.

**Actual Behavior**
What actually happened.

**Environment**
- OS: [e.g., Windows 10, macOS 12, Ubuntu 20.04]
- Java Version: [e.g., OpenJDK 11.0.2]
- IDE: [e.g., IntelliJ IDEA 2023.1]

**Additional Context**
Any other context about the problem.
```

### Issue Labels

Common labels used in this project:
- `bug`: Something isn't working
- `enhancement`: New feature or request
- `documentation`: Documentation improvements
- `good first issue`: Good for newcomers
- `help wanted`: Extra attention is needed

## Code of Conduct

### Our Pledge

We are committed to providing a friendly, safe, and welcoming environment for all contributors, regardless of experience level, gender identity and expression, sexual orientation, disability, personal appearance, body size, race, ethnicity, age, religion, or nationality.

### Expected Behavior

- **Be respectful** and inclusive in communications
- **Be constructive** when giving feedback
- **Be collaborative** and help others learn
- **Be patient** with newcomers and those learning
- **Focus on the code**, not the person

### Unacceptable Behavior

- Harassment, discrimination, or offensive language
- Personal attacks or trolling
- Publishing private information without permission
- Any conduct that could reasonably be considered inappropriate

### Enforcement

Project maintainers are responsible for clarifying standards and may take corrective action, including temporary or permanent bans, for any behavior deemed inappropriate.

## Questions and Support

- **General questions**: Open a discussion or issue on GitHub
- **Documentation**: Check the [README.md](README.md) first
- **Contribution questions**: Feel free to ask in your PR or issue

## Recognition

Contributors will be recognized in the following ways:
- Listed in commit history and PR acknowledgments
- Mentioned in release notes for significant contributions
- Added to a contributors section (if the project grows)

---

Thank you for contributing to Backend Agent Test! Every contribution, no matter how small, helps make this project better for everyone. 🎉