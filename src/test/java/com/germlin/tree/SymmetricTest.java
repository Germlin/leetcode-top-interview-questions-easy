package com.germlin.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTest {

    @Test
    void solution() {
        TreeNode tree = new TreeNode(new Integer[]{1,2,2});
        Symmetric symmetric = new Symmetric();
        assertTrue(symmetric.solution(tree));
    }
}