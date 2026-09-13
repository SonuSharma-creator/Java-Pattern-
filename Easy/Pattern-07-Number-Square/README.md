# Pattern 07 - Number Square

## Problem

Write a Java program to print a **number square pattern** where each row contains numbers from `1` to `n`.

## Pattern

For `n = 5`:

```text
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
```

## Concepts Used

- Nested `for` loops
- Rows and columns
- Pattern printing
- Loop control
- Java `System.out.print()`
- Java `System.out.println()`

## Logic

- The **outer loop** controls the number of rows.
- The **inner loop** controls the numbers printed in each row.
- The outer loop runs from `1` to `n`.
- The inner loop also runs from `1` to `n`.
- The value of `j` is printed in every iteration of the inner loop.
- Since the inner loop always starts from `1` and ends at `n`, every row contains the same sequence of numbers.
- The pattern forms a square because the number of rows and columns is equal.
- The pattern works for **any number of rows and columns** by changing `n`.

### Formula Used

```text
Number printed = j
Rows = n
Columns = n
```

Where:

- `n` = total number of rows and columns
- `i` = current row number
- `j` = current column number and printed value

### Example for `n = 5`

```text
i = 1 → 1 2 3 4 5
i = 2 → 1 2 3 4 5
i = 3 → 1 2 3 4 5
i = 4 → 1 2 3 4 5
i = 5 → 1 2 3 4 5
```

### Loop Relationship

```text
Outer loop    → Controls rows
Inner loop    → Controls columns
Printed value → j
```

```text
i = 1 → j = 1 to 5 → 1 2 3 4 5
i = 2 → j = 1 to 5 → 1 2 3 4 5
i = 3 → j = 1 to 5 → 1 2 3 4 5
...
i = n → j = 1 to n → 1 2 3 ... n
```

## Java Solution

See [`Pattern07.java`](./Pattern07.java)

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
- [ ] Pattern 08 - Reverse Number Triangle
- [ ] Pattern 09 - Repeated Alphabet Rows
- [ ] Pattern 10 - Floyd's Triangle