package com.leetcode.hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class SubtreeSum {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	private static HashMap<Integer, Integer> sumMap = new HashMap<>();
	private static int maxCount = Integer.MIN_VALUE;
		
	public int[] findFrequentTreeSum(TreeNode root) {
		inOrder(root);
		
		List<Integer> opList = new ArrayList<>();
		for (Entry<Integer, Integer> currEntry : sumMap.entrySet()) {
			if(currEntry.getValue().intValue() == maxCount){
				opList.add(currEntry.getKey());
			}
		}
		
		int[] output = new int[opList.size()];
		for (int i = 0; i < opList.size(); i++) {
			output[i] = opList.get(i);
		}
		
		sumMap.clear();
		maxCount = Integer.MIN_VALUE;
		return output;
	}
	
	public Integer postOrder(TreeNode root){
		if(root == null)
			return 0;
		
		int leftSum = postOrder(root.left);
		int rightSum = postOrder(root.right);
		//Can also use inorder method
		
		int subtreeSum = root.val + leftSum + rightSum;
		
		int count = sumMap.getOrDefault(subtreeSum, 0) + 1;
		
		
		sumMap.put(subtreeSum, count);
		maxCount = Math.max(maxCount, count);
		return subtreeSum;
	}
	
	
	public Integer inOrder(TreeNode root){
		if(root == null)
			return 0;
		
		int subtreeSum = inOrder(root.left) + root.val + inOrder(root.right);
		
		int count = sumMap.getOrDefault(subtreeSum, 0) + 1;
		
		
		sumMap.put(subtreeSum, count);
		maxCount = Math.max(maxCount, count);
		return subtreeSum;
	}
	
	
	
	public static void main(String[] args) {
		SubtreeSum subtreeSum = new SubtreeSum();
		SubtreeSum.TreeNode root = subtreeSum.new TreeNode(5);
		root.left= subtreeSum.new TreeNode(2);
		root.right = subtreeSum.new TreeNode(-3);
		
		
		/*root.left= subtreeSum.new TreeNode(2);
		root.right = subtreeSum.new TreeNode(-5);
		*/
		int[] output = subtreeSum.findFrequentTreeSum(root);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]+"\t");
		}
	}
}
