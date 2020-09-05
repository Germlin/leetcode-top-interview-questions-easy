package com.germlin.tree;

import java.util.*;

public class LevelOrder {
    public List<List<Integer>> solution(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.add(root);
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            if (!queue1.isEmpty()) {
                while (!queue1.isEmpty()) {
                    TreeNode node = queue1.poll();
                    if (node != null) {
                        list.add(node.val);
                        queue2.add(node.left);
                        queue2.add(node.right);
                    }
                }
            } else {
                while (!queue2.isEmpty()) {
                    TreeNode node = queue2.poll();
                    if (node != null) {
                        list.add(node.val);
                        queue1.add(node.left);
                        queue1.add(node.right);
                    }
                }
            }
            if(!list.isEmpty()) {
                result.add(list);
            }
        }
        return result;
    }
}
