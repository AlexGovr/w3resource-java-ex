package basicpart2;

import java.util.Scanner;

public class Ex171 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        System.out.println(check_sub(s1, s2));
    }

    public static boolean check_sub(String s1, String s2) {
        boolean issub = false;
        for (int i = 0; i < s1.length() - s2.length() + 1; i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                issub = true;
                for (int j = 1; j < s2.length(); j++) {
                    if (s1.charAt(i + j) != s2.charAt(j)) {
                        issub = false;
                        break;
                    }
                }
                if (issub) { return true; }
            }
        }
        return false;
    }

    // using built-in functionality
    public static boolean check_sub_(String s1, String s2) {
        return s1.indexOf(s2) != -1;
    }
}