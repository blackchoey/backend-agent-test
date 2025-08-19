# Backend Agent Test

A simple Java application for testing backend agent functionality.

## Description

This is a basic Java project that demonstrates a simple "Hello World" application with a counting loop. It serves as a foundation for testing backend automation and CI/CD processes.

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher (for building)

## Building the Project

To compile and build the project:

```bash
mvn compile
```

To run the application:

```bash
mvn exec:java -Dexec.mainClass="Main"
```

Alternatively, you can compile and run directly with javac:

```bash
javac src/Main.java
java -cp src Main
```

## Running Tests

To run the unit tests:

```bash
mvn test
```

## Project Structure

```
backend-agent-test/
├── src/
│   ├── main/java/
│   │   └── Main.java          # Main application class
│   └── test/java/
│       └── MainTest.java      # Unit tests
├── .github/workflows/
│   └── ci.yml                 # GitHub Actions CI/CD
├── pom.xml                    # Maven build configuration
├── README.md                  # Project documentation
├── LICENSE                    # Project license
├── CONTRIBUTING.md            # Contribution guidelines
├── CHANGELOG.md               # Version history
└── .gitignore                 # Git ignore rules
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For questions or issues, please open an issue on GitHub.