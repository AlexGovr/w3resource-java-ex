package basicpart1;

import java.util.Scanner;

public class Ex37 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string:");
        String str = input.next();
        str = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + str);
    }
}
