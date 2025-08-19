# Backend Agent Test

A simple Java application demonstrating basic functionality for backend agent testing.

## Description

This is a basic Java console application that prints a welcome message and demonstrates a simple loop. The project serves as a foundation for backend agent testing and can be extended with additional functionality.

## Features

- Simple console output
- Basic loop demonstration
- Clean project structure

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher (for building)

## Getting Started

### Building the Project

```bash
mvn clean compile
```

### Running the Application

```bash
mvn exec:java -Dexec.mainClass="Main"
```

Or manually with Java:

```bash
javac src/Main.java
java -cp src Main
```

### Running Tests

```bash
mvn test
```

## Project Structure

```
.
├── src/
│   └── Main.java          # Main application class
├── src/test/
│   └── java/              # Test files
├── pom.xml                # Maven configuration
├── README.md              # This file
└── LICENSE                # License information
```

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

See [CONTRIBUTING.md](CONTRIBUTING.md) for detailed guidelines.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Support

If you encounter any problems or have questions, please open an issue on GitHub.