# Backend Agent Test

A simple Java application demonstrating basic console output and iteration.

## Description

This project contains a basic Java application that prints a welcome message and demonstrates a simple loop that outputs numbers from 1 to 5. It serves as a starting point for Java development and testing.

## Prerequisites

- Java 17 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line tools

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/blackchoey/backend-agent-test.git
cd backend-agent-test
```

### Compile and Run

#### Using Command Line

```bash
# Create output directory
mkdir -p out

# Compile the Java source
javac src/Main.java -d out

# Run the application
java -cp out Main
```

#### Using Maven (if configured)

```bash
mvn compile exec:java -Dexec.mainClass="Main"
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
backend-agent-test/
├── src/
│   └── Main.java          # Main application entry point
├── .gitignore             # Git ignore rules
├── README.md              # This file
└── test.iml               # IntelliJ IDEA module file
```

## Contributing

We welcome contributions! Please see [CONTRIBUTING.md](CONTRIBUTING.md) for details on how to contribute to this project.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Code of Conduct

Please read our [Code of Conduct](CODE_OF_CONDUCT.md) to understand the expected behavior in our community.

## Security

If you discover any security vulnerabilities, please see our [Security Policy](SECURITY.md) for reporting guidelines.