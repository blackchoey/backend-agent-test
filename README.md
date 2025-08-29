# Backend Agent Test

A simple Java application for testing and demonstration purposes.

## Overview

This project contains a basic Java program that demonstrates console output and iteration. It serves as a foundation for testing and development workflows.

## Prerequisites

- Java 17 or higher
- Maven 3.6+ (for building)

## Quick Start

### Using Maven (Recommended)

```bash
# Clone the repository
git clone https://github.com/blackchoey/backend-agent-test.git
cd backend-agent-test

# Build the project
mvn compile

# Run the application
mvn exec:java -Dexec.mainClass="Main"
```

### Using Java directly

```bash
# Compile the source code
javac src/Main.java -d out/

# Run the application
java -cp out Main
```

## Building and Testing

```bash
# Clean and compile
mvn clean compile

# Run tests
mvn test

# Package the application
mvn package
```

## Project Structure

```
├── src/
│   ├── main/java/         # Source code
│   └── test/java/         # Test code
├── target/                # Build output (Maven)
├── README.md              # This file
├── pom.xml                # Maven build configuration
└── LICENSE                # Project license
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.

## Contact

For questions or support, please open an issue on GitHub.