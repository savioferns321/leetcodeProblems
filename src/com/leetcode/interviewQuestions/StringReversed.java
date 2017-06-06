package com.leetcode.interviewQuestions;

/**
 * Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
URL : https://leetcode.com/problems/reverse-string/#/description
 */
public class StringReversed {
    public String reverseString(String s) {
        
        if(s == null || s.isEmpty() || s.length() == 1) return s;
        
        char[] charArr = s.toCharArray();
        int n = s.length();
        char temp;
        for(int i=0; i < n/2; i++){
            temp = charArr[n - 1 - i];
            charArr[n - 1 - i] = charArr[i];
            charArr[i] = temp;
        }
        return new String(charArr);
    }
}
