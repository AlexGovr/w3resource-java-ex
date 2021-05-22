package basicpart2;

import java.util.Scanner;

public class Ex193 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long sum = 0;
        System.out.println(fast(n));
        for (int i = 1; i < Math.pow(2, n); i++) {
            sum += subset_sum(i, n);
        }
        System.out.println(sum);
    }

    public static int subset_sum(int i, int n) {
        int sum = 0;
        boolean[] bitset = get_bitset(i, n);
        int num = 1;
        for (boolean b : bitset) {
            sum += num * (b ? 1 : 0);
            num++;
        }
        return sum;
    }

    public static boolean[] get_bitset(int i, int n) {
        int size = (int)Math.sqrt(i) + 1;
        boolean[] set = new boolean[n];
        for (int j = 0; j < set.length; j++) {
            set[j] = (i & 1) == 1;
            i = i >> 1;
        }
        return set;
    }

    public static int fast(int n) {
        return (int)((n * (n + 1) / 2) * Math.pow(2, n - 1));
    }
}
