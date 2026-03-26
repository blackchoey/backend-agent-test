# Binary Search — Java

A simple Java program that demonstrates a **binary search** implementation.

## Overview

`Main.java` contains:
- `binarySearch(int[] arr, int target)` — searches a sorted integer array for a target value and returns its index, or `-1` if not found.
- A `main` method that accepts command-line arguments and prints the result.

> **Known bug:** The `while` loop condition uses `i < j` instead of `i <= j`, so the element at the final remaining position is never checked. The target will not be found when the search space narrows to a single element.

## Prerequisites

- Java Development Kit (JDK) 8 or later

## Compile

```bash
javac src/Main.java -d out
```

## Run

```bash
java -cp out Main <array elements separated by spaces> <target value>
```

The last argument is the **target value**; all preceding arguments form the **sorted array**.

### Example

```bash
java -cp out Main 1 2 3 4 5 3
# Output: Result index: 2
```

```bash
java -cp out Main 1 2 3 4 5 9
# Output: Result index: -1
```

## Usage Help

Running the program with fewer than two arguments prints usage information:

```
Usage: java Main <array elements> <target value>
Example: java Main 1 2 3 4 5 5
```
