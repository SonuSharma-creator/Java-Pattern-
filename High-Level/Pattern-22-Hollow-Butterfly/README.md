# Pattern 22 - Hollow Butterfly Pattern

## Problem

Write a Java program to print a **hollow butterfly pattern** where stars are printed only on the boundaries of both wings.

## Pattern

For `n = 5`:

```text
*                 *
* *             * *
*   *         *   *
*     *     *     *
*       * *       *
*       * *       *
*     *     *     *
*   *         *   *
* *             * *
*                 *
```

## Concepts Used

* Nested `for` loops
* Pattern printing
* Boundary conditions
* Space management
* Symmetrical pattern
* Increasing and decreasing sequence

## Logic

* The first outer loop creates the upper half.
* The second outer loop creates the lower half.
* Stars are printed only at the first and last positions of each wing.
* Middle spaces increase toward the center and decrease afterward.

### Formula Used

```text
Number of middle spaces = 2 * (n - i)
```

Boundary condition:

```text
j == 1 || j == i
```

Where:

* `n` = size of the butterfly
* `i` = current row
* `j` = current position

### Loop Relationship

```text
Outer loops → Control upper and lower halves
Inner loops → Control stars and spaces
Condition    → Controls boundary stars
```

## Java Solution

See [`Pattern22.java`](./Pattern22.java)

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
* [x] Pattern 22 - Hollow Butterfly Pattern
