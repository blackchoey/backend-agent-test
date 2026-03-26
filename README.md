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

Compile and run from the command line, passing the array elements followed by the target value as arguments:

```bash
javac src/Main.java -d out
java -cp out Main <array elements> <target value>
```

**Example** — search for `5` in the array `[1, 2, 3, 4, 5]`:

```bash
java -cp out Main 1 2 3 4 5 5
# Output: Result index: 4
```

The last argument is treated as the target; all preceding arguments form the sorted array.

## Requirements

- Java 8 or later
