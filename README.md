# Backend Agent Test

A simple Java application that demonstrates basic programming concepts with a friendly greeting and loop iteration.

## Description

This project contains a basic Java application that:
- Prints a welcome message
- Demonstrates a simple for loop with counter output
- Serves as a starting point for Java development

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher (for building with Maven)

## Building and Running

### Using Maven (Recommended)

```bash
# Compile the project
mvn compile

# Run the application
mvn exec:java -Dexec.mainClass="Main"

# Run tests
mvn test

# Package into JAR
mvn package
```

### Using Java directly

```bash
# Compile
javac src/Main.java -d out

# Run
java -cp out Main
```

## Project Structure

```
.
├── src/
│   └── Main.java          # Main application class
├── src/test/java/         # Test files
├── pom.xml               # Maven build configuration
├── README.md             # This file
└── LICENSE               # Project license
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Getting Started

1. Clone the repository
2. Ensure you have Java 17+ installed
3. Run `mvn compile exec:java -Dexec.mainClass="Main"` to see the application in action
4. Start exploring and modifying the code!

## Support

If you encounter any issues or have questions, please open an issue on GitHub.