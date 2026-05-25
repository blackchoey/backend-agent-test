# Binary Search

A Java implementation of the binary search algorithm.

## Overview

This project provides a binary search utility that searches for a target value within a sorted integer array and returns its index, or `-1` if the value is not found.

## Requirements

- Java Development Kit (JDK) 8 or higher

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

**Example** – search for `5` in the array `[1, 2, 3, 4, 5]`:

```bash
java -cp src Main 1 2 3 4 5 5
```

Expected output:

```
Result index: 4
```

If the target is not found, the program prints:

```
Result index: -1
```
