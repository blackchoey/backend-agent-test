# Backend Agent Test

A simple Java application demonstrating basic console output and loop iteration.

## Description

This project contains a basic Java program that prints a welcome message and demonstrates a simple for loop. It serves as a foundation for testing backend development practices and can be extended for more complex functionality.

## Features

- Simple console output
- Loop iteration demonstration
- Clean, readable code structure

## Prerequisites

- Java 11 or higher
- Maven 3.6+ (recommended)

## Building and Running

### Using Java directly

```bash
# Compile the program
javac src/Main.java

# Run the program
java -cp src Main
```

### Using Maven (recommended)

```bash
# Compile and package
mvn compile

# Run the application
mvn exec:java -Dexec.mainClass="Main"
```

## Expected Output

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
.
├── src/
│   └── Main.java          # Main application class
├── .gitignore            # Git ignore rules
├── README.md             # This file
├── LICENSE               # Project license
└── pom.xml               # Maven build configuration
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Changelog

See [CHANGELOG.md](CHANGELOG.md) for a detailed history of changes.