package leetcode;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] m  = {{1, 2, 3, 4},
                      {4, 5, 6, 7},
                      {7, 8, 9, 10},
                      {7, 8, 9, 10},
                      {7, 8, 9, 10}};
        String s = goRow(m, 0, m[0].length, 0, m.length, 1);
        System.out.println(s);
    }

    public static String goRow(int[][] m, int st, int end, int row, int nextrowend, int step) {
        if (st == end) { return "";}
        String s = "";
        for (int i = st; i != end; i += step) {
            s += String.valueOf(m[row][i]) + " ";
        }

        int nextcolend = st - (step == 1 ? 1 : -1);
        int rowst = row + step;
        int rowend = nextrowend;
        int col = end - step;
        return s + goCol(m, rowst, rowend, col, nextcolend, step);
    }

    public static String goCol(int[][] m, int st, int end, int col, int nextcolend, int step) {
        if (st == end) { return "";}
        String s = "";
        for (int i = st; i != end; i += step) {
            s += String.valueOf(m[i][col]) + " ";
        }

        int nextrowend = st - (step == 1 ? 1 : -1);
        int colst = col - step;
        int colend = nextcolend;
        int row = end - step;
        step = -step;
        return s + goRow(m, colst, colend, row, nextrowend, step);
    }
}
