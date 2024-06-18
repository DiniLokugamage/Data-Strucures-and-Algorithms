import java.util.Scanner;
public class SelectionSort {
    //Method to perform Selection Sort
    public static void selectionSort(int[] arr, int order){
        for(int i=0; i<arr.length; i++){
            int selectedIndex = i;

            for(int j=i+1; j<arr.length; j++){
                if(order==1 && arr[j]<arr[selectedIndex]){
                    selectedIndex = j;
                } else if(order==2 && arr[j] >arr[selectedIndex]){
                    selectedIndex = j;
                }
            }

            if(selectedIndex !=i){
                int temp = arr[i];
                arr[i] = arr[selectedIndex];
                arr[selectedIndex] = temp;
            }
        }
    }

    //method to print the array
    public static void printArray(int[] arr){
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        //Method to get the user inputs
        Scanner in = new Scanner(System.in);

        //get the number of elements
        System.out.print("Enter the number of elements: ");
        int count = in.nextInt();

        //get the elements
        int arr[] = new int[count];
        for(int i=0; i<count; i++){
            System.out.print("Enter Element " + (i+1) + ": ");
            arr[i] = in.nextInt();
        }

        //get the sorting order
        System.out.print("Enter the Sorting order(1 for ascending, 2 for descending: )");
        int order = in.nextInt();
        if(order != 1 && order !=2){
            System.out.println("Invalid order.Defaulting to Ascending.");
            order = 1;
        }

        //print tghe original array
        System.out.print("Original Array: ");
        printArray(arr);

        //sort the array
        selectionSort(arr, order);

        //print the sorted array
        System.out.println("Sorted Array: (" + (order == 1? "Ascending" : "descending") + "): ");
        printArray(arr);

        in.close();
    }
}