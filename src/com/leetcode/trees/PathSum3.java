package com.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.trees.BTreeLevelOrderTraversal.TreeNode;

public class PathSum3 {

	private int count = 0;
	public int pathSum(TreeNode root, int sum) {
		return root == null? 0: pathSumHelper(root, new ArrayList<>(), sum);
	}
	
	public int pathSumHelper(TreeNode root, List<Integer> nodesInPath, int sum){
		if(root == null) return count;
		
		nodesInPath.add(0, root.val);
		int runningSum = 0;
		for (Integer integer : nodesInPath) {
			runningSum += integer;
			if(runningSum == sum) count++;
		}
		pathSumHelper(root.left, nodesInPath, sum);
		pathSumHelper(root.right, nodesInPath, sum);
		nodesInPath.remove(0);
		return count;
		
	}
	
	
}
