package basicpart1;

import structures.Tree;
import structures.Node;

public class Ex130 {

    public static void main(String args[]) {
        Tree tree = new Tree();
        int[] arr = {-1, 2, 30, -8, 5, 16, 23, 34};
        for (int i = 0; i < arr.length; i++) {
            tree.insertNode(arr[i]);
        }

        System.out.println("Tree maximum depth: " + checkDepth(tree.getRoot()));
    }

    public static int checkDepth(Node n) {
        Node left, right;
        int leftDepth, rightDepth;
        leftDepth = rightDepth = 0;
        left = n.getLeftChild();
        right = n.getRightChild();
        if (right != null)
            rightDepth = checkDepth(right);
        if (left != null)
            leftDepth = checkDepth(right);

        return 1 + Math.max(rightDepth, leftDepth);
    }
}