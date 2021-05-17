package basicpart2;

import java.util.Arrays;

public class Ex170 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 5, 7, -4, 5, -6, 7, -81, -9, -6, -1, 0};
        System.out.println(Arrays.toString(arr));

        int longest = 0;
        int cur = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] > arr[i - 1])) {
                cur++;
            } else {
                longest = Math.max(cur, longest);
                cur = 1;
            }
        }
        longest = Math.max(cur, longest);
        System.out.println(longest);
    }
}