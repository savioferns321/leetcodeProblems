package com.leetcode.interviewQuestions;

public class HouseRobber {
    public int rob(int[] nums) {
        
        if(nums == null || nums.length == 0) return 0;
        
        int[][] matrix = new int[nums.length + 1][2];
        matrix[0][0] = 0;
        matrix[0][1] = 0;
        
        for(int i=1; i < matrix.length; i++){
            //0th index denotes value if house was robbed.
            matrix[i][0] = nums[i-1] + matrix[i-1][1];
            //1st index denotes value if this house was ignored.
            matrix[i][1] = Math.max(matrix[i-1][0], matrix[i-1][1]);
        }
        
        return Math.max(matrix[nums.length][0],matrix[nums.length][1]);
    }
}
