package basicpart2;

import java.util.Arrays;

public class Ex176 {

    public static void main(String args[]) {
        int[] arr = {1, 2, 1};
        System.out.println(Arrays.toString(arr));
        even_odd_partition(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void even_odd_partition(int[] arr) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (is_even(arr[i]) && !is_even(arr[i-1])) {
                    swap(arr, i-1, i);
                    sorted = false;
                }
            }
        }
    }

    public static boolean is_even(int n) {
        return (n % 2) == 0;
    }

    public static void swap(int[] arr, int i, int j) {
        int buf = arr[i];
        arr[i] = arr[j];
        arr[j] = buf;
    }
}