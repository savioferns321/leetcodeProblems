package com.leetcode.heaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class SortCharactersByFreq {

	public String frequencySort(String s) {
		int[] marker = new int[52];
		
		Set<Integer> freqSet = new TreeSet<Integer>(Collections.reverseOrder());
		char curr;
		//Populate marker and freqSet
		for (int i = 0; i < s.length(); i++) {
			curr = s.charAt(i);
			if(curr >= 'A' && curr <='Z'){
				marker[curr - 'A']++;
				freqSet.add(marker[curr - 'A']);
			} else if(curr >= 'a' && curr <= 'z'){
				marker[curr - 'a'+26]++;
				freqSet.add(marker[curr - 'a'+26]);
			}
		}
		
		int remainingLength = s.length();
		boolean isComplete = false;
		StringBuilder builder = new StringBuilder();
		for (Integer currFreq : freqSet) {
			for (int i = 0; i < marker.length; i++) {
				if(marker[i] == currFreq){
					char[] repeatArr = new char[currFreq];
					if(i < 26){
						curr = (char) ('A' + i);
					} else {
						curr = (char) ('a' + i - 26);
						System.out.println(curr);
					}
					Arrays.fill(repeatArr, curr);
					builder.append(repeatArr);
					remainingLength -= currFreq;
					if(remainingLength == 0){
						isComplete = true;
						break;
					}
				}
			}
			if(isComplete)
				break;
		}
		//System.out.println(builder);
		return builder.toString();

	}

	public String frequencySort2(String s){
		Map<Character, Integer> freqMap = new HashMap<>();
		Set<Integer> frequencies = new TreeSet<Integer>(Collections.reverseOrder());
		
		for (int i = 0; i < s.length(); i++) {
			if(freqMap.containsKey(s.charAt(i)))
				freqMap.put(s.charAt(i), freqMap.get(s.charAt(i))+1);
			else
				freqMap.put(s.charAt(i), 1);
			
			frequencies.add(freqMap.get(s.charAt(i)));
		}
		
		int remainingLength = s.length();
		StringBuilder outputBuilder = new StringBuilder();
		boolean isComplete = false;
		for (Integer currFreq : frequencies) {
			for(Entry<Character, Integer> entry : freqMap.entrySet()){
				if(entry.getValue().equals(currFreq)){
					char[] repeatArr = new char[currFreq];
					Arrays.fill(repeatArr, entry.getKey());
					outputBuilder.append(repeatArr);
					remainingLength-=currFreq;
					if(remainingLength == 0)
					{
						isComplete = true;
						break;
					}
				}
			}
			if(isComplete)
				break;
		}
		//System.out.println(outputBuilder);
		return outputBuilder.toString();
	}
	
	public static void main(String[] args) {
		SortCharactersByFreq freq = new SortCharactersByFreq();
		freq.frequencySort2("treeAA");

	}
}
