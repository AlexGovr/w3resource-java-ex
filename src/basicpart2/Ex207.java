package basicpart2;

import java.util.Arrays;

public class Ex207 {
    
    public static void main(String args[]) {
        int[] arr1 = {1, 2, 5, 6, 8, 20};
        int[] arr2 = {3, 4, 6};
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while ((i < arr1.length) && (j < arr2.length)) {
            if (arr1[i] > arr2[j]) {
                merged[k++] = arr2[j];
                j++;
            } else {
                merged[k++] = arr1[i];
                i++;
            }
        }
        for (i = i; i < arr1.length; i++) {merged[k++] = arr1[i];}
        for (j = j; j < arr2.length; j++) {merged[k++] = arr2[j];}
        System.out.println(Arrays.toString(merged));
    }
}