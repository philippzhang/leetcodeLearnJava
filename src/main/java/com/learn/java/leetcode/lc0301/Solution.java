package com.learn.java.leetcode.lc0301;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	private Set<String> validExpressions = new HashSet<>();
	private int minimumRemoved;
	private void reset(){
		validExpressions.clear();
		minimumRemoved = Integer.MAX_VALUE;
	}
	private void recurse(String s, int index, int leftCount, int rightCount, StringBuilder expression, int removedCount) {
		//达到最后
		if (index == s.length()) {
			//合法
			if(leftCount==rightCount){

				if(removedCount <= minimumRemoved){
					String possibleAnswer  = expression.toString();
					if(removedCount<minimumRemoved){
						validExpressions.clear();
						minimumRemoved = removedCount;
					}
					validExpressions.add(possibleAnswer);
				}
			}
		}else{
			char ch = s.charAt(index);
			int len = expression.length();
			if(ch!='(' && ch !=')'){
				expression.append(ch);
				recurse(s,index+1,leftCount,rightCount,expression,removedCount);
				//回溯
				expression.deleteCharAt(len);
			}else{
				recurse(s,index+1,leftCount,rightCount,expression,removedCount+1);
				expression.append(ch);

				if(ch=='('){
					recurse(s,index+1,leftCount+1,rightCount,expression,removedCount);
				}else if(rightCount<leftCount){
					recurse(s,index+1,leftCount,rightCount+1,expression,removedCount);
				}
				//回溯
				expression.deleteCharAt(len);
			}
		}

	}


	public List<String> removeInvalidParentheses(String s) {
		reset();
		recurse(s,0,0,0,new StringBuilder(),0);
		return new ArrayList<>(validExpressions);
	}
}
