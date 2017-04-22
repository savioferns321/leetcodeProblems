package com.leetcode.linkedlists;

import java.util.Stack;

public class AddTwoNumbers2 {

	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		Stack<Integer> firstStack = new Stack<>();
		Stack<Integer> secondStack = new Stack<>();
		
		ListNode curr = l1;
		while(curr != null){
			firstStack.push(curr.val);
			curr = curr.next;
		}
		
		curr = l2;
		while(curr != null){
			secondStack.push(curr.val);
			curr = curr.next;
		}
		
		int currSum = 0;
		int remainder = 0;
		ListNode prev = null;
		while(!firstStack.isEmpty() || !secondStack.isEmpty()){
			if(!firstStack.isEmpty()) currSum += firstStack.pop();
			
			if(!secondStack.isEmpty()) currSum+= secondStack.pop();
			
			remainder = currSum%10;

			curr = new ListNode(remainder);
			currSum /=10;
			
			if(prev!= null){
				curr.next = prev;
			}
			prev = curr;
		}
		if(currSum > 0){
			curr = new ListNode(currSum);
			curr.next = prev;
		}
			
		return curr;
		
	}
	/*
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode current = l1;
		ListNode output = null;
		ListNode prev = null;
		StringBuffer firstNumberStr = new StringBuffer();
		StringBuffer secondNumberStr = new StringBuffer();
		while(current != null){
			firstNumberStr.append(current.val);
			current = current.next;
		}
		current = l2;
		while(current != null){
			secondNumberStr.append(current.val);
			current = current.next;
		}
		long firstNum = Long.parseLong(firstNumberStr.toString());
		long secondNum = Long.parseLong(secondNumberStr.toString());
		
		long result = firstNum + secondNum;
		System.out.printf("First: %d Second: %d Result: %d", firstNum, secondNum, result);
		String resultStr = String.valueOf(result);
		
		
		for (int i = 0; i < resultStr.length(); i++) {
			
			current = new AddTwoNumbers2().new ListNode(Integer.parseInt(resultStr.charAt(i)+""));
			
			if(prev == null){
				output = current;
			} else{
				prev.next = current;
			}
			prev = current;				
		}
		return output;
	}
*/
	public static void main(String[] args) {
		ListNode f1 = createLinkedList(7243);
		ListNode f2 = createLinkedList(564);
		
		printList(f1);
		printList(f2);
		
		ListNode sum = new AddTwoNumbers2().addTwoNumbers(f1, f2);
		
		printList(sum);

	}
	
	public static ListNode createLinkedList(int num){
		ListNode current = null;
		ListNode prev = null;
		ListNode output = null;
		String numStr = String.valueOf(num);
		for (int i = 0; i < numStr.length(); i++) {
			current = new AddTwoNumbers2().new ListNode(Integer.parseInt(numStr.charAt(i)+""));
			System.out.print(numStr.charAt(i)+"\t");
			if(prev == null){
				output = current;
			} else{
				prev.next = current;
			}
			prev = current;
		}
		System.out.println();
		return output;
	}
	
	public static void printList(ListNode root){
		ListNode curr = root;
		while(curr != null){
			System.out.print(curr.val+"\t");
			curr = curr.next;
		}
		System.out.println();
	}
}
