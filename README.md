# Backend Agent Test

A simple Java backend application demonstrating basic functionality.

## Description

This is a Java backend project that provides a simple command-line application. The main functionality includes a welcome message and a basic counter loop.

## Prerequisites

- Java 8 or higher
- Maven 3.6+ (for building with Maven)

## Getting Started

### Building and Running

#### Using Java directly:
```bash
# Compile
javac src/Main.java

# Run
java -cp src Main
```

#### Using Maven (recommended):
```bash
# Clean and compile
mvn clean compile

# Run
mvn exec:java -Dexec.mainClass="Main"

# Build JAR
mvn package
```

### Expected Output
```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

## Project Structure

```
.
├── src/
│   └── Main.java          # Main application class
├── .gitignore            # Git ignore patterns
├── README.md             # This file
├── LICENSE               # Project license
└── pom.xml               # Maven build configuration
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Support

If you encounter any issues or have questions, please file an issue on the GitHub repository.