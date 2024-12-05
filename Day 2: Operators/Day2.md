## Objective
In this challenge, you will work with arithmetic operators. Check out the **Tutorial** tab for learning materials and an instructional video.

## Task
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. Round the result to the nearest integer.

### Example
**Input**:
meal_cost = 100 tip_percent = 15 tax_percent = 8

**Calculation**:
- A tip of 15% of 100 = 15.
- Taxes of 8% of 100 = 8.

**Output**:
123

```yaml
Print the value `123` and return from the function.
```

## Function Description

Complete the function `solve` in the editor below.

### Parameters
- `double meal_cost`: The cost of food before tip and tax.
- `int tip_percent`: The tip percentage.
- `int tax_percent`: The tax percentage.

### Returns
The function returns nothing. Print the calculated value, rounded to the nearest integer.

> **Note**: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result.

## Input Format
- The first line has a `double`, **meal_cost** (the cost of the meal before tax and tip).
- The second line has an `integer`, **tip_percent** (the percentage of **meal_cost** being added as tip).
- The third line has an `integer`, **tax_percent** (the percentage of **meal_cost** being added as tax).

## Sample Input

```yaml
12.00
20
8
```

## Sample Output

```yaml
15
```
