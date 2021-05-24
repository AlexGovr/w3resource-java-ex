package basicpart2;

import java.util.Scanner;

public class Ex202 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 1, 2, 3, 4, 6};
        System.out.println("Input the number of subsets:");
        int k = input.nextInt();
        int sm = 0;
        int count = 0;
        for (int i : arr) {
            sm += i;
            if (sm == k) {
                count++;
                sm = 0;
            }
            if (sm > k) {
                sm = 0;
            }
        }
        System.out.println(count);
    }

}