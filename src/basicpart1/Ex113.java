package basicpart1;

import java.util.Arrays;

public class Ex113 {
    
    public static void main(String args[]) {
        int[] arr = {10, 4, 30};
        int[] arr1 = {9, 2, 31};
        int[] res = new int[arr.length + arr1.length];
        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println("Array1: " + Arrays.toString(arr));
        System.out.println("Array2: " + Arrays.toString(arr1));
        int i, j, k, kk;
        i = j = k = 0;

        for (k = 0; (k < res.length) && (j != arr1.length) && (i != arr.length); k++) {
            if (arr[i] < arr1[j]) {
                res[k] = arr[i];
                i++;
            } else {
                res[k] = arr1[j];
                j++;
            }
        }

        // fill from the not finished array
        int[] rest;
        if (i == arr.length) {
            rest = arr1;
            kk = j;
        } else {
            rest = arr;
            kk = i;
        }
        for (k = k; k < res.length; k++) {
            res[k] = rest[kk++];
        }
            
        System.out.println("Merged array: " + Arrays.toString(res));
    }
}
