# Backend Agent Test 🔍

A simple Java project demonstrating a binary search implementation. This project serves as a test repository for backend agent development and testing.

## 📝 Description

This repository contains a Java implementation of a binary search algorithm in the `Main.java` file. The program allows users to search for a target value in an array of integers using binary search.

## ✨ Features

- 🔎 Binary search implementation in Java
- 💻 Command-line interface for easy testing
- 📦 Simple and straightforward codebase

## 📋 Requirements

- ☕ Java Development Kit (JDK) 8 or higher
- 🛠️ A Java IDE (IntelliJ IDEA recommended) or command-line Java compiler

## 📁 Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main class with binary search implementation
├── .gitignore             # Git ignore file
├── test.iml               # IntelliJ IDEA module file
└── README.md              # This file
```

## 🔨 Compilation

To compile the project from the command line:

```bash
javac src/Main.java
```

Or simply open the project in IntelliJ IDEA and build it using the IDE.

## 🚀 Usage

Run the program from the command line with the following syntax:

```bash
java -cp src Main <array elements> <target value>
```

### 💡 Example

```bash
java -cp src Main 1 2 3 4 5 5
```

This will search for the value `5` in the array `[1, 2, 3, 4, 5]`.

### 📤 Expected Output

```
Result index: <index>
```

Where `<index>` is the position of the target value in the array (0-based), or `-1` if the value is not found.

## 🐛 Known Issues

⚠️ **Note**: The current binary search implementation contains a known bug on line 7. The loop condition uses `i < j` instead of `i <= j`, which may cause the search to miss the target value in certain cases. This is intentional for testing purposes.

## 🤝 Contributing

This is a test repository. Feel free to fork and experiment with it.

## 📄 License

This project is provided as-is for educational and testing purposes.
