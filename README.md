# Backend Agent Test

A simple Java application demonstrating basic programming concepts with a Hello World example and loop iteration.

## Description

This is a basic Java console application that:
- Prints a welcome message
- Demonstrates a simple for loop by counting from 1 to 5
- Serves as a starting point for Java development

## Prerequisites

- Java 17 or higher
- Java Development Kit (JDK) installed
- Command line access or IDE support

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

## Usage

### Compile and Run from Command Line

1. Create the output directory:
   ```bash
   mkdir -p out
   ```

2. Compile the Java source code:
   ```bash
   javac src/Main.java -d out
   ```

3. Run the application:
   ```bash
   java -cp out Main
   ```

### Expected Output

```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

### Using an IDE

This project includes IntelliJ IDEA configuration files (`.iml`). You can:
1. Open the project in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Run the main method directly from the IDE

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application file
├── .gitignore             # Git ignore patterns
├── test.iml               # IntelliJ IDEA module file
└── README.md              # This file
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Support

If you encounter any issues or have questions, please open an issue on the [GitHub repository](https://github.com/blackchoey/backend-agent-test/issues).