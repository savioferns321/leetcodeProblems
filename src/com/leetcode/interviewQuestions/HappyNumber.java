package com.leetcode.interviewQuestions;

import java.util.HashSet;
import java.util.Set;

/**
 * Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
URL : https://leetcode.com/problems/happy-number/#/description
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        if(n < 0) return false;
        
        Set<Integer> set = new HashSet<>();
        while(n > 0){
            n= squareSum(n);
            if(n == 1) return true;
            if(set.contains(n)) break;
            set.add(n);
        }
        return false;
    }
    
    int squareSum(int n){
        int output = 0;
        while(n > 0){
            output += Math.pow(n%10, 2);
            n/=10;
        }
        return output;
    }
    
}
