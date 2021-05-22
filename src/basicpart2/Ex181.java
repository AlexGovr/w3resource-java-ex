package basicpart2;

import java.util.Scanner;

public class Ex181 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a sentence:");
        String[] sent = input.nextLine().split(" ");
        System.out.println("Lenght of the last word:" + sent[sent.length - 1].length());
    }
}