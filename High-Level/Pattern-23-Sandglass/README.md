# Pattern 23 - Sandglass Star Pattern

## Problem

Print a sandglass-shaped star pattern for `n = 5`.

## Pattern

```text
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
```

## Concepts Used

* Nested `for` loops
* Pattern symmetry
* Spaces and stars
* Row-based formula

## Logic

* Upper half decreases the number of stars.
* Lower half increases the number of stars.
* Leading spaces increase in the upper half and decrease in the lower half.
* Total rows = `2 * n - 1`.

### Formula Used

```text
Stars = 2 * (n - i) + 1   // Upper half
Stars = 2 * i - 1         // Lower half
```

### Loop Relationship

```text
Upper: i = 1 → n
Lower: i = 2 → n
```

## Java Solution

See [`Pattern23.java`](./Pattern23.java)

## Complexity

* **Time:** O(n²)
* **Space:** O(1)

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

* [x] Pattern 21 - Pascal's Triangle
* [x] Pattern 22 - Hollow Butterfly Pattern
* [x] Pattern 23 - Sandglass Star Pattern
