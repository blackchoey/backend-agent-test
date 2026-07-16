# 🤖 Backend Agent Test

A Java project demonstrating a binary search implementation.

## 📖 Overview

This project contains a `Main` class with a `binarySearch` method that searches for a target value in a sorted integer array and returns the index of the target, or `-1` if not found.

## ✅ Requirements

- ☕ Java Development Kit (JDK) 8 or later

## 🔨 Build

Compile the source from the repository root:

```bash
javac src/Main.java
```

## 🚀 Run

```bash
java -cp src Main <array elements> <target value>
```

The last argument is the target value to search for; all preceding arguments are the elements of the sorted array.

### 💡 Example

```bash
java -cp src Main 1 2 3 4 5 5
```

This searches for `5` in the array `[1, 2, 3, 4, 5]` and prints the result index.
