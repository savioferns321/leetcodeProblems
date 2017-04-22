package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	/*public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxVal = nums.length/2;
        
        
        for (int i = 0; i < nums.length; i++) {
			if(!map.containsKey(nums[i])){
				map.put(nums[i], 0);
			}
			if(map.get(nums[i]) > maxVal){
				return nums[i];
			}
			map.put(nums[i], map.get(nums[i])+1);
		}
        return -1;
    }*/
	
	public int majorityElement(int[] nums) {
		int candidate = nums[0];
		int counter = 1;
		
		for (int i = 1; i < nums.length; i++) {
			if(counter == 0 ){
				candidate = nums[i];
				counter = 1;
			} else if(candidate == nums[i]){
				counter++;
			} else{
				counter --;
			}
		}
		
		return candidate;
	}
	
}
