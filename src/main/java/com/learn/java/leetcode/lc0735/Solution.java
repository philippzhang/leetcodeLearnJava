package com.learn.java.leetcode.lc0735;

import java.util.Stack;

public class Solution {
	public int[] asteroidCollision(int[] asteroids) {
		Stack<Integer> stack = new Stack();
		for(int i =0;i<asteroids.length;i++){
			if(stack.empty()){
				stack.push(asteroids[i]);
			}else {
				boolean flag =false;
				int right = asteroids[i];
				while (!stack.isEmpty()) {
					flag = false;
					int left = stack.peek();
					if(left*right>0){
						stack.push(right);
						break;
					}else if(left<0&&right>0){
						stack.push(right);
						break;
					}else{
						if(Math.abs(left)==Math.abs(right)){
							stack.pop();
							break;
						}else if(Math.abs(left)>Math.abs(right)){
							break;
						}else if(Math.abs(left)<Math.abs(right)){
							stack.pop();
							flag = true;
						}
					}
				}
				if(flag){
					stack.push(right);
				}
			}
		}

		int[] results = new int[stack.size()];
		int i = results.length-1;
		while(!stack.isEmpty()){
			results[i--] = stack.pop();
		}
		return results;
	}
}
