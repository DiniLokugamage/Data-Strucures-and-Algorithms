public class BS {
    public static void main(String[] args) {
        int array[] = {5, 3, 8, 6, 4};

        System.out.println("Before sorted: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
       
        BubbleSort(array);
    }

    static void BubbleSort(int array[]){
        for(int i=1; i<array.length; i++){
            for(int j=1; j<=array.length-i; j++){
                if(array[j-1]>array[j]){
                    int x = array[j-1]; // 5
                    int y = array[j]; // 3
                    array[j] = x;
                    array[j-1] = y;
                }
            }
        }

        System.out.println("\nAfter Sorted: " );
        for (int y : array) {
            System.out.print(y + " ");
        }
        
    }
}

