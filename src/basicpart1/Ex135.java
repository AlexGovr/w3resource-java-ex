package basicpart1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex135 {

    public static void main(String args[]) {
        Integer[] arr = {1, 2, 30, 3, 15, 30, 5, 2, 0};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
        Collections.sort(list);
        System.out.println("List:" + list);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1) == list.get(i)){
                list.remove(i);
                i--;
            }
        }

        System.out.println("List:" + list);
    }
}