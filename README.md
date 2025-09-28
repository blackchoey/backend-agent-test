# Backend Agent Test

A simple Java "Hello World" application demonstrating basic Java programming concepts.

## Description

This project contains a basic Java application that prints a welcome message and demonstrates a simple loop iteration. It's designed as a starting point for Java development and testing.

## Features

- Simple console output
- Basic loop demonstration
- Clean, readable code structure

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA recommended) or command line tools

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. Compile the Java source code:
   ```bash
   mkdir -p out
   javac src/Main.java -d out
   ```

## Usage

Run the compiled application:
```bash
java -cp out Main
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
backend-agent-test/
├── src/
│   └── Main.java          # Main application class
├── .gitignore            # Git ignore file
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

## Development

### Using IntelliJ IDEA
1. Open the project in IntelliJ IDEA
2. The project should be automatically recognized as a Java project
3. Run the Main class directly from the IDE

### Using Command Line
1. Navigate to the project directory
2. Compile: `javac src/Main.java -d out`
3. Run: `java -cp out Main`

## Contributing

Contributions are welcome! Please read our [Contributing Guidelines](CONTRIBUTING.md) for details on how to submit pull requests, report issues, and contribute to the project.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

- Repository: [blackchoey/backend-agent-test](https://github.com/blackchoey/backend-agent-test)
- Issues: [GitHub Issues](https://github.com/blackchoey/backend-agent-test/issues)

## Acknowledgments

- Built with Java
- IntelliJ IDEA project structure