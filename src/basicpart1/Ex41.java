package basicpart1;

import java.util.Scanner;

public class Ex41 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input char:");
        
        char c = (char) input.next().charAt(0);
        System.out.printf("The ASCII value of %c is %d\n", c, (int) c);
    }
}
