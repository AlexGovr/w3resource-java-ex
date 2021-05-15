package basicpart2;

import java.util.Scanner;

public class Ex152 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean eq = true;
        if (input.nextInt() != n) { eq = false; }
        if (input.nextInt() != n) { eq = false; }
        if (input.nextInt() != n) { eq = false; }
        
        System.out.println(eq);
    }
}