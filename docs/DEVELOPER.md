# Developer Guide

Welcome to the Binary Search Implementation Developer Guide! This document provides comprehensive information for developers who want to contribute to, extend, or understand the codebase.

## Table of Contents

- [Project Overview](#project-overview)
- [Architecture and Design](#architecture-and-design)
- [Development Environment Setup](#development-environment-setup)
- [Code Organization](#code-organization)
- [Contributing Workflow](#contributing-workflow)
- [Code Style Guidelines](#code-style-guidelines)
- [Testing Strategy](#testing-strategy)
- [Performance Considerations](#performance-considerations)
- [Extension Points](#extension-points)
- [Debugging Guide](#debugging-guide)

## Project Overview

### Project Goals

This project serves as an educational implementation of binary search with the following objectives:

1. **Educational Value**: Provide a clear, well-documented implementation for learning
2. **Simplicity**: Keep the code simple and easy to understand
3. **Correctness**: Ensure the implementation is bug-free and handles edge cases
4. **Documentation**: Maintain comprehensive documentation for all aspects
5. **Best Practices**: Demonstrate good software development practices

### Target Audience

- **Students**: Learning algorithms and data structures
- **Educators**: Teaching binary search concepts
- **Developers**: Reference implementation for interviews or projects
- **Contributors**: Open source enthusiasts wanting to contribute

### Technology Stack

- **Language**: Java 8+ (compatible with newer versions)
- **Build System**: None (simple javac compilation)
- **Testing**: Manual testing and GitHub Actions CI
- **Documentation**: Markdown files
- **Version Control**: Git with GitHub

## Architecture and Design

### Design Principles

The project follows these key design principles:

1. **KISS (Keep It Simple, Stupid)**: Minimal complexity, maximum clarity
2. **Single Responsibility**: Each method has one clear purpose
3. **No External Dependencies**: Pure Java implementation
4. **Educational Focus**: Code optimized for learning, not just performance
5. **Comprehensive Documentation**: Every aspect is well-documented

### System Architecture

```
backend-agent-test/
├── src/                    # Source code
│   └── Main.java          # Main class with binary search implementation
├── docs/                  # Documentation
│   ├── API.md            # API documentation
│   ├── USER_GUIDE.md     # User guide
│   └── DEVELOPER.md      # This file
├── .github/              # GitHub-specific files
│   ├── ISSUE_TEMPLATE/   # Issue templates
│   ├── workflows/        # CI/CD workflows
│   └── PULL_REQUEST_TEMPLATE.md
└── [various .md files]   # Project documentation
```

### Class Design

```java
public class Main {
    // Core algorithm implementation
    public static int binarySearch(int[] arr, int b)
    
    // Command-line interface
    public static void main(String[] args)
}
```

**Design Decisions:**

1. **Static Methods**: No need for object instantiation, simpler usage
2. **Public API**: Both methods are public for maximum accessibility
3. **Primitive Types**: Using `int[]` instead of `Integer[]` for performance
4. **Return -1 for Not Found**: Standard convention in many programming contexts
5. **Iterative Implementation**: Avoids stack overflow, easier to understand

## Development Environment Setup

### Prerequisites

- **JDK 8 or higher**: For compilation and execution
- **Git**: For version control
- **IDE** (optional): IntelliJ IDEA, Eclipse, or VS Code
- **GitHub Account**: For contributing

### Local Development Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. **Verify Java Installation**:
   ```bash
   java -version
   javac -version
   ```

3. **Compile and Test**:
   ```bash
   javac src/Main.java
   java -cp src Main 1 2 3 4 5 3
   ```

4. **Set Up IDE** (Optional):
   - **IntelliJ IDEA**: Open project folder, configure JDK
   - **Eclipse**: Import as existing project
   - **VS Code**: Install Java Extension Pack

### Development Workflow

```bash
# 1. Create feature branch
git checkout -b feature/your-feature-name

# 2. Make changes
# Edit files...

# 3. Test changes
javac src/Main.java
java -cp src Main 1 2 3 4 5 3

# 4. Commit changes
git add .
git commit -m "Add: descriptive commit message"

# 5. Push and create PR
git push origin feature/your-feature-name
# Create pull request on GitHub
```

## Code Organization

### File Structure

```
src/Main.java               # Single source file containing:
├── Class documentation     # JavaDoc comments
├── binarySearch method     # Core algorithm
├── main method            # CLI interface
└── Input validation       # Error handling
```

### Code Sections

#### 1. File Header and Class Declaration
```java
//TIP comments (IDE-specific)
public class Main {
```

#### 2. Binary Search Implementation
```java
public static int binarySearch(int[] arr, int b) {
    // Algorithm implementation
}
```

#### 3. Command-Line Interface
```java
public static void main(String[] args) {
    // Input validation
    // Array parsing
    // Method invocation
    // Output formatting
}
```

### Coding Conventions

- **Class Names**: PascalCase (e.g., `Main`)
- **Method Names**: camelCase (e.g., `binarySearch`)
- **Variable Names**: camelCase (e.g., `targetValue`)
- **Constants**: UPPER_SNAKE_CASE (if any are added)
- **Indentation**: 4 spaces (no tabs)
- **Line Length**: 80-100 characters preferred

## Contributing Workflow

### Before You Start

1. **Read Documentation**: Familiarize yourself with the project
2. **Check Issues**: Look for existing issues or discussions
3. **Understand Goals**: Ensure your contribution aligns with project objectives

### Types of Contributions

#### 1. Bug Fixes
- **Process**: Issue → Branch → Fix → Test → PR
- **Requirements**: Include test cases, update documentation if needed
- **Examples**: Fix edge cases, handle exceptions, correct algorithm logic

#### 2. Feature Enhancements
- **Process**: Discussion → Issue → Design → Implementation → PR
- **Requirements**: Maintain simplicity, add documentation, include tests
- **Examples**: Generic type support, additional algorithms, performance improvements

#### 3. Documentation Improvements
- **Process**: Identify gap → Update docs → PR
- **Requirements**: Clear writing, accurate information, consistent formatting
- **Examples**: Fix typos, add examples, improve explanations

#### 4. Testing Improvements
- **Process**: Identify testing gaps → Add tests → PR
- **Requirements**: Cover edge cases, maintain simplicity
- **Examples**: Add CI tests, create test utilities, improve coverage

### Pull Request Process

1. **Create Issue**: Discuss the change before implementing
2. **Branch**: Create feature branch from `main`
3. **Implement**: Make changes following coding standards
4. **Test**: Thoroughly test your changes
5. **Document**: Update relevant documentation
6. **Submit PR**: Use the provided template
7. **Address Feedback**: Respond to review comments
8. **Merge**: Maintainer will merge approved PRs

### Review Process

**Automated Checks:**
- Code compilation
- Basic functionality tests
- Documentation checks

**Manual Review:**
- Code quality and style
- Algorithm correctness
- Documentation completeness
- Test coverage
- Educational value

## Code Style Guidelines

### Java Style

Follow standard Java conventions with these specific guidelines:

#### Method Documentation
```java
/**
 * Performs binary search on a sorted integer array.
 * 
 * @param arr the sorted array to search in
 * @param b the target value to find
 * @return the index of the target, or -1 if not found
 */
public static int binarySearch(int[] arr, int b) {
    // Implementation
}
```

#### Variable Naming
```java
// Good
int left = 0;
int right = arr.length - 1;
int middle = left + (right - left) / 2;

// Avoid
int i = 0;
int j = arr.length - 1;
int a = i + (j - i) / 2;
```

#### Comments
```java
// Use comments to explain why, not what
while (left <= right) { // Continue until search space is exhausted
    int middle = left + (right - left) / 2; // Prevent overflow
    
    if (arr[middle] == target) {
        return middle; // Found the target
    }
    // ... rest of logic
}
```

## Testing Strategy

### Current Testing Approach

The project uses a multi-layered testing approach:

#### 1. Manual Testing
```bash
# Basic functionality
javac src/Main.java
java -cp src Main 1 2 3 4 5 3    # Expected: 2
java -cp src Main 1 2 3 4 5 7    # Expected: -1
```

#### 2. CI/CD Testing
Automated tests run on every push and PR:
- **Compilation Test**: Ensures code compiles
- **Functionality Test**: Tests basic use cases
- **Documentation Test**: Verifies required files exist

#### 3. Edge Case Testing
```bash
# Empty array simulation (minimum args)
java -cp src Main 5                # Shows usage
java -cp src Main 5 5             # Single element: 0
```

### Testing Guidelines for Contributors

#### Test Your Changes
Before submitting a PR, run these tests:

```bash
# 1. Compilation test
javac src/Main.java

# 2. Basic functionality tests
java -cp src Main 1 2 3 4 5 3     # Should return: Result index: 2
java -cp src Main 1 2 3 4 5 7     # Should return: Result index: -1
java -cp src Main 5 5             # Should return: Result index: 0

# 3. Edge cases
java -cp src Main                 # Should show usage
java -cp src Main 1               # Should show usage

# 4. Clean up
rm src/*.class
```

## Performance Considerations

### Current Performance Characteristics

#### Time Complexity
- **Best Case**: O(1) - target is at middle
- **Average Case**: O(log n) - typical binary search
- **Worst Case**: O(log n) - target not found or at extreme position

#### Space Complexity
- **Space**: O(1) - constant extra space
- **In-place**: No additional arrays needed
- **Iterative**: No recursive call stack

### Optimization Guidelines

#### Current Optimizations
1. **Overflow Prevention**: `left + (right - left) / 2` instead of `(left + right) / 2`
2. **Iterative Approach**: Avoids recursion overhead
3. **Primitive Types**: Uses `int` instead of `Integer`
4. **Minimal Object Creation**: No temporary objects

## Extension Points

### Potential Enhancements

The project is designed to be extensible. Here are areas for future enhancement:

#### 1. Generic Type Support
```java
public static <T extends Comparable<T>> int binarySearch(T[] arr, T target) {
    // Generic implementation
}
```

#### 2. Custom Comparators
```java
public static <T> int binarySearch(T[] arr, T target, Comparator<T> comp) {
    // Implementation with custom comparison
}
```

#### 3. Range Queries
```java
public static int lowerBound(int[] arr, int target) {
    // Find first occurrence
}

public static int upperBound(int[] arr, int target) {
    // Find last occurrence
}
```

### Extension Guidelines

When extending the project:

1. **Maintain Simplicity**: Keep the educational focus
2. **Preserve Compatibility**: Don't break existing API
3. **Add Documentation**: Include comprehensive docs for new features
4. **Include Tests**: Test all new functionality
5. **Follow Style**: Maintain consistent coding style

## Debugging Guide

### Common Issues and Solutions

#### Issue 1: Incorrect Results
**Symptoms**: Binary search returns wrong index or -1 when element exists

**Debugging Steps**:
1. **Check Array Sorting**: Verify input array is sorted
2. **Trace Algorithm Execution**: Add debug output to follow the search process

#### Issue 2: Performance Problems
**Symptoms**: Unexpectedly slow execution

**Debugging Steps**:
1. **Profile Method Calls**: Time the execution
2. **Check Array Size**: Ensure reasonable array sizes
3. **Verify JVM Warmup**: Run multiple iterations for accurate timing

### Debugging Tools

#### Command Line Debugging
```bash
# Enable assertions
java -ea -cp src Main 1 2 3 4 5 3

# Verbose garbage collection
java -verbose:gc -cp src Main 1 2 3 4 5 3
```

#### IDE Debugging
1. **Set Breakpoints**: In binary search method
2. **Step Through**: Watch variable values change
3. **Inspect Variables**: Check array contents and indices
4. **Evaluate Expressions**: Test conditions in real-time

---

## Contributing

We welcome contributions! Please read our [CONTRIBUTING.md](../CONTRIBUTING.md) for detailed guidelines.

### Questions?

- **Issues**: Create a GitHub issue
- **Discussions**: Use GitHub Discussions
- **Support**: See [SUPPORT.md](../SUPPORT.md)

---

For more information, see:
- [API Documentation](API.md) - Detailed method specifications
- [User Guide](USER_GUIDE.md) - How to use the implementation
- [README.md](../README.md) - Project overview