package com.leetcode.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * Hackerrank graph topological sort algo
 * @author Savio
 *
 */
public class Graph{

	private List<List<Integer>> graph;

	private int[] inEdges;

	private int E;

	private int V;

	public Graph(int size, int edges){

		this.E = edges;
		this.V = size;
		this.inEdges =  new int[V];
		graph = new ArrayList<List<Integer>>(size);
		for(int i = 0 ; i < V; i++){
			graph.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int u, int v){

		inEdges[v]++;

		graph.get(u).add(v);
		Collections.sort(graph.get(u));
		Collections.reverse(graph.get(u));
	}

	public void topologicalSort(){

		Queue<Integer> q = new LinkedList<Integer>();	
		boolean[] visited = new boolean[V];

		for(int i = V-1; i >= 0 ; i--){
			if(!visited[i] && inEdges[i] == 0){
				visited[i] = true;
				q.add(i);
			}
		}

		while(!q.isEmpty()){
			Integer curr = q.remove();
			List<Integer> currList = graph.get(curr);
			for (int i = currList.size() - 1; i >= 0; i--) {
				int x = currList.get(i);
				if(!visited[x] && inEdges[x] > 0){
					visited[x] = true;
					inEdges[x]--;
					q.add(x);
				}
			}

			System.out.print((curr+1)+" ");
		}

	}


	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int vertices = in.nextInt();
		//System.out.println("Vertices : "+vertices);
		int edges = in.nextInt();
		//System.out.println("Edges : "+edges);
		Graph graph = new Graph(vertices, edges);

		for(int i=0;i < edges; i ++){
			int u = in.nextInt();
			int v = in.nextInt();
			//System.out.println("U : "+u+" V:"+v);
			graph.addEdge(u-1,v-1);
		}

		graph.topologicalSort();

		in.close();

	}


}