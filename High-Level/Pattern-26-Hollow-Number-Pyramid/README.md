# Pattern 26 - Hollow Number Pyramid

## Problem

Write a Java program to print a **hollow number pyramid** where each row contains the row number at the boundary and spaces inside the pyramid.

## Pattern

For `n = 5`:

```text
        1
      2   2
    3       3
  4           4
5 5 5 5 5 5 5 5 5
```

## Concepts Used

* Nested `for` loops
* Pattern printing
* Number printing
* Conditional statements
* Space management
* Center alignment
* Hollow pattern

## Logic

* The outer loop controls the rows.
* The first inner loop prints spaces before the numbers to center-align the pyramid.
* The second inner loop controls the positions inside each row.
* The row number `i` is printed at the left and right boundaries.
* For the last row, the row number is printed at every position.
* Spaces are printed between the boundary numbers to create the hollow effect.

### Formula Used

```text
Number of spaces = n - i
Number of positions = 2 × i - 1
```

Where:

* `n` = total number of rows
* `i` = current row
* `j` = current position

### Loop Relationship

```text
Outer loop  → Controls rows
First loop  → Controls leading spaces
Second loop → Controls number positions
Condition   → Determines number or space
```

## Java Solution

See [`Pattern26.java`](./Pattern26.java)

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
* Pattern 26 - Hollow Number Pyramid
