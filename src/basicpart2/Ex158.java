package basicpart2;

import java.util.Scanner;
import basicpart1.Ex48;
import basicpart2.Ex155;
import basicpart2.Ex157;

public class Ex158 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the size of the matrix:");
        int m = input.nextInt();
        Boolean[][] arr = new Boolean[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (Ex48.is_prime(i) && Ex48.is_prime(j)
                        && Ex157.get_common_factor(i, j) == 1)
                {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }
        System.out.println(Ex155.arr2str(arr));
    }
}