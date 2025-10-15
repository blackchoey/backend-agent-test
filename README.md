# Backend Agent Test

A Java application that implements a binary search algorithm for finding elements in sorted arrays.

## Description

This project contains a simple Java implementation of the binary search algorithm. The program accepts command-line arguments to perform binary search operations on integer arrays.

## Features

- Binary search implementation for sorted integer arrays
- Command-line interface for easy testing
- Returns the index of the target element or -1 if not found

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java Runtime Environment (JRE)

## Installation

1. Clone the repository:
```bash
git clone https://github.com/blackchoey/backend-agent-test.git
cd backend-agent-test
```

2. Compile the Java source code:
```bash
javac src/Main.java
```

## Usage

Run the program with the following command:

```bash
java -cp src Main <array_elements> <target_value>
```

### Arguments

- `<array_elements>`: Space-separated integers representing the sorted array
- `<target_value>`: The integer value to search for in the array

### Example

```bash
java -cp src Main 1 2 3 4 5 5
```

This command searches for the value `5` in the array `[1, 2, 3, 4, 5]`.

### Output

The program outputs the index of the target element in the array:
```
Result index: 4
```

If the element is not found, it returns:
```
Result index: -1
```

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java       # Main application with binary search implementation
├── .gitignore          # Git ignore rules
└── README.md           # This file
```

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is available for educational and testing purposes.
