package com.leetcode.interviewQuestions;

import java.util.Arrays;

/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.
URL : https://leetcode.com/problems/plus-one/#/description
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0) return null;
        
        int[] output = new int[digits.length + 1];
        int sum = 1;
        for(int i=digits.length-1; i >=0; i--){
            output[i+1] = sum + digits[i];
            sum = output[i+1]/10;
            output[i+1]%=10;
        }
        
        if(output[0] == 0) output = Arrays.copyOfRange(output, 1, output.length-1);
        
        return output;
    }
}
