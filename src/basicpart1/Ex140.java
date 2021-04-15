package basicpart1;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex140 {

    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Integer[] intvl = {1, 4};
        Integer[] intvl1 = {3, 5};
        Integer[] intvl2 = {6, 8};
        Integer[] intvl3 = {8, 12};
        list.add(new ArrayList<Integer>(Arrays.asList(intvl)));
        list.add(new ArrayList<Integer>(Arrays.asList(intvl1)));
        list.add(new ArrayList<Integer>(Arrays.asList(intvl2)));
        list.add(new ArrayList<Integer>(Arrays.asList(intvl3)));
        System.out.println("Initial intervals: " + list);

        int size = list.size();
        for (int i = 0; i < size; i++) {
            ArrayList<Integer> l1 = list.get(i);
            for (int j = i+1; j < size; j++) {
                ArrayList<Integer> l2 = list.get(j);
                if ((l1.get(0) >= l2.get(0) && l1.get(0) <= l2.get(1))
                        || l1.get(1) >= l2.get(0) && l1.get(1) <= l2.get(1)) {
                    int begin = Math.min(l1.get(0), l2.get(0));
                    int end = Math.max(l1.get(1), l2.get(1));
                    l1.set(0, begin);
                    l1.set(1, end);
                    list.remove(j);
                    j--;
                    size--;
                }
            }
        }

        System.out.println("Merged intervals: " + list);
    }
}