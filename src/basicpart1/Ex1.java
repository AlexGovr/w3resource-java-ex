package basicpart1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String args[]) {
        System.out.println("Hello, World!");
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = new String(scan.nextLine());
        System.out.println("Hello, " + name + "!");
    }
}
