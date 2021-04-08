package basicpart1;

import java.util.Scanner;

public class Ex64 {

    public static class NotInRangeException extends Exception {

        public NotInRangeException(String str) {
            super(str);
        }
    }
    
    public static void main(String args[]) throws NotInRangeException {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input two numbers between 25 and 75: ");
        int x = input.nextInt();
        int y = input.nextInt();

        if (!inrange(x) | !inrange(y))
            throw new NotInRangeException("Numbers must be in range 25 - 75");
        
        int x0 = x % 10;
        int x1 = x / 10;
        int y0 = y % 10;
        int y1 = y / 10;
        boolean res = x0 == y0 | x0 == y1 | x1 == y0 | x1 == y1;
        
        System.out.println(res);
    }

    public static boolean inrange(int i) {
        return i <= 75 & i >= 25;
    }
}
