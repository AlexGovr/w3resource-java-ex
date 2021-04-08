package basicpart1;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex57 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number : ");
        int x = input.nextInt();
        ArrayList l = new ArrayList();

        for (int i = 1; i < x / 2 + 1; i++) {
            if (x % i == 0) {
                l.add(i);
            }
        }
        l.add(x);
        System.out.println("Factors: " + l.size());
    }
}
