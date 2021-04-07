package basicpart1;

import java.util.Scanner;

public class Ex51 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string");
        String s = input.next();
        int d = Integer.parseInt(s);
        System.out.println("Integer value: " + d);
    }
}
