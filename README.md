# Backend Agent Test

A simple Java application for testing backend agent functionality.

## Description

This project contains a basic Java application that demonstrates a simple "Hello World" program with a loop. It serves as a foundation for backend agent testing and can be extended with additional functionality.

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher (for building with Maven)

## Building and Running

### Using Java directly

```bash
# Compile the source code
javac src/Main.java

# Run the application
java -cp src Main
```

### Using Maven (recommended)

```bash
# Build the project
mvn clean compile

# Run the application
mvn exec:java -Dexec.mainClass="com.example.Main"

# Run tests
mvn test

# Package the application
mvn package
```

## Project Structure

```
backend-agent-test/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── Main.java
├── src/
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── MainTest.java
├── pom.xml
├── README.md
└── LICENSE
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Getting Help

If you have questions or need help with this project:

1. Check the documentation in this README
2. Look for existing [issues](https://github.com/blackchoey/backend-agent-test/issues)
3. Create a new issue if needed

## Development

This project follows standard Java development practices:

- Code should be well-documented
- Tests should be written for new functionality
- Follow the existing code style
- Make sure all tests pass before submitting PRs