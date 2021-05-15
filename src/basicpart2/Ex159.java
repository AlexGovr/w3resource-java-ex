package basicpart2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex159 {
    
    public static void main(String args[]) {
        int[] arr = {1, 4, 5, 34, 56 , 33};
        Scanner input = new Scanner(System.in);

        System.out.println("Input the number:");
        int k = input.nextInt();
        Arrays.sort(arr);
        for (int i = 1; i <= k; i++) {
            System.out.printf("The #%s largest element is: %s \n", i, arr[arr.length - i]);
        }
    }
}