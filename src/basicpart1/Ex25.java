package basicpart1;

import java.util.Scanner;

public class Ex25 {
    
    public static void main(String args[]) {
        System.out.println("Input octal number:");
        Scanner input = new Scanner(System.in);
        String oct = input.next();
        System.out.println("Integer number: " + oct_to_int(oct));
    }

    public static int oct_to_int(String oct) {
        int res = 0;
        int len = oct.length();
        for (int i = 0; i < len; i++) {
            int oct_digit = (int) (oct.charAt(len-1-i) - '0');
            res += (int) (Math.pow(8, i) * oct_digit);
        }
        return res;
    }
}
