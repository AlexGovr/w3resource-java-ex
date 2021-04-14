package test;

import linal.Vector;

public class testVector {

    public static void main(String[] args) {
        double[] coords = {1, 2, 2};
        Vector v = new Vector(coords);
        coords[0] = 3;
        coords[2] = 0;
        Vector v1 = new Vector(coords);
        System.out.println("Create vector v: " + v.toString());
        System.out.println("Create vector v1: " + v1.toString());
        System.out.println("Distance between v and v1: " + v1.distanceTo(v));
        System.out.println("v1.abs(): " + v1.abs());
        System.out.println("v1 equals v: " + v1.equals(v));
        System.out.println("v1 equals v1: " + v1.equals(v1));
        System.out.println("v1 - v: " + v1.difference(v));
        System.out.println("v1 + v: " + v1.sum(v));
    }
}
