package com.germlin.list;

import java.util.Stack;

public class PalindromeList {
    public boolean solution(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        while (!stack.isEmpty()) {
            int sVal = stack.pop();
            int lVal = head.val;
            if(sVal != lVal) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
