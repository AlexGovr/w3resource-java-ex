package basicpart1;

import java.util.Arrays;

public class Ex81 {
    
    public static void main(String args[]) {
        int[] arr = {10, 4, 30};
        int[] arr1 = arr.clone();
        System.out.println("Original array: " + Arrays.toString(arr));
        arr1[0] = arr[arr.length - 1];
        arr1[arr1.length - 1] = arr[0];
        System.out.println("New array: " + Arrays.toString(arr1));
    }
}
