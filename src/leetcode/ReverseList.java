package leetcode;

import leetcode.LinkedListCycle.LL;
import leetcode.LinkedListCycle.Node;

public class ReverseList {
    public static void main(String[] args) {
        LL list = new LL();
        int[] arr = {0, 1, 2, 3, 4};
        for (int i : arr) {
            list.push(i);
        }
        System.out.println(list.toStr());
        reverseList(list);
        System.out.println(list.toStr());
    }

    public static void reverseList(LL list) {
        Node cur = list.getHead();
        Node next = cur.getNext();
        Node prev;
        cur.setNext(null);
        while (next != null) {
            prev = cur;
            cur = next;
            next = next.getNext();
            cur.setNext(prev);
        }
        list.setHead(cur);
    }

}
