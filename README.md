# Backend Agent Test

A simple Java project demonstrating a binary search implementation for testing and educational purposes.

## Overview

This project contains a Java implementation of the binary search algorithm. It's designed as a test project for backend agent interactions and demonstrates basic Java programming concepts.

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application with binary search implementation
├── .gitignore             # Git ignore rules
└── test.iml               # IntelliJ IDEA module file
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (IntelliJ IDEA recommended) or command-line Java compiler

## Building the Project

### Using Command Line

```bash
# Navigate to the project directory
cd backend-agent-test

# Compile the Java source file
javac src/Main.java

# The compiled class file will be in the src directory
```

### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. The project will automatically recognize the module configuration
3. Build the project using Build → Build Project (Ctrl+F9 / Cmd+F9)

## Running the Application

The application performs a binary search on a sorted array of integers.

### Usage

```bash
java -cp src Main <array elements> <target value>
```

### Examples

```bash
# Search for value 3 in array [1, 2, 3, 4, 5]
java -cp src Main 1 2 3 4 5 3

# Search for value 7 in array [1, 3, 5, 7, 9]
java -cp src Main 1 3 5 7 9 7
```

### Expected Output

The program will output the index of the target value in the array (0-based index), or -1 if the value is not found.

```
Result index: 2
```

## Features

- Binary search algorithm implementation
- Command-line interface for input
- Array parsing from command-line arguments
- Index-based search results

## Known Issues

The current implementation has a known bug in the binary search condition that may cause incorrect results in certain edge cases. This is intentional for testing purposes.

## Contributing

Contributions are welcome! Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

- Repository: [backend-agent-test](https://github.com/blackchoey/backend-agent-test)
- Issues: [Issue Tracker](https://github.com/blackchoey/backend-agent-test/issues)

## Acknowledgments

- Created for testing backend agent capabilities
- Educational resource for Java programming
