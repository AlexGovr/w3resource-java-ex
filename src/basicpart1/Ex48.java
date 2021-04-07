package basicpart1;

import java.util.Scanner;

public class Ex48 {
    
    public static void main(String args[]) {
        for (int n = 0; n < 100; n++){
            if (is_odd(n))
                System.out.println(n);
        }
    }

    public static boolean is_odd(int d) {
        for (int i = 2; i < (int) Math.sqrt(d) + 1; i++) {
            if ((d % i) == 0)
                return false;
        }
        return true;
    }
}
