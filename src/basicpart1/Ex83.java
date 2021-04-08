package basicpart1;

import java.util.Arrays;

public class Ex83 {
    
    public static void main(String args[]) {
        int[] arr = {10, 4, 30};
        int[] arr1 = {11, 20, 110};
        System.out.println("First array: " + Arrays.toString(arr));
        System.out.println("Second array: " + Arrays.toString(arr1));
        System.out.print("Result: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] * arr1[i] + " ");
        }
        System.out.println();
    }
}
