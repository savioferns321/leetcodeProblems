package com.leetcode.interviewQuestions;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * URL : https://leetcode.com/problems/first-unique-character-in-a-string/#/description
 */
public class FirstUniqueCharacter {
    
    public int firstUniqChar(String s) {
        
        if(s == null || s.isEmpty()) return -1;
        
        int[] lookup = new int[26];
        char[] charArr = s.toCharArray();
        
        for(int i=0; i < charArr.length; i++){
            lookup[charArr[i] - 'a']++;
        }
        
        for(int i=0; i < charArr.length; i++){
            if(lookup[charArr[i] - 'a'] == 1)
                return i;
        }
        
        
        return -1;
    }
    
}
