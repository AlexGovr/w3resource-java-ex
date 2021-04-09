package basicpart1;

import java.util.Arrays;

public class Ex104 {
    
    public static void main(String args[]) {
        int[] arr = {3, 101, 3, 10, 20, 3};
        int[] newarr = new int[0];
        System.out.println("Initial array: " + Arrays.toString(arr));
        
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 10) {
                newarr = new int[i];
                for (int j = 0; j < i; j++) {
                    newarr[j] = arr[j];
                }
                break;
            }
        }
        System.out.println("New array: " + Arrays.toString(newarr));
    }
}
