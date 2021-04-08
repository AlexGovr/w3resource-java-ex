package basicpart1;

import java.util.Scanner;

public class Ex54 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = input.nextInt();  
		System.out.print("Input the second number: ");
		int y = input.nextInt(); 
		System.out.print("Input the third number : ");
        int z = input.nextInt();
        boolean res = x % 10 == y % 10 | x % 10 == z % 10 | z % 10 == y % 10;
        System.out.println("The result is: " + res);
    }
}
