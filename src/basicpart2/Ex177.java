package basicpart2;

import basicpart1.Ex146.BTree;
import basicpart1.Ex146.Node;

public class Ex177 {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        BTree original = new BTree();
        for (int i : arr) {
            original.add(i);
        }
        original.vizualize();

        BTree clone = clone_tree(original);
        System.out.println();
        clone.vizualize();
    }

    public static BTree clone_tree(BTree tree) {
        Node root = tree.getRoot();
        Node rootclone = _clone_node(root);
        BTree clone = new BTree();
        clone.setRoot(rootclone);
        return clone;
    }

    private static Node _clone_node(Node n) {
        if (n == null) return null;
        Node nodeclone = new Node(n.getValue());
        nodeclone.setLeft(_clone_node(n.getLeft()));
        nodeclone.setRight(_clone_node(n.getRight()));
        return nodeclone;
    }
}