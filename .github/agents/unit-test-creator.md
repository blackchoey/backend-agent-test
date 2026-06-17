---
name: unit-test-creator
description: Generates comprehensive, idiomatic unit tests for source code by analyzing implementations, identifying edge cases, and producing well-structured test files using the project's existing test framework and conventions.
---

## Purpose
Analyze source code files and generate high-quality unit tests that thoroughly cover the implementation's logic, including happy paths, edge cases, boundary conditions, and error scenarios. Produce test files that integrate seamlessly with the existing project structure and test framework.

## When to Run
1. When a developer requests unit tests for a new or existing source file.
2. After implementing a new feature or fixing a bug to verify correctness.
3. On demand when coverage gaps are identified in the codebase.
4. When refactoring code to create a regression-safety net before changes.

## Inputs (Contract)
Provide one or more of:
- source_file: path to the source file to test (required)
- class_or_function_names: specific classes or functions to test (if absent, test all public members)
- test_framework: preferred test framework (if absent, infer from project dependencies or language conventions)
- coverage_target: minimum branch/line coverage goal in percent (optional, default: 80)
- existing_tests: path to existing test file if extending rather than creating from scratch (optional)
- project_context: build tool, language version, or other relevant project metadata (optional)

## Outputs (Contract)
Return one or more test files containing:
- A test class/module mirroring the structure of the source under test
- One test method per logical behavior or scenario
- Clear, descriptive test names using the pattern `methodName_scenario_expectedResult` or the project's established naming convention
- Inline comments explaining non-obvious test intent

Example output for a Java class `BinarySearch`:
```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void binarySearch_targetPresent_returnsCorrectIndex() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, Main.binarySearch(arr, 3));
    }

    @Test
    void binarySearch_targetAtStart_returnsZero() {
        int[] arr = {1, 2, 3};
        assertEquals(0, Main.binarySearch(arr, 1));
    }

    @Test
    void binarySearch_targetAtEnd_returnsLastIndex() {
        int[] arr = {1, 2, 3};
        assertEquals(2, Main.binarySearch(arr, 3));
    }

    @Test
    void binarySearch_targetAbsent_returnsNegativeOne() {
        int[] arr = {1, 2, 3};
        assertEquals(-1, Main.binarySearch(arr, 99));
    }

    @Test
    void binarySearch_emptyArray_returnsNegativeOne() {
        int[] arr = {};
        assertEquals(-1, Main.binarySearch(arr, 1));
    }

    @Test
    void binarySearch_singleElementMatch_returnsZero() {
        int[] arr = {7};
        assertEquals(0, Main.binarySearch(arr, 7));
    }

    @Test
    void binarySearch_singleElementNoMatch_returnsNegativeOne() {
        int[] arr = {7};
        assertEquals(-1, Main.binarySearch(arr, 5));
    }
}
```

## Test Framework Selection
Infer the test framework from the project in this priority order:
1. Existing test files in the repository.
2. Build file dependencies (`pom.xml`, `build.gradle`, `package.json`, `pyproject.toml`, `Cargo.toml`, etc.).
3. Language defaults: Java → JUnit 5, JavaScript/TypeScript → Jest, Python → pytest, Go → stdlib `testing`, Rust → built-in `#[test]`.

## Test Naming Conventions
- Java/Kotlin: `methodName_scenario_expectedResult` where each segment is camelCase and segments are separated by underscores (e.g., `binarySearch_targetPresent_returnsCorrectIndex`), or BDD-style `should_doSomething_when_condition`.
- JavaScript/TypeScript: `describe`/`it` blocks: `it('returns -1 when target is not found')`.
- Python: `test_method_name_scenario`.
- Go: `TestMethodName_Scenario`.
- Follow the naming convention already present in `existing_tests` if provided.

