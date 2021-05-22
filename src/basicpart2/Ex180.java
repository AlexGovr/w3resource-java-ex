package basicpart2;

import leetcode.LinkedListCycle.LL;
import leetcode.LinkedListCycle.Node;

public class Ex180 {
    public static void main(String[] args) {
        int[] arr = {1};
        LL list = new LL();
        for (int i : arr) {
            list.push(i);
        }
        System.out.println("Original list:");
        System.out.println(list.toStr());
        swap_every_two(list);
        System.out.println("Swapped list:");
        System.out.println(list.toStr());
    }

    public static void swap_every_two(LL list) {
        Node cur = list.getHead();
        Node next = cur.getNext();
        if (next == null) 
            { return; }
        list.setHead(next);
        Node prev;
        while (true) {
            cur.setNext(next.getNext());
            next.setNext(cur);
            prev = cur;
            cur = cur.getNext();
            if (cur == null) { return; }
            next = cur.getNext();
            if (next == null) { return; }
            // if there is a next pair attach previous current to next
            prev.setNext(next);
        }
    }
}
