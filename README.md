# backend-agent-test

Simple Java console project containing a `Main` class with a binary search example.

## Requirements

- Java JDK (recommended: 17+)

## Project Structure

- `src/Main.java` — application entry point and binary search logic

## Build

From the repository root:

```bash
javac src/Main.java
```

## Run

From the repository root:

```bash
java -cp src Main 1 2 3 4 5 5
```

Output format:

```text
Result index: <index or -1>
```

## Notes

- Input format is: all array elements first, then the target value as the final argument.
- This repository currently has no formal test framework configured.