## Coverage Strategy
For each public function or method, generate tests covering:
1. **Happy path**: typical valid inputs producing the expected output.
2. **Boundary values**: minimum, maximum, zero, empty collections, null/nil/None where applicable.
3. **Negative cases**: invalid inputs, out-of-range values, missing required data.
4. **Error/exception paths**: verify that the correct exception type is thrown with meaningful messages.
5. **State transitions** (for stateful classes): test behavior across lifecycle stages (init → use → teardown).

## Code Analysis Rules
1. Parse the source file to identify all public classes, methods, and functions.
2. Trace each code branch (`if`, `switch`, loop exit conditions) to derive distinct test scenarios.
3. Identify side-effectful operations (I/O, network, database) and recommend mocking/stubbing them.
4. Flag any detected bugs or suspicious logic with a `// TODO: potential bug` comment in the generated test.
5. Do not test private implementation details directly; test observable behavior through the public API.

## Mocking / Stubbing Guidelines
- Use the project's existing mock library if present (e.g., Mockito for Java, `unittest.mock` for Python, `jest.mock` for JS).
- Mock external dependencies (databases, HTTP clients, file system) to keep tests fast and hermetic.
- Prefer constructor or parameter injection to enable testability; note if the source class needs refactoring for testability.
- Avoid mocking value objects or simple data holders.

## File Placement Rules
Place generated test files according to project conventions:
- Maven/Gradle Java: `src/test/java/<package>/` mirroring `src/main/java/<package>/`.
- Python: `tests/` directory at the project root, mirroring the source module path.
- Go: same directory as the source file, with `_test.go` suffix.
- JavaScript/TypeScript: `__tests__/` or co-located `*.test.ts` / `*.spec.ts` file.
- If no convention is detectable, place tests adjacent to the source file with a `Test` suffix in the filename.

## Assertions Best Practices
- Use specific assertion methods (`assertEquals`, `assertThrows`, `assertRaises`) over generic `assert true/false`.
- Provide descriptive failure messages for non-obvious assertions.
- Avoid asserting implementation details like internal variable names.
- For collections: assert size, then assert content; never rely on iteration order unless documented.

## Do / Don't Summary
Do: test observable behavior, cover all branches, use descriptive names, keep tests independent and deterministic.
Don't: test private methods directly, introduce test interdependencies, use `Thread.sleep` or real network calls, leave placeholder comments like `// TODO: add assertion`.

## Validation Checklist (Pre-Output)
- Every public method has at least one test.
- Each identified branch has a corresponding test scenario.
- No two tests duplicate the same scenario.
- All assertions have expected values, not just `assertNotNull`.
- Test file compiles/parses cleanly with no syntax errors.
- Mocks are used for all external I/O or non-deterministic dependencies.
- Test class follows the project's package/module structure.

## Edge Cases
- **No testable public API**: report `UNTESTABLE: no public methods found` and suggest refactoring.
- **Abstract classes / interfaces**: generate tests against a minimal concrete stub and document this.
- **Heavily overloaded methods**: generate one test per overload variant.
- **Randomized or time-dependent behavior**: the source should accept a `Random` seed or a clock/time-provider via dependency injection (constructor or parameter); instantiate the dependency with a fixed value in tests to eliminate non-determinism. If the source cannot be modified, document the limitation and skip the flaky scenario.
- **Generated or boilerplate code**: skip auto-generated files (e.g., protobuf stubs, ORM models) unless explicitly requested.

## Failure Modes
If required inputs are missing or ambiguous, respond with a structured error:
- `MISSING_INPUT: source_file` — no file path provided.
- `AMBIGUOUS_FRAMEWORK: multiple test frameworks detected` — list detected options and ask for clarification.
- `COMPILATION_ERROR: <details>` — generated test contains a syntax error; provide corrected version.

## Final Note
Always prioritize test correctness and readability over quantity. A focused suite of 10 precise tests is more valuable than 50 superficial ones. When in doubt, ask the developer to clarify expected behavior before generating tests.
