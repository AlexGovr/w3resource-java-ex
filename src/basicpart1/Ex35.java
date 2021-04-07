package basicpart1;

import java.util.Scanner;

public class Ex34 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input piligon sides number:");
        double sides = input.nextDouble();
        System.out.println("Input piligon side length:");
        double len = input.nextDouble();
        double area = (sides * len * len) / (4 * Math.tan(Math.PI / sides));
        System.out.println("Area: " + area);
    }
}
