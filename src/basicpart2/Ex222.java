package basicpart2;

import java.util.Scanner;

import linal.Point;

public class Ex222 {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String args[]) {
        print("input points coords for two lines:");
        Point p1 = get_point();
        Point p2 = get_point();
        Point p3 = get_point();
        Point p4 = get_point();

        double dx1 = p1.getX() - p2.getX();
        double dy1 = p1.getY() - p2.getY();
        double dx2 = p3.getX() - p4.getX();
        double dy2 = p3.getY() - p4.getY();

        boolean paral = false;

        if (dx1 == 0 && dy1 == 0 || dx2 == 0 && dy2 == 0) {
            print("line points must differ!");
            return;
        }

        if (dy1 == 0 && dy2 == 0) {
            paral = true;
        } else if (dx1/dy1 == dx2/dy2){
            paral = true;
        }
        print("Lines are parallel: " + paral);
    }

    public static Point get_point() {
        return new Point(input.nextDouble(), input.nextDouble());
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}