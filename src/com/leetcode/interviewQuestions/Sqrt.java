package com.leetcode.interviewQuestions;

/**
 * Implement int sqrt(int x).

Compute and return the square root of x.
URL : https://leetcode.com/problems/sqrtx/#/description
 */
public class Sqrt {
    /**
     * Idea is to find which number below x squared is equal to or just greater than x.
     * Binary search can be used. But instead of checking (i*i == x) we check if (i == x/i).
     * This overcomes overflow errors. 
     * Binary search can be used to find the square root.
     * If square is less than x, then change left value to mid + 1.
     * If square is greater than x, change right to mid-1.
     * 
     */
    public int mySqrt(int x) {
        
        int left = 1;
        int right = Integer.max(x, left);
        int mid=1;
        while(true){
            mid = left + (right - left)/2;
            if(mid > x/mid){
                // (mid ^2) > x
                right = mid - 1;
            } else{
                // (mid ^2) <= x
                
                //If (mid +1)^2 > x, then mid is the answer.    
                if((mid + 1) > x/(mid + 1)) return mid;
                
                //mid^2 << x
                left = mid + 1;
            }
        }
    }
}
