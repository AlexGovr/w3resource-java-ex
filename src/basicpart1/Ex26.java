package basicpart1;

import java.util.Scanner;
import basicpart1.Ex25;

public class Ex24 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input octal number:");
        String num = input.next();
        num = to_bin(Ex25.oct_to_int(num));
        System.out.println("Binary number: " + num);
    }

    public static String to_bin(int i) {
        String bin = "";
        while (i > 0) {
            int tail = i % 2;
            bin = tail + bin;
            i /= 2;
        }
        return bin;
    }
}
