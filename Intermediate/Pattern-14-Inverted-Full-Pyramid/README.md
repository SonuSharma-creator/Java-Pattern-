# Pattern 14 - Inverted Centered Star Pyramid

## Problem

Write a Java program to print an **inverted centered star pyramid** where each row contains a decreasing odd number of stars, preceded by an increasing number of spaces to keep the stars centered.

## Pattern

For `n = 5`:

```text
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
* Decreasing star pattern
* Odd number sequence
* Java `System.out.print()`
* Java `System.out.println()`

## Logic

* The variable `n` stores the total number of rows.
* The **outer loop** controls the number of rows.
* The first **inner loop** prints spaces before the stars.
* The number of spaces increases by `1` in every new row.
* The second **inner loop** prints the stars in each row.
* The number of stars decreases by `2` in every new row.
* The expression `i - 1` determines the number of spaces printed before the stars.
* The expression `2 * (n - i) + 1` determines the number of stars printed in the current row.
* The pattern works for any number of rows by changing `n`.

### Formula Used

```text
Number of spaces = i - 1
Number of stars  = 2 * (n - i) + 1
```

Where:

* `n` = total number of rows
* `i` = current row number
* `j` = space/star counter

### Example for `n = 5`

```text
i = 1 → 0 spaces + 9 stars
i = 2 → 1 space  + 7 stars
i = 3 → 2 spaces + 5 stars
i = 4 → 3 spaces + 3 stars
i = 5 → 4 spaces + 1 star
```

### Loop Relationship

```text
Outer loop → Controls rows
First loop  → Controls spaces
Second loop → Controls stars
```

```text
i = 1 → spaces = 0, stars = 9
i = 2 → spaces = 1, stars = 7
i = 3 → spaces = 2, stars = 5
i = 4 → spaces = 3, stars = 3
i = 5 → spaces = 4, stars = 1
...
i = n → spaces = n - 1, stars = 1
```

## Java Solution

See [`Pattern14.java`](./Pattern14.java)

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
* [x] Pattern 13 - [Pattern 13 Name]
* [x] Pattern 14 - Inverted Centered Star Pyramid
