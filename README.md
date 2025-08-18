# Backend Agent Test

A Java project for learning and testing backend development concepts, demonstrating modern Java development practices with Maven, JUnit 5, and proper project structure.

## Project Structure

```
backend-agent-test/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/
│   │   │       ├── Main.java          # Main application class
│   │   │       └── MathUtils.java     # Utility class with mathematical operations
│   │   └── resources/
│   │       └── logback.xml            # Logging configuration
│   └── test/
│       └── java/
│           └── com/example/
│               └── MathUtilsTest.java # Unit tests for MathUtils
├── logs/                              # Application logs directory
├── pom.xml                           # Maven configuration
└── README.md                         # This file
```

## Features

- **Modern Java 17**: Uses the latest Java LTS version with modern syntax
- **Maven Build System**: Dependency management and build automation
- **Unit Testing**: Comprehensive JUnit 5 tests with assertions
- **Logging**: Structured logging with Logback (SLF4J)
- **Clean Architecture**: Proper package structure and separation of concerns
- **Documentation**: Javadoc comments and comprehensive README

## Prerequisites

- Java 17 or higher
- Maven 3.6.0 or higher (optional, can use Maven wrapper)

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/blackchoey/backend-agent-test.git
cd backend-agent-test
```

### 2. Build the Project

```bash
mvn clean compile
```

### 3. Run Tests

```bash
mvn test
```

### 4. Run the Application

```bash
mvn exec:java -Dexec.mainClass="com.example.Main"
```

Or compile and run manually:

```bash
mvn clean compile
java -cp target/classes com.example.Main
```

## Maven Commands

| Command | Description |
|---------|-------------|
| `mvn clean` | Clean the project |
| `mvn compile` | Compile source code |
| `mvn test` | Run unit tests |
| `mvn package` | Create JAR file |
| `mvn exec:java` | Run the main class |
| `mvn clean install` | Full build with tests |

## Classes Overview

### Main.java
The main application class that demonstrates:
- Logging with SLF4J
- Basic console output
- Object instantiation and method calls
- Exception handling

### MathUtils.java
A utility class providing mathematical operations:
- Basic arithmetic (add, subtract, multiply, divide)
- Factorial calculation
- Proper error handling with exceptions
- Comprehensive Javadoc documentation

### MathUtilsTest.java
Unit tests demonstrating:
- JUnit 5 annotations and assertions
- Test organization with @DisplayName
- Exception testing
- Edge case validation

## Logging

The application uses Logback for logging with the following features:
- Console and file output
- Configurable log levels
- Structured log format with timestamps
- Logs written to `logs/app.log`

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Learning Resources

This project demonstrates several important Java and backend development concepts:

- **Object-Oriented Programming**: Classes, methods, encapsulation
- **Testing**: Unit testing with JUnit 5, assertions, test organization
- **Build Tools**: Maven dependency management and build lifecycle
- **Logging**: Structured logging with SLF4J and Logback
- **Documentation**: Javadoc comments and README documentation
- **Project Structure**: Standard Maven directory layout

## License

This project is open source and available under the MIT License.