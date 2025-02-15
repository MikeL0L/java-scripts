// Michael Andres S. Cabot
// CS225-D

import java.util.Arrays;

class Main {  
    static void bubbleSort(int arr[]) {
        int n = arr.length;
      
        for (int i = 0; i < n - 1; i++)
        
            for (int j = 0; j < n - i - 1; j++)
            
                if (arr[j] > arr[j + 1]) {
                  
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                
    }

    public static void main(String args[]) {
        
        int[] a = {5, 3, 2, 0, 4, 1};
      
        Main.bubbleSort(a);
      
        System.out.println(Arrays.toString(a));
    }
}

