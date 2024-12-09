## Objective
Today we will expand our knowledge of strings, combining it with what we have already learned about loops.

## Task
Given a string, `S`, of length `N` that is indexed from `0` to `N-1`, print its even-indexed and odd-indexed characters as two space-separated strings on a single line (see the Sample below for more detail).

> **Note:** 0 is considered to be an even index.

## Example

**Input:**
```
s = adbefc
```

**Output:**
```
abc def
```

## Input Format
The first line contains an integer, `T` (the number of test cases).  
Each line `i` of the `T` subsequent lines contains a string, `S`.

## Constraints:
- `1 ≤ T ≤ 10`
- `2 ≤ length of S ≤ 10000`

## Output Format
For each string `S^j` (where `0 ≤ j ≤ T - 1`), print `S^j`'s even-indexed characters, followed by a space, followed by `S^j`'s odd-indexed characters.

### Sample Input
```yaml
2
Hacker
Rank
```

### Sample Output
```yaml
Hce akr
Rn ak
```
