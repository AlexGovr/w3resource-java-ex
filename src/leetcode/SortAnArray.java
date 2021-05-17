package leetcode;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        if (arr.length < 2) { return; }
        boolean sorted = false;
        int buf;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    buf = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = buf;
                    sorted = false;
                }
            }
        }
    }
}