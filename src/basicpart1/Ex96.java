package basicpart1;

import java.util.Arrays;

public class Ex96 {
    
    public static void main(String args[]) {
        int[] arr = {10, 4, 21, 1, 3, 5};
        int seek = 10;

        System.out.println("Array: " + Arrays.toString(arr));
        for (int i: arr) {
            if (i == seek)
                if (seek == 10)
                    seek = 20;
                else {
                    System.out.println(true);
                    return;
                }
        }
        System.out.println(false);
    }
}
