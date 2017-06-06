package com.leetcode.interviewQuestions;

/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * URL : https://leetcode.com/problems/sum-of-two-integers/#/description
 */
public class TwoIntegerSum {
    
    /*
     * XOR operation of 2 integers will give us sum for those bits with differing values i.e. 0 and 1 
     * (01) ^ (10) = (11) which is the sum
     * 
     * AND operation gives us the bits for which carry is obtained. 
     * (11) & (10) = (10) 
     * 
     * We need to store the XOR operation each time and get the And operation.
     * Shift the And operation each time and keep repeating until AND operation result is not zero.
     */
    public int getSum(int a, int b) {
        
        int c =  0;
        while(b != 0){
            
            c = a & b;
            a^= b;
            b=c;
            b <<= 1;
            
        }
        
        return a;
    }
}
