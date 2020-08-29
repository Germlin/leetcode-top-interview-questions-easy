package com.germlin.list;

public class DeleteNode {
    public void solution(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
}
