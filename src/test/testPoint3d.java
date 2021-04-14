package test;

import linal.Point3d;

public class testPoint3d {

    public static void main(String[] args) {
        Point3d p = new Point3d(1, 2, 2);
        System.out.println("Create point p: " + p.toString());
        Point3d p1 = new Point3d(1, 2, 3);
        System.out.println("Create point p1: " + p1.toString());
        System.out.println("Distance between p and p1: " + p1.distanceTo(p));
        System.out.println("Distance between p1 and origin: " + p1.distanceTo(Point3d.origin));
        System.out.println("p1 equals p: " + p1.equals(p));
        System.out.println("p1 equals p1: " + p1.equals(p1));
        System.out.println("p1 compared to p: " + p1.compareTo(p));
    }
}
