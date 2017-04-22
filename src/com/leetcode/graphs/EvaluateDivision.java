package com.leetcode.graphs;

import java.util.HashMap;
import java.util.Map;

public class EvaluateDivision {

	/*public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {

		Map<String, Map<String, Double>> graph = new HashMap<>();
		
		//Construct the graph
		for (int i = 0; i < equations[0].length; i++) {
			String[] equation = equations[i];
			if(graph.containsKey(equation[0])) addNode(graph, equation[0], equation[1], values[i]);
			if(graph.containsKey(equation[1])) addNode(graph, equation[1], equation[0], 1/values[i]);
			
		}
	}*/
	
	public void addNode(Map<String, Map<String, Double>> graph, String oper1, String oper2, double value){
		Map<String, Double> innerPair = new HashMap<>();
		innerPair.put(oper2, value);
		
		graph.put(oper1, innerPair);		
	}
}
