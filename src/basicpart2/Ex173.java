package basicpart2;

import java.util.Scanner;
import java.util.Arrays;

public class Ex173 {
    public static void main(String[] args) {
        int[] arr = {1, 10, 2, 3, -7, 4, 5, 7};
        Scanner inp = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));

        int k = inp.nextInt();
        int[] arr1 = new int[arr.length - k + 1];
        for (int i = 0; i < arr1.length; i++) {
            int[] _arr = new int[k];
            for (int j = 0; j < k; j++) {
                _arr[j] = arr[i + j];
            }
            Arrays.sort(_arr);
            arr1[i] = _arr[k / 2];
        }

        System.out.println(Arrays.toString(arr1));
    }
}