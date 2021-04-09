package basicpart1;

import java.util.Arrays;

public class Ex106 {
    
    public static void main(String args[]) {
        int[] arr = {3, 101, 3, 10, 20, 3};
        int len = arr.length;
        int[] newarr = new int[len];
        System.out.println("Initial array: " + Arrays.toString(arr));
        
        newarr[len - 1] = arr[0];
        for (int i = 0; i < len - 1; i++) {
            newarr[i] = arr[i+1];
        }
        System.out.println("New array: " + Arrays.toString(newarr));
    }
}
