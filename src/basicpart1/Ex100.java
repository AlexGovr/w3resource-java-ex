package basicpart1;

import java.util.Arrays;

public class Ex100 {
    
    public static void main(String args[]) {
        int[] arr = {3, 4, 3, 1, 4, 3};
        int[] arr1 = {3, 5, 3, 0, 4, 3};
        int count = 0;
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Array: " + Arrays.toString(arr1));


        for (int i=0; i<arr.length; i+=1) {
            if (Math.abs(arr[i] - arr1[i]) == 1)
                count++;
        }
        System.out.println(count);
    }
}
