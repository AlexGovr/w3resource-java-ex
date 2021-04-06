package basicpart1;

import java.util.Scanner;
import basicpart1.Ex17;

public class Ex19 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a decimal number:");
        int n = input.nextInt();
        System.out.println("Binary number is: " + Ex17.to_bin(n));
    }
}