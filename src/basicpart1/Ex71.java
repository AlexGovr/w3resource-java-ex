package basicpart1;

import java.util.Scanner;

public class Ex71 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input two strings: ");
        String s1 = input.next();
        String s2 = input.next();

        String s = s1.substring(1) + s2.substring(1);
        System.out.println(s);
    }
}
 