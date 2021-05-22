package basicpart2;

import java.util.Scanner;

public class Ex191 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i*i <= n; i++) {
            for (int j = 0; j*j <= n; j++) {
                if ((i*i + j*j) == n) {
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }
}