# Backend Agent Test

A simple Java application that implements a binary search algorithm to find elements in a sorted array.

## Description

This project contains a command-line Java application that performs binary search on an array of integers. The program accepts array elements and a target value as command-line arguments, then returns the index of the target element if found, or -1 if not found.

## Features

- Binary search implementation for efficient element lookup
- Command-line interface for easy testing
- Accepts variable-length integer arrays
- Returns zero-based index of found elements

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A command-line terminal

## Building the Project

To compile the project, navigate to the project root directory and run:

```bash
javac -d out src/Main.java
```

This will compile the source code and place the compiled `.class` files in the `out` directory.

## Usage

After building the project, run the program using:

```bash
java -cp out Main <array elements> <target value>
```

### Parameters

- `<array elements>`: Space-separated integers representing the sorted array
- `<target value>`: The integer value to search for in the array

### Examples

Search for the value `3` in the array `[1, 2, 3, 4, 5]`:

```bash
java -cp out Main 1 2 3 4 5 3
```

Output:
```
Result index: 2
```

Search for the value `7` in the array `[1, 3, 5, 9]`:

```bash
java -cp out Main 1 3 5 9 7
```

Output:
```
Result index: -1
```

### Error Handling

If insufficient arguments are provided, the program will display usage information:

```bash
java -cp out Main
```

Output:
```
Usage: java Main <array elements> <target value>
Example: java Main 1 2 3 4 5 5
```

## Project Structure

```
.
├── src/
│   └── Main.java       # Main application file with binary search implementation
├── out/                # Compiled class files (generated after build)
└── README.md           # This file
```

## Algorithm

The binary search algorithm divides the search interval in half repeatedly until the target value is found or the interval is empty. The time complexity is O(log n), making it efficient for searching in sorted arrays.

## License

This project is provided as-is for testing and educational purposes.
