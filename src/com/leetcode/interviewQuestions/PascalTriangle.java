package com.leetcode.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
URL : https://leetcode.com/problems/pascals-triangle/#/description
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        if(numRows <=0) return output;
        for(int i=1; i <= numRows; i++){
            List<Integer> currList = new ArrayList<>();
            
            for(int j=0; j <i; j++){
                if(j==0 || j==i-1)
                    currList.add(1);
                else currList.add(output.get(i-2).get(j) + output.get(i-2).get(j-1));    
            }
            output.add(currList);
        }
        return output;
    }
}
