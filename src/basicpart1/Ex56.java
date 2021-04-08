package basicpart1;

import java.util.Scanner;

public class Ex56 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = input.nextInt();  
		System.out.print("Input the second number: ");
		int y = input.nextInt(); 
		System.out.print("Input the third number : ");
        int z = input.nextInt();

        for (int i = x; i <= y; i++) {
            if (i%z == 0) {
                System.out.println("The result is: " + i);
                break;
            }
        }
    }
}
