package basicpart2;

import java.util.Scanner;
import java.util.HashMap;

public class Ex199 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] sent = input.nextLine().split(" ");
        System.out.println("Strings are isomorphic: " + pattern_is_there(s, sent));
    }

    public static boolean pattern_is_there(String s, String[] sent) {
        if (s.length() != sent.length) { return false; }
        HashMap<Character, String> map = new HashMap<Character, String>();
        char c;
        String w;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            w = sent[i];
            if (map.containsKey(c) || map.containsValue(w)) {
                String ww = map.getOrDefault(c, w + "_");
                if (!w.equals(ww)) { return false; }
            } else {
                map.put(c, w);
            }
        }
        System.out.println(map);
        return true;
    }
}