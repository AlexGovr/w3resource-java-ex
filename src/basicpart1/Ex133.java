package basicpart1;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex133 {

    public static void main(String args[]) {
        int[][] map = {{1, 2, 30},
                       {3, 15, 30},
                       {5, 2,  0},};

        System.out.println("Path:" + aStarWay(0, 0, 2, 2, map));
    }

    public static ArrayList<Integer> aStarWay(int x0, int y0, int xend, int yend, int[][] map) {
        ArrayList<Integer> path = new ArrayList<>();
        ArrayList<Integer[]> nextPositions = new ArrayList<>();
        int[][] markMap = getMarkMap(map);
        int[][] scores = getMarkMap(map);
        int x = x0;
        int y = y0;

        while (true) {
            nextPositions.addAll(getNextPos(x, y, markMap));
            Integer[] minScorePos = nextPositions.get(0);
            // somewhat big
            scores[minScorePos[0]][minScorePos[1]] = 1000;
            for (Integer[] pos : nextPositions) {
                int _x = pos[0];
                int _y = pos[1];
                if (scores[_x][_y] == 0)
                    scores[_x][_y] = map[_x][_y] + dist(_x, _y, xend, yend);
                if (scores[minScorePos[0]][minScorePos[1]] > scores[_x][_y]) {
                    minScorePos = pos;
                }
            }
            x = minScorePos[0];
            y = minScorePos[1];
            if (x == xend && y == yend) break;

            nextPositions.remove(minScorePos);
        }

        // form a path
        markMap = getMarkMap(map);
        while (x != x0 || y != y0) {
            Integer[] p = getPathPos(x, y, markMap, scores);
            x = p[0];
            y = p[1];
            path.add(map[x][y]);
        }

        return path;
    }

    public static int[][] getMarkMap(int[][] map) {
        int[][] markMap = new int[map.length][];
        for (int i = 0; i < markMap.length; i++) {
            markMap[i] = new int[map[i].length];
            Arrays.fill(markMap[0], 0);
        }
        return markMap;
    }

    public static ArrayList<Integer[]> getNextPos(int x, int y, int[][] markMap) {
        ArrayList<Integer[]> positions = new ArrayList<>();
        Integer[] left = {x-1, y};
        Integer[] right = {x+1, y};
        Integer[] up = {x, y-1};
        Integer[] down = {x, y+1};

        if (x>0) {
            if (markMap[left[0]][left[1]] == 0) {
                positions.add(left);
                markMap[left[0]][left[1]] = 1;
            }
        }
        if (x < markMap[y].length - 1) {
            if (markMap[right[0]][right[1]] == 0) {
                positions.add(right);
                markMap[right[0]][right[1]] = 1;
            }
        }
        if (y>0) {
            if (markMap[up[0]][up[1]] == 0) {
                positions.add(up);
                markMap[up[0]][up[1]] = 1;
            }
        }
        if (y < markMap.length - 1) {
            if (markMap[down[0]][down[1]] == 0) {
                positions.add(down);
                markMap[down[0]][down[1]] = 1;
            }
        }
        return positions;
    }

    public static Integer[] getPathPos(int x, int y, int[][] markMap, int[][] scores) {
        Integer[] left = {x-1, y};
        Integer[] right = {x+1, y};
        Integer[] up = {x, y-1};
        Integer[] down = {x, y+1};

        Integer[] nextPoint = left;

        int sc = 1000;
        markMap[x][y] = 1;

        if (x>0) {
            if (markMap[left[0]][left[1]] == 0) {
                if (sc > scores[left[0]][left[1]]) {
                    nextPoint = left;
                    sc = scores[left[0]][left[1]];
                }
            }
        }
        if (x < markMap[y].length - 1) {
            if (markMap[right[0]][right[1]] == 0) {
                if (sc > scores[right[0]][right[1]]) {
                    nextPoint = right;
                    sc = scores[right[0]][right[1]];
                }
            }
        }
        if (y>0) {
            if (markMap[up[0]][up[1]] == 0) {
                if (sc > scores[up[0]][up[1]]) {
                    nextPoint = up;
                    sc = scores[up[0]][up[1]];
                }
            }
        }
        if (y < markMap.length - 1) {
            if (markMap[down[0]][down[1]] == 0) {
                if (sc > scores[down[0]][down[1]]) {
                    nextPoint = down;
                    sc = scores[down[0]][down[1]];
                }
            }
        }
        return nextPoint;
    }

    public static int dist(int _x, int _y, int xend, int yend) {
        return (Math.abs(xend - _x) + Math.abs(yend - _y));
    }
}