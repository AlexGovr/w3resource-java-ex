package basicpart1;

import java.util.Scanner;

public class Ex60 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");
        String txt = input.nextLine();
        String[] words = txt.split(" ");
        System.out.println(words[words.length - 2]);
    }
}
 