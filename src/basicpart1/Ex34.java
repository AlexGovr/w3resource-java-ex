package basicpart1;

import java.util.Scanner;

public class Ex34 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input hexagon side length:");
        double len = input.nextDouble();
        double area = (6 * len * len) / (4 * Math.tan(Math.PI / 6));
        System.out.println("Area: " + area);
    }
}
