package basicpart1;

import java.util.Arrays;

public class Ex92 {
    
    public static void main(String args[]) {
        int[] arr = {10, 4, 30};
        int evens = 0;
        int odds = 0;
        System.out.println("Array: " + Arrays.toString(arr));
        for (int i: arr) {
            if (i % 2 == 0)
                evens++;
            else
                odds++;
        }
        System.out.println("Evens: " + evens);
        System.out.println("Odds: " + odds);
    }
}
