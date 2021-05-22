package basicpart2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex189 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s1 = new StringBuilder(input.nextLine()).reverse().toString();
        String s2 = new StringBuilder(input.nextLine()).reverse().toString();
        if (s2.length() > s1.length()) {
            String buf = s1;
            s1 = s2;
            s2 = buf;
        }

        int mem = 0;
        int res = 0;
        int add = 0;
        int mult = 1;
        // 13245
        // 1294
        // = 59152
        for (int i = 0; i < s2.length(); i++) {
            add = char2int(s1.charAt(i)) + char2int(s2.charAt(i)) + mem;
            res += (add % 10) * mult;
            mult *= 10;
            mem = add / 10;
        }
        if (s1.length() == s2.length())
            res += mem * mult;
        else {
            for (int i = s2.length(); i < s1.length(); i++) {
                add = char2int(s1.charAt(i)) + mem;
                res += (add % 10) * mult;
                mult *= 10;
                mem = add / 10;
            }
        }
        res += mem * mult;
        
        System.out.printf("s1 + s2 = %s", res);
    }

    public static int char2int(char c) {
        return (int) c - 48;
    }
}
