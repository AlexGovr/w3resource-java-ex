package basicpart2;

import java.util.Arrays;

public class Ex162 {
    
    public static void main(String args[]) {
        int[] arr = {1, 4, 5, 34, 56 , 33};

        if (arr.length == 0) {
            System.out.println("Error: empty array");
            return;
        }

        int avrg = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            avrg += arr[i];
        }
        avrg /= arr.length;
        System.out.println("Average value: " + avrg);
        for (int n : arr) {
            if (n > avrg) {
                System.out.println(n);
            }
        }
    }
}