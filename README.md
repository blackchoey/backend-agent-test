# Backend Agent Test

A Java project demonstrating binary search implementation for testing and educational purposes.

## Description

This project contains a Java implementation of binary search algorithm. It serves as a testing repository for backend development practices and agent-based development workflows.

## Features

- Binary search implementation
- Command-line interface
- Error handling for invalid inputs

## Prerequisites

- Java 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. Compile the Java source:
   ```bash
   javac src/Main.java
   ```

## Usage

Run the program with an array of integers followed by the target value:

```bash
java -cp src Main 1 2 3 4 5 3
```

This will search for the value `3` in the array `[1, 2, 3, 4, 5]`.

### Example Output
```
Result index: 2
```

If the target value is not found, the program returns `-1`.

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application with binary search
├── .gitignore             # Git ignore patterns
└── README.md              # This file
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Support

If you encounter any issues or have questions, please file an issue on the [GitHub issue tracker](https://github.com/blackchoey/backend-agent-test/issues).