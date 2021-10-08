package com.company.leetcode;

import java.util.Stack;

public class _155 {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public static void main(String[] args) {

    }

    public _155() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty()){
            minStack.push(val);
        } else {
            minStack.push(Math.min(val,minStack.peek()));
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
