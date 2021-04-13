package linal;

import java.util.Arrays;

public class Vector {
    private final double[] coords;

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

    public Vector(double[] coords) {
        this.coords = coords.clone();
    }

    public int getSize() {
        return this.coords.length;
    }

    @Override
    public int hashCode() {
        return Arrays.toString(this.coords).hashCode();
    }

    @Override
    public boolean equals(Object other){
        if (this.getClass() != other.getClass()) return false;
        if (this == other) return true;
        if (this.getSize() != ((Vector) other).getSize()) return false;
        for (int i = 0; i < coords.length; i++) {
            if (this.coords[i] != ((Vector) other).getCoordinate(i)) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("Vector(%s)", Arrays.toString(this.coords));
    }

    public double distanceTo(Vector other) throws IllegalArgumentException {
        if (this.getSize() != other.getSize())
            throw new IllegalArgumentException("vectors must be of the same size");
        double squaredDist = 0;
        double _dist = 0;
        for (int i = 0; i < coords.length; i++) {
            _dist = this.coords[i] - other.getCoordinate(i);
            squaredDist += _dist*_dist;
        }
        return Math.sqrt(squaredDist);
    }

    public double abs() {
        return this.distanceTo(new Vector(new double[this.getSize()]));
    }

    public Vector sum(Vector other) throws IllegalArgumentException {
        if (this.getSize() != other.getSize())
            throw new IllegalArgumentException("vectors must be of the same size");
        double[] coords = new double[this.getSize()];
        for (int i = 0; i < this.getSize(); i++) {
            coords[i] = this.coords[i] + other.getCoordinate(i);
        }
        return new Vector(coords);
    }

    public Vector difference(Vector other) throws IllegalArgumentException {
        if (this.getSize() != other.getSize())
            throw new IllegalArgumentException("vectors must be of the same size");
        double[] coords = new double[this.getSize()];
        for (int i = 0; i < this.getSize(); i++) {
            coords[i] = this.coords[i] - other.getCoordinate(i);
        }
        return new Vector(coords);
    }

    public double getCoordinate(int i) {
        return this.coords[i];
    }
}