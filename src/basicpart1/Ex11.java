package basicpart1;

import java.util.Scanner;

public class Ex11 {
    
    public static void main(String args[]) {
        double r;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the radius");
        r = scan.nextDouble();
        System.out.println("Area: " + Math.PI * r * r);
    }
}