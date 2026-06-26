# backend-agent-test 🔎

Small Java command-line example that runs a binary search over sorted integer input.

## Requirements ✅

- Java compiler and runtime (`javac`, `java`)

## Build 🛠️

From the repository root:

```bash
javac src/Main.java
```

## Run ▶️

Pass sorted array elements followed by the target value:

```bash
java -cp src Main 1 2 3 4 5 5
```

If not enough arguments are provided, the program prints usage help:

```bash
java -cp src Main
```
