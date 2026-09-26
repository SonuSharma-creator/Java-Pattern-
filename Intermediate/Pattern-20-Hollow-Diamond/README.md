# Pattern 20 - Hollow Diamond Star Pattern

## Problem

Write a Java program to print a **hollow diamond star pattern** where stars are printed only on the boundaries of the diamond.

## Pattern

For `n = 5`:

```text
        * 
      *   *
    *       *
  *           *
*               *
  *           *
    *       *
      *   *
        *
```

## Concepts Used

* Nested `for` loops
* Pattern printing
* Space management
* Center alignment
* Boundary conditions
* Symmetrical pattern
* Increasing and decreasing sequence

## Logic

* The first outer loop prints the upper half of the diamond.
* The second outer loop prints the lower half.
* Spaces are used to center the diamond.
* The inner loop prints stars only at the first and last positions.
* The number of spaces inside the diamond increases toward the middle and then decreases.

### Formula Used

```text
Upper half:
Leading spaces = n - i
Width = 2 * i - 1

Lower half:
Leading spaces = i
Width = 2 * (n - i) - 1
```

### Loop Relationship

```text
First outer loop  → Controls upper half
Second outer loop → Controls lower half
First inner loop  → Controls leading spaces
Second inner loop → Controls diamond width
Condition         → Controls boundary stars
```

## Java Solution

See [`Pattern20.java`](./Pattern20.java)

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
* [x] Pattern 20 - Hollow Diamond Star Pattern
