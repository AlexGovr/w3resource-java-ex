package basicpart1;

import java.util.Scanner;
import java.util.HashMap;

public class Ex148 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        String s = input.next();
        for (int i: s.toCharArray()) {
            if (map.containsKey(i)) 
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }
        for (int i: map.keySet()) {
            if (map.get(i) == 1) {
                System.out.println((char) i);
                return;
            }
        }
    }
}