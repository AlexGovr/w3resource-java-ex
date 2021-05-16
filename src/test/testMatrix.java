package test;

import linal.Matrix;

public class testMatrix {
    public static void main(String[] args) {
        double[][] values = {{1, 2, 2,  1},
                             {3, 0, 5, -2},
                             {4, 2, 2,  6},
                             {1, 3, 2,  5}};
        Matrix m = new Matrix(values);
        System.out.println("Matrix:\n" + m.toString());
        System.out.println("Determinant: " + m.det());
        System.out.println("Trace: " + m.trace());
        System.out.println("Transposed:'\n" + m.transpose());

        double[][] values1 = {{3, 2,  2,  1},
                              {5, 0,  5, -2},
                              {4, 1,  8,  6},
                              {1, 0, -3,  5}};
        Matrix m1 = new Matrix(values1);
        System.out.println("Matrix1:\n" + m.toString());
        System.out.println("m + m1:\n" + m.sum(m1).toString());
        System.out.println("m - m1:\n" + m.difference(m1).toString());
        System.out.println("m * m1:\n" + m.mul(m1).toString());
        System.out.println("m hash code:\n" + m.hashCode());
        System.out.println();
    }
}
