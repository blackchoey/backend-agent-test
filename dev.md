# Developer Guide

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java   # Binary search implementation and CLI entry point
├── README.md       # User-facing documentation
└── dev.md          # This file — developer notes
```

## Building

Compile the source into an `out/` directory:

```bash
javac src/Main.java -d out
```

## Running Locally

```bash
java -cp out Main 1 2 3 4 5 3
# Result index: 2
```

## Code Overview

### `binarySearch(int[] arr, int b)`

Standard iterative binary search over a **sorted** integer array.

| Variable | Role |
|----------|------|
| `i` | Left boundary (inclusive) |
| `j` | Right boundary (inclusive) |
| `a` | Midpoint index |
| `b` | Target value |

**Known bug:** The loop condition is `i < j` instead of `i <= j`. When the search space narrows to a single element (`i == j`), that element is never examined, so the method returns `-1` even when the target is present.

**Fix:**

```java
// Change:
while (i < j) {
// To:
while (i <= j) {
```

### `main(String[] args)`

Parses command-line arguments: all arguments except the last form the sorted array; the last argument is the search target. Prints the result index, or `-1` if not found.

## Contributing

1. Fix the known bug described above.
2. Add unit tests (e.g., with JUnit 5) covering:
   - Target found in the middle
   - Target found at the first index
   - Target found at the last index (exercises the `i == j` edge case)
   - Target not present
   - Single-element array
3. Run tests before opening a pull request.
