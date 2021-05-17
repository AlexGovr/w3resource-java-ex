package basicpart2;

import java.util.Scanner;

public class Ex166 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int dec = 10;
        String s = "";
        boolean neg = false;
        if (n < 0) { 
            neg = true;
            n *= -1;
        }
        while (n != 0) {
            s = n % dec + s;
            n = n / dec;
            dec *= 10;
        }
        if (neg) { s = "-" + s; }
        System.out.println(s);
    }
}