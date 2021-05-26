package basicpart2;

import java.util.Scanner;

public class Ex210 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String pattern = input.nextLine();
        String s = input.nextLine();
        System.out.println(match(pattern, s));
    }

    // aabdaaabdaaa aa*bd?aa*
    public static boolean match(String pattern, String s) {
        if (pattern.length() == 0) {
            if (s.length() == 0)
                return true;
            return false;
        }
        // retrieve nextsymbol in pattern
        char p = pattern.charAt(0);
        // check string is finished
        if (s.length() == 0)
            if (p == '*')
                return true;
            else
                return false;
        // retrieve nextsymbol in string
        char c = s.charAt(0);
        // match '?' or common symbol
        if(p == c || p == '?') return match(pattern.substring(1), s.substring(1));
        // match '*'
        if (p == '*') {
            // if '*' is the last
            if (pattern.length() == 1) { return true; }
            // else search for the next matching symbol
            for (int i = 0; i < s.length(); i++) {
                if (match(pattern.substring(1), s.substring(i)))
                    return true;
            }
        }
        return false;
    }
}