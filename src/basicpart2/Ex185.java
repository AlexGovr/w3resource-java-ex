package basicpart2;

import java.util.Scanner;
import java.util.HashMap;

public class Ex185 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        System.out.println("Strings are isomorphic: " + is_isomorph(s1, s2));
    }

    public static boolean is_isomorph(String s1, String s2) {
        if (s1.length() != s2.length()) { return false; }
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        char c1, c2, def;
        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            if (map.containsKey(c1) || map.containsValue(c2)) {
                def = ((char)(c2 + 1));
                if (c2 != map.getOrDefault(c1, def)) { return false; }
            } else {
                map.put(c1, c2);
            }
        }
        return true;
    }
}