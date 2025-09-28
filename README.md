# Binary Search Implementation

A simple Java implementation of the binary search algorithm for educational purposes.

## Description

This project provides a straightforward implementation of binary search in Java. Binary search is an efficient algorithm for finding a target value in a sorted array by repeatedly dividing the search interval in half.

## Features

- Efficient O(log n) time complexity binary search
- Command-line interface for easy testing
- Clear error handling and usage instructions

## Installation

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A terminal or command prompt

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. Compile the Java source:
   ```bash
   javac src/Main.java
   ```

## Usage

Run the program from the command line with the following syntax:

```bash
java -cp src Main <array elements> <target value>
```

### Examples

Search for value 3 in array [1, 2, 3, 4, 5]:
```bash
java -cp src Main 1 2 3 4 5 3
# Output: Result index: 2
```

Search for value 7 in array [1, 3, 5, 9]:
```bash
java -cp src Main 1 3 5 9 7
# Output: Result index: -1
```

### Return Values

- Returns the index of the target element if found
- Returns -1 if the target element is not in the array

## API Documentation

### `binarySearch(int[] arr, int target)`

Performs binary search on a sorted integer array.

**Parameters:**
- `arr`: Sorted array of integers
- `target`: The value to search for

**Returns:**
- `int`: Index of the target element, or -1 if not found

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Support

If you have questions or need help, please check our [SUPPORT.md](SUPPORT.md) file or open an issue.

## Authors

See [AUTHORS.md](AUTHORS.md) for a list of contributors who participated in this project.