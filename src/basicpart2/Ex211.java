package basicpart2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Math;

public class Ex211 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input buildings heights:");
        String[] s_heights = input.nextLine().split(" ");
        Integer[] arr = new Integer[s_heights.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s_heights[i]);
        }

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Three highest buildings' heights:");
        for(int i = 0; i < Math.min(arr.length, 3); i++) {
            System.out.println(arr[i]);
        }
    }
}