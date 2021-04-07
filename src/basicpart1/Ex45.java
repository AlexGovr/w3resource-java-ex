package basicpart1;

import java.util.Scanner;
import java.io.File;

public class Ex45 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input file name:");
        String fname = input.next();
        File file = new File(fname);
        System.out.println("File size: " + file.length() + " bytes");
    }
}
