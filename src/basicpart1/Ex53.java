package basicpart1;

import java.util.Scanner;

public class Ex53 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = input.nextInt();  
		System.out.print("Input the second number: ");
		int y = input.nextInt(); 
		System.out.print("Input the third number : ");
        int z = input.nextInt();
        System.out.println("The result is: " + (x<y & y<z));
    }
}
