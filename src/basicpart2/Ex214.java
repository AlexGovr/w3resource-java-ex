package basicpart2;

import java.util.Scanner;

public class Ex214 {

    // solve the equation:
    // ax+by=c
    // dx+ey=f
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        print("Input a b c d e f:");
        String[] in = input.nextLine().split(" ");
        double a = Integer.parseInt(in[0]);
        double b = Integer.parseInt(in[1]);
        double c = Integer.parseInt(in[2]);
        double d = Integer.parseInt(in[3]);
        double e = Integer.parseInt(in[4]);
        double f = Integer.parseInt(in[5]);

        double y = (-a * f / d + c) / (b - a * e / d);
        double x = (c - b * y) / a;
        print("y = " + y + "; x = " + x);
        print("" + (a * x + b * y - c));
        print("" + (d * x + e * y - f));
    }

    public static void print(String s) {
        System.out.println(s);
    }
}