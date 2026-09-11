# Pattern 05 - Repeated Row Number

## Problem

Write a Java program to print a **repeated row number pattern** where each row contains the same number repeated according to the current row number.

## Pattern

For `n = 5`:

```text
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
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
- The **inner loop** controls the number of repetitions in each row.
- The inner loop starts from `1`.
- The inner loop runs until `j <= i`.
- The number printed is the value of `i`.
- Since `i` remains the same during one row, the same number is printed repeatedly.
- The number of repetitions increases by `1` in every new row.
- The pattern works for **any number of rows** by changing `n`.

### Formula Used

```text
Number printed in current row = i
Number of repetitions = i
```

Where:

- `n` = total number of rows
- `i` = current row number
- `j` = repetition counter

### Example for `n = 5`

```text
i = 1 → 1
i = 2 → 2 2
i = 3 → 3 3 3
i = 4 → 4 4 4 4
i = 5 → 5 5 5 5 5
```

### Loop Relationship

```text
Outer loop    → Controls rows
Inner loop    → Controls repetitions
Printed value → i
```

```text
i = 1 → print 1 one time
i = 2 → print 2 two times
i = 3 → print 3 three times
...
i = n → print n, n times
```

## Java Solution

See [`Pattern05.java`](./Pattern05.java)

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
- [ ] Pattern 06 - Alphabet Triangle
- [ ] Pattern 07 - Number Square
- [ ] Pattern 08 - Reverse Number Triangle
- [ ] Pattern 09 - Repeated Alphabet Rows
- [ ] Pattern 10 - Floyd's Triangle