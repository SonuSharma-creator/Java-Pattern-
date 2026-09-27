# Pattern 21 - Pascal's Triangle

## Problem

Write a Java program to print **Pascal's Triangle** where each number is generated from the previous value in the same row.

## Pattern

For `n = 5`:

```text
        1
      1   1
    1   2   1
  1   3   3   1
1   4   6   4   1
```

## Concepts Used

* Nested `for` loops
* Pattern printing
* Number sequences
* Space management
* Center alignment
* Mathematical formula

## Logic

* The outer loop controls the rows.
* `value` starts with `1` for every row.
* The first inner loop prints spaces to center the triangle.
* The second inner loop prints the values of the current row.
* Each next value is calculated using the previous value.

### Formula Used

```text
Next value = value * (i - j) / (j + 1)
```

Where:

* `n` = number of rows
* `i` = current row
* `j` = current position
* `value` = current Pascal's Triangle value

### Loop Relationship

```text
Outer loop → Controls rows
First loop → Controls spaces
Second loop → Prints and calculates values
```

## Java Solution

See [`Pattern21.java`](./Pattern21.java)

## Complexity

**Time Complexity:** `O(n²)`

**Space Complexity:** `O(1)`

---

### Progress

* [x] Pattern 01 - Square Star
* [x] Pattern 02 - Right Triangle
* [x] Pattern 03 - Inverted Right Triangle
* [x] Pattern 04 - Number Triangle
* [x] Pattern 05 - Repeated Row Number
* [x] Pattern 06 - Alphabet Triangle
* [x] Pattern 07 - Number Square
* [x] Pattern 08 - Reverse Number Triangle
* [x] Pattern 09 - Repeated Alphabet Rows
* [x] Pattern 10 - Floyd's Triangle

* [x] Pattern 11 - Right-Aligned Star Triangle
* [x] Pattern 12 - Inverted Right-Aligned Star Triangle
* [x] Pattern 13 - Pyramid Star Pattern
* [x] Pattern 14 - Inverted Centered Star Pyramid
* [x] Pattern 15 - Diamond Star Pattern
* [x] Pattern 16 - Hollow Square Star Pattern
* [x] Pattern 17 - Hollow Right Triangle
* [x] Pattern 18 - Butterfly Star Pattern
* [x] Pattern 19 - Palindromic Number Pyramid
* [x] Pattern 20 - Hollow Diamond Star Pattern

* [x] Pattern 21 - Pascal's Triangle
