# Binary Search Demo

A simple Java project demonstrating a binary search implementation.

## Overview

This project contains a `Main` class with a `binarySearch` method that searches for a target value in a sorted integer array and returns its index, or `-1` if the target is not found.

## Requirements

- Java (JDK 8 or higher)

## Building

Compile the source file from the project root:

```bash
javac src/Main.java -d out/
```

## Usage

Run the program by passing the array elements followed by the target value as command-line arguments:

```bash
java -cp out Main <array elements> <target value>
```

**Example** — search for `5` in the array `[1, 2, 3, 4, 5]`:

```bash
java -cp out Main 1 2 3 4 5 5
```

Expected output:

```
Result index: 4
```

## Project Structure

```
src/
└── Main.java   # Binary search implementation and entry point
```
