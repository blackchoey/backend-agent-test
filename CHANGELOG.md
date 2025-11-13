# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- Initial project documentation
- README.md with project overview and usage instructions
- CONTRIBUTING.md with contribution guidelines
- LICENSE file with MIT license
- CODE_OF_CONDUCT.md with community guidelines
- CHANGELOG.md for tracking version history

### Known Issues
- Binary search implementation has a bug in the while loop condition (line 7)
  - Should be `while (i <= j)` instead of `while (i < j)`
  - This may cause the search to miss the target value in certain edge cases

## [0.1.0] - Initial Release

### Added
- Basic binary search implementation in Java
- Command-line interface for array searching
- IntelliJ IDEA project configuration
