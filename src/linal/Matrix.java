package linal;

import java.util.Arrays;

public class Matrix {
    private final double[][] VALUES;
    private final int WIDTH;
    private final int HEIGHT;
    private String asString;

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

    public Matrix(double[][] values) throws IllegalArgumentException {
        int height = values.length;
        int width = values[0].length;
        String asStr = "";
        for (double[] ds : values) {
            if (ds.length != width)
                throw new IllegalArgumentException("matrix rows must be of the same length");
            asStr += Arrays.toString(values);
        }
        this.VALUES = values.clone();
        this.HEIGHT = height;
        this.WIDTH = width;
        this.asString = asStr;
    }

    public int getWidth() {
        return this.WIDTH;
    }

    public int getHeight() {
        return this.HEIGHT;
    }

    @Override
    public int hashCode() {
        return this.asString.hashCode();
    }

    @Override
    public boolean equals(Object other){
        this.checkSameSize((Matrix)other);
        if (this.getClass() != other.getClass()) return false;
        if (this == other) return true;
        for (int i = 0; i < this.getHeight(); i++) {
            for (int j = 0; j < this.getWidth(); j++) {
                if (this.VALUES[i][j] != ((Matrix) other).getValue(i, j))
                    return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("Matrix(\n%s\n)", this.asString);
    }

    public Matrix sum(Matrix other) {
        this.checkSameSize(other);
        double[][] values = new double[this.getHeight()][this.getWidth()];
        for (int i = 0; i < this.getHeight(); i++) {
            for (int j = 0; j < this.getWidth(); j++) {
                values[i][j] = this.getValue(i, j) + other.getValue(i, j);
            }
        }
        return new Matrix(values);
    }

    public Matrix difference(Matrix other) {
        this.checkSameSize(other);
        double[][] values = new double[this.getHeight()][this.getWidth()];
        for (int i = 0; i < this.getHeight(); i++) {
            for (int j = 0; j < this.getWidth(); j++) {
                values[i][j] = this.getValue(i, j) - other.getValue(i, j);
            }
        }
        return new Matrix(values);
    }

    public double getValue(int i, int j) {
        return this.VALUES[i][j];
    }

    public void checkSameSize(Matrix other) throws IllegalArgumentException {
        if (this.getWidth() != other.getWidth() || this.getHeight() != other.getHeight())
            throw new IllegalArgumentException("matrices must be of the same size");
    }
}