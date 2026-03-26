# Binary Search (Java)

A simple Java implementation of the binary search algorithm.

## Overview

This project demonstrates binary search — an efficient algorithm for finding a target value within a sorted array. It runs in O(log n) time by repeatedly halving the search space.

## Project Structure

```
src/
└── Main.java   # Binary search implementation and entry point
```

## Usage

### Compile

```bash
javac src/Main.java -d out
```

### Run

```bash
java -cp out Main <array elements> <target value>
```

The last argument is the **target value** to search for; all preceding arguments are the **sorted array elements**.

**Example** — search for `5` in the array `[1, 2, 3, 4, 5]`:

```bash
java -cp out Main 1 2 3 4 5 5
```

Expected output:

```
Result index: 4
```

If the target is not found, the program prints:

```
Result index: -1
```

## Requirements

- Java 8 or later
