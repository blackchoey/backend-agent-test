# backend-agent-test

A Java project demonstrating a binary search implementation.

## Overview

This project contains a `Main` class with a `binarySearch` method that searches for a target value in a sorted integer array and returns its index, or `-1` if not found.

## Requirements

- Java Development Kit (JDK) 8 or later

## Build & Run

Compile the source:

```bash
javac src/Main.java
```

Run with a sorted array followed by the target value:

```bash
java -cp src Main <array elements> <target value>
```

### Example

Search for value `3` in the array `1 2 3 4 5`:

```bash
java -cp src Main 1 2 3 4 5 3
```

Output:
```
Result index: 2
```

If the target is not found, the result will be `-1`.

## Project Structure

```
.
└── src/
    └── Main.java   # Binary search implementation and entry point
```
