package basicpart1;

import java.util.Arrays;

public class Ex97 {
    
    public static void main(String args[]) {
        int[] arr = {10, 4, 3, 3, 3, 5};
        int seek = 4;

        System.out.println("Array: " + Arrays.toString(arr));
        for (int i=0; i<arr.length-2; i++) {
            if (arr[i] == seek && (arr[i] == arr[i+1] || arr[i] == arr[i+2])) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
