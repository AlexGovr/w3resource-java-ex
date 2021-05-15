package basicpart2;

import java.util.Scanner;

public class Ex157 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.printf("The largest comming divisor is: %s \n", get_common_factor(a, b));
    }

    public static int get_common_factor(int a, int b) {
        if (a == 0 || b == 0) { return 1;}
        while (a != b) {
            if (a > b) { a = a - b; }
            else { b = b - a; }
        }
        return a;
    }
}