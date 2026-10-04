# Pattern 28 - Binary Triangle

## Problem

Write a Java program to print a **binary triangle** where `0` and `1` are printed alternately in each row.

## Pattern

For `n = 5`:

```text
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
```

## Concepts Used

* Nested `for` loops
* Pattern printing
* Binary numbers
* Modulus operator
* Conditional statements
* Alternating pattern
* Row and column positioning

## Logic

* The outer loop controls the rows.
* The inner loop prints numbers from `1` to the current row number.
* The sum of the current row and column numbers is checked using the modulus operator.
* If the sum is even, `1` is printed.
* If the sum is odd, `0` is printed.
* This creates an alternating binary pattern.

### Formula Used

```text
If (i + j) % 2 == 0 → 1
If (i + j) % 2 != 0 → 0
```

Where:

* `n` = total number of rows
* `i` = current row
* `j` = current column

### Loop Relationship

```text
Outer loop  → Controls rows
Inner loop  → Controls numbers in each row
Condition   → Determines whether to print 0 or 1
```

## Java Solution

See [`Pattern28.java`](./Pattern28.java)

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
* Pattern 27 - Concentric Square
* Pattern 28 - Binary Triangle
