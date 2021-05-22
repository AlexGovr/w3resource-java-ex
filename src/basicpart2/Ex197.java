package basicpart2;

import java.util.Scanner;

public class Ex197 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("The number is a perfect square:" + ((Math.sqrt(n) % 1) == 0));
    }
}