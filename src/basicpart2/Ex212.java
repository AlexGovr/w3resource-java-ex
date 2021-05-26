package basicpart2;

import java.util.Scanner;

public class Ex212 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        print("Input lengths of three sides of a triangle:");
        int l1 = input.nextInt();
        int l2 = input.nextInt();
        int l3 = input.nextInt();
        print("Triangle is rigth: " + (((l1 == l2) && (l2 == l3)) ? "yes" : "no"));
    }

    public static void print(String s) {
        System.out.println(s);
    }
}