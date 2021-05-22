package basicpart2;

import java.util.Scanner;
import java.util.Arrays;

public class Ex196 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // (x, y) movement directions
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] grid = new int[n][n];
        int x = 0;
        int y = 0;
        int dir_ind = 0;
        int dx = dirs[dir_ind][0];
        int dy = dirs[dir_ind][1];
        int xx, yy;
        boolean change_dir = false;
        for (int i = 1; i <= n*n; i++) {
            grid[x][y] = i;
            xx = x + dx;
            yy = y + dy;

            if (!inrange(xx, 0, n) || !inrange(yy, 0, n)) change_dir = true;
            else if (grid[xx][yy] != 0)  change_dir = true;

            if (change_dir) {
                // change dir in a cycling way
                dir_ind = dir_ind < 3 ? (dir_ind + 1) : 0;
                dx = dirs[dir_ind][0];
                dy = dirs[dir_ind][1];
                xx = x + dx;
                yy = y + dy;
                change_dir = false;
            }
            x = xx;
            y = yy;
        }
        for (int[] arr : grid) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static boolean inrange(int x, int st, int end) {
        return (x >= st) && (x < end);
    }
}