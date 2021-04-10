package basicpart1;

import java.util.ArrayList;
import java.util.List;

public class Ex122 {
    
    public static void main(String args[]) {
        int[] arr = {-1, 2, 30, -8, 5, 16};
        List<Integer> list = new ArrayList<>();
        List<Integer> maxsumlist = new ArrayList<>();
        int max = 0;
        for (int n: arr) {
            list.add(n);
            max = max > n ? n : max;
        }

        
        System.out.println(list);
        int len = list.size();
        int _max;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len+1; j++) {
                List<Integer> sub = list.subList(i, j);
                _max = sum(sub);
                if (max < _max) {
                    max = _max;
                    maxsumlist = sub;
                }
            }
        }
        System.out.println("Max sum subarray: " + maxsumlist);
    }

    public static int sum(List<Integer> list) {
        return list.stream().mapToInt(i -> i).sum();
    }
}