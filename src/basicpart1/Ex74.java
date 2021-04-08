package basicpart1;

import java.util.Scanner;

public class Ex74 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input data: ");
        String[] data = input.nextLine().split(",");
        System.out.println((data[0].equals("10")) & (data[0].equals(data[data.length-1])));
    }
}
 