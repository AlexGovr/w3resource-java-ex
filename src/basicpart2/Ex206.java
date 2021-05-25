package basicpart2;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ex206 {
    
    public static void main(String args[]) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int sum = 5;
        System.out.println("Found unique comboes:" + find(arr, sum, 0)); 
    }

    public static ArrayList<ArrayList<Integer>>  find(int[] arr, int target_sum, int st) {
        ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
        for (int i = st; i < arr.length; i++) {
            if (arr[i] < target_sum) {
                ArrayList<ArrayList<Integer>> found = find(arr, target_sum - arr[i], i + 1);
                for (ArrayList<Integer> _list : found) {
                    _list.add(0, arr[i]);
                    all.add(_list);
                }
            } else if (arr[i] == target_sum) {
                ArrayList<Integer> _list = new ArrayList<Integer>();
                _list.add(arr[i]);
                all.add(_list);
            }
        }
        return all;
    }
}