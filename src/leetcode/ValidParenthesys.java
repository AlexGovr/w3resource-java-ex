package leetcode;

import java.util.EmptyStackException;
import java.util.HashMap;

public class ValidParenthesys {

    public static void main(String[] args) {
        String s = "dsfds{[]}";
        Stack stack = new Stack();
        String openChars = "({[";
        HashMap<Character, Character> mapClose = new HashMap<>();
        mapClose.put('}', '{');
        mapClose.put(']', '[');
        mapClose.put(')', '(');

        for (char c : s.toCharArray()) {
            if (openChars.indexOf(c) != -1)
                stack.push(c);
            else if (mapClose.containsKey(c)) {
                Character opening = mapClose.get(c);
                try {
                    if (opening != stack.pop()) {
                        System.out.println("Parenthesys unmatched");
                        return;
                    }
                }
                catch (EmptyStackException err) {
                    System.out.println("Parenthesys unmatched");
                    return;
                }
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Parenthesys unmatched");
            return;
        }
        System.out.println("Parenthesys matched");
    }

    public static class Stack {
        private Node head;

        public Stack() {
            this.head = new Node(null);
        }

        public void push(char val) {
            this.head.val = val;
            this.head = new Node(this.head);
        }

        public char pop() {
            if (this.head.prev == null) {
                throw new EmptyStackException();
            }
            this.head = this.head.prev;
            return this.head.val;
        }

        public boolean isEmpty() {
            return this.head.prev == null;
        }
    }

    public static class Node {
        private Node prev;
        private char val;

        public Node(Node prev) {
            this.prev = prev;
        }
    }
}
