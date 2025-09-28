# API Documentation

This document provides detailed API documentation for the Binary Search Implementation project.

## Table of Contents

- [Overview](#overview)
- [Class: Main](#class-main)
- [Method: binarySearch](#method-binarysearch)
- [Method: main](#method-main)
- [Usage Examples](#usage-examples)
- [Error Handling](#error-handling)
- [Performance Characteristics](#performance-characteristics)

## Overview

The Binary Search Implementation provides a simple, educational implementation of the binary search algorithm in Java. The API consists of a single class with two public methods.

## Class: Main

**Package:** Default package  
**File:** `src/Main.java`

The `Main` class contains the binary search implementation and command-line interface.

### Methods

#### Method: binarySearch

```java
public static int binarySearch(int[] arr, int b)
```

Performs binary search on a sorted integer array to find the index of a target value.

**Parameters:**
- `arr` (`int[]`) - A sorted array of integers to search in
- `b` (`int`) - The target value to search for

**Returns:**
- `int` - The index of the target element if found, or -1 if not found

**Preconditions:**
- The input array must be sorted in ascending order
- The array can be empty (length 0)
- The array can contain duplicate elements

**Postconditions:**
- Returns a valid index (0 to arr.length-1) if the element is found
- Returns -1 if the element is not found
- Does not modify the input array

**Time Complexity:** O(log n) where n is the length of the array  
**Space Complexity:** O(1) - uses constant extra space

**Algorithm Details:**
- Uses iterative approach (not recursive)
- Implements the standard binary search algorithm
- Handles edge cases properly (empty arrays, single elements)

**Example Usage:**
```java
int[] sortedArray = {1, 2, 3, 4, 5};
int index = Main.binarySearch(sortedArray, 3);
// Returns: 2
```

**Edge Cases:**
- Empty array: Returns -1
- Single element array: Returns 0 if found, -1 if not found
- Target is first element: Returns 0
- Target is last element: Returns arr.length-1
- Target not in array: Returns -1
- Duplicate elements: Returns index of any occurrence (implementation-specific)

#### Method: main

```java
public static void main(String[] args)
```

Command-line interface for testing the binary search implementation.

**Parameters:**
- `args` (`String[]`) - Command-line arguments where:
  - `args[0]` to `args[n-2]` are the array elements (integers)
  - `args[n-1]` is the target value to search for

**Returns:**
- `void` - Prints results to standard output

**Behavior:**
- Validates command-line arguments
- Parses string arguments to integers
- Calls the binary search method
- Prints the result index or error messages

**Output Format:**
```
Result index: <index>
```

**Error Messages:**
```
Usage: java Main <array elements> <target value>
Example: java Main 1 2 3 4 5 5
```

## Usage Examples

### Basic Usage

```java
// Direct method call
int[] arr = {1, 3, 5, 7, 9};
int result = Main.binarySearch(arr, 5);
System.out.println("Index: " + result); // Output: Index: 2
```

### Command Line Usage

```bash
# Search for 3 in array [1, 2, 3, 4, 5]
java -cp src Main 1 2 3 4 5 3
# Output: Result index: 2

# Search for element not in array
java -cp src Main 1 2 3 4 5 7
# Output: Result index: -1

# Single element array
java -cp src Main 42 42
# Output: Result index: 0
```

### Integration Example

```java
public class MyClass {
    public void example() {
        // Create a sorted array
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        // Search for various elements
        System.out.println("Index of 30: " + Main.binarySearch(data, 30)); // 2
        System.out.println("Index of 75: " + Main.binarySearch(data, 75)); // -1
        System.out.println("Index of 10: " + Main.binarySearch(data, 10)); // 0
        System.out.println("Index of 100: " + Main.binarySearch(data, 100)); // 9
    }
}
```

## Error Handling

### Input Validation

The binary search method itself does not perform extensive input validation for performance reasons. However, the command-line interface includes validation:

**Command-line validation:**
- Checks for minimum number of arguments (at least 2)
- Validates that all arguments can be parsed as integers
- Provides clear usage instructions on error

**Method-level considerations:**
- Null array: Will throw `NullPointerException`
- Empty array: Returns -1 (handled gracefully)
- Unsorted array: May return incorrect results (precondition violation)

### Exception Scenarios

```java
// These will throw exceptions:
Main.binarySearch(null, 5);           // NullPointerException
Main.binarySearch(new int[]{}, 5);    // Returns -1 (not an exception)

// Command line:
java -cp src Main                     // Shows usage message
java -cp src Main abc def             // NumberFormatException
java -cp src Main 1                   // Shows usage message
```

## Performance Characteristics

### Time Complexity

| Operation | Best Case | Average Case | Worst Case |
|-----------|-----------|--------------|------------|
| Binary Search | O(1) | O(log n) | O(log n) |

**Explanation:**
- **Best Case:** Target element is at the middle position
- **Average Case:** Target element requires log₂(n) comparisons
- **Worst Case:** Target element is not found or at a position requiring maximum comparisons

### Space Complexity

- **Space Complexity:** O(1) - Constant extra space
- **In-place algorithm:** Does not require additional arrays or data structures
- **Iterative implementation:** No recursive call stack overhead

### Performance Comparison

For an array of size n:

| Array Size | Max Comparisons | Performance |
|------------|----------------|-------------|
| 10 | 4 | Excellent |
| 100 | 7 | Excellent |
| 1,000 | 10 | Excellent |
| 1,000,000 | 20 | Excellent |
| 1,000,000,000 | 30 | Excellent |

---

For more information, see:
- [User Guide](USER_GUIDE.md) - How to use the binary search implementation
- [Developer Guide](DEVELOPER.md) - How to contribute and extend the code
- [README.md](../README.md) - Project overview and quick start