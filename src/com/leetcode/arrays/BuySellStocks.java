package com.leetcode.arrays;

public class BuySellStocks {

	public int maxProfit(int[] prices) {
		
		int currentMaxProfit = 0;
		int overallMaxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			currentMaxProfit = Math.max(0, currentMaxProfit + prices[i]-prices[i-1]);
			overallMaxProfit = Math.max(overallMaxProfit, currentMaxProfit);
		}
		
		return overallMaxProfit;
	}
	
	public static void main(String[] args) {
		BuySellStocks buySellStocks = new BuySellStocks();
		//7, 1, 5, 3, 6, 4
		//2,3,4,5,1,11
		
		System.out.println(buySellStocks.maxProfit(new int[]{2,3,4,5,1,11}));
	}
}
