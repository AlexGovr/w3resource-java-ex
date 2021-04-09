package basicpart1;

import java.util.Arrays;

public class Ex101 {
    
    public static void main(String args[]) {
        int[] arr = {3, 10, 3, 10, 20, 3};
        System.out.println("Array: " + Arrays.toString(arr));
        int cnt10 = 0;
        int cnt20 = 0;
        
        for (int i=0; i<arr.length; i+=1) {
            cnt10 += arr[i] == 10 ? 1 : 0;
            cnt20 += arr[i] == 20 ? 1 : 0;
        }
        System.out.println(cnt10 > cnt20);
    }
}
