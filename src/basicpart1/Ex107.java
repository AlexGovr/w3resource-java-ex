package basicpart1;

import java.util.Arrays;

public class Ex107 {
    
    public static void main(String args[]) {
        int[] arr = {3, 101, 3, 100, 20, 3};
        System.out.println("Array: " + Arrays.toString(arr));
        
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                count++;
                if (count == 2) {
                    System.out.println(true);
                    return;
                }
            }
            else
                count = 0;
        }
        System.out.println(false);
    }
}
