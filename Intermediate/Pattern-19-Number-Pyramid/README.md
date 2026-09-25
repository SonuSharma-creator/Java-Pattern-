# Pattern 19 - Palindromic Number Pyramid

## Problem

Write a Java program to print a **palindromic number pyramid** where numbers increase toward the center and then decrease symmetrically.

## Pattern

For `n = 5`:

```text
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
```

## Concepts Used

* Nested `for` loops
* Pattern printing
* Number sequence
* Space management
* Center alignment
* Palindrome pattern

## Logic

* The outer loop controls the rows.
* The first inner loop prints spaces before the numbers.
* The second inner loop prints numbers in increasing order from `1` to `i`.
* The third inner loop prints numbers in decreasing order from `i - 1` to `1`.
* This creates a symmetrical number pattern.

### Formula Used

```text
Number of spaces = n - i
Increasing numbers = 1 to i
Decreasing numbers = i - 1 to 1
```

Where:

* `n` = total number of rows
* `i` = current row
* `j` = loop counter

### Loop Relationship

```text
Outer loop  → Controls rows
First loop  → Controls spaces
Second loop → Prints increasing numbers
Third loop  → Prints decreasing numbers
```

## Java Solution

See [`Pattern19.java`](./Pattern19.java)

## Complexity

**Time Complexity:** `O(n²)`

**Space Complexity:** `O(1)`

---

### Progress

* [x] Pattern 01 - Square Star
* [x] Pattern 02 - Right Triangle
* [x] Pattern 03 - Inverted Right Triangle
* [x] Pattern 04 - Number Triangle
* [x] Pattern 05 - Repeated Row Number
* [x] Pattern 06 - Alphabet Triangle
* [x] Pattern 07 - Number Square
* [x] Pattern 08 - Reverse Number Triangle
* [x] Pattern 09 - Repeated Alphabet Rows
* [x] Pattern 10 - Floyd's Triangle
* [x] Pattern 11 - Right-Aligned Star Triangle
* [x] Pattern 12 - Inverted Right-Aligned Star Triangle
* [x] Pattern 13 - Pyramid Star Pattern
* [x] Pattern 14 - Inverted Centered Star Pyramid
* [x] Pattern 15 - Diamond Star Pattern
* [x] Pattern 16 - Hollow Square Star Pattern
* [x] Pattern 17 - Hollow Right Triangle
* [x] Pattern 18 - Butterfly Star Pattern
* [x] Pattern 19 - Palindromic Number Pyramid
