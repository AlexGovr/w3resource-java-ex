package basicpart2;

import java.util.Scanner;

public class Ex168 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two numbers:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println("Multiplication: " + mult_by_add(n1, n2));
    }

    public static int mult_by_add(int n1, int n2) {
        if ((n1 == 0) || (n2 == 0)){
            return 0;
        }
        // optimize
        if (n1 < n2) {
            int buf = n1;
            n1 = n2;
            n2 = buf;
        }
        int res = n1;
        while (n2 != 1) {
            res += n1;
            n2--;
        }
        return res;
    }
}