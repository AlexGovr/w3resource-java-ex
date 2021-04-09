package basicpart1;

import java.util.Arrays;

public class Ex105 {
    
    public static void main(String args[]) {
        int[] arr = {3, 10, 5,  3, 10, 1};
        int l = 2;
        System.out.println("Array: " + Arrays.toString(arr));
        
        int len = arr.length;
        for (int i = 0; i < l && i < len; i++) {
            if (arr[i] != arr[len - l + i]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
