# 🔍 Binary Search Implementation

A Java implementation of the binary search algorithm for finding elements in a sorted array.

## 📖 Project Description

This project contains a simple Java application that implements binary search functionality. Binary search is an efficient algorithm for finding an item from a sorted list of items by repeatedly dividing the search interval in half.

## ✨ Features

- 🎯 Binary search implementation for integer arrays
- 💬 Command-line interface for easy testing
- ✅ Returns the index of the target element or -1 if not found

## 📋 Prerequisites

- ☕ Java Development Kit (JDK) 8 or higher
- 🖥️ Basic understanding of command-line operations

## 🚀 Getting Started

### Compilation

To compile the Java source code, navigate to the project directory and run:

```bash
javac src/Main.java
```

### Running the Application

Run the compiled program with the following syntax:

```bash
java -cp .:src Main <array elements> <target value>
```

**Arguments:**
- `<array elements>`: Space-separated integers representing the sorted array
- `<target value>`: The integer value to search for

### 💻 Usage Examples

**Example 1: Finding an element in an array**
```bash
java -cp .:src Main 1 2 3 4 5 3
```
Output: `Result index: 2`

**Example 2: Searching for a non-existent element**
```bash
java -cp .:src Main 1 2 3 4 5 10
```
Output: `Result index: -1`

**Example 3: Finding the first element**
```bash
java -cp .:src Main 10 20 30 40 50 10
```
Output: `Result index: 0`

**Example 4: Running without arguments (shows usage)**
```bash
java -cp .:src Main
```
Output:
```
Usage: java Main <array elements> <target value>
Example: java Main 1 2 3 4 5 5
```

## 📁 Project Structure

```
.
├── src/
│   └── Main.java          # Main application with binary search implementation
├── .gitignore             # Git ignore rules
├── test.iml               # IntelliJ IDEA module file
└── README.md              # This file
```

## 🧮 Algorithm Details

The binary search algorithm works by:
1. Starting with the entire array
2. Comparing the middle element with the target value
3. If the middle element equals the target, return its index
4. If the target is less than the middle element, search the left half
5. If the target is greater than the middle element, search the right half
6. Repeat until the element is found or the search space is empty

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)

## ⚠️ Important Note

The input array must be sorted in ascending order for the binary search to work correctly.

## 📄 License

This project is available for educational purposes.
