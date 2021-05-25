package basicpart2;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex205 {
    
    public static void main(String[] args) {
        boolean b = true;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = in.nextInt();           
        while(num!=1) {
            if(num%2!=0)
            { 
                b=! b;
                System.out.print(b);
                System.exit(0);
            }
                num = num / 2;
        }
        System.out.print(b);
    }
}