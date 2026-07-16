# backend-agent-test

A Java project containing a binary search implementation.

## Overview

This project implements a binary search algorithm in Java. The `binarySearch` method searches a sorted integer array for a target value and returns its index, or `-1` if not found.

## Prerequisites

- Java Development Kit (JDK) installed

## Build

Compile the source file from the repository root:

```bash
javac src/Main.java
```

## Usage

Run the program by providing a sorted array of integers followed by the target value as command-line arguments:

```bash
java -cp src Main <array elements> <target value>
```

**Example** — search for `3` in the array `[1, 2, 3, 4, 5]`:

```bash
java -cp src Main 1 2 3 4 5 3
```

Expected output:

```
Result index: 2
```

If the target is not found, the program prints:

```
Result index: -1
```
