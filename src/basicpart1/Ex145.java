package basicpart1;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex145 {
    
    public static void main(String args[]) {
        Integer[] arr = {1, 3, 5, 6, 7, };
        int n = 3;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        list.remove(list.size() - n);
        System.out.println(list);
    }
}