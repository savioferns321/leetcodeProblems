package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicate2 {


	public boolean containsDuplicate2(int[] nums, int k) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])){
				for (int index : map.get(nums[i])) {
					if( (i - index) <= k) return true; 
				}
			} else {
				map.put(nums[i], new ArrayList<>());
			}
			map.get(nums[i]).add(i);
		}
		return false;

	}

}
