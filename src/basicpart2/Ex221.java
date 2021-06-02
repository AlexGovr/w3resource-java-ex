package basicpart2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex221 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        print("input six numbers:");
        String[] arr = input.nextLine().split(" ");
        if (arr.length != 6) {
            print("wrong number of integers!");
            return;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        print(Arrays.toString(arr));
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}