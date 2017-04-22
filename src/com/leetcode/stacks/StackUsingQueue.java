package com.leetcode.stacks;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	
	

	class MyStack {

		private Queue<Integer> stackQueue;
		private Integer top = null;
		private int stackSize;
	    /** Initialize your data structure here. */
	    public MyStack() {
	        stackQueue = new LinkedList<>();
	        stackSize = 0;
	    }
	    
	    /** Push element x onto stack. */
	    public void push(int x) {
	        stackSize++;
	        if(top != null)
	        	stackQueue.offer(top);
	        
	        top = x;
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() {

	    	if(stackSize == 0)
	    		return Integer.MIN_VALUE;
	    	stackSize--;
	        int head = top;
	        top = stackQueue.poll();
	        for (int i = 1; i < stackSize; i++) {
				
				stackQueue.offer(top);
				top = stackQueue.poll();
			}
	        
	        return head;
	    }
	    
	    /** Get the top element. */
	    public int top() {
	        return top;
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
	        return stackSize  == 0;
	    }
	    
	    public void printElements(){
	    	int curr;
	    	for (int i = 0; i < stackSize - 1; i++) {
				curr = stackQueue.poll();
				System.out.print(curr+"\t");
				stackQueue.offer(curr);
			}
	    	System.out.println(top);
	    }
	}
	
	public static void main(String[] args) {
		MyStack myStack  =new StackUsingQueue().new MyStack();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.printElements();
		System.out.println(myStack.pop());
		myStack.printElements();
		myStack.push(5);
		myStack.printElements();
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		myStack.push(10);
		myStack.printElements();
	}
}
