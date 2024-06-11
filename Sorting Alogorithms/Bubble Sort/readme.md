# Bubble Sort

This is a Java implementation of the Bubble Sort algorithm. Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The algorithm continues to do this until the list is sorted.

## Usage

To use this implementation of Bubble Sort, follow these steps:

1. Create an instance of the `BubbleSort` class.
2. Define an array of integers that you want to sort.
3. Call the `bubbleSort` method, passing in the array as an argument.
4. Iterate over the sorted array and perform any desired operations.

Here's an example of how to use the Bubble Sort algorithm:

```java
public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {7, 3, 9, 2, 4};
        bubbleSort(data);
        for (int num : data) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        // Implementation details
    }
}
```

## Complexity Analysis

The time complexity of Bubble Sort is O(n^2), where n is the number of elements in the array. This makes it inefficient for large data sets. However, Bubble Sort has the advantage of being easy to understand and implement.

-------------------------------------------------------------------------------------------------------------------------------

# Optimized Bubble Sort

This is a Java implementation of the Optimized Bubble Sort algorithm. Optimized Bubble Sort is a variation of the Bubble Sort algorithm that improves its efficiency by stopping the algorithm if the inner loop doesn't perform any swaps in a pass.

## Usage

To use this implementation of Optimized Bubble Sort, follow these steps:

1. Create an instance of the `optimizedBubbleSort` class.
2. Define an array of integers that you want to sort.
3. Call the `BubbleSort` method, passing in the array as an argument.
4. Iterate over the sorted array and perform any desired operations.

Here's an example of how to use the Optimized Bubble Sort algorithm:

```java
public class optimizedBubbleSort {
    public static void main(String[] args) {
        int array[] = { 4, 3, 5, 6, 8 };

        System.out.println("Before sorted: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        BubbleSort(array);
    }

    static void BubbleSort(int array[]) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            count++;
            boolean isSwapped = false;
            for (int j = 1; j <= array.length - i; j++) {

                if (array[j - 1] > array[j]) {
                    int x = array[j - 1]; // 5
                    int y = array[j]; // 3
                    array[j] = x;
                    array[j - 1] = y;

                    isSwapped = true;

                }
            }
            if (isSwapped) {
                continue;
            } else {
                System.out.println("\n" + count);
                break;

            }
        }

        System.out.println("\nAfter Sorted: ");
        for (int y : array) {
            System.out.print(y + " ");
        }

    }
}
```

## Complexity Analysis

The time complexity of Optimized Bubble Sort is also O(n^2), where n is the number of elements in the array. However, the optimized version reduces the number of comparisons and swaps, making it more efficient than the regular Bubble Sort algorithm.

