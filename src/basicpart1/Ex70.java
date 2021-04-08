package basicpart1;

import java.util.Scanner;

public class Ex70 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input two strings: ");
        String s1 = input.next();
        String s2 = input.next();
        if (s1.length() == s2.length()){
            System.out.println("strings must have different length");
            return;
        }
        if (s1.length() < s2.length()) {
            String buf = s1;
            s1 = s2;
            s2 = buf;
        }
        String s = s2 + s1 + s2;
        System.out.println(s);
    }
}
 