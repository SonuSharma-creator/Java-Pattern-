# Pattern 02 - Right Triangle Star 

## Problem

Write a Java program to print a **right-angled triangle pattern** using stars (`*`).

## Pattern

```text
*
* *
* * *
* * * *
* * * * *
```

## Concepts Used

* Nested `for` loops
* Rows and columns
* Pattern printing
* `System.out.print()`
* `System.out.println()`

## Logic

* The **outer loop** controls the number of rows.
* The **inner loop** prints stars in each row.
* The number of stars increases by **1** in every new row.
* For `n` rows, the inner loop runs from `1` to the current row number.

### Example

```text
Row 1 → *
Row 2 → * *
Row 3 → * * *
Row 4 → * * * *
Row 5 → * * * * *
```

## Java Solution

See [`Pattern02.java`](./Pattern02.java)

## Complexity

**Time Complexity:** `O(n²)`

**Space Complexity:** `O(1)`

---

### Progress

### Progress
* [✓] Pattern 01 
* [✓] Pattern 02
* [ ] Pattern 03
* [ ] Pattern 04
* [ ] Pattern 05
* [ ] Pattern 06
* [ ] Pattern 07
* [ ] Pattern 08
* [ ] Pattern 09
* [ ] Pattern 10
