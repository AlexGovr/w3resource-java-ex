package basicpart1;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex94 {
    
    public static void main(String args[]) {
        int[] arr = {10, 4, 30, 1, 3, 5};
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Array: " + Arrays.toString(arr));
        for (int i: arr) {
            if (i % 2 == 0)
                list.add(list.size(), i);
            else
                list.add(0, i);
        }
        arr = list.stream().mapToInt(i -> i).toArray();
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
