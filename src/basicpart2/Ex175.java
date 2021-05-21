package basicpart2;

import java.util.Scanner;

import leetcode.LinkedListCycle.LL;
import leetcode.LinkedListCycle.Node;

public class Ex175 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = {1, 10, 2, 3};
        LL list = new LL();
        for (int i : arr) {
            list.push(i);
        }

        System.out.println("Input the index of the element to delete:");
        int k = inp.nextInt();
        delete_list_element(list, k);
        System.out.println(list.toStr());
    }

    public static void delete_list_element(LL list, int k) throws IndexOutOfBoundsException {
        if (k < 0) { throw new IndexOutOfBoundsException(); }
        if (k == 0) {
            list.setHead(list.getHead().getNext());
            return;
        }
        Node n = list.getHead();
        int i = 0;
        Node prev = null;
        while (n != null) {
            if (i == k) {
                // delete list element
                Node next = n.getNext();
                prev.setNext(next);
                return;
            }
            prev = n;
            n = n.getNext();
            i++;
        }
        throw new IndexOutOfBoundsException();
    }
}
