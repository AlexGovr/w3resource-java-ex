package basicpart1;

import java.util.Scanner;

public class Ex17 {
    
    public static void main(String args[]) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input two binary numbers:");
        a = scan.nextInt();
        b = scan.nextInt();
        a = to_int(a);
        b = to_int(b);
        System.out.println("Result: " + to_bin(a + b));
    }

    public static long to_bin(int i) {
        int aux = i;
        long bin = 0;
        int shift = 1;
        while (aux > 0) {
            bin += (aux % 2) * shift;
            shift *= 10;
            aux = aux / 2;
        }
        return bin;
    }

    public static int to_int(int i) {
        int dg = digits(i);
        int res = 0;
        System.out.println("dg: " + dg);
        for (int _i = 0; _i < dg; _i++) {
            res += (int) (Math.pow(2, _i) * get_digit(i, _i));
        }
        return res;
    }

    public static int digits(int i) {
        int k = 1;
        int res = 1;
        while (k*10 <= i) {
            k *= 10;
            res += 1;
        }
        return res;
    }

    public static int get_digit(int i, int k) {
        int gen = (int) Math.pow(10, k);
        int d = (int) ((i % (gen*10)) / gen);
        return d;
    }
}
