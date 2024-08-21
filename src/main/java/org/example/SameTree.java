package org.example;

import javax.swing.tree.TreeNode;

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

    public boolean isSameTree(SameTreeNode p, SameTreeNode q) {
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
        SameTreeNode p = new SameTreeNode(1);
        p.left = new SameTreeNode(2);
        p.right = new SameTreeNode(3);

        SameTreeNode q = new SameTreeNode(1);
        q.left = new SameTreeNode(2);
        q.right = new SameTreeNode(3);

        SameTree main = new SameTree();
        boolean result = main.isSameTree(p, q);

        System.out.println(result);  // Output: true
    }
}
