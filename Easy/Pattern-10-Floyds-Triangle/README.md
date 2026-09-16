# Pattern 10 - Floyd's Triangle

## Problem

Write a Java program to print **Floyd's Triangle**, where numbers are printed continuously in increasing order. Each row contains one more number than the previous row.

## Pattern

For `n = 5`:

```text
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

## Concepts Used

- Nested `for` loops
- Rows and columns
- Pattern printing
- Loop control
- Variable initialization
- Post-increment operator
- Continuous number printing
- Java `System.out.print()`
- Java `System.out.println()`

## Logic

- The variable `n` stores the total number of rows.
- The variable `m` is initialized to `1` and stores the number to be printed.
- The outer loop controls the number of rows.
- The inner loop controls the number of numbers printed in each row.
- The inner loop runs from `1` to `i`.
- The expression `m++` prints the current value of `m` and then increments it by `1`.
- Since `m` is not reset after each row, the numbers continue from the previous row.
- The number of elements increases by `1` in every new row.
- The pattern works for any number of rows by changing `n`.

### Formula Used

```text
Numbers in current row = i
Printed number = m++
Next value of m = m + 1
```

Where:

- `n` = total number of rows
- `i` = current row number
- `j` = column counter
- `m` = current number being printed

### Number Sequence Reference

| Row | Numbers Printed |
|-----|-----------------|
| 1   | 1               |
| 2   | 2 3             |
| 3   | 4 5 6           |
| 4   | 7 8 9 10        |
| 5   | 11 12 13 14 15  |

### Example for `n = 5`

```text
i = 1 → 1
i = 2 → 2 3
i = 3 → 4 5 6
i = 4 → 7 8 9 10
i = 5 → 11 12 13 14 15
```

### Loop Relationship

```text
Outer loop    → Controls rows
Inner loop    → Controls numbers in each row
m             → Maintains continuous numbering
Printed value → m++
```

```text
i = 1 → print 1 number
i = 2 → print 2 numbers
i = 3 → print 3 numbers
i = 4 → print 4 numbers
i = 5 → print 5 numbers
...
i = n → print n numbers
```

## Java Solution

See [`Pattern10.java`](./Pattern10.java)

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