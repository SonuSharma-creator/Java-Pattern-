# Pattern 16 - Hollow Square Star Pattern

## Problem

Write a Java program to print a **hollow square pattern** where stars are printed only on the boundary of the square.

## Pattern

For `n = 5`:

```text
* * * * *
*       *
*       *
*       *
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
* The inner loop controls the columns.
* A star is printed when the position is on the boundary.
* Otherwise, spaces are printed.

### Formula Used

```text
Print * if:
i == 1 || j == 1 || i == n || j == n
```

Where:

* `n` = size of the square
* `i` = current row
* `j` = current column

### Loop Relationship

```text
Outer loop → Controls rows
Inner loop → Controls columns
Condition → Controls boundary stars
```

## Java Solution

See [`Pattern16.java`](./Pattern16.java)

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
* [x] Pattern 13 - pyramid star pattern
* [x] Pattern 14 - Inverted Centered Star Pyramid
* [x] Pattern 15 - Diamond Star Pattern
* [x] Pattern 16 - Hollow Square Star Pattern


