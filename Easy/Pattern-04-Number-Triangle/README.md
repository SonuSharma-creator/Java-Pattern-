# Pattern 04 - Number Triangle

# Problem

Write a Java program to print a **number triangle pattern** where each row starts from `1` and continues up to the current row number.

## Pattern

For `n = 5`:

```text
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
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
* The **inner loop** prints numbers in each row.
* The inner loop starts from `1`.
* The number printed is the value of `j`.
* The inner loop runs until `j <= i`, so each row contains numbers from `1` to the current row number.
* The pattern works for **any number of rows** by changing `n`.

### Formula Used

```text
Numbers in current row = i
```

Where:

* `n` = total number of rows
* `i` = current row number
* `j` = current number being printed

### Example for `n = 5`

```text
i = 1 → 1
i = 2 → 1 2
i = 3 → 1 2 3
i = 4 → 1 2 3 4
i = 5 → 1 2 3 4 5
```

### Loop Relationship

```text
Outer loop  →  Controls rows
Inner loop  →  Controls numbers in each row

i = 1 → j = 1
i = 2 → j = 1, 2
i = 3 → j = 1, 2, 3
...
i = n → j = 1, 2, 3, ..., n
```

## Java Solution

See [`Pattern04.java`](./Pattern04.java)

## Complexity

**Time Complexity:** `O(n²)`

**Space Complexity:** `O(1)`

---

### Progress

* [x] Pattern 01 - Square Star
* [x] Pattern 02 - Right Triangle
* [x] Pattern 03 - Inverted Right Triangle
* [x] Pattern 04 - Number Triangle
* [ ] Pattern 05 - Repeated Row Number
* [ ] Pattern 06 - Alphabet Triangle
* [ ] Pattern 07 - Number Square
* [ ] Pattern 08 - Reverse Number Triangle
* [ ] Pattern 09 - Repeated Alphabet Rows
* [ ] Pattern 10 - Floyd's Triangle
