# Backend Agent Test

A simple Java project demonstrating a binary search implementation. This project is designed for testing backend agent capabilities.

## Overview

This repository contains a Java application that implements a binary search algorithm. The implementation includes a deliberately introduced bug for testing and educational purposes.

## Project Structure

```
.
├── src/
│   └── Main.java          # Main class with binary search implementation
├── .gitignore             # Git ignore configuration
└── README.md              # This file
```

## Requirements

- Java Development Kit (JDK) 8 or higher
- Java Runtime Environment (JRE) 8 or higher

## Building the Project

To compile the Java source code:

```bash
javac src/Main.java -d .
```

This will compile the `Main.java` file and place the compiled `.class` file in the current directory.

## Usage

The program performs binary search on a sorted array of integers.

### Syntax

```bash
java Main <array elements> <target value>
```

- `<array elements>`: Space-separated integers representing the sorted array
- `<target value>`: The integer value to search for

### Examples

Search for value `3` in the array `[1, 2, 3, 4, 5]`:
```bash
java Main 1 2 3 4 5 3
```
Output: `Result index: 2`

Search for value `5` in the array `[1, 2, 3, 4, 5]`:
```bash
java Main 1 2 3 4 5 5
```
Output: `Result index: 4`

Search for a value not in the array:
```bash
java Main 1 2 3 4 5 10
```
Output: `Result index: -1`

### Return Values

- Returns the index of the target value if found (0-based indexing)
- Returns `-1` if the target value is not found in the array

## Known Issues

⚠️ **Note**: This implementation contains a known bug in the binary search algorithm. The while loop condition uses `i < j` instead of `i <= j`, which may cause the algorithm to miss the target value in certain edge cases.

## License

This project is for testing and educational purposes.

## Repository

This project is hosted at: [https://github.com/blackchoey/backend-agent-test](https://github.com/blackchoey/backend-agent-test)
