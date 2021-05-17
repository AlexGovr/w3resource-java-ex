package basicpart2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex161 {
    
    public static void main(String args[]) {
        int[] arr = {1, 4, 5, 34, 56 , 33};
        Scanner input = new Scanner(System.in);

        System.out.println("Input the number:");
        int k = input.nextInt();
        Arrays.sort(arr);
        System.out.printf("The #%s largest element is: %s \n", k, arr[arr.length - k]);
        System.out.printf("The #%s smallest element is: %s \n", k, arr[k]);
    }
}