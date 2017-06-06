package com.leetcode.interviewQuestions;
/**
 * You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
URL : https://leetcode.com/problems/climbing-stairs/#/description

1 = 1
2 = 2
3 = 3
4 = 5
5 = 11111, 1112, 1121, 1211, 2111, 221, 212, 122.
 */
public class ClimbingStairs {
    
    public int climbStairs(int n) {
        
         if(n <=2) return n;
         int[] lookup = new int[n+1];
         
         for(int i=0; i<lookup.length; i++){
             if(n < 3) lookup[i] = i;
             else lookup[i] = lookup[i-1] + lookup[i-2];
         }
         return lookup[n];
    
    }

}
