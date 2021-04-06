package basicpart1;

import java.util.Scanner;

public class Ex6 {
    
    public static void main(String args[]) {
        double a, b;
        Scanner scan = new Scanner(System.in);

        System.out.println("First number, please:");
        a = scan.nextDouble();
        System.out.println("Second number, please:");
        b = scan.nextDouble();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}