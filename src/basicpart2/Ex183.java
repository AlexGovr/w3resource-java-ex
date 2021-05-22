package basicpart2;

import java.util.Scanner;

public class Ex183 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while ((n / 10) != 0) {
            n = digits_sum(n);
        }
        System.out.println("Result:" + n);
    }

    public static int digits_sum(int n) {
        int res = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            res += (int)s.charAt(i) - 48;
        }
        return res;
    }
}