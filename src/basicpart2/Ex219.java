package basicpart2;

import java.util.Scanner;
import linal.Point;

public class Ex219 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String args[]) {
        print("Input target point and three points of a trianlge:");
        Point p = new Point(getd(), getd());
        // shift to origin and work as with vectors
        Point t1 = new Point(getd() - p.getX(), getd() - p.getY());
        Point t2 = new Point(getd() - p.getX(), getd() - p.getY());
        Point t3 = new Point(getd() - p.getX(), getd() - p.getY());
        double ang = angle(t1, t2) + angle(t2, t3) + angle(t3, t1);
        print("p is in triangle: " + (ang == 2 * Math.PI));
    }

    public static double angle(Point a, Point b) {
        double dot = (a.getX() * b.getX() + a.getY() * b.getY());
        double cos = dot / a.distanceTo(Point.origin) / b.distanceTo(Point.origin);
        return Math.acos(cos);
    }

    public static void print(Object o) {
        System.out.println(o);
    }

    public static double getd() {
        return input.nextDouble();
    }
}