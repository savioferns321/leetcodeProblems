package com.leetcode.interviewQuestions;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction 
(ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
URL : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/#/description
 */
public class BuySellStock1 {
    public int maxProfit(int[] prices) {
        
        if(prices == null || prices.length == 0) return 0;
        
        int currMin = prices[0];
        int currMax = prices[0];
        int overallMax = 0;
        
        for(int i=1; i < prices.length; i++){
            currMin = Math.min(currMin, prices[i]);
            currMax=  Math.max(currMax, prices[i]);
            overallMax = Math.max(overallMax, currMax - currMin);
        }
        
        return overallMax;
    }
}
