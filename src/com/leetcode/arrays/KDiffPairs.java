package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {

	public int findPairs(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		
		if(k < 0) return 0;
		
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		for(Integer key : map.keySet()){
			if(k == 0){
				if(map.get(key) > 1) count++;
			} else {
				if(map.containsKey(key - k)) count++;
			}
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		KDiffPairs diffPairs = new KDiffPairs();
		System.out.println(diffPairs.findPairs(new int[]{3, 1, 4, 1, 5}, 2));
		System.out.println(diffPairs.findPairs(new int[]{1, 2, 3, 4, 5}, 1));
		System.out.println(diffPairs.findPairs(new int[]{1, 3, 1, 5, 4}, 0));
		System.out.println(diffPairs.findPairs(new int[]{1,2,3,4,5}, -1));
		
	}
}
