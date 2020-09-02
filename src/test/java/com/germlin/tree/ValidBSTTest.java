package com.germlin.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidBSTTest {

    @Test
    void solution() {
        ValidBST validBST = new ValidBST();
        TreeNode root1 = new TreeNode(new Integer[]{5, 1, 4, null, null, 3, 6});
        assertFalse(validBST.solution(root1));
        TreeNode root2 = new TreeNode(new Integer[]{1,1});
        assertFalse(validBST.solution(root2));
    }
}