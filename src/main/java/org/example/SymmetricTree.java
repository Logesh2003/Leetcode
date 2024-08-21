package org.example;

class SymmetricTreeNode {
    int val;
    SymmetricTreeNode left;
    SymmetricTreeNode right;

    SymmetricTreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class SymmetricTree {

    public static void main(String[] args) {
        // Example symmetric tree
        SymmetricTreeNode root = new SymmetricTreeNode(1);
        root.left = new SymmetricTreeNode(2);
        root.right = new SymmetricTreeNode(2);
        root.left.left = new SymmetricTreeNode(3);
        root.left.right = new SymmetricTreeNode(4);
        root.right.left = new SymmetricTreeNode(4);
        root.right.right = new SymmetricTreeNode(3);

        SymmetricTree symmetricTree = new SymmetricTree();
        boolean result = symmetricTree.isSymmetric(root);  // Call the correct method

        System.out.println(result);  // Output: true
    }

    public boolean isSymmetric(SymmetricTreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(SymmetricTreeNode left, SymmetricTreeNode right) {
        // Both nodes are null, symmetric
        if (left == null && right == null) {
            return true;
        }
        // One of the nodes is null, not symmetric
        if (left == null || right == null) {
            return false;
        }
        return (left.val == right.val)
                && isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }
}
