package basicpart1;

import java.util.Scanner;

public class Ex85 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string:");
        String s = input.nextLine();
        System.out.println("Input a sarting sequence to check:");
        String start = input.next();
        if (s.split(" ")[0].equals(start)) {
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}