# Backend Agent Test

A simple Java console application that demonstrates basic programming concepts and serves as a testing ground for backend development workflows.

## Description

This project contains a basic Java application that outputs a welcome message and demonstrates a simple loop structure. It's designed as a foundational example for Java development and testing purposes.

## Features

- Simple console output
- Basic loop demonstration
- Clean, readable code structure
- IntelliJ IDEA project configuration

## Prerequisites

Before running this application, ensure you have the following installed:

- **Java Development Kit (JDK)** - Version 8 or higher
  - Download from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
- **Java Runtime Environment (JRE)** - Usually included with JDK

To verify your Java installation, run:
```bash
java -version
javac -version
```

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. **Verify the project structure:**
   ```
   backend-agent-test/
   ├── src/
   │   └── Main.java
   ├── .gitignore
   ├── test.iml
   └── README.md
   ```

## Usage

### Compile the Application

```bash
javac src/Main.java
```

### Run the Application

```bash
java -cp src Main
```

### Expected Output

```
Hello and welcome!
i = 1
i = 2
i = 3
i = 4
i = 5
```

## Development

### Using IntelliJ IDEA

This project includes IntelliJ IDEA configuration files (`test.iml` and `.idea/` directory):

1. Open IntelliJ IDEA
2. Select "Open" and choose the project directory
3. The project should load with proper configuration
4. Use the Run button or `Shift+F10` to execute the application

### Using Command Line

The application can be developed and run entirely from the command line using standard Java tools (`javac` and `java`).

## Project Structure

```
├── src/                    # Source code directory
│   └── Main.java          # Main application class
├── .gitignore             # Git ignore rules for Java/IDE files
├── test.iml               # IntelliJ IDEA module file
├── .idea/                 # IntelliJ IDEA configuration (auto-generated)
└── README.md              # Project documentation
```

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Make your changes
4. Commit your changes (`git commit -am 'Add new feature'`)
5. Push to the branch (`git push origin feature/new-feature`)
6. Create a Pull Request

### Code Style

- Follow standard Java naming conventions
- Use meaningful variable and method names
- Include comments for complex logic
- Maintain consistent indentation (4 spaces)

## License

This project is available for educational and testing purposes. Please refer to the repository owner for specific licensing terms.

## Support

For questions or issues, please open an issue on the GitHub repository or contact the project maintainer.

---

**Note:** This is a test/demo project designed for learning and experimentation with Java development workflows.