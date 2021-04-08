package basicpart1;

import java.util.Scanner;

public class Ex18 {
    
    public static void main(String args[]) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input two binary numbers:");
        a = scan.nextInt();
        b = scan.nextInt();
        a = Ex17.to_int(a);
        b = Ex17.to_int(b);
        System.out.println("Result: " + Ex17.to_bin(a * b));
    }
}
