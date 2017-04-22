package com.leetcode.arrays;

public class BuySellStocks2 {
	public int maxProfit(int[] prices) {
		int total = 0;
		for (int i = 1; i < prices.length; i++) {
			if(prices[i] > prices[i-1]) total += prices[i] - prices[i-1];
		}
		return total;
	}	
}