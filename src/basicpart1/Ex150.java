package basicpart1;

public class Ex150 {
    
    public static void main(String args[]) {
        String s = "abcdef";
        String s1 = "def";
        Ex146.BTree tree = new Ex146.BTree();
        Ex146.BTree tree1 = new Ex146.BTree();
        Ex146.arr2BTree(s.chars().map(c -> (int) c).toArray(), tree, 0, s.length()-1);
        Ex146.arr2BTree(s1.chars().map(c -> (int) c).toArray(), tree1, 0, s1.length()-1);
        System.out.println("Tree");
        tree.vizualize();
        System.out.println("Sub");
        tree1.vizualize();
        System.out.println(isSubTree(tree.getRoot(), tree1.getRoot()));
    }

    public static boolean isSubTree (Ex146.Node node, Ex146.Node subroot) {

        if (node == null ^ subroot == null)
            return false;
        if (node == null && subroot == null)
            return true;

        if (subTreesEqual(node, subroot))
            return true;
        if (isSubTree(node.getLeft(), subroot))
            return true;
        if (isSubTree(node.getRight(), subroot))
            return true;
        return false;
    }

    public static boolean subTreesEqual(Ex146.Node n, Ex146.Node n1) {
        if (n == null ^ n1 == null)
            return false;
        if (n == null && n1 == null)
            return true;

        if (n.getValue() == n1.getValue())
            return subTreesEqual(n.getLeft(), n1.getLeft()) 
                   && subTreesEqual(n.getRight(), n1.getRight());
        return false;
    }
}

