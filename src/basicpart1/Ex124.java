package basicpart1;

import java.util.Arrays;

public class Ex124 {
    
    public static void main(String args[]) {
        int[] arr = {-1, 2, 30, -8, 5, 16, 23,34};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(find(arr, -4));
    }

    public static int find(int[] arr, int val) {
        int len = arr.length;
        int i = len / 2;
        int st = 0;
        int end = len;
        while ((arr[i] != val) && (st != (end - 1))) {
            if (arr[i] < val) {
                st = i;
                i += (end - i) / 2;
            } else {
                end = i;
                i -= (i - st) / 2;
            }
        }
        if (arr[i] > val)
            i++;
        else if (arr[i] < val)
            i--;
        return i;
    }
}