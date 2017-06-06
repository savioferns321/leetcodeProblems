package com.leetcode.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class NextFibonacci {
    
    public int nextFib(int n){
        if(n == 0) return 1;
        List<Integer> fibs = new ArrayList<>();
        fibs.add(1);
        fibs.add(1);
        int index = 1;
        
        while(n >= fibs.get(index)){
            fibs.add(fibs.get(index)+fibs.get(index-1));
            index++;
        }
        return fibs.get(fibs.size()-1);
    }
}
