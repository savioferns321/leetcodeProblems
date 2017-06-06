package com.leetcode.interviewQuestions;

/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        
        if(s == null || t == null || s.length() != t.length()) return false;
        
        int[] lookup = new int[26];
        
        int len = s.length();
        
        for(int i=0; i < len; i++){
            
            lookup[s.charAt(i) - 'a']++;
            lookup[t.charAt(i) - 'a']--;
        }
        
        for(int i=0; i < lookup.length; i++){
            if(lookup[i] != 0) return false;
        }
        
        return true;
    }
}
