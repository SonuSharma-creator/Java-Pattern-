# Pattern 17 - Hollow Right Triangle

## Problem

Write a Java program to print a **hollow right triangle** where stars are printed only on the left boundary, right boundary, and bottom row.

## Pattern

For `n = 5`:

```text
* 
* *
*   *
*     *
* * * * *
```

## Concepts Used

* Nested `for` loops
* Pattern printing
* Boundary conditions
* Ternary operator
* Rows and columns

## Logic

* The outer loop controls the rows.
* The inner loop runs from `1` to the current row number.
* A star is printed on the left boundary, right boundary, or last row.
* Otherwise, spaces are printed.

### Formula Used

```text
Print * if:
j == 1 || i == j || i == n
```

Where:

* `n` = number of rows
* `i` = current row
* `j` = current column

### Loop Relationship

```text
Outer loop → Controls rows
Inner loop → Controls columns
Condition  → Controls boundary stars
```

## Java Solution

See [`Pattern17.java`](./Pattern17.java)

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
