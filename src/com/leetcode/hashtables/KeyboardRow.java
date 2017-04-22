package com.leetcode.hashtables;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {

	public String[] findWords(String[] words) {
		List<String> output = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			output.add(words[i]);
		}

		String[] rows = new String[]{"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};

		for (int i = 0; i < words.length; i++) {

			int rownum= 0;
			while(!rows[rownum].contains(words[i].substring(0,1).toUpperCase())){
				rownum++;
			}
			for (int j = 1; j < words[i].length(); j++) {
				if(!rows[rownum].contains(words[i].substring(j, j+1).toUpperCase())) {
					output.remove(words[i]); 
					break;
				}
			}
		}
		
		
		for (String string : output) {
			System.out.println(string);
			
		}

		return output.toArray(new String[output.size()]);

	}
	
	public static void main(String[] args) {
		KeyboardRow keyboardRow = new KeyboardRow();
		keyboardRow.findWords(new String[]{"Hello","Alaska","Dad","Peace"});
	}
}
