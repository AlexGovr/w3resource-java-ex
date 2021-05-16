package linal;

import java.util.Arrays;

public class Vector {
    private final double[] coords;

    public Vector(double[] coords) {
        this.coords = Arrays.copyOf(coords, coords.length);
    }

    public int getSize() {
        return this.coords.length;
    }

    @Override
    public int hashCode() {
        int h = 17;
        for (double d : coords) {
            h += 31 * h + String.valueOf(d).hashCode();
        }
        return h;
    }
    
    @Override
    public boolean equals(Object other){
        if (other == null || this.getClass() != other.getClass()) return false;
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