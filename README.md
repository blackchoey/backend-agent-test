# Backend Agent Test

A Java-based binary search implementation project for testing purposes.

## Description

This project contains a simple Java application that implements a binary search algorithm. The program accepts an array of integers and a target value as command-line arguments, then performs a binary search to find the target value's index in the array.

## Features

- Binary search implementation
- Command-line interface for easy testing
- Returns the index of the target element or -1 if not found

## Requirements

- Java Development Kit (JDK) 17 or higher
- Java Runtime Environment (JRE) 17 or higher

## Building the Project

To compile the project, use the following command from the project root directory:

```bash
javac -d out src/Main.java
```

This will compile the source code and place the compiled `.class` files in the `out` directory.

## Usage

To run the program, use the following command:

```bash
java -cp out Main <array elements> <target value>
```

### Arguments

- `<array elements>`: Space-separated list of integers representing the array to search
- `<target value>`: The integer value to search for in the array

### Example

```bash
java -cp out Main 1 2 3 4 5 5
```

This command searches for the value `5` in the array `[1, 2, 3, 4, 5]`.

### Output

The program will output the index of the target value if found, or `-1` if the value is not present in the array:

```
Result index: 4
```

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application with binary search implementation
├── out/                   # Compiled class files (created after build)
└── README.md             # Project documentation
```

## Known Issues

The binary search implementation contains a known bug in the loop condition (line 7 of Main.java). The condition uses `i < j` when it should use `i <= j` for a correct binary search implementation. This may cause the algorithm to miss the target element in certain cases.

## License

This project is for testing purposes only.
