package com.leetcode.hashtables;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

	public int longestPalindrome(String s) {
		
		int output = 0;
		int oddCount = 0;
		Map<Character, Integer> map = new HashMap<>();
				
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		for (Integer count : map.values()) {
			if(count % 2 == 0) 
				output+=count;
			else{
				output += count - 1;
				oddCount = 1;
			} 
				
		}
		
		return output + oddCount;
	}
}
