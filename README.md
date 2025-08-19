# Backend Agent Test

A simple Java application for testing backend agent functionality.

## Description

This is a basic Java console application that demonstrates a simple "Hello World" program with a counting loop. The project serves as a foundation for backend agent testing and development.

## Features

- Simple Java console output
- Basic loop demonstration
- Clean project structure

## Prerequisites

- Java 17 or higher
- Maven 3.6+ (for building with Maven)

## Building and Running

### Using Java directly:
```bash
# Compile the source code
javac src/Main.java

# Run the application
java -cp src Main
```

### Using Maven:
```bash
# Compile and package
mvn compile

# Run the application
mvn exec:java -Dexec.mainClass="Main"
```

## Expected Output

```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java           # Main application class
├── .gitignore             # Git ignore rules
├── README.md              # This file
└── pom.xml                # Maven build configuration
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Security

If you discover a security vulnerability, please see our [Security Policy](SECURITY.md) for information on how to report it responsibly.