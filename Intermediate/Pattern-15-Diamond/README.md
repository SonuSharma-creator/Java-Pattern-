# Pattern 15 - Diamond Star Pattern

## Problem

Write a Java program to print a **diamond star pattern** where the number of stars first increases toward the center and then decreases symmetrically, with spaces used to keep the pattern centered.

## Pattern

For `n = 5`:

```text
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
```

## Concepts Used

* Nested `for` loops
* Rows and columns
* Pattern printing
* Loop control
* Space management
* Center alignment
* Increasing and decreasing star pattern
* Ternary operator
* Symmetrical pattern
* Java `System.out.print()`
* Java `System.out.println()`

## Logic

* The variable `n` stores the number of rows in the upper half of the diamond.
* The **outer loop** runs from `1` to `2 * n - 1` to print the complete diamond.
* The variable `row` determines the effective row number for the current iteration.
* The ternary expression `i <= n ? i : 2 * n - i` increases the row number until `n` and then decreases it.
* The first **inner loop** prints spaces before the stars.
* The number of spaces decreases as the pattern moves toward the center and increases after the center.
* The second **inner loop** prints the stars.
* The number of stars increases by `2` toward the center and decreases by `2` after the center.
* The pattern is symmetrical around the middle row.
* The pattern works for any value of `n` by changing the value of `n`.

### Formula Used

```text
Total rows   = 2 * n - 1
Current row  = (i <= n) ? i : 2 * n - i
Number of spaces = n - row
Number of stars  = 2 * row - 1
```

Where:

* `n` = size of the diamond
* `i` = current loop iteration
* `row` = effective row number
* `j` = space/star counter


### Loop Relationship

```text
Outer loop → Controls all rows of the diamond
First loop  → Controls spaces
Second loop → Controls stars
```

```text
i = 1 → row = 1 → spaces = 4, stars = 1
i = 2 → row = 2 → spaces = 3, stars = 3
i = 3 → row = 3 → spaces = 2, stars = 5
i = 4 → row = 4 → spaces = 1, stars = 7
i = 5 → row = 5 → spaces = 0, stars = 9
i = 6 → row = 4 → spaces = 1, stars = 7
i = 7 → row = 3 → spaces = 2, stars = 5
i = 8 → row = 2 → spaces = 3, stars = 3
i = 9 → row = 1 → spaces = 4, stars = 1
```

### How `row` Works

The expression:

```java
int row = (i <= n) ? i : 2 * n - i;
```

creates the increasing and decreasing row sequence:

```text
1 → 2 → 3 → 4 → 5 → 4 → 3 → 2 → 1
```

This allows the same two inner loops to generate both the upper and lower halves of the diamond.

## Java Solution

See [`Pattern15.java`](./Pattern15.java)

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
