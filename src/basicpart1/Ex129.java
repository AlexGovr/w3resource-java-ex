package basicpart1;

import java.util.Arrays;

public class Ex129 {

    public static void main(String args[]) {
        int[] arr = {1, 1, 3, 3, 4,};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i += 2) {
            if (arr[i] != arr[i+1]) {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(arr[arr.length-1]);
    }
}