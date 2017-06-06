package com.leetcode.interviewQuestions;

import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
URL : https://leetcode.com/problems/min-stack/#/description
 */
public class MinStack {
    
	private Stack<Integer> actualStack;
	private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        actualStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int x) {
        actualStack.push(x);
        if(minStack.isEmpty() || x <= minStack.peek()) minStack.push(x);
    }
    
    public void pop() {
    	if(!actualStack.isEmpty()){
        	if(minStack.peek().intValue() == actualStack.peek().intValue()) minStack.pop();
        	actualStack.pop();
    	}
    }
    
    public int top() {
        if(!actualStack.isEmpty()) return actualStack.peek();
        
        return -1;
    }
    
    public int getMin() {
    	if(!minStack.isEmpty()) return minStack.peek();
        
        return -1;
    }


}
