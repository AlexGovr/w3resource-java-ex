package basicpart1;

import java.util.Arrays;

public class Ex82 {
    
    public static void main(String args[]) {
        int[] arr = {100, 4, 5, 100, 30};
        System.out.println("Original array: " + Arrays.toString(arr));
        int len = arr.length;
        int res = Math.max(arr[0], Math.max(arr[len / 2], arr[len - 1]));
        System.out.println(res);
    }
}
