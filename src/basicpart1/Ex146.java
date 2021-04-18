package basicpart1;

import java.util.Arrays;

public class Ex146 {
    
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        BTree tree = new BTree();
        System.out.println(Arrays.toString(arr));
        arr2BTree(arr, tree, 0, arr.length-1);
        // tree.show();
        System.out.println("depth: " + tree.depth);
        tree.vizualize();
    }

    public static void arr2BTree(int[] arr, BTree tree, int st, int end) {
        int i = (end - st) / 2 + st;
        tree.add(arr[i]);
        if (st == end) return;
        arr2BTree(arr, tree, i+1, end);
        if (i > st)
            arr2BTree(arr, tree, st, i-1);
    }

    public static class BTree {
        private Node root;
        private int depth;

        public BTree() {
            this.root = null;
            this.depth = 0;
        }

        public void add(int val) {
            if (this.root == null) {
                this.root = new Node(val);
                this.depth = 1;
                return;
            }
            int depth = 1;
            Node newnode = new Node(val);
            Node node = this.root;
            Node prev = node;
            while (node != null) {
                prev = node;
                depth++;
                if (val < node.value)
                    node = node.left;
                else if (val > node.value)
                    node = node.right;
                // value is already in tree
                else
                    return;
            }
            if (val < prev.value)
                prev.left = newnode;
            else
                prev.right = newnode;
            newnode.head = prev;
            this.depth = Math.max(this.depth, depth);
        }

        public void show() {
            this.root.show();
        }

        public void vizualize() {
            this.root.visualize();
        }

        public Node getRoot() {
            return this.root;
        }
    }

    public static class Node {
        private Node left;
        private Node right;
        private Node head;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public void visualize() {
            String l = this.left != null ? String.valueOf(this.left.value) : "_";
            String r = this.right != null ? String.valueOf(this.right.value) : "_";
            System.out.printf(" %s\n/ \\ \n%s %s\n", this.value, l, r);
            if (this.left != null) this.left.visualize();
            if (this.right != null) this.right.visualize();
        }

        public void show() {
            if (left != null)
                this.left.show();
            System.out.println(this.value);
            if (right != null)
                this.right.show();
        }

        public int getValue() {
            return this.value;
        }

        public Node getLeft() {
            return this.left;
        }

        public Node getRight() {
            return this.right;
        }
    }
}