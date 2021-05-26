package basicpart2;

import java.util.Scanner;

public class Ex217 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int max = input.nextInt();
        int count = 1;
        for (int i = 3; i < max; i++) {
            count += is_prime(i) ? 1 : 0;
        }
        print(count);
    }

    public static boolean is_prime(int n) {
        for (int i = 2; i <= Math.max(Math.sqrt(n), 2); i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}