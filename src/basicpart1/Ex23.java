package basicpart1;

import java.util.Scanner;

public class Ex23 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input binary number:");
        String num = input.next();
        num = Ex20.to_hex(Ex22.bin_to_int(num));
        System.out.println("Hexademical number: " + num);
    }
}
