package basicpart1;

import java.util.Scanner;

public class Ex134 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of stairs: ");
        int n = input.nextInt();
        int prevprev = 1;
        int prev = 2;
        int l = 0;
        if (n == 1) {
            System.out.println(" Distinct ways can you climb to the top: " + prevprev);
            return;
        }
        if (n == 2) {
            System.out.println(" Distinct ways can you climb to the top: " + prev);
            return;
        }

        for (int i = prev + 1; i <= n; i++) {
            l = prev + prevprev;
            prevprev = prev;
            prev = l;
        }
        System.out.println(" Distinct ways can you climb to the top: " + l);
    }
}