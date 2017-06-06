package com.leetcode.interviewQuestions;

/**
 * Implement strStr().

TODO Need to improve time complexity.
Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class StrStr {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null 
        || haystack.isEmpty() || needle.isEmpty()) return 0;
        
        int index = -1;
        int currIndex = 0;
        for(int i=0; i < haystack.length(); i++){
            
            if(haystack.charAt(i) == needle.charAt(currIndex)){
                if(index == -1) index = i;
                currIndex++;
                
                if(currIndex == needle.length()) return index;
            } else{
                index = -1;
                currIndex = 0;
                
            } 
            
            
        }
        
        return index;
    }
}
