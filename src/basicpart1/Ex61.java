package basicpart1;

import java.util.Scanner;

public class Ex61 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");
        String txt = new StringBuilder(input.nextLine()).reverse().toString();
        System.out.println(txt);
    }
}
 