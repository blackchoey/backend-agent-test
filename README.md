# Backend Agent Test

A simple Java application demonstrating basic functionality and serving as a template for open source development.

## Description

This project contains a basic Java application that outputs a welcome message and demonstrates a simple loop structure. It serves as a foundation for building more complex backend applications.

## Features

- Simple console output
- Loop demonstration
- Java 17 compatibility
- Maven build system

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. Build the project:
   ```bash
   mvn compile
   ```

3. Run the application:
   ```bash
   mvn exec:java -Dexec.mainClass="Main"
   ```

### Using Java directly

Alternatively, you can compile and run using Java directly:

```bash
javac src/Main.java -d out
java -cp out Main
```

## Project Structure

```
backend-agent-test/
├── src/                    # Source code
│   └── Main.java          # Main application class
├── tests/                 # Test files
├── docs/                  # Documentation
├── .github/               # GitHub templates and workflows
├── pom.xml               # Maven configuration
├── README.md             # This file
└── LICENSE               # License information
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Security

For information about security policies and reporting vulnerabilities, see [SECURITY.md](SECURITY.md).

## Changelog

See [CHANGELOG.md](CHANGELOG.md) for a list of changes and version history.

## Support

If you encounter any issues or have questions, please [open an issue](https://github.com/blackchoey/backend-agent-test/issues) on GitHub.