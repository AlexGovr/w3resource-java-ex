package basicpart1;

import java.util.Arrays;

public class Ex80 {
    
    public static void main(String args[]) {
        int[] arr = {10, 4, 30};
        System.out.println("Original array: " + Arrays.toString(arr));
        int res = arr[0];
        if (res < arr[arr.length - 1])
            res = arr[arr.length - 1];
        System.out.println(res);
    }
}
