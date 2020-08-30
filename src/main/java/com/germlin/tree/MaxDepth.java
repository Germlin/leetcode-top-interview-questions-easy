package com.germlin.tree;


public class MaxDepth {
    public int solution(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        depth++;
        int leftDepth = dfs(root.left, depth);
        int rightDepth = dfs(root.right, depth);
        return Math.max(leftDepth, rightDepth);
    }
}
