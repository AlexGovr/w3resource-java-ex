package basicpart1;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex143 {
    
    public static void main(String args[]) {
        Integer[] arr = {1, 3, 5, 6, 7, };
        Integer[] arr1 = {2, 4, 5, 5, 6, };
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(list);
        System.out.println(list1);
        ArrayList<Integer> merged = new ArrayList<>();
        int size = list.size();
        int size1 = list1.size();
        int i = 0, i1 = 0;
        while (i < size && i1 < size1) {
            if (list.get(i) < list1.get(i1))
                merged.add(list.get(i++));
            else
                merged.add(list1.get(i1++));
        }
        if (i == size) {
            list = list1;
            i = i1;
            size = size1;
        }
        for (i = i; i < size; i++) {
            merged.add(list.get(i));
        }
        System.out.println(merged);
    }
}