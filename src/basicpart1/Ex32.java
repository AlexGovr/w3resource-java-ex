package basicpart1;

import java.util.Scanner;

public class Ex32 {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input a and b");

        int a = input.nextInt();
        int b = input.nextInt();

        Boolean equal = (a == b);
        Boolean gt = (a > b);

        if (equal) System.out.printf("%d == %d\n", a, b);
        else if (gt) System.out.printf("%d > %d\n", a, b);
        else System.out.printf("%d < %d\n", a, b);
    }
}