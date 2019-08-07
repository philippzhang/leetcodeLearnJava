package com.learn.java.leetcode.lc0282;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> addOperators(String num, int target) {
		List<String> results = new ArrayList<>();
		if(num.length()==0){
			return results;
		}

		helper(num,target,results,0,0,0,0,new ArrayList<>());
		return results;

	}

	private void helper(String num, long target,List<String> results,int index,long previousOperand,long currentOperand, long value,List<String> ops){
		if(index ==num.length()){
			if(value == target && currentOperand==0){
				StringBuilder sb = new StringBuilder();
				ops.subList(1,ops.size()).forEach(v->sb.append(v));
				results.add(sb.toString());
			}

			return;
		}

		currentOperand = currentOperand*10+Character.getNumericValue(num.charAt(index));
		String currentValue = Long.toString(currentOperand);


		if(currentOperand>0){
			//不加操作符
			helper(num,target,results,index+1,previousOperand,currentOperand,value,ops);
		}

		ops.add("+");
		ops.add(currentValue);
		helper(num,target,results,index+1,currentOperand,0,value+currentOperand,ops);
		ops.remove(ops.size()-1);
		ops.remove(ops.size()-1);

		if(ops.size()>0){
			ops.add("-");
			ops.add(currentValue);
			helper(num,target,results,index+1,-currentOperand,0,value-currentOperand,ops);
			ops.remove(ops.size()-1);
			ops.remove(ops.size()-1);

			ops.add("*");
			ops.add(currentValue);
			helper(num,target,results,index+1,previousOperand*currentOperand,0,value-previousOperand+previousOperand*currentOperand,ops);
			ops.remove(ops.size()-1);
			ops.remove(ops.size()-1);
		}

	}
}
