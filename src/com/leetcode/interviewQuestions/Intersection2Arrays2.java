package com.leetcode.interviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersection2Arrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        
		if(nums1 == null || nums2 == null 
				|| nums1.length == 0 || nums2.length == 0)
			return new int[]{};
		
		Map<Integer, Integer> countMap = new HashMap<>();
		List<Integer> outputList = new ArrayList<>();
		
		for (int i = 0; i < nums1.length; i++) {
			countMap.put(nums1[i], countMap.getOrDefault(nums1[i], 0) + 1);
		}
		
		for (int i = 0; i < nums2.length; i++) {
			if(countMap.containsKey(nums2[i])){
				countMap.put(nums2[i], countMap.get(nums2[i]) - 1);
				outputList.add(nums2[i]);
				
				if(countMap.get(nums2[i]) == 0)
					countMap.remove(nums2[i]);
			}
		}
		
		int[] output = new int[outputList.size()];
		for (int i = 0; i < output.length; i++) {
			output[i] = outputList.get(i);
		}
		
		return output;
			
	
    }

}
