package basicpart1;

import java.util.Arrays;

public class Ex79 {
    
    public static void main(String args[]) {
        int[] arr = {10, 20, 30};
        int len = arr.length;
        int[] rot = new int [len];
        rot[len - 1] = arr[0];
        for(int i = 0; i < len - 1; i++) {
            rot[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rot));
    }
}
