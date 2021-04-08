package basicpart1;

import java.util.Scanner;

public class Ex72 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String s = input.next();
        int len = Math.min(3, s.length());
        int sub = 3 - len;
        System.out.println(s.substring(0, len) + "#".repeat(sub));
    }
}
 