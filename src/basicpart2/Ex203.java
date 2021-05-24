package basicpart2;

import java.util.Scanner;

public class Ex203 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 1, 2, 3, 4, 6};
        System.out.println("Input the length of subarrays:");
        int k = input.nextInt();
        System.out.println("Max average: " + max_average(arr, k));
        
    }

    public static double max_average(int[] arr, int k) {
        double cur_sum = 0;
        for(int i = 0; i < k; i++) {
            cur_sum += arr[i];
        }
        double max = cur_sum / k;
        for(int i = 1; i < arr.length + 1 - k; i++) {
            cur_sum += arr[i + k - 1] - arr[i - 1];
            max = Math.max(max, (cur_sum / k));
        }
        return max;
    }
}