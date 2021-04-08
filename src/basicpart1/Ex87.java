package basicpart1;

import java.util.Scanner;
import basicpart1.Ex17;

public class Ex87 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer:");
        int d = input.nextInt();
        int sum = 0;

        for(int i = 0; i < Ex17.digits(d); i++) {
            sum += Ex17.get_digit(d, i);
        }
        
        System.out.println(sum);
        for(int i = 0; i < Ex17.digits(sum); i++) {
            int cur = Ex17.get_digit(sum, i);
            System.out.print(digitname(cur) + " ");
        }
        System.out.println();
    }

    public static String digitname(int d) {
        switch(d) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
        }
        return "";
    }
}