package InsertionSort;

public class InsertionSort{
    //Method to perform insertion sort
    public static void insertionSort(int[]arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            insert(arr, i);
        }
    }
    //Method to insert arr[i] into the sorted part of the array
    public static void insert(int[]arr, int i){
        int key = arr[i];
        int j = i-1;

        //move elemets of arr[0..i-1], trhat are greater than key, to one position ahead of their current position
        while (j>=0 && arr[j] > key){
            arr[j+1] = arr[j];
            j = j-1;
        }
        arr[j+1] = key;
    }

    //Method to print the array
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[]args){
        int[]arr = {12,11,13,5,6};
        System.out.println("Original Array: ");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}