package basicpart1;

import java.util.Scanner;
import basicpart1.Ex27;

public class Ex28 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input hexademical number:");
        String hex = input.next();
        System.out.println("Octal number: " + Ex27.baseof_to_baseof(hex, 16, 8));
    }
}
