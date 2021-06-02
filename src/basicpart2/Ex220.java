package basicpart2;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex220 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        print("Input two integers:");
        BigInteger n = new BigInteger(input.nextLine());
        n = n.add(new BigInteger(input.nextLine()));
        if (("" + n).length() > 80) {
            print("overflow");
            return;
        }
        print(n);
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}