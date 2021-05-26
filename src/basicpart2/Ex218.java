package basicpart2;

import java.util.Scanner;

public class Ex218 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input x1, y1, x2, y2, x3, y3 separated by a single space:"); 

        String[] in = input.nextLine().split(" ");

        double x1 = Double.parseDouble(in[0]);
        double y1 = Double.parseDouble(in[1]);
        double x2 = Double.parseDouble(in[2]);
        double y2 = Double.parseDouble(in[3]);
        double x3 = Double.parseDouble(in[4]);
        double y3 = Double.parseDouble(in[5]);

        double A = x2 - x1;
        double B = y2 - y1;
        double p = (y2 * y2 - y1 * y1 + x2 * x2 - x1 * x1) / 2;
        double C = x3 - x1;
        double D = y3 - y1;
        double q = (y3 * y3 - y1 * y1 + x3 * x3 - x1 * x1) / 2;

        double X = (D * p - B * q) / (A * D - B * C);
        double Y = (A * q - C * p) / (A * D - B * C);

        double r = Math.sqrt(Math.pow(X - x1, 2.0) + Math.pow(Y - y1, 2.0));
        System.out.println("\nRadius and the central coordinate:"); 
        System.out.printf("%.3f (%.3f %.3f)", r, X, Y);        
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}