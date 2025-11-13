# Backend Agent Test

A Java project demonstrating a binary search implementation.

## Overview

This project contains a simple Java application with a binary search algorithm implementation. The main class provides a command-line interface for searching elements in an array.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java Runtime Environment (JRE)

## Project Structure

```
.
├── src/
│   └── Main.java          # Main application with binary search implementation
├── .github/
│   └── agents/            # Custom agent configurations
├── README.md              # This file
└── test.iml               # IntelliJ IDEA module file
```

## Building the Project

To compile the Java source code:

```bash
javac src/Main.java
```

## Running the Application

After compilation, run the application with:

```bash
java -cp src Main <array elements> <target value>
```

### Example

```bash
java -cp src Main 1 2 3 4 5 5
```

This will search for the value `5` in the array `[1, 2, 3, 4, 5]`.

### Usage

```
java Main <array elements> <target value>
```

- **array elements**: Space-separated integers representing the array to search
- **target value**: The integer value to find in the array

The program will output the index of the target value if found, or `-1` if not found.

## Algorithm

The project implements a binary search algorithm that:
- Takes a sorted array of integers
- Searches for a target value
- Returns the index of the target value or -1 if not found

**Note**: The current implementation has a known bug in the while loop condition that may cause issues in certain edge cases.

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

See the [LICENSE](LICENSE) file for details.

## Code of Conduct

This project adheres to a Code of Conduct. By participating, you are expected to uphold this code. Please read [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) for details.
