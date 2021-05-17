package basicpart2;

import java.util.Scanner;

public class Ex163 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String bin = bitArr(n);
        System.out.println("Binary: " + bin);
        int count = bin.length() - bin.replace("0", "").length();
        System.out.println("Number of zeros: " + count);
    }

    public static String bitArr(int n) {
        String bin = "";
        while (n != 0) {
            bin = (n & 1) + bin;
            n = n >> 1;
        }
        return bin;
    }
}