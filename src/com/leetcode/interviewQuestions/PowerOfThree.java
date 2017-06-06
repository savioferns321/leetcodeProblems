package com.leetcode.interviewQuestions;

/**
 * Given an integer, write a function to determine if it is a power of three.
 * URL : https://leetcode.com/problems/power-of-three/#/description
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        int currPower = 3;
        
        if(n == 1) return true;
        if(n < 3) return false;
        
        while(currPower > 0){
            currPower *=3;
            if(currPower == n) return true;
            if(currPower > n) break;
        }
        return false;
    }
}
