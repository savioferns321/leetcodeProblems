package com.leetcode.interviewQuestions;

/**
 * Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.
URL : https://leetcode.com/problems/factorial-trailing-zeroes/#/description
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        
        if(n < 5) return 0;
        
        return n/5 + trailingZeroes(n/5);
    }
}
