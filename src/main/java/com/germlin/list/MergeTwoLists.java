package com.germlin.list;

public class MergeTwoLists {
    public ListNode solution(ListNode l1, ListNode l2) {
        ListNode pre = null;
        ListNode result = null;
        while (l1 != null && l2 != null) {
            int v1 = l1.val;
            int v2 = l2.val;
            if (v1 <= v2) {
                if (pre == null) {
                    result = l1;
                } else {
                    pre.next = l1;
                }
                pre = l1;
                l1 = l1.next;
            } else {
                if (pre == null) {
                    result = l2;
                } else {
                    pre.next = l2;
                }
                pre = l2;
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            if (pre == null) {
                result = l1;
            } else {
                pre.next = l1;
            }
            pre = l1;
            l1 = l1.next;
        }
        while (l2 != null) {
            if (pre == null) {
                result = l2;
            } else {
                pre.next = l2;
            }
            pre = l2;
            l2 = l2.next;
        }
        return result;
    }
}
