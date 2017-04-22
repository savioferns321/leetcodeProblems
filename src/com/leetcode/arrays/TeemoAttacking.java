package com.leetcode.arrays;

import java.util.Arrays;

public class TeemoAttacking {

	public static int findPoisonedDuration(int[] timeSeries, int duration) {
        Arrays.sort(timeSeries);
        
        switch (timeSeries.length) {
		case 0:
			return 0;

		case 1:
			return duration;
		default:
			break;
		}
        
        int totalDuration = duration;
        for (int i = 1; i < timeSeries.length; i++) {
        	
        	if(timeSeries[i] - timeSeries[i-1] < duration){
        		totalDuration += (timeSeries[i] - timeSeries[i-1]);
        	} else {
        		totalDuration += duration;
        	}
        	
		}
        return totalDuration;
    }
	
	public static void main(String[] args) {
		System.out.println(findPoisonedDuration(new int[]{1,4}, 2));
	}
}
