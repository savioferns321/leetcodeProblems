package com.leetcode.interviewQuestions;

/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.
URL : https://leetcode.com/problems/count-and-say/#/description
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if(n <= 0) return "";
        StringBuilder curr = new StringBuilder("1");
        StringBuilder prev = new StringBuilder();
        for(int i=2; i <=n; i++){
            prev = curr;
            curr.setLength(0);
            int count = 1;
            char say = curr.charAt(0);
            for(int j=1; j < prev.length(); j++){
                if(prev.charAt(j) != prev.charAt(j-1)){
                    curr.append(count).append(say);
                    count = 1;
                    say = curr.charAt(j);
                } else {
                    count++;
                }
            }
            curr.append(count).append(say);
            
                        
        }
        return prev.toString();
    }
}
