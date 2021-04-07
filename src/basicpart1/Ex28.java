package basicpart1;

import java.util.Scanner;
import basicpart1.Ex27;

public class Ex28 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input hexademical number:");
        String hex = input.next();
        System.out.println("Decimal number: " + Ex27.base_to_dec(hex, 16));
    }
}
