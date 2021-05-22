package basicpart2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex188 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        StringBuilder s = new StringBuilder(input.nextLine());
        int end = s.length();
        String direct = input.nextLine();
        String reversed = new StringBuilder(direct).reverse().toString();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = s.indexOf(direct);
        while (i != -1) {
            list.add(i);
            i = s.indexOf(direct, i + 1);
        }
        i = s.indexOf(reversed);
        while (i != -1) {
            list.add(i);
            i = s.indexOf(direct, i + 1);
        }
        System.out.println("Substrings indices:" + list);
    }
}
