package basicpart1;

import java.util.Scanner;
import basicpart1.Ex17;

public class Ex20 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a decimal number:");
        int n = input.nextInt();
        System.out.println("Hexademical number is: " + to_hex(n));
    }

    public static String to_hex(int i) {
        String hex = "";
        while (i > 0) {
            int tail = i % 16;
            if (tail > 9) {
                switch (tail) {
                    case 10: hex = 'a'+hex; break;
                    case 11: hex = 'b'+hex; break;
                    case 12: hex = 'c'+hex; break;
                    case 13: hex = 'd'+hex; break;
                    case 14: hex = 'e'+hex; break;
                    case 15: hex = 'f'+hex; break;
                }
            }
            else
                hex = tail + hex;
            i /= 16;
        }
        return hex;
    }
}