package basicpart2;

import java.util.Arrays;

public class Ex155 {
    
    public static void main(String args[]) {
        Integer[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {4, 9, 6},
                       {4, 5, 6}};
        
        System.out.println(arr2str(swap_row_col(arr)));
    }

    public static Integer[][] swap_row_col(Integer[][] arr) {
        Integer[][] swapped = new Integer[arr[0].length][arr.length];
        for (Integer i = 0; i < arr.length; i++) {
            for (Integer j = 0; j < arr[i].length; j++) {
                swapped[j][i] = arr[i][j];
            }
        }
        return swapped;
    }

    public static String arr2str(Object[][] arr) {
        String s = "";
        for (Object[] sub : arr) {
            s += Arrays.toString(sub) + '\n';
        }
        return s;
    }
}