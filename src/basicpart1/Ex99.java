package basicpart1;

import java.util.Arrays;

public class Ex99 {
    
    public static void main(String args[]) {
        int[] arr = {3, 4, 3, 1, 4, 3};
        int seek = 3;
        int count = 0;
        System.out.println("Array: " + Arrays.toString(arr));


        for (int i=0; i<arr.length; i+=1) {
            if (arr[i] != seek) {
                count++;
                if (count > 1) {
                    System.out.println(false);
                    return;
                }
            }
            else
                count = 0;
        }
        System.out.println(true);
    }
}
