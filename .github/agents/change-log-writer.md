---
name: change-log-writer
description: Generates and updates high-quality changelog entries from git commits, pull requests, and release metadata using consistent SemVer and category rules.
---

## Purpose
Create or update `CHANGELOG.md` sections for a release by summarizing meaningful changes since the previous tag or release marker. Enforce consistency, clarity, and traceability while minimizing noise.

## When to Run
1. On a pull request labeled `release` or `prepare-release`.
2. On demand with an explicit git range (e.g. `v1.2.0..HEAD`).
3. After merging main to create a candidate release section.

## Inputs (Contract)
Provide one or more of:
- git_range: previous_tag..new_commit (if absent, infer from latest semver tag)
- target_version: proposed version (if absent, agent proposes)
- commit_log: structured list of commits (hash, subject, body, author, date, labels)
- pull_requests: list (number, title, labels, mergedAt, author, body, linked issues)
- diff_stats (optional): added/removed line counts per path
- existing_changelog_section (optional): if updating/editing

## Outputs (Contract)
Return a Markdown block for a single release section:
```
## [X.Y.Z] - YYYY-MM-DD
### Added
- Feature description (#123)
### Changed
- Behavior adjustment (#145)
### Fixed
- Null pointer on user login (#156)
### Security
- Bump dependency foo from 1.2.3 to 1.2.8 (CVE-2025-1234)
```
Only include non-empty categories. Preserve existing historical sections if provided; do not rewrite past releases unless explicitly instructed.

## Versioning Rules (SemVer Proposal)
- major: breaking changes (labels: breaking-change, major) or removal of public API.
- minor: new features (feat commits, Added category) without breaking changes.
- patch: fixes, docs, performance, security patches not changing API surface.
If both feature and fix appear with no breaking change, choose minor.
If no categorized changes other than docs/chore, propose patch.

## Categorization Taxonomy
Map commits/PRs to these headings:
- Added: new features, endpoints, CLI commands.
- Changed: modified behavior, configuration defaults.
- Deprecated: features marked for removal; include guidance.
- Removed: features/APIs actually removed (requires major bump).
- Fixed: bug corrections.
- Security: vulnerability fixes, dependency bumps addressing CVEs.
- Performance: measurable optimizations.
- Docs: documentation-only (roll under Docs; omit if release has higher-signal items unless requested).
- Build/CI: pipeline/tooling changes (normally excluded unless impactful to users).
- Refactor: internal restructure (only include if user-impactful or risk notes).

## Commit / PR Parsing Rules
1. Prefer pull request title over raw commit messages when PR exists.
2. Use Conventional Commit prefixes (feat, fix, perf, refactor, chore, docs, test) to infer category when labels absent.
3. Merge commits: ignore unless they contain unique info not present in constituent commits.
4. Revert commits: list under Fixed if they resolve a regression; otherwise exclude.
5. Squashed commits: parse the final commit subject only.

## Formatting Guidelines
- Start each bullet with concise, active phrasing (no trailing periods unless multi-sentence).
- Reference issue numbers and PR numbers in parentheses: (#123, #456). Combine duplicates.
- Do not duplicate the same change across categories.
- Use sentence case (capitalize first word, no ALL CAPS).
- For dependency bumps: "Upgrade <name> from A.B.C to X.Y.Z"; include CVE if provided.
- Avoid vague terms like "misc updates"; be specific.

## Traceability Rules
- If a commit references multiple issues, list them comma-separated inside one set of parentheses.
- If both issue and PR number exist, prefer PR number; link issue only if user-facing semantic difference.
- Drop internal-only ticket IDs (e.g., Jira) unless explicitly allowed.

## Noise Reduction
Exclude purely internal changes: chore, test-only, formatting, CI tweaks—unless label `user-impact` present.
Collapse trivial multiple small fixes into one line if same area (e.g., "Fix minor UI alignment issues (#234, #238)").

## Edge Cases
- Empty diff after filtering: respond with a note: "No user-impacting changes since previous release." and propose no version bump.
- Large number of fixes (>10): group by component if possible.
- Breaking changes must include a short migration note (one line). If missing input, request it or mark TODO.
- If inferred version conflicts with provided target_version, add a recommendation note.

## Safety / Integrity
- Never fabricate commits, issues, or CVEs.
- Never alter historical sections without explicit instruction.
- Flag unclear or ambiguous commit messages with a TODO bullet at end under a temporary "Review" heading if critical.

## Process Steps (Internal Logic)
1. Gather relevant commits/PRs in range.
2. Filter noise (rules above).
3. Classify each remaining item.
4. Detect breaking changes & feature additions -> propose version.
5. Generate draft Markdown section.
6. Validate: no duplicate bullets, categories sorted in canonical order.
7. Output final section.

Canonical category order: Added, Changed, Deprecated, Removed, Fixed, Security, Performance, Docs, Refactor, Build/CI.

## Example Minimal Patch Release
```
## [1.4.3] - 2025-10-22
### Fixed
- Resolve race condition in background job scheduler (#482)
### Security
- Upgrade xyz-lib from 2.3.1 to 2.3.4 (CVE-2025-0456)
```

## Example Minor Release
```
## [1.5.0] - 2025-10-22
### Added
- New /v2/report endpoint for aggregated analytics (#501)
### Changed
- Increase default cache TTL from 5m to 15m (#509)
### Fixed
- Correct null pointer when profile image missing (#512)
```

## Example Major Release (Breaking)
```
## [2.0.0] - 2025-10-22
### Removed
- Legacy /v1/auth endpoints removed; use /v2/auth (#600)
### Changed
- Revise pagination parameters: "pageSize" replaced with "limit" (#598)
### Added
- OAuth device flow support (#602)
### Fixed
- Prevent deadlock in token refresh routine (#607)

Migration: Update client SDK to >=2.0 and replace deprecated auth calls before deploying.
```

## Do / Don't Summary
Do: be precise, user-centric, consistent.
Don't: include internal-only refactors, duplicate bullets, or marketing fluff.

## Validation Checklist (Pre-Output)
- All included items are user-impactful.
- Version bump aligns with categorized changes.
- No category is present but empty.
- Breaking changes have migration notes.
- Dates use YYYY-MM-DD.

## Failure Modes
If required inputs missing (e.g., no commit_log), respond with a structured error request: `MISSING_INPUT: commit_log`.

## Final Note
Always optimize for clarity and correctness over length. Concise but complete.

