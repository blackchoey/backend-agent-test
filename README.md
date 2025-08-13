# Java Hello World Project

A simple Java application that demonstrates basic Java programming concepts. This beginner-friendly project prints a welcome message and displays a counting sequence from 1 to 5.

## Description

This is a basic Java learning project that showcases:
- Basic Java syntax and structure
- Using `System.out.printf()` and `System.out.println()` for output
- Simple for-loop implementation
- Basic project organization

The application outputs:
```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

## Getting Started

### Prerequisites

Before running this project, make sure you have the following installed:

- **Java Development Kit (JDK)** - Version 8 or higher
  - Download from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
  - Verify installation by running `java --version` in your terminal
- **Text Editor or IDE** (optional but recommended)
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/) (this project is configured for IntelliJ)
  - [Visual Studio Code](https://code.visualstudio.com/)
  - [Eclipse](https://www.eclipse.org/)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. **Verify Java installation**
   ```bash
   java --version
   javac --version
   ```

## How to Run the Application

### Method 1: Command Line

1. **Compile the Java file**
   ```bash
   javac src/Main.java
   ```

2. **Run the application**
   ```bash
   java -cp src Main
   ```

### Method 2: Using IntelliJ IDEA

1. Open IntelliJ IDEA
2. Click "Open" and select the project directory
3. Navigate to `src/Main.java`
4. Click the green play button (▶️) next to the `main` method
5. View the output in the console window

## Project Structure

```
backend-agent-test/
├── .idea/                  # IntelliJ IDEA configuration files
│   ├── misc.xml           # Project settings (JDK version, etc.)
│   └── modules.xml        # Module configuration
├── src/                   # Source code directory
│   └── Main.java         # Main application file
├── test.iml              # IntelliJ IDEA module file
├── .gitignore            # Git ignore rules
└── README.md             # This file
```

### Key Files

- **`src/Main.java`** - The main application file containing the `Main` class and `main` method
- **`test.iml`** - IntelliJ IDEA module configuration file
- **`.idea/`** - Directory containing IntelliJ IDEA project settings

## Development Setup

### Using IntelliJ IDEA (Recommended)

1. **Open the project**
   - Launch IntelliJ IDEA
   - Click "Open" and select the project directory
   - The IDE will automatically recognize the project configuration

2. **Configure JDK (if needed)**
   - Go to File → Project Structure
   - Under "Project Settings" → "Project"
   - Set the Project SDK to your installed JDK version

3. **Run/Debug the application**
   - Right-click on `Main.java` in the project explorer
   - Select "Run 'Main.main()'" or "Debug 'Main.main()'"

### Using Command Line

1. **Navigate to the project directory**
   ```bash
   cd backend-agent-test
   ```

2. **Compile and run**
   ```bash
   # Compile
   javac src/Main.java
   
   # Run
   java -cp src Main
   ```

3. **Clean compiled files (optional)**
   ```bash
   rm src/*.class
   ```

## Learning Objectives

This project helps beginners learn:

- Basic Java program structure
- How to write and run a simple Java application
- Understanding the `main` method
- Using basic output methods (`System.out.printf` and `System.out.println`)
- Implementing simple loops (`for` loop)
- Working with IntelliJ IDEA IDE
- Basic project organization and file structure

## Contributing

We welcome contributions to improve this learning project! Here's how you can contribute:

1. **Fork the repository**
2. **Create a new branch** for your feature or improvement
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. **Make your changes** and test them
4. **Commit your changes**
   ```bash
   git commit -m "Add your descriptive commit message"
   ```
5. **Push to your branch**
   ```bash
   git push origin feature/your-feature-name
   ```
6. **Create a Pull Request**

### Contribution Ideas

- Add more example programs
- Improve code comments and documentation
- Add unit tests
- Create additional learning exercises
- Improve the README with more examples

## License

This project is licensed under the MIT License - see below for details:

```
MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

## Support

If you have questions or need help with this project:

1. Check the [Issues](https://github.com/blackchoey/backend-agent-test/issues) page for existing questions
2. Create a new issue if your question hasn't been answered
3. For Java learning resources, visit:
   - [Oracle Java Documentation](https://docs.oracle.com/en/java/)
   - [Java Tutorials](https://docs.oracle.com/javase/tutorial/)
   - [OpenJDK Documentation](https://openjdk.org/)

---

Happy coding! 🚀