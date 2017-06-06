package com.leetcode.interviewQuestions;

/**
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.

URL : https://leetcode.com/problems/number-of-1-bits/#/description
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int output = 0;
        while(n != 0){
            output += (n&1);
            n >>>= 1;
        }
        return output;
    }
}
