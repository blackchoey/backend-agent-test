# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- Initial project documentation
  - README.md with project overview and usage instructions
  - LICENSE file (MIT License)
  - CONTRIBUTING.md with contribution guidelines
  - CODE_OF_CONDUCT.md with community standards
  - CHANGELOG.md for tracking project changes

## [0.1.0] - 2026-01-30

### Added
- Initial project setup
- Binary search implementation in Java
- Main class with command-line interface
- Basic array search functionality
- IntelliJ IDEA project configuration

### Known Issues
- Binary search implementation contains a known bug in the loop condition
  (uses `i < j` instead of `i <= j`) which may cause incorrect results
  in certain edge cases

---

## Notes

This changelog follows the principles of [Keep a Changelog](https://keepachangelog.com/):
- **Added** for new features
- **Changed** for changes in existing functionality
- **Deprecated** for soon-to-be removed features
- **Removed** for now removed features
- **Fixed** for any bug fixes
- **Security** for vulnerability fixes
