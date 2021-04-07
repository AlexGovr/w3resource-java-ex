package basicpart1;

import java.util.Scanner;

public class Ex44 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer:");
        int n = input.nextInt();
        System.out.printf("%d + %d%d + %d%d%d = %4d\n", n, n, n, n, n, n, n * (111+11+1));
    }
}
