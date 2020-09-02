package com.germlin.tree;

/**
 * Definition for a binary tree node.
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    TreeNode(Integer[] vals) {
        TreeNode root = build(vals, 0);
        assert root != null;
        this.val = root.val;
        this.right = root.right;
        this.left = root.left;
    }

    private TreeNode build(Integer[] vals, int index) {
        if (index >= vals.length || vals[index] == null) {
            return null;
        }
        TreeNode node = new TreeNode(vals[index]);
        node.left = build(vals, index * 2 + 1);
        node.right = build(vals, index * 2 + 2);
        return node;
    }

}
