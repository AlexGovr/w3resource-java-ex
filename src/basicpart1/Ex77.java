package basicpart1;

import java.util.Arrays;

public class Ex77 {
    
    public static void main(String args[]) {
        int[] arr = {10, 20, 30};
        int[] arr1 = {10, 20, 10};
        int[] arr2 = {arr[0], arr1[arr1.length-1]};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
