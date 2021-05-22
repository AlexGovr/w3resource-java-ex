package basicpart2;

import basicpart1.Ex146.BTree;
import basicpart1.Ex146.Node;
import basicpart1.Ex146;

public class Ex184 {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        BTree tree = new BTree();
        // make balanced tree
        Ex146.arr2BTree(arr, tree, 0, arr.length - 1);
        tree.add(10);
        tree.add(11);
        tree.vizualize();
        System.out.println("Tree longest consecutive sequence size: " + tree_depth(tree));
    }

    public static int tree_depth(BTree tree) {
        Node node = tree.getRoot();
        return _depth(node, 0);
    }

    private static int _depth(Node n, int cur_depth) {
        if (n == null) { return cur_depth; }
        cur_depth++;
        return Math.max(_depth(n.getLeft(), cur_depth),
                        _depth(n.getRight(), cur_depth));
    }
}