package basicpart1;

import java.util.Arrays;

public class Ex139 {
    
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, -6, 7, 9};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    System.out.printf("First and last indices of subarray: %s %s\n", i, j);
                    return;
                }
            }
        }
    }
}