package basicpart1;

import java.util.Scanner;

public class Ex5 {
    
    public static void main(String args[]) {
        
        double a, b;
        a = 1;
        b = 3;
        System.out.printf("%.1f %.1f\n", a, b);
        double buf = a;
        a = b;
        b = buf;
        System.out.printf("%.1f %.1f\n", a, b);
    }
}