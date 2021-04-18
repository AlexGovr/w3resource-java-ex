package basicpart1;

import java.util.Scanner;

public class Ex149 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two strings: ");
        String s = input.next();
        String s1 = input.next();
        if (s.length() != s1.length()) {
            System.out.println("These two strings are not permutations of each other");
            return;
        }
        int[] charcount = new int['z' - 'a' + 1];
        int[] charcount1 = new int['z' - 'a' + 1];
        for (int i = 0; i < s.length(); i++) {
            charcount[s.charAt(i) - 'a']++;
            charcount1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (charcount[s.charAt(i) - 'a'] != charcount1[s.charAt(i) - 'a']) {
                System.out.println("These two strings are not permutations of each other");
                return;
            }
        }
        System.out.println("Oh yes, they are!");
    }
}