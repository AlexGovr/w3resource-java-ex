package basicpart2;

import java.util.Scanner;
import java.util.Arrays;

public class Ex174 {
    public static void main(String[] args) {
        int[] arr = {1, 10, 2, 3};
        Scanner inp = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));

        int k = inp.nextInt();
        for (int i = 0; i < arr.length - k +1; i++) {
            int max = arr[i];
            for (int j = 1; j < k; j++) {
                max =  max > arr[i + j] ? max : arr[i + j];
            }
            System.out.println(max);
        }

    }
}