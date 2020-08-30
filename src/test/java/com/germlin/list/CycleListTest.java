package com.germlin.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CycleListTest {

    @Test
    void solution() {
        CycleList cycleList = new CycleList();
        assertFalse(cycleList.solution(new ListNode(new int[]{1, 2}, -1)));
        assertTrue(cycleList.solution(new ListNode(new int[]{1}, 0)));
    }
}