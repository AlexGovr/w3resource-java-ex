package basicpart1;

import java.util.Scanner;

public class Ex29 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input hexademical number:");
        String hex = input.next();
        System.out.println("Binary number: " + Ex27.baseof_to_baseof(hex, 16, 2));
    }
}
