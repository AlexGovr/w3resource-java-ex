package basicpart1;

import java.util.Arrays;

public class Ex132 {

    public static void main(String args[]) {
        int[] arr = {-1, -1, 30, 34, 34, -8, -8, -8, 23, 34};
        Arrays.sort(arr);
        int newlen = 0;
        int j = 0;
        int i = 0;
        
        while (i < (arr.length - 2) && j < arr.length) {
            j = i + 1;
            if (arr[i] == arr[j]){
                newlen++;
                j++;
            }
            while (arr[i] == arr[j]) {
                j++;
                if (j == arr.length) break;
            }
            newlen++;
            i = j;
        }

        System.out.println("Length of a new array with at most double duplicates: " + newlen);
    }
}