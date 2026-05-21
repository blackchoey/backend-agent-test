# Binary Search

A simple Java implementation of the binary search algorithm.

## Description

This project provides a `binarySearch` method that searches for a target value within a sorted integer array and returns its index, or `-1` if the value is not found.

## Build

Compile the source file from the repository root:

```bash
javac src/Main.java
```

## Usage

Run the program by passing the array elements followed by the target value as command-line arguments:

```bash
java -cp src Main <array elements> <target value>
```

**Example** — search for `3` in the array `[1, 2, 3, 4, 5]`:

```bash
java -cp src Main 1 2 3 4 5 3
```

Output:
```
Result index: 2
```

If the target is not found, the program prints `Result index: -1`.
