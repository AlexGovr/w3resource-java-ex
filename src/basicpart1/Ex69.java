package basicpart1;

import java.util.Scanner;

public class Ex69 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");
        String txt = input.nextLine();
        System.out.println(txt.substring(0, (int)txt.length() / 2));
    }
}
 