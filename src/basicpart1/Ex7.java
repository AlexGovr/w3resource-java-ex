package basicpart1;

import java.util.Scanner;

public class Ex7 {
    
    public static void main(String args[]) {
        double a;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input a number, please");
        a = scan.nextDouble();
        for (int i=1; i<11; i++) {
            System.out.println(a + " * " + i + " = " + a*i);
        }    
    }
}