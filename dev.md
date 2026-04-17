# Developer Notes

## Local Workflow

1. Compile:
   ```bash
   javac src/Main.java
   ```
2. Run:
   ```bash
   java -cp src Main 1 2 3 4 5 5
   ```

## Coding Scope

- Core logic is implemented in `src/Main.java`.
- `binarySearch(int[] arr, int b)` performs the search and returns the index or `-1`.

## Validation

- There is no dedicated lint/test pipeline configured in this repository.
- Use `javac` compile success and basic command-line runs as the current validation baseline.

## Contribution Guidance

- Keep changes minimal and focused.
- Avoid committing generated artifacts (for example, `*.class` files).
