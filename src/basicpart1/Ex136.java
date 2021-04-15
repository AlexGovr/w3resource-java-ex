package basicpart1;

import java.util.Scanner;

public class Ex136 {

    public static void main(String args[]) {
        int n, m;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the m and n size of a grid: ");
        n = input.nextInt();
        m = input.nextInt();
        int[][] paths = new int[n][m];

        // all cells in first col and first row have 1 possible path
        for (int i = 0; i < n; i++) {
            paths[i][0] = 1;
        }
        for (int j = 0; j < m; j++) {
            paths[0][j] = 1;
        }
        // compute all other
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                paths[i][j] = paths[i][j-1] + paths[i-1][j];
            }
        }
        System.out.println("Number of all paths: " + paths[n-1][m-1]);
    }
}