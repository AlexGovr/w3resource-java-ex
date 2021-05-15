package basicpart2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex160 {
    
    public static void main(String args[]) {
        int[] arr = {1, 4, 5, 34, 56 , 33};
        Scanner input = new Scanner(System.in);

        System.out.println("Input the number:");
        int k = input.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            System.out.printf("The #%s smallest element is: %s \n", i, arr[i]);
        }
    }
}