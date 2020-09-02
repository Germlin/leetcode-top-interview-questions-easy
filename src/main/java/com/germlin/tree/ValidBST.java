package com.germlin.tree;

import java.util.ArrayList;
import java.util.List;

public class ValidBST {
    public boolean solution(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        ldr(root, list);
        if (list.isEmpty()) {
            return true;
        } else {
            int temp = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                int val = list.get(i);
                if (val <= temp) {
                    return false;
                }
                temp = val;
            }
            return true;
        }
    }

    private void ldr(TreeNode root, List<Integer> list) {
        if (root != null) {
            ldr(root.left, list);
            list.add(root.val);
            ldr(root.right, list);
        }
    }
}
