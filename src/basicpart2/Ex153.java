package basicpart2;

import java.util.Scanner;

public class Ex153 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        boolean between = true;
        double d = input.nextDouble();
        if (0 >= d || d >= 1) { between = false; }
        d = input.nextDouble();
        if (0 >= d || d >= 1) { between = false; }
        System.out.println(between);
    }
}