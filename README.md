# 🔍 Binary Search — Java

A simple Java project demonstrating a **binary search** algorithm.

## 📖 Overview

This project implements a classic binary search on a sorted integer array.  
The main class (`Main`) accepts a sorted list of integers and a target value as command-line arguments and prints the index of the target value, or `-1` if it is not found.

## 📁 Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java   # Binary search implementation and entry point
└── README.md
```

## ✅ Requirements

- Java 8 or higher

## 🔨 Building

Compile the source file from the repository root:

```bash
javac src/Main.java -d out/
```

## 🚀 Usage

Run the compiled class, passing the sorted array elements followed by the target value as arguments:

```bash
java -cp out Main <array elements> <target value>
```

**Example** — search for `5` in the array `[1, 2, 3, 4, 5]`:

```bash
java -cp out Main 1 2 3 4 5 5
# Output: Result index: 4
```

If the target is not found, the program prints:

```
Result index: -1
```

## 🧠 Algorithm

`binarySearch(int[] arr, int target)` uses a standard iterative binary search:

1. Maintain `left` and `right` pointers around the search range.
2. Calculate the midpoint `mid = left + (right - left) / 2`.
3. If `arr[mid] == target`, return `mid`. ✅
4. If `arr[mid] < target`, narrow the range to `[mid + 1, right]`. ➡️
5. Otherwise, narrow the range to `[left, mid - 1]`. ⬅️
6. Return `-1` when the range is exhausted. ❌

## 📄 License

This project is provided for educational purposes.
