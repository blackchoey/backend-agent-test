# Installation Guide

This guide provides detailed instructions for installing and setting up the Binary Search Implementation project.

## Table of Contents

- [System Requirements](#system-requirements)
- [Quick Start](#quick-start)
- [Detailed Installation](#detailed-installation)
- [Verification](#verification)
- [Troubleshooting](#troubleshooting)
- [Development Setup](#development-setup)

## System Requirements

### Minimum Requirements

- **Java**: Java Development Kit (JDK) 8 or higher
- **Operating System**: Any OS that supports Java (Windows, macOS, Linux)
- **Memory**: 128 MB RAM (minimal for this simple program)
- **Storage**: 10 MB free disk space

### Recommended Requirements

- **Java**: JDK 11 or higher for best compatibility
- **Operating System**: Recent version of your preferred OS
- **Memory**: 512 MB RAM or more
- **Storage**: 100 MB free disk space (including development tools)

## Quick Start

For users who just want to run the program:

```bash
# 1. Clone the repository
git clone https://github.com/blackchoey/backend-agent-test.git

# 2. Navigate to the project directory
cd backend-agent-test

# 3. Compile the Java code
javac src/Main.java

# 4. Run the program
java -cp src Main 1 2 3 4 5 3
```

## Detailed Installation

### Step 1: Install Java Development Kit (JDK)

#### Windows

1. **Download JDK**:
   - Visit [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
   - Download the Windows installer for JDK 11 or later

2. **Install JDK**:
   - Run the downloaded installer
   - Follow the installation wizard
   - Note the installation path (typically `C:\Program Files\Java\jdk-XX`)

3. **Set Environment Variables**:
   - Open System Properties → Advanced → Environment Variables
   - Add `JAVA_HOME` variable pointing to JDK installation directory
   - Add `%JAVA_HOME%\bin` to your PATH variable

4. **Verify Installation**:
   ```cmd
   java -version
   javac -version
   ```

#### macOS

1. **Using Homebrew** (recommended):
   ```bash
   # Install Homebrew if not already installed
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
   
   # Install OpenJDK
   brew install openjdk@11
   
   # Add to PATH
   echo 'export PATH="/opt/homebrew/opt/openjdk@11/bin:$PATH"' >> ~/.zshrc
   source ~/.zshrc
   ```

2. **Manual Installation**:
   - Download JDK from Oracle or OpenJDK
   - Install the .dmg package
   - JDK will be installed to `/Library/Java/JavaVirtualMachines/`

3. **Verify Installation**:
   ```bash
   java -version
   javac -version
   ```

#### Linux (Ubuntu/Debian)

1. **Install OpenJDK**:
   ```bash
   # Update package list
   sudo apt update
   
   # Install JDK 11
   sudo apt install openjdk-11-jdk
   
   # Alternative: Install default JDK
   sudo apt install default-jdk
   ```

2. **Set JAVA_HOME** (if needed):
   ```bash
   echo 'export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64' >> ~/.bashrc
   source ~/.bashrc
   ```

3. **Verify Installation**:
   ```bash
   java -version
   javac -version
   ```

#### Linux (CentOS/RHEL/Fedora)

1. **Install OpenJDK**:
   ```bash
   # For CentOS/RHEL 8+
   sudo dnf install java-11-openjdk-devel
   
   # For older versions
   sudo yum install java-11-openjdk-devel
   ```

2. **Verify Installation**:
   ```bash
   java -version
   javac -version
   ```

### Step 2: Clone the Repository

1. **Install Git** (if not already installed):
   - Windows: Download from [git-scm.com](https://git-scm.com/)
   - macOS: `brew install git` or install with Xcode command line tools
   - Linux: `sudo apt install git` (Ubuntu/Debian) or `sudo dnf install git` (Fedora)

2. **Clone the repository**:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

### Step 3: Compile and Run

1. **Compile the Java source**:
   ```bash
   javac src/Main.java
   ```

2. **Run the program**:
   ```bash
   java -cp src Main 1 2 3 4 5 3
   ```

## Verification

### Test Basic Functionality

Run these commands to verify the installation:

```bash
# Test 1: Basic functionality
java -cp src Main 1 2 3 4 5 3
# Expected output: Result index: 2

# Test 2: Element not found
java -cp src Main 1 2 3 4 5 7
# Expected output: Result index: -1

# Test 3: Single element
java -cp src Main 5 5
# Expected output: Result index: 0

# Test 4: Usage help
java -cp src Main
# Expected output: Usage instructions
```

### Verify Java Installation

```bash
# Check Java version
java -version
# Should show Java version 8 or higher

# Check compiler version
javac -version
# Should show javac version

# Check JAVA_HOME (if set)
echo $JAVA_HOME  # On macOS/Linux
echo %JAVA_HOME% # On Windows
```

## Troubleshooting

### Common Issues

#### "javac is not recognized as an internal or external command"

**Cause**: Java is not installed or not in PATH
**Solution**: 
1. Install JDK following the steps above
2. Ensure JDK's bin directory is in your PATH
3. Restart your terminal/command prompt

#### "Error: Could not find or load main class Main"

**Cause**: Incorrect classpath or working directory
**Solution**:
```bash
# Ensure you're in the project root directory
cd backend-agent-test

# Use correct classpath
java -cp src Main 1 2 3 4 5 3
```

#### "Exception in thread "main" java.lang.NumberFormatException"

**Cause**: Non-numeric arguments provided
**Solution**:
```bash
# Ensure all arguments are integers
java -cp src Main 1 2 3 4 5 3  # Correct
java -cp src Main a b c d e f  # Incorrect
```

#### Permission Denied (Linux/macOS)

**Cause**: Insufficient permissions
**Solution**:
```bash
# Make sure you have read permissions
chmod +r src/Main.java

# If needed, make script executable
chmod +x run.sh  # If you create run scripts
```

### Getting Help

If you encounter issues not covered here:

1. Check our [SUPPORT.md](SUPPORT.md) file
2. Search existing [GitHub issues](https://github.com/blackchoey/backend-agent-test/issues)
3. Create a new issue with:
   - Your operating system and version
   - Java version (`java -version`)
   - Exact error message
   - Steps you followed

## Development Setup

For contributors who want to modify the code:

### Additional Tools

1. **IDE** (optional but recommended):
   - [IntelliJ IDEA](https://www.jetbrains.com/idea/) (Community Edition is free)
   - [Eclipse](https://www.eclipse.org/ide/)
   - [Visual Studio Code](https://code.visualstudio.com/) with Java extensions

2. **Build Tools** (for larger projects):
   - [Maven](https://maven.apache.org/) - `brew install maven` or download manually
   - [Gradle](https://gradle.org/) - `brew install gradle` or download manually

### IDE Setup

#### IntelliJ IDEA
1. Open IntelliJ IDEA
2. Choose "Open" and select the project directory
3. IDEA should automatically detect it as a Java project
4. Set up the SDK (File → Project Structure → Project → Project SDK)

#### Visual Studio Code
1. Install the "Extension Pack for Java" extension
2. Open the project folder
3. VSCode should automatically detect the Java files

### Running Tests

Currently, this project uses manual testing. To run comprehensive tests:

```bash
# Create a test script (optional)
cat > test.sh << 'EOF'
#!/bin/bash
echo "Running tests..."
java -cp src Main 1 2 3 4 5 3 && echo "✓ Test 1 passed"
java -cp src Main 1 2 3 4 5 7 && echo "✓ Test 2 passed" 
java -cp src Main 5 5 && echo "✓ Test 3 passed"
echo "All tests completed"
EOF

chmod +x test.sh
./test.sh
```

### Contributing

Once you have the development environment set up:

1. Read [CONTRIBUTING.md](CONTRIBUTING.md)
2. Create a feature branch: `git checkout -b feature/your-feature`
3. Make your changes
4. Test thoroughly
5. Submit a pull request

---

For more information, see our [README.md](README.md) and [SUPPORT.md](SUPPORT.md) files.