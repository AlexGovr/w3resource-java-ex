package basicpart1;

import java.util.Scanner;

public class Ex73 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input two strings: ");
        String s1 = input.nextLine();
        String s2 = input.nextLine();

        char c1 = '#';
        char c2 = '#';

        if (s1.length() > 0)
            c1 = s1.charAt(1);

        if (s2.length() > 0)
            c2 = s2.charAt(1);

        System.out.println(String.valueOf(c1) + String.valueOf(c2));
    }
}
 