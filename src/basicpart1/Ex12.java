package basicpart1;

import java.util.Scanner;

public class Ex12 {

    public static void main(String args[]) {

        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Input 3 numbers");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        System.our.println((a + b + c) / 3);
    }
}