package basicpart2;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex216 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        print("Input a number for all comboes' sums to be equal to:");
        int n = input.nextInt();
        print(find(n, 4));
    }

    public static ArrayList<ArrayList<Integer>> find(int n, int k) {
        ArrayList<ArrayList<Integer>> comboes = new ArrayList<ArrayList<Integer>>();
        if (k == 0) return comboes;
        for (int i = 0; i < 10; i++) {
            if (i < n) {
                ArrayList<ArrayList<Integer>> _comboes = find(n - i, k - 1);
                for (ArrayList<Integer> list : _comboes) {
                    list.add(0, i);
                    comboes.add(list);
                }
            } else if (i == n) {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(i);
                comboes.add(list);
            }
        }
        return comboes;
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}