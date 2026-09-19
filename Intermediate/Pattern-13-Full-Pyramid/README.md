# Pattern 13 - Pyramid Star Pattern

## Problem

Write a Java program to print a **pyramid star pattern** where each row contains an increasing number of stars, with spaces added before the stars to center-align the pyramid.

## Pattern

For `n = 5`:

```text
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
```

## Concepts Used

- Nested `for` loops
- Rows and columns
- Pattern printing
- Loop control
- Space management
- Center alignment
- Arithmetic expression
- Java `System.out.print()`
- Java `System.out.println()`

## Logic

- The variable `n` stores the total number of rows.
- The **outer loop** controls the number of rows.
- The first **inner loop** prints spaces before the stars.
- The number of spaces decreases as the row number increases.
- The second **inner loop** prints the stars in each row.
- The number of stars increases by `2` in every new row.
- The expression `n - i` determines the number of spaces printed before the stars.
- The expression `i * 2 - 1` determines the number of stars printed in the current row.
- The pattern works for any number of rows by changing `n`.

### Formula Used

```text
Number of spaces = n - i
Number of stars  = i * 2 - 1
```

Where:

- `n` = total number of rows
- `i` = current row number
- `j` = space counter
- `k` = star counter

### Example for `n = 5`

```text
i = 1 → 4 spaces + 1 star
i = 2 → 3 spaces + 3 stars
i = 3 → 2 spaces + 5 stars
i = 4 → 1 space  + 7 stars
i = 5 → 0 spaces + 9 stars
```

### Loop Relationship

```text
Outer loop → Controls rows
First loop  → Controls spaces
Second loop → Controls stars
```

```text
i = 1 → spaces = 4, stars = 1
i = 2 → spaces = 3, stars = 3
i = 3 → spaces = 2, stars = 5
i = 4 → spaces = 1, stars = 7
i = 5 → spaces = 0, stars = 9
...
i = n → spaces = 0, stars = 2n - 1
```

## Java Solution

See [`Pattern13.java`](./Pattern13.java)

## Complexity

**Time Complexity:** `O(n²)`

**Space Complexity:** `O(1)`

---

### Progress

- [x] Pattern 01 - Square Star
- [x] Pattern 02 - Right Triangle
- [x] Pattern 03 - Inverted Right Triangle
- [x] Pattern 04 - Number Triangle
- [x] Pattern 05 - Repeated Row Number
- [x] Pattern 06 - Alphabet Triangle
- [x] Pattern 07 - Number Square
- [x] Pattern 08 - Reverse Number Triangle
- [x] Pattern 09 - Repeated Alphabet Rows
- [x] Pattern 10 - Floyd's Triangle
- [x] Pattern 11 - Right-Aligned Star Triangle
- [x] Pattern 12 - Inverted Right-Aligned Star Triangle
- [x] Pattern 13 - Pyramid Star Pattern