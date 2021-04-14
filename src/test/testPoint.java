package test;

import linal.Point;

public class testPoint {
    
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        System.out.println("Create point p: " + p.toString());
        Point p1 = new Point(2, 2.2);
        System.out.println("Create point p1: " + p1.toString());
        System.out.println("Distance between p and p1: " + p1.distanceTo(p));
        System.out.println("Distance between p1 and origin: " + p1.distanceTo(Point.origin));
        System.out.println("p1 equals p: " + p1.equals(p));
        System.out.println("p1 equals p1: " + p1.equals(p1));
        System.out.println("p1 compared to p: " + p1.compareTo(p));
    }
}
