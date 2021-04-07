package basicpart1;

import java.util.Scanner;

public class Ex38 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string:");
        String s = input.nextLine();

        int[] arr = count(s);
        
        System.out.println("Letters: " + arr[0]);
        System.out.println("Spaces: " + arr[1]);
        System.out.println("Digits: " + arr[2]);
        System.out.println("Other: " + arr[3]);
    }

    public static int[] count(String s) {
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;
        for(int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                letter++;
            else if (Character.isSpaceChar(s.charAt(i)))
                space++;
            else if (Character.isDigit(s.charAt(i)))
                number++;
            else
                other++;
        }
        return new int[] {letter, space, number, other};
    }
}
