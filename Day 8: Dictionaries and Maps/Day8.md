## Objective
Today, we’re learning about Key-Value pair mappings using a Map or Dictionary data structure. Check out the Tutorial tab for learning materials and an instructional video!

## Task
Given `n` names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each `name` queried, print the associated entry from your phone book on a new line in the form: `name=phoneNumber`; If an entry for `name` is not found, print: `Not found` instead.

> **Note**: Your phone book should be a Dictionary/Map/HashMap data structure.

## Input Format
1. The first line contains an integer, `n`, denoting the number of entries in the phone book.
2. Each of the `n` subsequent lines describes an entry in the form of 2 space-separated values on a single line:
   - The first value is a friend’s name.
   - The second value is an `8-`digit phone number.

3. After the `n` lines of phone book entries, there are an unknown number of lines of queries.  
   - Each line (query) contains a `name` to look up, and you must continue reading lines until there is no more input.

> **Note**: Names consist of lowercase English alphabetic letters and are first names only.

## Constraints
- `1 ≤ n ≤ 10^5`
- `1 ≤ queries ≤ 10^5`

## Output Format
On a new line for each query, print `Not found` if the name has no corresponding entry in the phone book. Otherwise, print the full `name` and `phoneNumber` in the format: `name=phoneNumber`.

## Sample Input
```yaml
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry
```

## Sample Output
```yaml
sam=99912222
Not found
harry=12299933
```
