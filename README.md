# Backend Agent Test

A simple Java project demonstrating a binary search implementation.

## Overview

This project contains a `Main` class with a binary search algorithm that searches for a target value within a sorted integer array.

## Project Structure

```
src/
└── Main.java   # Binary search implementation and entry point
```

## Usage

Compile and run from the command line:

```bash
javac src/Main.java -d out
java -cp out Main <array elements> <target value>
```

### Example

```bash
java -cp out Main 1 2 3 4 5 5
```

The last argument is the target value to search for. All preceding arguments form the sorted array.

**Output:**
```
Result index: 4
```

Returns the zero-based index of the target in the array, or `-1` if not found.

## Requirements

- Java 8 or later
