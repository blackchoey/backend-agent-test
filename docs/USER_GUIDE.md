# User Guide

Welcome to the Binary Search Implementation User Guide! This document will help you understand and effectively use this educational binary search implementation.

## Table of Contents

- [Quick Start](#quick-start)
- [Understanding Binary Search](#understanding-binary-search)
- [Installation and Setup](#installation-and-setup)
- [Using the Command Line Interface](#using-the-command-line-interface)
- [Using the API in Your Code](#using-the-api-in-your-code)
- [Common Use Cases](#common-use-cases)
- [Troubleshooting](#troubleshooting)
- [Best Practices](#best-practices)

## Quick Start

### 1. Get the Code
```bash
git clone https://github.com/blackchoey/backend-agent-test.git
cd backend-agent-test
```

### 2. Compile and Run
```bash
javac src/Main.java
java -cp src Main 1 2 3 4 5 3
```

**Expected Output:**
```
Result index: 2
```

That's it! You've successfully run your first binary search.

## Understanding Binary Search

### What is Binary Search?

Binary search is an efficient algorithm for finding a target value in a **sorted** array. It works by repeatedly dividing the search space in half.

**Key Concepts:**
- **Sorted Data**: The array must be sorted for binary search to work correctly
- **Divide and Conquer**: Each step eliminates half of the remaining possibilities
- **Logarithmic Time**: Much faster than linear search for large datasets

### How It Works

1. **Start** with the entire sorted array
2. **Compare** the target with the middle element
3. **Eliminate** half the array based on the comparison
4. **Repeat** until the element is found or the search space is empty

**Visual Example:**
```
Array: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Target: 6

Step 1: Check middle (5) → 6 > 5, search right half
        [6, 7, 8, 9]

Step 2: Check middle (7) → 6 < 7, search left half  
        [6]

Step 3: Check middle (6) → 6 = 6, found at index 5!
```

### Why Use Binary Search?

**Performance Comparison:**

| Array Size | Linear Search | Binary Search |
|------------|---------------|---------------|
| 10 | 5 comparisons (avg) | 3 comparisons (max) |
| 100 | 50 comparisons (avg) | 7 comparisons (max) |
| 1,000 | 500 comparisons (avg) | 10 comparisons (max) |
| 1,000,000 | 500,000 comparisons (avg) | 20 comparisons (max) |

## Installation and Setup

### System Requirements

- **Java 8 or higher**
- **Any operating system** (Windows, macOS, Linux)
- **Command line access**

### Detailed Installation

See our comprehensive [INSTALL.md](../INSTALL.md) guide for platform-specific instructions.

### Quick Setup Verification

```bash
# Check Java installation
java -version
javac -version

# Compile the program
javac src/Main.java

# Test basic functionality
java -cp src Main 1 2 3 4 5 3
```

## Using the Command Line Interface

### Basic Syntax

```bash
java -cp src Main <array_elements> <target_value>
```

### Command Structure

- **Array Elements**: Space-separated integers (must be sorted)
- **Target Value**: The integer you want to find
- **Order Matters**: Array elements must be in ascending order

### Examples

#### Example 1: Element Found
```bash
java -cp src Main 1 2 3 4 5 3
```
**Output:** `Result index: 2`
**Explanation:** Value 3 is found at index 2 (0-based indexing)

#### Example 2: Element Not Found
```bash
java -cp src Main 1 2 3 4 5 7
```
**Output:** `Result index: -1`
**Explanation:** Value 7 is not in the array

#### Example 3: Single Element Array
```bash
java -cp src Main 42 42
```
**Output:** `Result index: 0`
**Explanation:** Single element found at index 0

#### Example 4: First and Last Elements
```bash
# First element
java -cp src Main 1 2 3 4 5 1
# Output: Result index: 0

# Last element  
java -cp src Main 1 2 3 4 5 5
# Output: Result index: 4
```

### Error Cases

#### Insufficient Arguments
```bash
java -cp src Main 5
```
**Output:**
```
Usage: java Main <array elements> <target value>
Example: java Main 1 2 3 4 5 5
```

#### Invalid Input
```bash
java -cp src Main a b c d
```
**Result:** `NumberFormatException` - all arguments must be integers

## Using the API in Your Code

### Basic Usage

```java
// Direct usage (same package)
public class MyProgram {
    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9, 11, 13};
        int index = Main.binarySearch(data, 7);
        System.out.println("Found at index: " + index); // Output: 3
    }
}
```

### Integration Patterns

#### Pattern 1: Search and Process
```java
public class DataProcessor {
    public void processItem(int[] sortedData, int targetValue) {
        int index = Main.binarySearch(sortedData, targetValue);
        
        if (index >= 0) {
            System.out.println("Processing item at index " + index);
            // Process the found item
        } else {
            System.out.println("Item not found, using default processing");
            // Handle item not found
        }
    }
}
```

#### Pattern 2: Validation Helper
```java
public class DataValidator {
    public boolean contains(int[] sortedData, int value) {
        return Main.binarySearch(sortedData, value) >= 0;
    }
    
    public boolean isValidSelection(int[] allowedValues, int userInput) {
        return contains(allowedValues, userInput);
    }
}
```

## Common Use Cases

### 1. Educational Projects

**Perfect for:**
- Algorithm learning and teaching
- Computer science coursework
- Coding interviews preparation
- Algorithm comparison studies

### 2. Data Lookup Applications

**Suitable for:**
- ID validation systems
- Grade boundaries checking
- Price point verification
- Configuration value lookup

### 3. Testing and Validation

**Useful for:**
- Algorithm correctness verification
- Performance benchmarking
- Edge case testing
- Input validation

## Troubleshooting

### Common Issues and Solutions

#### Issue 1: "Could not find or load main class Main"
**Cause:** Incorrect classpath or working directory
**Solution:**
```bash
# Ensure you're in the project root directory
cd backend-agent-test

# Use correct classpath
java -cp src Main 1 2 3 4 5 3
```

#### Issue 2: Wrong Results
**Cause:** Array is not sorted
**Solution:**
```java
// Incorrect (unsorted)
int[] data = {5, 1, 3, 2, 4};
int result = Main.binarySearch(data, 3); // May return wrong result

// Correct (sorted)
int[] data = {1, 2, 3, 4, 5};
int result = Main.binarySearch(data, 3); // Returns correct result
```

#### Issue 3: NumberFormatException
**Cause:** Non-numeric command line arguments
**Solution:**
```bash
# Incorrect
java -cp src Main one two three four

# Correct
java -cp src Main 1 2 3 4
```

### Getting Help

If you encounter issues:

1. **Check Documentation**: Read this guide and [SUPPORT.md](../SUPPORT.md)
2. **Verify Prerequisites**: Ensure Java is properly installed
3. **Test with Examples**: Try the provided examples first
4. **Search Issues**: Check [GitHub Issues](https://github.com/blackchoey/backend-agent-test/issues)
5. **Ask for Help**: Create a new issue with detailed information

## Best Practices

### For Learning

1. **Start Simple**: Begin with small, manually created arrays
2. **Trace Execution**: Follow the algorithm step-by-step on paper
3. **Test Edge Cases**: Try empty arrays, single elements, boundaries
4. **Compare Algorithms**: Implement linear search to see the difference
5. **Measure Performance**: Time both algorithms on different array sizes

### For Development

1. **Always Sort First**: Ensure your data is sorted before searching
2. **Handle Edge Cases**: Check for null arrays and empty arrays
3. **Validate Input**: Verify that your data meets preconditions
4. **Document Assumptions**: Make sorting requirements clear
5. **Test Thoroughly**: Include boundary and error conditions

### For Production Use

1. **Consider Thread Safety**: The method is thread-safe for read-only operations
2. **Profile Performance**: Measure actual performance in your environment
3. **Handle Exceptions**: Wrap calls in try-catch for robust error handling
4. **Use Appropriate Data Structures**: Consider TreeSet or other structures for dynamic data
5. **Document Dependencies**: Make sorting requirements explicit in your API

---

For more information, see:
- [API Documentation](API.md) - Detailed method specifications
- [Developer Guide](DEVELOPER.md) - Contributing to the project
- [README.md](../README.md) - Project overview