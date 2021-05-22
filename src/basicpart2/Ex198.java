package basicpart2;

import java.util.Scanner;
import basicpart1.Ex48;

public class Ex198 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int pos = 0;
        for (int i = 2; i < n; i++) {
            if (Ex48.is_prime(i)) {
                pos++;
            }
        }
        System.out.println("Prime's position is:" + pos);
    }
}