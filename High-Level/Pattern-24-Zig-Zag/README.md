# Pattern 24 - Zig-Zag Pattern

## Problem

Write a Java program to print a **Zig-Zag star pattern** using nested loops and conditional statements.

## Pattern

For `n = 5`:

```text
*       *       *       *       *
  *   *   *   *   *   *   *   *
    *       *       *       *
  *   *   *   *   *   *   *   *
*       *       *       *       *
```

## Concepts Used

* Nested `for` loops
* Pattern printing
* Modulus operator
* Conditional statements
* Logical operators
* Row and column positioning
* Space management

## Logic

* The outer loop controls the rows.
* The inner loop controls the columns.
* The number of columns is calculated using `4 * n - 3`.
* The modulus operator `%` is used to determine the positions of the stars.
* Different conditions are applied for each row.
* The first and last rows print stars at positions where `j % 4 == 1`.
* The second and fourth rows print stars where `j % 4 == 2` or `j % 4 == 0`.
* The middle row prints stars where `j % 4 == 3`.
* These conditions create the zig-zag pattern.

### Formula Used

```text
Number of columns = 4n - 3
```

For `n = 5`:

```text
4 × 5 - 3 = 17 columns
```

Where:

* `n` = total number of rows
* `i` = current row
* `j` = current column

### Loop Relationship

```text
Outer loop  → Controls rows
Inner loop  → Controls columns
Condition   → Determines star positions
```

## Java Solution

See [`Pattern24.java`](./Pattern24.java)

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
