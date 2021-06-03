package basicpart2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class Ex226 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        print("Input the number of values:");
        int[] arr = new int[input.nextInt()];
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        print("Input values larger than 0 and smaller than 100");
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            int cnt = map.getOrDefault(arr[i], 0) + 1;
            map.put(arr[i], cnt);
            max = cnt > max ? cnt : max;
        }
        for (Integer n : map.keySet()) {
            if (map.get(n) == max)
                list.add(n);
        }
        Collections.sort(list, Collections.reverseOrder());
        print(list);
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}