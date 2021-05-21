package basicpart2;

import java.util.ArrayList;

public class Ex172 {
    public static void main(String[] args) {
        int[] arr = {1, 1, -1, 3, 3, 4, 9, 7};
        int[] query = {2, 3, 7};
        System.out.println(count(arr, query));
    }

    public static ArrayList<Integer> count(int[] arr, int[] query) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i : query) {
            l.add(count_smaller(arr, i));
        }
        return l;
    }

    public static int count_smaller(int[] arr, int n) {
        int cnt = 0;
        for (int i: arr) {
            if (i < n) cnt++;
        }
        return cnt;
    }
}