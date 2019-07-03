package com.learn.java.leetcode.lc0394;

import java.util.Stack;
import java.util.regex.Pattern;

public class Solution {
	private static Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
	public String decodeString(String s) {
		Stack<String> stack = new Stack<>();
		if(s==null||s.length()==0){
			return "";
		}
		int digit =0;
		StringBuffer stringBuffer = new StringBuffer();
		for(int i =0;i<s.length();i++){
			char c = s.charAt(i);
			if(Character.isDigit(c)){
				digit = digit*10+(c-'0');
				if(stringBuffer.length()>0){
					if(!stack.isEmpty()&&!isInteger(stack.peek())){
						stack.push(stack.pop()+stringBuffer.toString());
					}else {
						stack.push(stringBuffer.toString());
					}

					stringBuffer.setLength(0);
				}
			}else if(c=='['){
				stack.push(String.valueOf(digit));
				digit = 0;
			}else if(Character.isLetter(c)){
				stringBuffer.append(c);
			}else if(c==']'){
				String temp  = null;
				if(stringBuffer.length()==0){
					if(!stack.isEmpty()){
						temp = stack.pop();
					}else{
						temp = "";
					}
				}else{
					temp = stringBuffer.toString();
				}
				stringBuffer.setLength(0);
				int d = 1;
				if(!stack.isEmpty()){
					if(isInteger(stack.peek())) {
						d = Integer.parseInt(stack.pop());
						for(int j =0;j<d;j++){
							stringBuffer.append(temp);
						}
					}else {
						temp = stack.pop()+temp;
						stringBuffer.setLength(0);
						if(!stack.isEmpty()){
							if(isInteger(stack.peek())) {
								d = Integer.parseInt(stack.pop());
								for(int j =0;j<d;j++){
									stringBuffer.append(temp);
								}
							}
						}
					}
				}


				if(!stack.isEmpty()&&!isInteger(stack.peek())){
					stack.push(stack.pop()+stringBuffer.toString());
				}else {
					stack.push(stringBuffer.toString());
				}
				stringBuffer.setLength(0);
			}
		}

		while(!stack.isEmpty()){
			stringBuffer.insert(0,stack.pop());
		}

		return stringBuffer.toString();
	}


	private  boolean isInteger(String str) {
		return pattern.matcher(str).matches();
	}
}
