package com.germlin.list;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode(int[] vals) {
        ListNode head = null;
        ListNode pre = null;
        for (int v : vals) {
            if (head == null) {
                this.val = v;
                head = this;
                pre = this;
            } else {
                ListNode node = new ListNode(v);
                pre.next = node;
                pre = node;
            }
        }
    }

    ListNode(int[] vals, int pos) {
        ListNode head = null;
        ListNode pre = null;
        ListNode tail = null;
        int index = 0;
        for (int v : vals) {
            if (head == null) {
                this.val = v;
                head = this;
                pre = this;
            } else {
                ListNode node = new ListNode(v);
                pre.next = node;
                pre = node;
            }
            if(index == pos) {
                tail = pre;
            }
            index ++;
        }
        if(pre != null) {
            pre.next = tail;
        }
    }

    public String toString() {
        ListNode node = this;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        while (node != null) {
            stringBuilder.append(node.val).append(", ");
            node = node.next;
        }
        stringBuilder.delete(stringBuilder.length()-2, stringBuilder.length()-1);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }
        if(other instanceof ListNode) {
            ListNode me = this;
            ListNode you = (ListNode) other;
            while(me != null) {
                if(you == null || you.val != me.val) {
                    return false;
                }
                you = you.next;
                me = me.next;
            }
            return true;
        }
        return false;
    }

}
