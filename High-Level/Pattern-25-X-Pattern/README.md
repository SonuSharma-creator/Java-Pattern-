# Pattern 25 - X Pattern

## Problem

Write a Java program to print an **X-shaped star pattern** using nested loops and conditional statements.

## Pattern

For `n = 5`:

```text
*       *
  *   *
    *
  *   *
*       *
```

## Concepts Used

* Nested `for` loops
* Pattern printing
* Conditional statements
* Row and column positioning
* Diagonal pattern
* Space management

## Logic

* The outer loop controls the rows.
* The inner loop controls the columns.
* A star is printed when the column number is equal to the row number.
* A star is also printed when the column number is equal to `n - i + 1`.
* These two diagonal conditions create the shape of an `X`.
* Spaces are printed for all other positions.

### Formula Used

```text
Main diagonal     → j = i
Secondary diagonal → j = n - i + 1
```

Where:

* `n` = total number of rows and columns
* `i` = current row
* `j` = current column

### Loop Relationship

```text
Outer loop  → Controls rows
Inner loop  → Controls columns
Condition   → Determines diagonal star positions
```

## Java Solution

See [`Pattern25.java`](./Pattern25.java)

## Complexity

**Time Complexity:** `O(n²)`

**Space Complexity:** `O(1)`

---

### Progress

* Pattern 01 - Square Star
* Pattern 02 - Right Triangle
* Pattern 03 - Inverted Right Triangle
* Pattern 04 - Number Triangle
* Pattern 05 - Repeated Row Number
* Pattern 06 - Alphabet Triangle
* Pattern 07 - Number Square
* Pattern 08 - Reverse Number Triangle
* Pattern 09 - Repeated Alphabet Rows
* Pattern 10 - Floyd's Triangle

* Pattern 11 - Right-Aligned Star Triangle
* Pattern 12 - Inverted Right-Aligned Star Triangle
* Pattern 13 - Pyramid Star Pattern
* Pattern 14 - Inverted Centered Star Pyramid
* Pattern 15 - Diamond Star Pattern
* Pattern 16 - Hollow Square Star Pattern
* Pattern 17 - Hollow Right Triangle
* Pattern 18 - Butterfly Star Pattern
* Pattern 19 - Palindromic Number Pyramid
* Pattern 20 - Hollow Diamond Star Pattern

* Pattern 21 - Hollow Butterfly Pattern
* Pattern 22 - Sandglass Pattern
* Pattern 23 - Sandglass Pattern
* Pattern 24 - Zig-Zag Pattern
* Pattern 25 - X Pattern
