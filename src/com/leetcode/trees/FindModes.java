package com.leetcode.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.leetcode.trees.BTreeLevelOrderTraversal.TreeNode;

public class FindModes {

	private Map<Integer, Integer> map = new HashMap<>();
	int max = 0;
	
	public int[] findMode(TreeNode root) {
		populateMap(root);
		
		List<Integer> modes = new ArrayList<>();
		for (Integer node : map.keySet()) {
			if(map.get(node) == max){
				modes.add(node);
			}
		}
		int[] modeArr = new int[modes.size()];
		for (int i = 0; i < modeArr.length; i++) {
			modeArr[i] = modes.get(i);
		}
		return modeArr;
	}
	
	public void populateMap(TreeNode root){
		if(root == null) return;
		
		map.put(root.val, map.getOrDefault(root.val, 0) + 1);
		
		max = Math.max(max, map.get(root.val));
		
		populateMap(root.left);
		populateMap(root.right);
	}
}
