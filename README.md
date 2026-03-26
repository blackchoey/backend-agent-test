# Backend Agent Test

A Java project demonstrating a binary search algorithm implementation.

## Overview

This project contains a `Main` class with a binary search method that searches for a target value within a sorted integer array.

## Project Structure

```
src/
└── Main.java   # Main class with binary search implementation
```

## Usage

Compile and run from the `src` directory:

```bash
javac Main.java
java Main <array elements> <target value>
```

### Example

```bash
java Main 1 2 3 4 5 5
```

The last argument is the target value to search for. All preceding arguments are the elements of the sorted array.

**Output:**
```
Result index: 4
```

Returns the index of the target in the array, or `-1` if not found.

## Requirements

- Java 8 or higher
