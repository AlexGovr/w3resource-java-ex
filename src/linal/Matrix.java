package linal;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Matrix {
    private final double[][] VALUES;
    private final int SIZE;
    private final String AS_STRING;

    public Matrix(double[][] values) throws IllegalArgumentException {
        int size = values.length;
        int width = values[0].length;
        if (width != size)
            throw new IllegalArgumentException("matrix rows must be of the same length");

        String asStr = "";
        for (double[] ds : values) {
            if (ds.length != width)
                throw new IllegalArgumentException("matrix rows must be of the same length");
            asStr += Arrays.toString(ds) + "\n";
        }
        this.VALUES = copy2dim(values);
        this.SIZE = size;
        this.AS_STRING = asStr;
    }

    private static double[][] copy2dim(double[][] arr) {
        double[][] res = new double[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            res[i] = Arrays.copyOf(arr[i], arr[i].length);
        }
        return res;
    }

    public int getSize() {
        return this.SIZE;
    }

    @Override
    public int hashCode() {
        int h = 17;
        for (double[] row : VALUES) {
            for (double d : row) {
                h += 31 * h + String.valueOf(d).hashCode();
            }
        }
        return h;
    }

    @Override
    public boolean equals(Object other){
        this.checkSameSize((Matrix)other);
        if (other == null || this.getClass() != other.getClass()) return false;
        if (this == other) return true;
        for (int i = 0; i < this.getSize(); i++) {
            for (int j = 0; j < this.getSize(); j++) {
                if (this.VALUES[i][j] != ((Matrix) other).getValue(i, j))
                    return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("Matrix(\n%s)", this.AS_STRING);
    }

    public Matrix sum(Matrix other) {
        this.checkSameSize(other);
        double[][] values = new double[this.getSize()][this.getSize()];
        for (int i = 0; i < this.getSize(); i++) {
            for (int j = 0; j < this.getSize(); j++) {
                values[i][j] = this.getValue(i, j) + other.getValue(i, j);
            }
        }
        return new Matrix(values);
    }

    public Matrix difference(Matrix other) {
        this.checkSameSize(other);
        double[][] values = new double[this.getSize()][this.getSize()];
        for (int i = 0; i < this.getSize(); i++) {
            for (int j = 0; j < this.getSize(); j++) {
                values[i][j] = this.getValue(i, j) - other.getValue(i, j);
            }
        }
        return new Matrix(values);
    }

    public double trace() {
        double diagSum = 0;
        for (int i = 0; i < this.getSize(); i++) {
            diagSum += this.getValue(i, i);
        }
        return diagSum;
    }

    public Matrix transpose() {
        int size = this.getSize();
        double[][] values = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                values[j][i] = this.getValue(i, j);
            }
        }
        return new Matrix(values);
    }

    public Matrix mul(Matrix other) {
        this.checkSameSize(other);
        int size = this.getSize();
        double[][] values = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    values[i][j] += this.getValue(i, k) + other.getValue(k, j);
                }
            }
        }
        return new Matrix(values);
    }

    public double det() {
        int[] rows = IntStream.range(0, this.getSize()).toArray();
        return this.subDet(rows, 0);
    }

    private double subDet(int[] rows, int j0) {
        int size = this.getSize();
        if (j0 == size)
            return 1;

        double res = 0;
        int sign = 1;
        for (int i : rows) {
            if (i != -1) {
                int[] _rows = rows.clone();
                _rows[i] = -1;
                res += this.getValue(i, j0) * this.subDet(_rows, j0+1) * sign;
                sign *= -1;
            }
        }
        return res;
    }

    public double getValue(int i, int j) {
        return this.VALUES[i][j];
    }

    public void checkSameSize(Matrix other) throws IllegalArgumentException {
        if (this.getSize() != other.getSize())
            throw new IllegalArgumentException("matrices must be of the same size");
    }
}