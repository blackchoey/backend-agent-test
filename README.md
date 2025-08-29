# Backend Agent Test

A simple Java application for testing and demonstration purposes.

## Description

This is a basic Java project that demonstrates a simple console application. The application prints a welcome message and displays numbers from 1 to 5.

## Prerequisites

- Java 17 or higher
- Maven 3.6+ (for building with Maven)

## Getting Started

### Compilation and Running

#### Using Java directly:
```bash
# Compile the application
javac src/Main.java

# Run the application
java -cp src Main
```

#### Using Maven (recommended):
```bash
# Compile the application
mvn compile

# Run the application
mvn exec:java -Dexec.mainClass="Main"

# Run tests
mvn test

# Build JAR
mvn package
```

### Expected Output
```
Hello and welcome!
i = 1
i = 2
i = 3
i = 4
i = 5
```

## Project Structure

```
├── src/
│   └── Main.java          # Main application class
├── src/test/java/         # Test source files
├── pom.xml               # Maven build configuration
├── README.md             # Project documentation
└── LICENSE              # License file
```

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

- Project Repository: [https://github.com/blackchoey/backend-agent-test](https://github.com/blackchoey/backend-agent-test)