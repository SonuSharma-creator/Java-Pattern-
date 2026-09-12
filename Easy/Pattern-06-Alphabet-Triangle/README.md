# Pattern 06 - Alphabet Triangle

## Problem

Write a Java program to print an **alphabet triangle pattern** where each row starts from `A` and continues up to the alphabet corresponding to the current row number.

## Pattern

For `n = 5`:

```text
A
A B
A B C
A B C D
A B C D E
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
- The **inner loop** controls the number of alphabets printed in each row.
- The inner loop starts from `1`.
- The number of alphabets printed in each row is equal to the current row number.
- The expression `(char) (j + 64)` converts the numeric value into its corresponding uppercase alphabet.
- ASCII value `65` represents `A`, so adding `64` to `j` gives the required ASCII value.
- The pattern works for **any number of rows** by changing `n`.

### Formula Used

```text
Alphabet = (char) (j + 64)
```

Where:

- `n` = total number of rows
- `i` = current row number
- `j` = current alphabet position

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
i = 2 → A B
i = 3 → A B C
i = 4 → A B C D
i = 5 → A B C D E
```

### Loop Relationship

```text
Outer loop    → Controls rows
Inner loop    → Controls alphabets in each row
Printed value → (char) (j + 64)
```

```text
i = 1 → j = 1       → A
i = 2 → j = 1, 2    → A B
i = 3 → j = 1, 2, 3 → A B C
...
i = n → j = 1 to n  → A B C ... 
```

## Java Solution

See [`Pattern06.java`](./Pattern06.java)

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
- [ ] Pattern 07 - Number Square
- [ ] Pattern 08 - Reverse Number Triangle
- [ ] Pattern 09 - Repeated Alphabet Rows
- [ ] Pattern 10 - Floyd's Triangle