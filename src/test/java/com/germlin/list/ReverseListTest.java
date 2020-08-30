package com.germlin.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {

    @Test
    void solution() {
        ReverseList reverseList = new ReverseList();
        ListNode head = new ListNode(new int[]{1, 2, 3, 4, 5});
        ListNode except = new ListNode(new int[]{5, 4, 3, 2, 1});
        ListNode result = reverseList.solution(head);
        assertEquals(except, result);
    }
}