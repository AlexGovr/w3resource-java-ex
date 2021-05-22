package basicpart2;

import java.util.Scanner;
import java.util.Arrays;

public class Ex195 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double l1 = input.nextDouble();
        double l2 = input.nextDouble();
        double l3 = input.nextDouble();
        double[] arr = {l1, l2, l3};
        Arrays.sort(arr);
        boolean res = arr[2] < (arr[0] + arr[1]);
        System.out.println("Triangle can be formed: " + res);
    }
}