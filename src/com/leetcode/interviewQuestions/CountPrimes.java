package com.leetcode.interviewQuestions;

/**
 * Description:

Count the number of prime numbers less than a non-negative number, n.

Credits:
URL : https://leetcode.com/problems/count-primes/#/description
 */
public class CountPrimes {
    
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        
        int counter = n-2;
        boolean[] marker = new boolean[n];
        
        for(int i=1; i < n; i++){
            
            if(marker[i]) {
                counter--;
            } else{
                
                for(int j = i+i; j < n; j++){
                    marker[j] = true;
                }
            }
            
        }
        
        return counter;
    }
}
