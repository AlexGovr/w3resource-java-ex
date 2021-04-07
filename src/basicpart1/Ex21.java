package basicpart1;

import java.util.Scanner;

public class Ex21 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a decimal number:");
        int n = input.nextInt();
        System.out.println("Octal number is: " + to_oct(n));
    }

    public static String to_oct(int i) {
        String oct = "";
        while (i > 0) {
            int tail = i % 8;
            oct = tail + oct;
            i /= 8;
        }
        return oct;
    }
}