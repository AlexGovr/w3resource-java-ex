package basicpart1;

import java.util.LinkedList;

public class Ex121 {
    
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};
        LinkedList<Integer> ll = new LinkedList<>();
        for (int n: arr) {
            ll.add(n);
        }
        System.out.println(ll);
        int len = ll.size();
        for (int i = 0; i < len / 2; i++) {
            int buf = ll.get(i);
            ll.set(i, ll.get(len - 1 - i));
            ll.set(len - 1 - i, buf);
        }
        System.out.println(ll);
    }
}