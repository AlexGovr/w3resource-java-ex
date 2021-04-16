package basicpart1;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex144 {
    
    public static void main(String args[]) {
        int[] arr = {1, 3, 5, 6, 7, 9, 4, 5, 6, };
        int n = 6;
        int j = 0;
        int i = 0;
        for (i = 0; j < arr.length - 1; i++) {
            if (arr[i] == n) j++;
            arr[i] = arr[j];
            j++;
        }
        if (i < arr.length) arr[i] = '\0';
        if (arr[j] == n) arr[j] = '\0';
        System.out.println(Arrays.toString(arr));
        System.out.println("Length of the new arr: " + i);
    }
}
