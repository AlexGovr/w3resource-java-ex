package basicpart2;

import java.util.Arrays;

public class Ex178 {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 7, 8, 9};
        int max = 0;
        int cur = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) cur++;
            else {
                max = cur > max ? cur : max;
                cur = 1;
            }
        }
        max = cur > max ? cur : max;
        System.out.println(Arrays.toString(arr));
        System.out.println("Length of the longest increasing subsequence: " + max);
    }
}