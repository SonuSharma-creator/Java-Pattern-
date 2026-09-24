# Pattern 18 - Butterfly Star Pattern

## Problem

Write a Java program to print a **butterfly star pattern** using stars and spaces.

## Pattern

For `n = 5`:

```text
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
```

## Concepts Used

* Nested `for` loops
* Pattern printing
* Symmetrical pattern
* Space management
* Ternary operator
* Increasing and decreasing sequence

## Logic

* The outer loop runs for `2 * n` rows.
* The `row` variable increases from `1` to `n` and then decreases back to `1`.
* The first and third loops print stars on both sides.
* The middle loop prints spaces between the two star sections.
* The number of stars increases toward the middle and decreases afterward.

### Formula Used

```text
Total rows       = 2 * n
Current row      = (i <= n) ? i : 2 * n - i + 1
Number of stars  = row
Number of spaces = 2 * (n - row)
```

### Loop Relationship

```text
Outer loop → Controls rows
First loop → Prints left stars
Second loop → Prints middle spaces
Third loop → Prints right stars
```

## Java Solution

See [`Pattern18.java`](./Pattern18.java)

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
