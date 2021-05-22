package basicpart2;

import java.util.Scanner;
import java.util.HashMap;

public class Ex187 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println("First non-repeated character: " + non_repeated_char(s));
    }

    public static char non_repeated_char(String s) throws IllegalStateException {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) { return c; }
        }
        throw new IllegalStateException();
    }
}