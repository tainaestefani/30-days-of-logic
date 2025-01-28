## Objective

Today, we are building on our knowledge of arrays by adding another dimension.

## Context

Given a 2D Array `arr`:

```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
```

We define an hourglass in `arr` to be a subset of values with indices falling in this pattern in the graphical representation of the array:

```
a b c
d
e f g
```

There are **16 hourglasses** in a 6x6 array, and an hourglass sum is the sum of an hourglass' values.

## Task

Calculate the hourglass sum for every hourglass in `arr`, then print the maximum hourglass sum.

## Example

In the array shown above, the maximum hourglass sum is `19` for the hourglass in the top-left corner.

## Input Format

There are 6 lines of input, where each line contains 6 space-separated integers that describe the 2D Array `arr`.

## Constraints

- `-9 ≤ A[i][j] ≤ 9`
- `0 ≤ i,j ≤ 5`

## Output Format

Print the maximum hourglass sum in `arr`.

## Sample Input

```yaml
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
```

## Sample Output

```yaml
19
```
