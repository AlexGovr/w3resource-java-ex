package basicpart2;

import java.util.Scanner;

public class Ex204 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input x : ");
        int x = input.nextInt();  
        System.out.print("Input n : ");
        int n = input.nextInt(); 
        System.out.print("Input y : ");
        int y = input.nextInt(); 
        double result = Math.pow(x, n);
        double result1 = result % y;
        System.out.println("x^n % y = " + result1); 
    }
}