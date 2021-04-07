package basicpart1;

import java.util.Scanner;

public class Ex36 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double r = 6371.01;

        System.out.println("Input the latitude of coordinate 1:");
        double x1 = input.nextDouble();
        System.out.println("Input the longitude of coordinate 1:");
        double y1 = input.nextDouble();
        System.out.println("Input the latitude of coordinate 2:");
        double x2 = input.nextDouble();
        System.out.println("Input the longitude of coordinate 2:");
        double y2 = input.nextDouble();

        double dist = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println("Distance between two points: " + dist + " km");
    }
}
