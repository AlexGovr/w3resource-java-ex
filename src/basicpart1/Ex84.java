package basicpart1;

import java.util.Scanner;

public class Ex84 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String sub = s.substring(s.length() - 3, s.length());
        String news = sub + s + sub;
        System.out.println(news);
    }
}