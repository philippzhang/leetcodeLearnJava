package com.learn.java.leetcode.lc0399;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	private Map<String, String> parents = new HashMap<>();
	private Map<String, Double> vals = new HashMap<>();

	/**
	 * 并查集
	 * @param equations
	 * @param values
	 * @param queries
	 * @return
	 */
	public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
		double[] results = new double[queries.size()];
		for(int i =0;i<values.length;i++){
			union(equations.get(i).get(0),equations.get(i).get(1),values[i]);
		}
		for(int i =0;i<queries.size();i++){
			String x = queries.get(i).get(0);
			String y = queries.get(i).get(1);
			results[i] = (parents.containsKey(x)&& parents.containsKey(y)&&find(x)==find(y))?vals.get(x)/vals.get(y):-1.0;
		}

		return results;
	}
	private void add(String s){
		if(parents.containsKey(s)){
			return;
		}
		parents.put(s,s);
		vals.put(s,1.0);
	}
	private void union(String x,String y,double v){
		add(x);
		add(y);
		String px = find(x);
		String py = find(y);
		parents.put(px,py);
		vals.put(px,v*vals.get(y)/vals.get(x));
	}
	private String find(String s){
		String p = parents.getOrDefault(s,s);
		if(s!=p){
			String pp = find(p);
			vals.put(s,vals.get(s)*vals.get(p));
			parents.put(s,pp);
		}
		return parents.getOrDefault(s,s);
	}
}

