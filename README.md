# Binary Search Test Project

A Java application demonstrating a binary search implementation with a known bug. This project is useful for learning about binary search algorithms and debugging techniques.

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application with binary search
├── .gitignore            # Git ignore patterns
├── .idea/                # IntelliJ IDEA configuration
├── test.iml              # IntelliJ IDEA module file
└── README.md             # Project documentation
```

## Description

This Java console application implements a binary search algorithm to find elements in a sorted array. The program takes command-line arguments and searches for a target value in the provided array.

**Note:** The implementation contains a known bug in the loop condition (`while (i < j)` should be `while (i <= j)`), which causes it to fail when searching for the last element in the array.

## Features

- Binary search implementation for sorted integer arrays
- Command-line interface for easy testing
- Educational example demonstrating a common binary search bug
- Clear usage instructions and examples

## Requirements

- Java Development Kit (JDK) 8 or higher
- IntelliJ IDEA (recommended) or any Java IDE/text editor

## How to Run

### Using Command Line

1. Navigate to the project directory
2. Compile the Java file:
   ```bash
   javac src/Main.java
   ```
3. Run the program with array elements followed by the target value:
   ```bash
   java -cp src Main <array elements> <target value>
   ```

### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Configure Run Configuration with program arguments
4. Click the green run button or press `Ctrl+Shift+F10`

## Usage Examples

Search for element 3 in array [1, 2, 3, 4, 5]:
```bash
java -cp src Main 1 2 3 4 5 3
```
Output: `Result index: 2`

Search for element 1 in array [1, 2, 3, 4, 5]:
```bash
java -cp src Main 1 2 3 4 5 1
```
Output: `Result index: 0`

Search for element 5 in array [1, 2, 3, 4, 5] (demonstrates the bug):
```bash
java -cp src Main 1 2 3 4 5 5
```
Output: `Result index: -1` (incorrect - should be 4)

Search for non-existent element:
```bash
java -cp src Main 1 2 3 4 5 10
```
Output: `Result index: -1`

## Known Issues

The binary search implementation has a bug in the loop condition:
- Current: `while (i < j)`
- Should be: `while (i <= j)`

This bug causes the search to fail when the target element is at the last position of the array. The program will return -1 (not found) instead of the correct index.

## Program Details

The `binarySearch` method:
- Takes a sorted integer array and a target value
- Returns the index of the target if found, -1 otherwise
- Uses the standard binary search algorithm with midpoint calculation to avoid integer overflow

The `main` method:
- Validates command-line arguments (minimum 2 required)
- Parses array elements from arguments
- Performs binary search for the target value
- Displays the result index

## Contributing

This is a test project for educational purposes. Feel free to fork and experiment with:
- Fixing the binary search bug
- Adding test cases
- Implementing iterative vs recursive binary search
- Extending to support different data types

## License

This project is for educational purposes.
