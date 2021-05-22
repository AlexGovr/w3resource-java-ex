package basicpart2;

import basicpart1.Ex146.BTree;
import basicpart1.Ex146.Node;
import basicpart2.Ex177;

public class Ex182 {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3};
        BTree original = new BTree();
        for (int i : arr) {
            original.add(i);
        }

        BTree clone = Ex177.clone_tree(original);
        System.out.println("Original and clone are equal:" + trees_are_equal(original, clone));
        clone.add(15);
        System.out.println("Original and modified clone are equal:" + trees_are_equal(original, clone));
    }

    public static boolean trees_are_equal(BTree t1, BTree t2) {
        return _iterate_nodes(t1.getRoot(), t2.getRoot());
    }

    private static boolean _iterate_nodes(Node n1, Node n2) {
        if (n1.getValue() != n2.getValue()) return false;
        Node l1 = n1.getLeft();
        Node l2 = n2.getLeft();
        Node r1 = n1.getRight();
        Node r2 = n2.getRight();
        if (((l1 == null) && (l2 != null)) || ((l1 != null) && (l2 == null))
                || ((r1 == null) && (r2 != null)) || ((r1 != null) && (r2 == null)))
            return false;
        
        if (l1 != null)
            if (!_iterate_nodes(l1, l2))
                return false;
        if (r1 != null)
            return _iterate_nodes(r1, r2);
        return true;
    }
}