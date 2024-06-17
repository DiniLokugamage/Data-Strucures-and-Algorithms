package BubbleSort;

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
