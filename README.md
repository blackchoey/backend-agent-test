# 🔍 Binary Search - Java

A Java implementation of binary search that takes an array and a target value as command-line arguments and returns the index of the target in the array.

## ✅ Prerequisites

- ☕ Java Development Kit (JDK) installed

## 🔨 Build

Compile the source from the repository root:

```bash
javac src/Main.java
```

## 🚀 Usage

Run the program with the array elements followed by the target value as arguments:

```bash
java -cp src Main <array elements> <target value>
```

### 📌 Example

```bash
java -cp src Main 1 2 3 4 5 3
```

This searches for `3` in the array `[1, 2, 3, 4, 5]` and prints the result index.

## 📤 Output

```
Result index: 2
```

Returns `-1` if the target value is not found in the array.
