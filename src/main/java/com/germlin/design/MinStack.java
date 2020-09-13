package com.germlin.design;


import java.util.Stack;

public class MinStack {

    static class Pair{
        int value;
        int min;

        public Pair(int v, int m) {
            value = v;
            min = m;
        }
    }

    private final Stack<Pair> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        int min = x;
        if (!stack.isEmpty()) {
            min = Math.min(min, stack.peek().min);
        }
        Pair pair = new Pair(x, min);
        stack.push(pair);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().min;
    }
}
