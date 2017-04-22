package com.leetcode.hashtables;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> output = new ArrayList<>();
		StringBuilder builder;
		for (int i = 0; i < s.length() - p.length(); i++) {
			builder = new StringBuilder(s);
			for (int j = i; j < i+p.length(); j++) {
				if(builder.indexOf(s.charAt(j) + "") >=0 ) builder.deleteCharAt(builder.indexOf(s.charAt(j)+""));
			}
			if(builder.length() == 0) output.add(i);
		}
		
		return output;
	}
}
