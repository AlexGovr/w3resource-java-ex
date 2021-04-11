package basicpart1;

import java.util.Arrays;

public class Ex128 {

    public static void main(String args[]) {
        int[] arr = {-1, 2, 30, -8, 5, 16, 23, 34};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length / 2]);

    }
}