package basicpart1;

import structures.Tree;
import structures.Node;
import java.util.ArrayList;

public class Ex125 {
    
    public static void main(String args[]) {
        Tree tree = new Tree();
        int[] arr = {-1, 2, 30, -8, 5, 16, 23,34};
        for (int i = 0; i < arr.length; i++) {
            tree.insertNode(arr[i]);
        }
        tree.printTree();

        ArrayList <Node> qeue = new ArrayList<>();
        qeue.add(tree.getRoot());
        System.out.println(qeue);
        while (!qeue.isEmpty()) {
            Node n, left, right;
            n = qeue.remove(0);
            left = n.getLeftChild();
            right = n.getRightChild();
            System.out.print(n.getValue() + " ");
            if (left != null)
                qeue.add(left);
            if (right != null)
                qeue.add(right);
        }
    }
}