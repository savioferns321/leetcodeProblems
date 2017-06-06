package com.leetcode.interviewQuestions;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
URL : https://leetcode.com/problems/valid-parentheses/#/description
 */
public class ValidParentheses {
    public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '(':
				stack.push(')');
				break;
			case '{':
				stack.push('}');
				break;

			case '[':
				stack.push(']');
				break;
				
			case ')':
			case '}':
			case ']':
				if(stack.isEmpty() || stack.peek() != s.charAt(i)) return false;
				
				stack.pop();
				break;

			default:
				break;
			}
		}
		if(stack.isEmpty()) return true;
		
		return false;
    }

    
}
