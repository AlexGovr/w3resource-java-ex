package basicpart1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Ex138 {
    
    public static void main(String args[]) {
        String[] dict = {
            "cat",
            "dog",
            "red",
            "is",
            "am"
        };
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        System.out.println("Initial dictionary: " + Arrays.toString(dict));
        int max = -1;
        for (String s : dict) {
            int len = s.length();
            if (max < len) {
                max = len;
                ArrayList<String> bylen = new ArrayList<>();
                map.put(max, bylen);
            }
            if (len == max) {
                map.get(max).add(s);
            }
        }
        System.out.println("Longest strings: " + map.get(max));
    }
}