package basicpart1;

import java.util.Arrays;

public class Ex137 {

    public static void main(String args[]) {
        int[][] map = {
            {0, 0, 1, 0},
            {0, 0, 0, 1},
            {0, 0, 0, 0},
        };
        System.out.println("Input the m and n size of a grid: ");
        int n = map.length;
        int m = map[0].length;
        int[][] paths = new int[n][m];
        for (int i = 0; i < n; i++) {
            paths[i][0] = map[i][0] == 0 ? 1 : 0;
        }
        for (int j = 0; j < m; j++) {
            paths[0][j] = map[0][j] == 0 ? 1 : 0;
        }
        System.out.println(Arrays.toString(paths[0]));
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (map[i][j] == 0)
                    paths[i][j] = paths[i][j-1] + paths[i-1][j];
            }
            System.out.println(Arrays.toString(paths[i]));
        }
        System.out.println("Number of all paths: " + paths[n-1][m-1]);
    }
}