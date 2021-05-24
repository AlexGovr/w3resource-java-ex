package basicpart2;

import java.util.Scanner;
import java.util.HashSet;

public class Ex200 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String no_duplicates = "";
        HashSet<Character> in = new HashSet<Character>();
        for (char c : s.toCharArray()) {
            if (!in.contains(c)) {
                no_duplicates += c;
                in.add(c);
            }
        }
        System.out.println(no_duplicates);
        input.close();
    }
}
