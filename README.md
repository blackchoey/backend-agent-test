# backend-agent-test

A simple Java project demonstrating a binary search implementation.

## Overview

This project contains a `Main` class with a `binarySearch` method that searches for a target value in a sorted integer array and returns its index, or `-1` if not found.

## Requirements

- Java Development Kit (JDK) 8 or higher

## Build & Run

Compile the source file from the repository root:

```bash
javac src/Main.java
```

Run the program by passing a sorted array of integers followed by the target value:

```bash
java -cp src Main <array elements> <target value>
```

### Example

```bash
java -cp src Main 1 2 3 4 5 5
```

This searches for `5` in the array `[1, 2, 3, 4, 5]` and prints the result index.

## Project Structure

```
backend-agent-test/
└── src/
    └── Main.java   # Binary search implementation and entry point
```
