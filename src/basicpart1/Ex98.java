package basicpart1;

import java.util.Arrays;

public class Ex98 {
    
    public static void main(String args[]) {
        int[] arr = {10, 20, 2, 20, 3, 0};
        int count = 0;

        System.out.println("Array: " + Arrays.toString(arr));
        for (int i=1; i<arr.length; i++) {
            if (arr[i] == 20) {
                if (!(arr[i] == arr[i-1])){
                    count++;
                    if (count == 3) {
                        System.out.println(true);
                        return;
                    }
                }
                else {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(false);
    }
}
