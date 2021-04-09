package basicpart1;

import java.util.Arrays;

public class Ex102 {
    
    public static void main(String args[]) {
        int[] arr = {3, 10, 3, 10, 20, 3};
        System.out.println("Array: " + Arrays.toString(arr));
        
        for (int i=0; i<arr.length; i+=1) {
            if (arr[i] == 10 || arr[i] == 30){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
