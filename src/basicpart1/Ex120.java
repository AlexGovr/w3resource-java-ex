package basicpart1;

import java.util.Arrays;

public class Ex120 {
    
    public static void main(String args[]) {
        int[][] arr = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 25, 4, 5}};
        int i = 25;
        for (int k = 0; k < arr.length; k++) {
            int[] row = arr[k];
            int ind = Arrays.binarySearch(row, i);
            if (ind >= 0) {
                System.out.printf("Occurence of %s in\n%s at [%s, %s]\n", i, matrix2str(arr), k, ind);
                return;
            }
        }
        System.out.printf("Not found\n");
    }

    public static String matrix2str(int[][] arr) {
        String res = new String();
        for (int k = 0; k < arr.length; k++) {
            res += Arrays.toString(arr[k]) + "\n";
        }
        return res;
    }
}