package basicpart2;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex205 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Input number of elements:");
        int num = input.nextInt();
        System.out.println("Input target sum:");
        int sum = input.nextInt();
        System.out.println("Input elements:(format: 1 2 3 4)");
        String[] s = input.nextLine().split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

    }

    public static int[] find(int[] arr, int num, int target_sum, int st) {
        if (num == 0) return new int[0];
        for (int i = st; i < arr.length; i++) {
            if (arr[i] < target_sum) {
                
            }
        }
    }
}