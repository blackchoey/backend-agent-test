# Backend Agent Test

A simple Java application for testing backend agent functionality.

## Description

This is a basic Java project that demonstrates a simple "Hello World" application with a counting loop. It serves as a test repository for backend agent operations and showcases standard Java project structure and open-source best practices.

## Features

- Simple console output
- Counting loop demonstration
- Maven build system
- JUnit 5 testing framework
- GitHub Actions CI/CD

## Prerequisites

- Java 17 or higher
- Maven 3.6.0 or higher

## Building the Project

### Using Maven

```bash
# Compile the project
mvn compile

# Run tests
mvn test

# Create executable JAR
mvn package

# Clean build artifacts
mvn clean
```

## Running the Application

### From Maven

```bash
mvn exec:java -Dexec.mainClass="Main"
```

### From Compiled JAR

```bash
java -jar target/backend-agent-test-1.0.0.jar
```

### Direct Java Execution

```bash
# Compile and run directly
javac -d target/classes src/main/java/Main.java
java -cp target/classes Main
```

## Project Structure

```
backend-agent-test/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── Main.java          # Main application class
│   └── test/
│       └── java/                  # Test files
├── target/                        # Maven build output
├── .github/
│   └── workflows/
│       └── ci.yml                 # GitHub Actions workflow
├── pom.xml                        # Maven build configuration
├── README.md                      # This file
├── LICENSE                        # Project license
├── CONTRIBUTING.md                # Contribution guidelines
├── CODE_OF_CONDUCT.md            # Code of conduct
├── SECURITY.md                   # Security policy
└── .gitignore                    # Git ignore rules
```

## Development

### Running Tests

```bash
mvn test
```

### Code Style

This project follows standard Java conventions:
- Use camelCase for variables and methods
- Use PascalCase for class names
- Proper indentation and formatting

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Security

Please see [SECURITY.md](SECURITY.md) for information about reporting security vulnerabilities.

## Support

If you have any questions or need help with this project, please:

1. Check the existing issues on GitHub
2. Create a new issue if your question hasn't been answered
3. Follow the templates provided for bug reports and feature requests