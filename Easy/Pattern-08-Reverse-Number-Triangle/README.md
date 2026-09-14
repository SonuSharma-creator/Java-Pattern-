# Pattern 08 - Reverse Number Triangle

## Problem

Write a Java program to print a **reverse number triangle pattern** where each row starts from `n` and prints numbers in decreasing order. The number of elements decreases by one in every row.

## Pattern

For `n = 5`:

```text
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
```

## Concepts Used

- Nested `for` loops
- Rows and columns
- Pattern printing
- Loop control
- Variable initialization
- Decrement operator (`--`)
- Java `System.out.print()`
- Java `System.out.println()`

## Logic

- The **outer loop** controls the number of rows.
- The **inner loop** controls the number of numbers printed in each row.
- The inner loop runs until `j <= n - i + 1`.
- A variable `m` is initialized with `n` at the beginning of every row.
- The value of `m` is printed, and then `m--` decreases it by `1`.
- Every new row starts again from `n`.
- The number of elements decreases by `1` after every row.
- The pattern works for **any number of rows** by changing `n`.

### Formula Used

```text
Numbers in current row = n - i + 1
Starting number = n
Next number = m--
```

Where:

- `n` = total number of rows and starting number
- `i` = current row number
- `j` = inner loop counter
- `m` = number being printed in decreasing order

### Example for `n = 5`

```text
i = 1 → 5 numbers → 5 4 3 2 1
i = 2 → 4 numbers → 5 4 3 2
i = 3 → 3 numbers → 5 4 3
i = 4 → 2 numbers → 5 4
i = 5 → 1 number  → 5
```

### Loop Relationship

```text
Outer loop     → Controls rows
Inner loop     → Controls numbers in each row
Starting value → m = n
Printed value  → m--
```

```text
i = 1 → j = 1 to 5 → 5 4 3 2 1
i = 2 → j = 1 to 4 → 5 4 3 2
i = 3 → j = 1 to 3 → 5 4 3
i = 4 → j = 1 to 2 → 5 4
i = 5 → j = 1      → 5
```

## Java Solution

See [`Pattern08.java`](./Pattern08.java)

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
- [ ] Pattern 09 - Repeated Alphabet Rows
- [ ] Pattern 10 - Floyd's Triangle