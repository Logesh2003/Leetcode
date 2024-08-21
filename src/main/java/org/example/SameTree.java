package org.example;

class SameTreeNode {
    int val;
    SameTreeNode left;
    SameTreeNode right;

    SameTreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Both nodes are null, trees are identical
        if (p == null && q == null) {
            return true;
        }

        // One of the nodes is null, trees are not identical
        if (p == null || q == null) {
            return false;
        }

        // Values of the current nodes are different, trees are not identical
        if (p.val != q.val) {
            return false;
        }

        // Recursively check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        // Example trees
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        SameTree sameTree = new SameTree();
        boolean result = sameTree.isSameTree(p, q);

        System.out.println(result);  // Output: true
    }
}
