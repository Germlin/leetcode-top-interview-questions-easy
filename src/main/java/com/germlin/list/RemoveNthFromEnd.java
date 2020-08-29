package com.germlin.list;

public class RemoveNthFromEnd {
    public ListNode solution(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode pre = newHead;
        n = n - 1;
        while (n > 0) {
            second = second.next;
            n--;
        }
        while (second.next != null) {
            pre = first;
            first = first.next;
            second = second.next;
        }
        pre.next = first.next;
        return newHead.next;
    }
}
