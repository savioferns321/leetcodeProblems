package com.leetcode.interviewQuestions;

/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    
    URL : https://leetcode.com/problems/excel-sheet-column-number/#/description
 */
public class ExcelSheetColumnNumber {
    
    public int titleToNumber(String s) {
        
        if(s == null || s.isEmpty()) return 0;
        
        char[] charArr = s.toUpperCase().toCharArray();
        int output = 0;
        
        for(int i=0; i < charArr.length; i++){
            
            output += (charArr[i] - 'A'+1) * Math.pow(26, charArr.length - 1 - i);
            
        }
        
        return output;
    }
}
