package basicpart2;

import java.util.Scanner;
import java.util.HashMap;

public class Ex186 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        System.out.println("The number is strobogrammatic: " + is_strob(n));
    }

    public static boolean is_strob(String n) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');
        char c1, c2;
        for (int i = 0; i < n.length() / 2; i++) {
            c1 = n.charAt(i);
            if (!map.containsKey(c1)) { return false; }
            c2 = n.charAt(n.length() - 1 - i);
            if (c2 != map.get(c1)) { return false; }
        }
        return true;
    }
}