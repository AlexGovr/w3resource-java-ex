package basicpart1;

import java.util.Scanner;

public class Ex13 {

    public static void main(String args[]) {

        double a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("Input width and height:");
        a = input.nextDouble();
        b = input.nextDouble();
        System.out.printf("Perimeter is (%.1f + %.1f)*2 = %.1f\n", a, b,(a + b) * 2);
        System.out.printf("Area is %.1f * %.1f = %.2f\n", a, b, a * b);
    }
}