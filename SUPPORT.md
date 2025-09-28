# Support

Thank you for using our Binary Search Implementation! This document provides information on how to get help and support.

## Getting Help

### Documentation

Before asking for help, please check our documentation:

- **[README.md](README.md)** - Project overview, installation, and usage instructions
- **[CONTRIBUTING.md](CONTRIBUTING.md)** - How to contribute to the project
- **[docs/](docs/)** - Detailed documentation and guides

### Common Issues and Solutions

#### Compilation Issues

**Problem**: `javac: command not found`
**Solution**: Install Java Development Kit (JDK). On Ubuntu/Debian:
```bash
sudo apt update
sudo apt install default-jdk
```

**Problem**: `Main.java:X: error: cannot find symbol`
**Solution**: Ensure you're compiling from the correct directory:
```bash
cd backend-agent-test
javac src/Main.java
```

#### Runtime Issues

**Problem**: `Error: Could not find or load main class Main`
**Solution**: Use the correct classpath when running:
```bash
java -cp src Main 1 2 3 4 5 3
```

**Problem**: `NumberFormatException`
**Solution**: Ensure all command-line arguments are valid integers:
```bash
# Correct
java -cp src Main 1 2 3 4 5 3

# Incorrect (contains non-numeric values)
java -cp src Main a b c d e f
```

#### Algorithm Issues

**Problem**: Binary search returns incorrect results
**Solution**: Ensure your input array is sorted in ascending order:
```bash
# Correct (sorted array)
java -cp src Main 1 2 3 4 5 3

# Incorrect (unsorted array)
java -cp src Main 5 2 1 4 3 3
```

### Where to Get Help

#### 1. GitHub Issues

For bug reports, feature requests, or general questions:

1. Go to our [Issues page](https://github.com/blackchoey/backend-agent-test/issues)
2. Search existing issues to see if your question has been answered
3. If not, create a new issue using the appropriate template:
   - **Bug Report**: For reporting bugs or unexpected behavior
   - **Feature Request**: For suggesting new features or improvements
   - **Question**: For general questions about usage or implementation

#### 2. GitHub Discussions

For broader discussions, ideas, or community support:

1. Visit our [Discussions page](https://github.com/blackchoey/backend-agent-test/discussions) (if enabled)
2. Browse existing discussions or start a new one
3. Great for sharing use cases, getting feedback on ideas, or helping other users

#### 3. Educational Resources

Since this is an educational project, you might find these resources helpful:

- [Binary Search Algorithm - Wikipedia](https://en.wikipedia.org/wiki/Binary_search_algorithm)
- [Java Documentation - Oracle](https://docs.oracle.com/en/java/)
- [Algorithms Course - Khan Academy](https://www.khanacademy.org/computing/computer-science/algorithms)

### How to Report Issues Effectively

When reporting issues, please include:

#### For Bug Reports:
- **Java version**: `java -version`
- **Operating system**: e.g., Ubuntu 20.04, Windows 10, macOS 12
- **Steps to reproduce**: Exact commands you ran
- **Expected behavior**: What you expected to happen
- **Actual behavior**: What actually happened
- **Error messages**: Full error output (if any)

#### For Feature Requests:
- **Clear description**: What feature you'd like to see
- **Use cases**: How this feature would be helpful
- **Implementation ideas**: Any thoughts on how it could be implemented

#### For Questions:
- **Context**: What you're trying to accomplish
- **What you've tried**: Steps you've already taken
- **Specific question**: Clear, focused question

### Response Times

We aim to respond to:
- **Critical bugs**: Within 24-48 hours
- **General issues**: Within 3-7 days
- **Feature requests**: Within 1-2 weeks
- **Questions**: Within 2-5 days

Please note that this is an open-source project maintained by volunteers, so response times may vary.

### Community Guidelines

When seeking support:

- Be respectful and patient
- Follow our [Code of Conduct](CODE_OF_CONDUCT.md)
- Search existing issues before creating new ones
- Provide clear, detailed information
- Stay on topic and focused

### Alternative Support

If you need immediate help:

1. **Stack Overflow**: Tag your question with `java` and `binary-search`
2. **Java communities**: Reddit's r/learnjava, Java Discord servers
3. **Local user groups**: Java User Groups (JUGs) in your area

### Contributing Back

If you received help and solved your problem:

- Consider updating documentation to help others
- Share your solution in the issue thread
- Submit a pull request if you fixed a bug
- Help answer questions from other users

### Security Issues

For security-related issues, please see our [SECURITY.md](SECURITY.md) file and follow the responsible disclosure process.

---

Thank you for being part of our community! 🙏