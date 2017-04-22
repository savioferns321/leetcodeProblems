package com.leetcode.hashtables;

public class IslandPerimeter {

	public int islandPerimeter(int[][] grid) {
		
		int perimeter = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == 1){
					perimeter += (4 - getNumNeighbors(grid, i, j));
				}
			}
		}
		return perimeter;
	}
	
	public int getNumNeighbors(int[][] grid, int i, int j){
		
		int count = 0;
		
		if( i + 1 < grid[0].length && grid[i+1][j] == 1) count++;
		
		if( j + 1 < grid.length && grid[i][j+1] == 1) count++;
		
		if( i - 1 >= 0 && grid[i-1][j] == 1) count++;
		
		if( j - 1 >= 0 && grid[i][j-1] == 1) count++;
		
		return count;
	}
}
