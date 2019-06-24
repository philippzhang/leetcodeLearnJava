package com.learn.java.leetcode.lc0071;

import java.util.Stack;

public class Solution {
	public String simplifyPath(String path) {
		if(path==null||path.length() ==0||path.equals("/")){
			return path;
		}

		Stack<String> stack = new Stack();
		StringBuffer word = new StringBuffer();
		path = path+"/";
		for(int i =0;i<path.length();i++){
			char c = path.charAt(i);
			if(c=='/'){
				if(word.length()>0){
					stack.push(word.reverse().toString());
					word.setLength(0);
				}
			}else if(c=='.'){
				if(i>0&&path.charAt(i-1)=='/'){
					if(i+1<path.length()&&path.charAt(i+1)=='/'){
						continue;
					}else if(i+1<path.length()&&path.charAt(i+1)=='.'){
						if(i+2<path.length()&&path.charAt(i+2)=='/'){
							if(!stack.isEmpty()) {
								stack.pop();
							}
							i++;
						}else{
							word.append(c);
						}
					}else{
						word.append(c);
					}
				}else{
					word.append(c);
				}
			}else{
				word.append(c);
			}
		}


		if(stack.isEmpty()){
			return "/";
		}else{
			while(!stack.isEmpty()){
				word.append(stack.pop()).append("/");
			}
			return word.reverse().toString();
		}



	}
}
