package basicpart2;

import java.util.Scanner;

public class Ex208 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String compressed = "";
        char prev = s.charAt(0);
        int count = 1;
        char c = '/';
        for (int i = 1; i < s.length(); i++) {
            c = s.charAt(i);
            if (c != prev) {
                compressed += prev + String.valueOf(count);
                count = 0;
            }
            count++;
            prev = c;
        }
        if (c == prev) {compressed += prev + String.valueOf(count); };
        System.out.println("Compressed string:" + compressed);
    }
}