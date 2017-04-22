package com.leetcode.hashtables;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

	public char findTheDifference(String s, String t) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < t.length(); i++) {
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
		}
		
		for (int j = 0; j < s.length(); j++) {
			map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
			if(map.get(s.charAt(j)) == 0){
				map.remove(s.charAt(j));
			}
		}
		
		return map.keySet().iterator().next();
	}
}
