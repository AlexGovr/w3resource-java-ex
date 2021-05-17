package basicpart2;

import java.util.Arrays;

public class Ex167 {
    public static void main(String[] args) {
        int[] arr = {-5, -4, 0, 0, -4, 0};
        System.out.println(Arrays.toString(arr));

        boolean sorted = false;
        int buf;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < arr.length; i++) {
                if ((arr[i] == 0) && (arr[i - 1] != 0)) {
                    buf = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = buf;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}