package basicpart1;

import java.util.Scanner;

public class Ex49 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer:");
        double d = input.nextInt();
        if (d % 2 == 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
