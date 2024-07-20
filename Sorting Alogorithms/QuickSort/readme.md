# QuickSort Algorithm

This repository contains an implementation of the QuickSort algorithm in Python.

## Description
QuickSort is a widely used sorting algorithm that follows the divide-and-conquer approach. It works by selecting a pivot element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then recursively sorted.

## Usage
To use the QuickSort algorithm, follow these steps:
1. Define a list of elements to be sorted.
2. Call the `quickSort` function, passing the list, the starting index, and the ending index as parameters.

```python
list = [50, 23, 9, 18, 61, 32]
quickSort(list, 0, len(list) - 1)
```

## Example
Consider the following example:
```python
list = [50, 23, 9, 18, 61, 32]
quickSort(list, 0, len(list) - 1)
```
The output of this example will be:
```
[9, 18, 23, 32, 50, 61]
```




