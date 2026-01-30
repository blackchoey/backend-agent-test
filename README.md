# Backend Agent Test 🔍

A Java project demonstrating a binary search implementation for educational purposes.

## 📖 Description

This repository contains a simple Java application that implements a binary search algorithm. The project is designed to test backend agent functionality and includes a Main class with a binary search method.

## 📁 Project Structure

```
backend-agent-test/
├── .idea/                 # IntelliJ IDEA configuration directory
├── src/
│   └── Main.java          # Main class with binary search implementation
├── .gitignore             # Git ignore configuration
├── test.iml               # IntelliJ IDEA module file
└── README.md              # This file
```

## ✨ Features

- **Binary Search Implementation**: A method to search for elements in a sorted array
- **Command-line Interface**: Run the program with array elements and target value as arguments
- **Educational Code**: Includes comments and example usage

## 📋 Prerequisites

- Java Development Kit (JDK) 8 or higher
- Command line terminal or IDE (IntelliJ IDEA recommended)

## 🔨 Building the Project

To compile the Java source code:

```bash
javac src/Main.java
```

## 🚀 Usage

Run the program from the command line with the following syntax:

```bash
java -cp src Main <array elements> <target value>
```

### 💡 Example

Search for the value `5` in the array `[1, 2, 3, 4, 5]`:

```bash
java -cp src Main 1 2 3 4 5 5
```

### Parameters

- **array elements**: Space-separated integers that form a sorted array
- **target value**: The integer value to search for in the array

### Output

The program will output the index of the target value in the array, or `-1` if the value is not found.

## 💻 Code Overview

### Binary Search Method

The `binarySearch` method implements a binary search algorithm:

```java
public static int binarySearch(int[] arr, int b)
```

**Parameters:**
- `arr`: Sorted integer array to search
- `b`: Target value to find

**Returns:**
- Index of the target value if found
- `-1` if the target value is not in the array

**Note**: The current implementation contains a known bug in the loop condition (line 7). The condition `while (i < j)` should be `while (i <= j)` for complete correctness. This bug may cause the algorithm to miss the target in certain edge cases.

## 🛠️ Development

This project uses IntelliJ IDEA as the primary IDE. The `.idea` directory and `test.iml` file contain IDE-specific configurations.

### IDE Setup

1. Open IntelliJ IDEA
2. Select "Open" and choose the project directory
3. The IDE will recognize the project structure automatically
4. Run the `Main` class using the Run button or Shift+F10

## ⚠️ Known Issues

- The binary search implementation has a bug in the while loop condition that may cause incorrect results in edge cases
- The bug is documented in the code comments for educational purposes

## 🤝 Contributing

This is a test repository for backend agent functionality. Contributions are welcome for educational improvements.

## 📄 License

This project is for educational and testing purposes.
