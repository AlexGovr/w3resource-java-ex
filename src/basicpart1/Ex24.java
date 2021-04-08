package basicpart1;

import java.util.Scanner;

public class Ex24 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input binary number:");
        String num = input.next();
        num = Ex21.to_oct(Ex22.bin_to_int(num));
        System.out.println("Octal number: " + num);
    }
}
