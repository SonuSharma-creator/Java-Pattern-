# Pattern 27 - Concentric Square

## Problem

Write a Java program to print a **concentric number square** where numbers are arranged in layers, with the smallest number on the outer boundary and the largest number at the center.

## Pattern

For `n = 5`:

```text
1 1 1 1 1 1 1 1 1
1 2 2 2 2 2 2 2 1
1 2 3 3 3 3 3 2 1
1 2 3 4 4 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 4 4 3 2 1
1 2 3 3 3 3 3 2 1
1 2 2 2 2 2 2 2 1
1 1 1 1 1 1 1 1 1
```

## Concepts Used

* Nested `for` loops
* Pattern printing
* `Math.min()`
* Row and column positioning
* Concentric pattern
* Number layers
* Mathematical logic

## Logic

* The outer loop controls the rows.
* The inner loop controls the columns.
* The pattern contains `2n - 1` rows and `2n - 1` columns.
* For every position, the distance from the nearest boundary is calculated.
* `Math.min()` is used to find the minimum distance from the four boundaries.
* The calculated value determines which number should be printed.
* The outermost layer contains `1`.
* Each inner layer increases the number by `1`.
* The center contains the largest number, `n`.

### Formula Used

```text
Number of rows    = 2n - 1
Number of columns = 2n - 1
```

The value at each position is determined using the minimum distance from:

```text
Top    → i
Left   → j
Bottom → 2n - i
Right  → 2n - j
```

Where:

* `n` = maximum number at the center
* `i` = current row
* `j` = current column

### Loop Relationship

```text
Outer loop  → Controls rows
Inner loop  → Controls columns
Math.min()  → Finds the nearest boundary
Calculated value → Determines the number to print
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
* Pattern 25 - X Pattern
* Pattern 26 - Hollow Number Pyramid
* Pattern 27 - Concentric Square
