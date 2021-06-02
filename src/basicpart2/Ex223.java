package basicpart2;

import java.util.Scanner;

public class Ex223 {
    
    public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		print("How many integers would you like to input?");
        int n = input.nextInt();
        int ans = -100000;
        int acc = 0;
        print("Input the integers:");
        for (int i=0;i<n;i++) {
            acc += input.nextInt();
            ans = Math.max(ans, acc);
            if (acc < 0) acc = 0;
        }
        print("Maximum sum of the said contiguous subsequence:");
        print(ans);
	}

    public static void print(Object o) {
        System.out.println(o);
    }
}