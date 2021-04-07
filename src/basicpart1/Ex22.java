package basicpart1;

import java.util.Scanner;

public class Ex22 {
    
    public static void main(String args[]) {
        System.out.println("Input binary number:");
        Scanner input = new Scanner(System.in);
        String bin = input.next();
        System.out.println("Integer number: " + bin_to_int(bin));
    }

    public static int bin_to_int(String bin) {
        int res = 0;
        int len = bin.length();
        for (int i = 0; i < len; i++) {
            int bin_digit = (int) (bin.charAt(len-1-i) - '0');
            res += (int) (Math.pow(2, i) * bin_digit);
        }
        return res;
    }
}
