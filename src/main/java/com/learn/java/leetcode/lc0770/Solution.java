package com.learn.java.leetcode.lc0770;

import java.util.*;

public class Solution {
	class Term implements Comparable<Term>{
		int coef;
		List<String> vars;

		public Term(int coef) {
			this.coef = coef;
			vars = new ArrayList<>();
		}
		public Term(String s) {
			this.coef = 1;
			vars = new ArrayList<>();
			vars.add(s);
		}

		@Override
		public String toString() {
			return coef + varString();
		}

		public String varString() {
			Collections.sort(vars);
			StringBuilder sb = new StringBuilder();
			for (String s : vars) {
				sb.append('*');
				sb.append(s);
			}
			return sb.toString();
		}

		@Override
		public boolean equals(Object obj) {
			return varString().equals(((Term)obj).varString());
		}

		@Override
		public int compareTo(Term t) {
			if(vars.size()!=t.vars.size()){
				return t.vars.size()-vars.size();
			}
			return varString().compareTo(t.varString());
		}

		public Term multi(Term t) {
			Term result = new Term(coef);
			result.vars.addAll(vars);
			result.coef *= t.coef;
			for (String v : t.vars) {
				result.vars.add(v);
			}
			return result;
		}
	}
	class Sequence{
		List<Term> terms;

		public Sequence() {
			terms = new ArrayList<>();
		}
		public Sequence(int n) {
			terms = new ArrayList<>();
			terms.add(new Term(n));
		}

		public Sequence(String s) {
			terms = new ArrayList<>();
			terms.add(new Term(s));
		}

		public Sequence(Term t) {
			terms = new ArrayList<>();
			terms.add(t);
		}

		public Sequence add(Sequence sq){
			for(Term t2:sq.terms){
				boolean found = false;
				for(Term t1:terms){
					if(t1.equals(t2)){
						t1.coef += t2.coef;
						if(t1.coef==0){
							terms.remove(t1);
						}
						found = true;
						break;
					}
				}
				if(!found&&t2.coef!=0){
					terms.add(t2);
				}
			}
			return this;
		}

		public Sequence multi(Sequence sq){
			Sequence result = new Sequence();
			for(Term t1:terms){
				for(Term t2:sq.terms){
					result.add(new Sequence(t1.multi(t2)));
				}
			}
			return result;
		}

	}
	private int i;
	public List<String> basicCalculatorIV(String expression, String[] evalvars, int[] evalints) {
		Map<String,Integer> map = new HashMap<>();
		for(int i =0;i<evalvars.length;i++){
			map.put(evalvars[i],evalints[i]);
		}
		i =0;
		Sequence sq = helper(expression,map);
		List<String> results = new LinkedList<>();
		Collections.sort(sq.terms);
		for(Term t:sq.terms){
			String s = t.toString();
			if(!s.equals("0")){
				results.add(s);
			}
		}
		return results;
	}

	private void addToStack(Stack<Sequence> stack, Sequence sq, int flag) {
		if (flag == 0) {
			stack.push(stack.pop().multi(sq));
		} else {
			stack.push(sq.multi(new Sequence(flag)));
		}
	}

	private Sequence helper(String expression,Map<String,Integer> map){
		Stack<Sequence> stack = new Stack<>();
		int flag = 1;
		stack.push(new Sequence(0));
		while(i<expression.length()){
			char ch = expression.charAt(i);
			if(ch==' '){

			}else if(ch =='('){
				i++;
				Sequence sq = helper(expression,map);
				addToStack(stack,sq,flag);
			}else if(ch ==')'){
				break;
			}else if(ch=='+'){
				flag = 1;
			}else if(ch=='-'){
				flag = -1;
			}else if(ch=='*'){
				flag = 0;
			}else if(Character.isDigit(ch)){
				int j = i +1;
				while(j<expression.length()&&  Character.isDigit(expression.charAt(j))){
					j++;
				}
				int coef = Integer.valueOf(expression.substring(i,j));
				i =j-1;
				addToStack(stack,new Sequence(coef),flag);
			}else {
				int j = i+1;
				while(j<expression.length()&&expression.charAt(j)!=' '&&expression.charAt(j)!=')'){
					j++;
				}
				String var = expression.substring(i,j);
				i = j -1;
				if(map.containsKey(var)){
					addToStack(stack,new Sequence(map.get(var)),flag);
				}else{
					addToStack(stack,new Sequence(var),flag);
				}
			}
			i++;
		}
		Sequence result = new Sequence();
		while(!stack.isEmpty()){
			result.add(stack.pop());
		}
		return result;
	}
}
