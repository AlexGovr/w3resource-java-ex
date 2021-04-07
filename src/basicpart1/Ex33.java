package basicpart1;

import java.util.Scanner;
import basicpart1.Ex27;

public class Ex33 {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer:");

        int a = input.nextInt();
        String s = "" + a;
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            sum += Ex27.get_digit(s.charAt(i));
        }

        System.out.println("Sum is: " + sum);
    }
}