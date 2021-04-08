package basicpart1;

import java.util.Scanner;

public class Ex58 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number : ");
        StringBuilder txt = new StringBuilder(input.nextLine());

        txt.setCharAt(0, Character.toUpperCase(txt.charAt(0)));

        for (int i = 0; i < txt.length() - 1; i++) {
            if (txt.charAt(i) == ' ') {
                char c = txt.charAt(i + 1);
                txt.setCharAt(i + 1, Character.toUpperCase(c));
            }
        }
		
        System.out.println(txt);
    }
}
