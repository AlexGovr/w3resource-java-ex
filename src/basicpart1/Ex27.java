package basicpart1;

import java.util.Scanner;

public class Ex27 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input octal number:");
        String num = input.next();
        num = baseof_to_baseof(num, 8, 16);
        System.out.println("Hexademical number: " + num);
    }

    public static int base_to_dec(String of_base, int base) {
        int res = 0;
        int len = of_base.length();
        for (int i = 0; i < len; i++) {
            int _digit = get_digit(of_base.charAt(len-1-i));
            res += (int) (Math.pow(base, i) * _digit);
        }
        return res;
    }

    public static String dec_to_base(int i, int base) {
        String of_base = "";
        while (i > 0) {
            int tail = i % base;
            if (tail > 9) {
                switch (tail) {
                    case 10: of_base = 'a'+of_base; break;
                    case 11: of_base = 'b'+of_base; break;
                    case 12: of_base = 'c'+of_base; break;
                    case 13: of_base = 'd'+of_base; break;
                    case 14: of_base = 'e'+of_base; break;
                    case 15: of_base = 'f'+of_base; break;
                }
            }
            else
                of_base = tail + of_base;
            i /= base;
        }
        return of_base;
    }

    public static int get_digit(char c) {
        if (c > '9') {
            switch (c) {
                case 'a': return 10;
                case 'b': return 11;
                case 'c': return 12;
                case 'd': return 13;
                case 'e': return 14;
                case 'f': return 15;
            }
        }
        return (int) (c - '0');
    }

    public static String baseof_to_baseof(String num, int basefrom, int baseto) {
        return dec_to_base(base_to_dec(num, basefrom), baseto);
    }
}
