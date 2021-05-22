package basicpart2;

import java.util.Scanner;
import java.util.Arrays;

public class Ex192 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = sorted_str(input.nextLine());
        System.out.println(s);
        int n = 0;
        int i = 0;
        while (is_digit(s.charAt(i))) {
            n += s.charAt(i) - 48;
            i++;
        }
        s = s.substring(i) + String.valueOf(n);
        System.out.println(s);
    }

    public static String sorted_str(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static boolean is_digit(char c) {
        return (c >= 48 && c <= 57);
    }
}