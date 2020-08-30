package com.germlin.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthTest {

    @Test
    void solution() {
        MaxDepth maxDepth = new MaxDepth();
        TreeNode root = new TreeNode(new Integer[]{1, 2, 3, null, null, 4, 5});
        assertEquals(3, maxDepth.solution(root));
    }
}