# Pattern 30 - Spiral Number Square

## Problem

Write a Java program to print a **spiral number square** where numbers are arranged from `1` to `n²` in a clockwise spiral pattern.

## Pattern

For `n = 5`:

```text
 1  2  3  4  5
16 17 18 19  6
15 24 25 20  7
14 23 22 21  8
13 12 11 10  9
```

## Concepts Used

- 2D arrays
- Nested `for` loops
- `while` loop
- Matrix traversal
- Spiral traversal
- Boundary management
- Incrementing numbers
- `printf()` formatting

## Logic

- A square matrix of size `n × n` is created.
- Four boundaries are maintained:
  - `top`
  - `bottom`
  - `left`
  - `right`
- Numbers are filled in a clockwise spiral order.
- First, the top row is filled from left to right.
- Then, the right column is filled from top to bottom.
- Next, the bottom row is filled from right to left.
- Finally, the left column is filled from bottom to top.
- After completing each boundary, the corresponding boundary is moved inward.
- This process continues until the entire matrix is filled.
- The matrix is then printed row by row.

### Formula Used

```text
Matrix size = n × n
Total elements = n²
```

For `n = 5`:

```text
Total elements = 5² = 25
```

Where:

- `n` = size of the square matrix
- `top` = top boundary
- `bottom` = bottom boundary
- `left` = left boundary
- `right` = right boundary
- `num` = current number being inserted

### Loop Relationship

```text
while loop     → Controls the spiral traversal
Top row        → Left to right
Right column   → Top to bottom
Bottom row     → Right to left
Left column    → Bottom to top
Boundary update → Moves the spiral inward
```

## Java Solution

See [`Pattern30.java`](./Pattern30.java)

## Complexity

**Time Complexity:** `O(n²)`

**Space Complexity:** `O(n²)`

---

### Progress

-  Pattern 01 - Square Star
-  Pattern 02 - Right Triangle
-  Pattern 03 - Inverted Right Triangle
-  Pattern 04 - Number Triangle
-  Pattern 05 - Repeated Row Number
-  Pattern 06 - Alphabet Triangle
-  Pattern 07 - Number Square
-  Pattern 08 - Reverse Number Triangle
-  Pattern 09 - Repeated Alphabet Rows
-  Pattern 10 - Floyd's Triangle

-  Pattern 11 - Right-Aligned Star Triangle
-  Pattern 12 - Inverted Right-Aligned Star Triangle
-  Pattern 13 - Pyramid Star Pattern
-  Pattern 14 - Inverted Centered Star Pyramid
-  Pattern 15 - Diamond Star Pattern
-  Pattern 16 - Hollow Square Star Pattern
-  Pattern 17 - Hollow Right Triangle
-  Pattern 18 - Butterfly Star Pattern
-  Pattern 19 - Palindromic Number Pyramid
-  Pattern 20 - Hollow Diamond Star Pattern

-  Pattern 21 - Hollow Butterfly Pattern
-  Pattern 22 - Sandglass Pattern
-  Pattern 23 - Sandglass Pattern
-  Pattern 24 - Zig-Zag Pattern
-  Pattern 25 - X Pattern
-  Pattern 26 - Hollow Number Pyramid
-  Pattern 27 - Concentric Square
-  Pattern 28 - Binary Triangle
-  Pattern 29 - Character Diamond
-  Pattern 30 - Spiral Number Square

---

## 🎉 Challenge Completed

I have successfully completed the **30 Days Java Pattern Printing Challenge** with consistency and dedication.

This challenge helped me improve my understanding of:

- Java loops
- Nested loops
- Conditional statements
- Pattern logic
- Mathematical logic
- Problem-solving skills
- Consistency in coding

**30 Days. 30 Patterns. One step closer to becoming a better programmer.**

**Consistency is the key to improvement!**