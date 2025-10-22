# Backend Agent Test

A simple Java project demonstrating a binary search implementation.

## Description

This project contains a Java implementation of a binary search algorithm. The implementation is designed for educational and testing purposes, demonstrating how binary search works on sorted arrays.

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java       # Main class with binary search implementation
├── .gitignore
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (IntelliJ IDEA, Eclipse, etc.) or command-line tools

## Compilation

To compile the project, navigate to the project root directory and run:

```bash
javac src/Main.java
```

## Usage

The program accepts command-line arguments consisting of an array of integers followed by a target value to search for.

```bash
java -cp src Main <array elements> <target value>
```

### Example

```bash
java -cp src Main 1 2 3 4 5 5
```

This will search for the value `5` in the array `[1, 2, 3, 4, 5]`.

### Output

The program will output the index of the target value if found, or `-1` if not found:

```
Result index: 4
```

### Usage Information

If you run the program without arguments or with insufficient arguments, it will display usage instructions:

```bash
java -cp src Main
```

Output:
```
Usage: java Main <array elements> <target value>
Example: java Main 1 2 3 4 5 5
```

## How Binary Search Works

Binary search is an efficient algorithm for finding a target value within a sorted array. It works by repeatedly dividing the search interval in half:

1. Compare the target value to the middle element of the array
2. If the target matches the middle element, return its position
3. If the target is less than the middle element, search the left half
4. If the target is greater than the middle element, search the right half
5. Repeat until the value is found or the search space is empty

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)

## Note

This implementation contains a deliberate bug in the binary search algorithm (line 7) for testing purposes. The condition `i < j` should be `i <= j` for a correct implementation.

## License

This project is for educational and testing purposes.
