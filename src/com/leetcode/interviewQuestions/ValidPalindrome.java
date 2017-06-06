package com.leetcode.interviewQuestions;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
URL : https://leetcode.com/problems/valid-palindrome/#/description
 */
public class ValidPalindrome {
    
    public boolean isPalindrome(String s) {
        
        if(s == null || s.length() <= 1) return true;
        
        int left =0, right = s.length() - 1;
        s =s.toLowerCase();
        while(left <= right){
            
            while(!Character.isAlphabetic(s.charAt(left)) && !Character.isDigit(s.charAt(left)) && left < right) left++;
            
            while(!Character.isAlphabetic(s.charAt(right)) && !Character.isDigit(s.charAt(right)) && left < right) right--;
            
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
            
        }
        return true;
    
    }
}
