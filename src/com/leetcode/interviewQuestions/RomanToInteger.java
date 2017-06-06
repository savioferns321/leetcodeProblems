package com.leetcode.interviewQuestions;

/**
 * Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
URL : https://leetcode.com/problems/roman-to-integer/#/description
 */
public class RomanToInteger {
    public int romanToInt(String s) {
		//Integer i1 = new Integer(2);
		
		if(s==null || s.isEmpty()) return 0;
		
		int output = 0;
		char numeral;
		int  prev = 0;
		int currVal = 0;
		for (int i = 0; i < s.length(); i++) {
			numeral = s.charAt(i);
			currVal =  getValue(numeral);
			if(prev > 0 && prev < currVal)
				output -= (2 * prev);
			
			output += currVal;
			prev = currVal;
		}
		
		return output;

	}

	public int getValue(char numeral){
		switch (numeral) {
		case 'I':
			return 1;

		case 'V':
			return 5;

		case 'X':
			return 10;	

		case 'L':
			return 50;

		case 'C':
			return 100;

		case 'D':
			return 500;

		case 'M':
			return 1000;	

		default:
			return -1;
		}
	}
}
