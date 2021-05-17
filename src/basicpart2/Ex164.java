package basicpart2;

import java.util.Scanner;

public class Ex164 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two numbers:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println("Division: " + divide_by_sub(n1, n2, 3));
    }

    public static float divide_by_sub(int n1, int n2, int precision) {
        if (n1 == 0){
            return 0;
        }
        int intpart = 0;
        while (n1 >= n2) {
            intpart++;
            n1 -= n2;
        }
        if (intpart == 0) {
            return intpart;
        }
        float decpart = 0;
        if (precision > 0) {
            decpart = divide_by_sub(n1*10, n2, precision - 1);
        }
        return intpart + decpart/10;
    }
}