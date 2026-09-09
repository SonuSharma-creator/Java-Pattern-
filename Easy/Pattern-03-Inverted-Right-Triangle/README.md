# Pattern 03 - Inverted Right Triangle

## Problem

Write a Java program to print an **inverted right-angled triangle pattern** using stars (`*`).

## Pattern

```text
* * * * *
* * * *
* * *
* *
*
```

## Concepts Used

* Nested `for` loops
* Rows and columns
* Pattern printing
* Loop control
* Java `System.out.print()`
* Java `System.out.println()`

## Logic

* The **outer loop** controls the number of rows.
* The **inner loop** controls the number of stars printed in each row.
* The number of stars **decreases by 1** after every row.
* The inner loop runs from `1` to `5 - i + 1`.

### Example

```text
Row 1 → * * * * *
Row 2 → * * * *
Row 3 → * * *
Row 4 → * *
Row 5 → *
```

### Formula Used

```text
5 - i + 1
```

This determines how many stars should be printed in the current row.

For example:

```text
i = 1 → 5 - 1 + 1 = 5 stars
i = 2 → 5 - 2 + 1 = 4 stars
i = 3 → 5 - 3 + 1 = 3 stars
i = 4 → 5 - 4 + 1 = 2 stars
i = 5 → 5 - 5 + 1 = 1 star
```

## Java Solution

See [`Pattern03.java`](./Pattern03.java)

## Complexity

**Time Complexity:** `O(n²)`

**Space Complexity:** `O(1)`

---

### Progress

* [x] Pattern 01 - Square Star
* [x] Pattern 02 - Right Triangle
* [x] Pattern 03 - Inverted Right Triangle
* [ ] Pattern 04 - Number Triangle
* [ ] Pattern 05 - Repeated Row Number
* [ ] Pattern 06 - Alphabet Triangle
* [ ] Pattern 07 - Number Square
* [ ] Pattern 08 - Reverse Number Triangle
* [ ] Pattern 09 - Repeated Alphabet Rows
* [ ] Pattern 10 - Floyd's Triangle
