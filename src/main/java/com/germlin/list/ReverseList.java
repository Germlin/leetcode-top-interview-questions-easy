package com.germlin.list;

public class ReverseList {
    public ListNode solution(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode last = null;
        ListNode pre = head;
        ListNode next = head.next;
        while (next != null) {
            pre.next = last;
            last = pre;
            pre = next;
            next = next.next;
        }
        pre.next = last;
        return pre;
    }
}
