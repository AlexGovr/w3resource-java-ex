package basicpart2;

import java.util.Scanner;
import basicpart2.Ex222;
import linal.Point;

public class Ex224 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        print("Input center point and radius of the first circle: ");
        Point c1 = Ex222.get_point();
        double r1 = input.nextDouble();
        print("Input center point and radius of the second circle: ");
        Point c2 = Ex222.get_point();
        double r2 = input.nextDouble();
        double dist = c1.distanceTo(c2);
        if (dist < r1)
            print("C2 is in C1");
        if (dist < r2)
            print("C1 is in C2");
        if (dist < (r1 + r2))
            print("Circumference of C1 and C2 intersect");
        else
            print("C1 and C2 do not overlap");
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}