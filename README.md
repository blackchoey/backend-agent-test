# Binary Search Java Application

A simple Java application that implements binary search functionality to find elements in sorted arrays.

## Description

This project contains a Java implementation of the binary search algorithm. The application takes command-line arguments representing array elements and a target value, then searches for the target value in the array using binary search.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A terminal or command prompt

## How to Compile and Run

### Compilation

From the project root directory, compile the Java source code:

```bash
javac src/Main.java -d .
```

### Running the Application

```bash
java Main <array_elements> <target_value>
```

Where:
- `<array_elements>` - Space-separated integers representing the sorted array
- `<target_value>` - The integer value to search for

### Usage Examples

```bash
# Search for value 3 in array [1, 2, 3, 4, 5]
java Main 1 2 3 4 5 3
# Output: Result index: 2

# Search for value 1 in array [1, 2, 3, 4, 5]
java Main 1 2 3 4 5 1
# Output: Result index: 0

# Search for value 6 (not in array) in array [1, 2, 3, 4, 5]
java Main 1 2 3 4 5 6
# Output: Result index: -1
```

## Expected Input/Output

- **Input**: Command-line arguments where the last argument is the target value and all preceding arguments form the sorted array
- **Output**: The index (0-based) of the target value in the array, or -1 if not found

## Project Structure

```
.
├── src/
│   └── Main.java          # Main application with binary search implementation
├── .gitignore            # Git ignore file
├── .idea/                # IntelliJ IDEA configuration files
├── test.iml              # IntelliJ module file
└── README.md             # This file
```

## Known Issues

⚠️ **Bug Alert**: The current binary search implementation contains a bug in the while loop condition. The condition `while (i < j)` should be `while (i <= j)` for correct behavior. This bug may cause the algorithm to miss certain values, particularly the last element in some cases.

## Algorithm Details

The binary search algorithm works by:
1. Taking a sorted array and a target value
2. Repeatedly dividing the search space in half
3. Comparing the middle element with the target
4. Eliminating half of the remaining elements based on the comparison
5. Continuing until the target is found or the search space is exhausted

**Time Complexity**: O(log n)  
**Space Complexity**: O(1)

## Error Handling

The application includes basic input validation:
- Requires at least 2 command-line arguments (array + target)
- Provides usage instructions if insufficient arguments are provided
- Assumes all inputs are valid integers

## Contributing

This is a test repository. If you'd like to fix the known bug or make improvements, please ensure that:
1. The array input is sorted (binary search requirement)
2. All test cases pass after modifications
3. The fix addresses the while loop condition issue