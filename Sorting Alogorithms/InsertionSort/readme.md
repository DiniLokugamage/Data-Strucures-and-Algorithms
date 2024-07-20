# Insertion Sort in Java

This repository contains a simple implementation of the Insertion Sort algorithm in Java.

## Files

The main file in this repository is `InsertionSort.java`, which contains the implementation of the Insertion Sort algorithm.

## Code Overview

The `InsertionSort.java` file contains three main methods:

1. `insertionSort(int[] arr)`: This method sorts an array of integers using the Insertion Sort algorithm. It iteratively calls the `insert` method to place each element in its correct position.

2. `insert(int[] arr, int i)`: This method inserts the `i`-th element of the array into its correct position in the sorted part of the array.

3. `printArray(int[] arr)`: This method prints the elements of an array.

The `main` method demonstrates the use of the `insertionSort` method by sorting a sample array and printing the original and sorted arrays.

## Usage

To run the code, compile the `InsertionSort.java` file and run the `main` method. The sample array is hardcoded in the `main` method, but can modify it to sort a different array.

```java
int[] arr = {12, 11, 13, 5, 6}; // Modify this line to sort a different array