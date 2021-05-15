package leetcode;

import java.util.HashSet;

public class LinkedListCycle {

    public static void main(String[] args) {
        LL list = new LL();
        int[] arr = {0, 1, 2, 3, 4};
        for (int i : arr) {
            list.push(i);
        }
        Node last = list.getLast();
        // make cycle in list
        last.setNext(list.getHead().getNext().getNext());
        System.out.println(checkCycles(list));
    }

    public static boolean checkCycles(LL list) {
        Node head = list.getHead();
        HashSet<Node> seen = new HashSet<Node>();
        Node cur = head;
        while (cur.next != null) {
            seen.add(cur);
            cur = cur.next;
            if (seen.contains(cur)) { return true; }
        }
        return false;
    }

    public static class LL {
        private Node head;

        public void push(int val) {
            if (this.head == null) {
                this.head = new Node(val);
                return;
            }
            Node node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node(val);
        }

        public Node getHead() {return this.head;}

        public Node getLast() {
            if (this.head == null)
                return null;
            Node node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            return node;
        }

        public Node pop() throws IllegalStateException {
            if (this.head == null)
                throw new IllegalStateException();
            Node node = this.head;
            if (this.head.next == null) {
                this.head = null;
                return node;
            }
            while (node.next.next != null) {
                node = node.next;
            }
            Node popped = node.next;
            node.next = null;
            return popped;
        }
    }

    public static class Node {
        
        private Node next;
        private int val;

        public Node(int val) {
            this.val = val;
        }

        public int getVal() {
            return this.val;
        }

        public Node getNext() {return this.next;}

        public void setNext(Node n) {this.next = n;}
    }
}