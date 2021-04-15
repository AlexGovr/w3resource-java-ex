package basicpart1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ex142 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two strings:");
        String s = input.next();
        String s1 = input.next();
        if (getDistinctChars(s).equals(getDistinctChars(s1))) {
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }

    public static String getDistinctChars(String s) {
        char[] arr = new char[123-97];
        ArrayList<Character> chars = new ArrayList<>();
        String res = "";
        for (int c : s.chars().toArray()) {
            if (arr[c-97] == 0){
                arr[c-97] = 1;
                chars.add((char)c);
            }
        }
        Collections.sort(chars);
        for (Character c : chars) {
            res += c;
        }
        System.out.println(res);
        return res;
    }
}