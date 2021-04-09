package basicpart1;

import java.util.Arrays;

public class Ex103 {
    
    public static void main(String args[]) {
        int[] arr = {3, 10, 3, 10, 20, 3};
        int[] newarr = new int[0];
        System.out.println("Initial array: " + Arrays.toString(arr));
        
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            if (arr[i] == 10) {
                newarr = new int[len - 1 - i];
                for (int j = 0; j + i < len - 1; j++) {
                    newarr[j] = arr[j + i + 1];
                }
                break;
            }
        }
        System.out.println("New array: " + Arrays.toString(newarr));
    }
}
