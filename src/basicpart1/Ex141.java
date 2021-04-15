package basicpart1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex141 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] chars = IntStream.range(97, 123).toArray();
        int len = chars.length;
        System.out.println("Input a string:");
        String s = input.next();

        for (int i : s.chars().toArray()) {
            if (chars[i-97] != -1){
                chars[i-97] = -1;
                len--;
            }
        }

        if (len == 0) {
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}