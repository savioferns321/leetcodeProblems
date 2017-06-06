package com.leetcode.interviewQuestions;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * URL : https://leetcode.com/problems/longest-common-prefix/#/description
 */
public class LongestCommonPrefix {
    
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        
        StringBuilder prefix = new StringBuilder(strs[0]);
        
        for(int i=1; i < strs.length; i++){
            int minLen = Math.min(prefix.length(), strs[i].length());
            int counter = 0;
            while(counter < minLen && strs[i].charAt(counter) == prefix.charAt(counter)) counter++;
            prefix.setLength(counter);
        }
        
        return prefix.toString();
    }
}
