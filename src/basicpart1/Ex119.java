package basicpart1;

import java.util.Arrays;

public class Ex119 {
    
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};
        int i = 3;
        System.out.printf("Occurence of %s in %s at %s", i, Arrays.toString(arr), Arrays.binarySearch(arr, i));
    }
}