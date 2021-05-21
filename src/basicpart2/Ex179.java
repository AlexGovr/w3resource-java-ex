package basicpart2;

import java.util.Arrays;

public class Ex179 {

    public static void main(String args[]) {
        int[] arr = {8, 9, 9, 9, 9};
        int[] newarr = arr;
        int mem = 1;
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            int cur = arr[i] + mem;
            mem = cur / 10;
            arr[i] = cur % 10;
        }
        if (mem != 0){
            newarr = new int[arr.length + 1];
            newarr[0] = mem;
            for (int i = 1; i < newarr.length; i++) {
                newarr[i] = arr[i-1];
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}