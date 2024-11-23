import java.util.Arrays;
public class Optimized_Bubble_Sort {
    public static void earlybublesort(int[]arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped=false;
             for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                     swapped=true;
                }  
             
                }
                if(!swapped){
                 break;
                  }
    }
    }
    public static void main(String[]args){
        int []arr={4,1,2,3,5,6};
        System.out.println("Original Array: " + Arrays.toString(arr));
        earlybublesort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
    

    
    
