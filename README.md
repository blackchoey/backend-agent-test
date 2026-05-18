# Binary Search

A simple Java implementation of binary search.

## Description

This project provides a `binarySearch` method that searches for a target value within a sorted integer array and returns its index, or `-1` if the target is not found.

## Requirements

- Java Development Kit (JDK) 8 or later

## Build

Compile the source from the repository root:

```bash
javac src/Main.java
```

## Usage

Run the program by passing the array elements followed by the target value as command-line arguments:

```bash
java -cp src Main <array elements> <target value>
```

### Example

Search for `5` in the sorted array `[1, 2, 3, 4, 5]`:

```bash
java -cp src Main 1 2 3 4 5 5
```

Output:

```
Result index: 4
```

If the target is not found, the program prints `Result index: -1`.
