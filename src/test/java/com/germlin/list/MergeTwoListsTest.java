package com.germlin.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoListsTest {

    @Test
    void solution() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode l1 = new ListNode(new int[]{1, 2, 3});
        ListNode l2 = new ListNode(new int[]{2, 4});
        ListNode except = new ListNode(new int[]{1, 2, 2, 3, 4});
        ListNode result = mergeTwoLists.solution(l1, l2);
        assertEquals(except, result);
    }
}