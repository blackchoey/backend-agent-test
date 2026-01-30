# Backend Agent Test

A simple Java project demonstrating a binary search implementation. This project is designed for testing and educational purposes.

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java        # Main class with binary search implementation
├── .gitignore          # Git ignore rules for Java projects
└── README.md           # This file
```

## Description

This project contains a Java implementation of a binary search algorithm. The `Main` class provides:
- A `binarySearch()` method that searches for a target value in a sorted array
- A `main()` method that accepts command-line arguments to test the search functionality

**Note**: The current implementation contains an intentional bug in the binary search algorithm (line 7). The while loop condition uses `i < j` instead of `i <= j`, which may cause the algorithm to miss the target value in certain edge cases.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A terminal or command prompt

## How to Compile

Navigate to the project directory and compile the Java file:

```bash
javac src/Main.java
```

## How to Run

After compilation, run the program with the following syntax:

```bash
java -cp src Main <array_elements> <target_value>
```

### Usage Examples

1. Search for the value 5 in the array [1, 2, 3, 4, 5]:
   ```bash
   java -cp src Main 1 2 3 4 5 5
   ```

2. Search for the value 3 in the array [1, 2, 3, 4, 5]:
   ```bash
   java -cp src Main 1 2 3 4 5 3
   ```

3. Search for a value not in the array:
   ```bash
   java -cp src Main 1 2 3 4 5 10
   ```

### Expected Output

The program will output the index of the target value in the array (0-indexed), or `-1` if the value is not found:

```
Result index: 2
```

## Known Issues

- The binary search implementation has a bug in the loop condition (line 7 of Main.java) that may cause incorrect results in certain cases
- This bug is intentional for testing and educational purposes

## License

This project is for testing purposes.
