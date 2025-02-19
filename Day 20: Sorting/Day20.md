## Objective

In this challenge, we will discuss a simple sorting algorithm called Bubble Sort.

Consider the following implementation of Bubble Sort:
```java
for (int i = 0; i < n; i++) {
    // Track the number of swaps made in a single pass
    int numberOfSwaps = 0;

    for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in the wrong order
        if (a[j] > a[j + 1]) {
            swap(a[j], a[j + 1]);
            numberOfSwaps++;
        }
    }

    // If no elements were swapped, the array is already sorted
    if (numberOfSwaps == 0) {
        break;
    }
}
```

## Task
Given an array a of size n containing distinct elements, sort it in ascending order using Bubble Sort.

Once sorted, print the following three lines:

1. `Array is sorted in numSwaps swaps`.
   where `numSwaps` is the total number of swaps performed.

3. `First Element: firstElement`.
   where `firstElement` is the first element of the sorted array.

5. `Last Element: lastElement`.
   where `lastElement` is the last element of the sorted array.
> **Hint:** To complete this challenge, maintain a variable that keeps track of the total number of swaps performed throughout the sorting process.

## Example
`a = [4, 3, 1, 2]`
```yaml
original a: 4 3 1 2
round 1 a: 3 1 2 4  swaps this round: 3
round 2 a: 1 2 3 4  swaps this round: 2
round 3 a: 1 2 3 4  swaps this round: 0
```

In the first round, the number `4` was swapped in all three comparisons, reaching the last position. In the second round, the number `3` was swapped twice. In the third round, no swaps were needed, so the process stopped.

```yaml
Array is sorted in 5 swaps.
First Element: 1
Last Element: 4
```

## Input Format
The first line contains an integer n, representing the number of elements in the array `a`.
The second line contains `n` space-separated integers that describe `a[0], a[1], ..., a[n-1]`.


## Constraints:
- `2 ≤ n ≤ 600`
- `1 ≤ a[i] ≤ 2 × 10^6, where 0 ≤ i < n.`

## Output Format
Print the following three lines of output:

1. `Array is sorted in numSwaps swaps`.
   where `numSwaps` is the total number of swaps performed.

3. `First Element: firstElement`.
   where `firstElement` is the first element of the sorted array.

4. `Last Element: lastElement`.
   where `lastElement` is the last element of the sorted array.

## Sample Input 0:
```yaml
3
1 2 3
```

## Sample Output 0:
```yaml
Array is sorted in 0 swaps.
First Element: 1
Last Element: 3
```

## Sample Input 1:
```yaml
3
3 2 1
```

## Sample Input 1:
```yaml
Array is sorted in 3 swaps.
First Element: 1
Last Element: 3
```
