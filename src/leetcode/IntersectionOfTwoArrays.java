package leetcode;

import java.util.HashSet;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4};
        Integer[] arr2 = {5, 6, 3, 4, 6, 4};
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(arr1));
        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(arr2));
        HashSet<Integer> sect = new HashSet();
        for (Integer i : set1) {
            if (set2.contains(i)) { sect.add(i); }
        }
        System.out.println(sect);
    }
}
