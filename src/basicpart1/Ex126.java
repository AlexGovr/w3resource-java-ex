package basicpart1;

import structures.Tree;
import structures.Node;

public class Ex126 {

    public static void main(String args[]) {
        Tree tree = new Tree();
        int[] arr = {-1, 2, 30, -8, 5, 16, 23, 34};
        for (int i = 0; i < arr.length; i++) {
            tree.insertNode(arr[i]);
        }

        print_branch_inordered(tree.getRoot());
    }

    public static void print_branch_inordered(Node n) {
        Node left, right;
        left = n.getLeftChild();
        right = n.getRightChild();
        if (right != null)
            print_branch_inordered(right);
        System.out.print(n.getValue() + " ");
        if (left != null)
            print_branch_inordered(left);
    }
}