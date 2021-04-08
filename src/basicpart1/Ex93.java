package basicpart1;

import java.util.Arrays;

public class Ex93 {
    
    public static void main(String args[]) {
        int[] arr = {10, 10, 20, 21};
        System.out.println("Array: " + Arrays.toString(arr));
        boolean ten = false;
        boolean twenty = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                ten = arr[i] == 10 | ten;
                twenty = arr[i] == 20 | twenty;
            }
        }
        if (!(twenty ^ ten)) {
            System.out.println(false);
            return;
        }
        System.out.println(true);
    }
}
