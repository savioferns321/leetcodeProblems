package com.leetcode.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and 
for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

URL : https://leetcode.com/problems/fizz-buzz/#/description
 */
public class FizzBuzz {
    
    public List<String> fizzBuzz(int n) {
        if(n<=0) return null;
        
        List<String> output = new ArrayList<>();
        
        for(int i=1; i <=n; i++){
            if(i % 15 == 0)
                output.add("FizzBuzz");
            else if(i % 5 ==0)
                output.add("Buzz");
            else if(i % 3 == 0)
                output.add("Fizz");
            else
                output.add(i+"");
        }
        
        return output;
    }
}

