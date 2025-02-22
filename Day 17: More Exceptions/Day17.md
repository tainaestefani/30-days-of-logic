## Objective
Yesterday's challenge taught you to manage exceptional situations by using try and catch blocks. In today's challenge, you will practice throwing and propagating an exception.

## Task
Write a Calculator class with a single method: int power(int,int). The power method takes two integers, `n` and `p`, as parameters and returns the integer result of `n^p`. If either `n` or `p` is negative, then the method must throw an exception with the message: n and p should be non-negative.

> **Note:** Do not use an access modifier (e.g.: public) in the declaration for your Calculator class.

## Input Format

Input from stdin is handled for you by the locked stub code in your editor. The first line contains an integer, `T`, the number of test cases. Each of the `T` subsequent lines describes a test case in  space-separated integers that denote  and , respectively.

## Constraints

- `No Test Case will result in overflow for correctly written code.`

## Output Format

Output to stdout is handled for you by the locked stub code in your editor. There are `T` lines of output, where each line contains the result of `n^p` as calculated by your Calculator class' power method.

## Sample Input
```yaml
4
3 5
2 4
-1 -2
-1 3
```

## Sample Output
```yaml
243
16
n and p should be non-negative
n and p should be non-negative
```
