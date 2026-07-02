# backend-agent-test

A Java project containing a binary search implementation.

## Project Structure

```
src/
  Main.java   - Binary search implementation and CLI entry point
```

## Building

Compile the source from the repository root:

```bash
javac src/Main.java
```

## Running

```bash
java -cp src Main <array elements> <target value>
```

The last argument is the target value to search for; all preceding arguments are the sorted array elements.

**Example:**

```bash
java -cp src Main 1 2 3 4 5 3
```

This searches for `3` in the array `[1, 2, 3, 4, 5]` and prints the result index.

## Usage

```
Usage: java Main <array elements> <target value>
Example: java Main 1 2 3 4 5 3
```

Output:

```
Result index: 2
```

Returns `-1` if the target value is not found in the array.
