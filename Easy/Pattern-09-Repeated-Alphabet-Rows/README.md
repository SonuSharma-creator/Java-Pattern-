# Pattern 09 - Repeated Alphabet Rows

## Problem

Write a Java program to print a **repeated alphabet row pattern** where each row contains the same alphabet repeated according to the current row number.

## Pattern

For `n = 5`:

```text
A
B B
C C C
D D D D
E E E E E
```

## Concepts Used

- Nested `for` loops
- Rows and columns
- Pattern printing
- Loop control
- Type casting
- ASCII values
- Java `System.out.print()`
- Java `System.out.println()`

## Logic

- The **outer loop** controls the number of rows.
- The **inner loop** controls the number of repetitions in each row.
- The inner loop runs from `1` to `i`.
- The expression `(char) (i + 64)` converts the numeric value of `i` into its corresponding uppercase alphabet.
- Since the value of `i` remains the same during one row, the same alphabet is printed repeatedly.
- The number of repetitions increases by `1` in every new row.
- The pattern works for **any number of rows** by changing `n`.

### Formula Used

```text
Alphabet printed = (char) (i + 64)
Number of repetitions = i
```

Where:

- `n` = total number of rows
- `i` = current row number
- `j` = repetition counter

### ASCII Value Reference

| Alphabet | ASCII Value |
|----------|-------------|
| A        | 65          |
| B        | 66          |
| C        | 67          |
| D        | 68          |
| E        | 69          |

### Example for `n = 5`

```text
i = 1 → A
i = 2 → B B
i = 3 → C C C
i = 4 → D D D D
i = 5 → E E E E E
```

### Loop Relationship

```text
Outer loop    → Controls rows
Inner loop    → Controls repetitions
Printed value → (char) (i + 64)
```

```text
i = 1 → print A one time
i = 2 → print B two times
i = 3 → print C three times
i = 4 → print D four times
i = 5 → print E five times
...
i = n → print corresponding alphabet, n times
```

## Java Solution

See [`Pattern09.java`](./Pattern09.java)

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
- [ ] Pattern 10 - Floyd's Triangle