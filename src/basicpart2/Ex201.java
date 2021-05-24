package basicpart2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex201 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 1, 1, 2, 3, 4, 6};
        System.out.println("Input the number of subsets:");
        int k = input.nextInt();
        System.out.println(search_equal_subsets(arr, k));
    }

    public static boolean search_equal_subsets(int[] arr, int k) {
        int sm = sum(arr);
        if ((sm % k) != 0)
            return false;

        boolean[] used = new boolean[arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            if (!_search(arr, used, sm / k, 0))
                return false;
        }
        return true;
    }

    // {1, 1, 1, 2, 3, 4, 6}
    private static boolean _search(int[] arr, boolean[] used, int target_sum, int st) {
        // int subset_maxlen = arr.length - (k - 1);
        for (int i = st; i < arr.length; i++) {
            if (used[i]) continue;
            if (arr[i] > target_sum) return false;
            if (arr[i] < target_sum) {
                if (_search(arr, used, target_sum - arr[i], i)) {
                    used[i] = true;
                    return true;
                }
            }
            // last element of a subset
            if (arr[i] == target_sum) {
                used[i] = true;
                return true;
            }
        }
        return false;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}