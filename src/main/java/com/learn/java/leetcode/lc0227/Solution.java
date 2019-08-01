package com.learn.java.leetcode.lc0227;

import java.util.Stack;

public class Solution {
	public int calculate(String s) {
		//求后缀：当其优先级高于栈顶元素，直接入栈。否则从栈顶依次弹出比当前处理的运算符优先级高和优先级相等的运算符，然后才入栈。
		Stack<Integer> stack=new Stack<>();
		StringBuffer center=last(s);
		//计算
		StringBuffer num=new StringBuffer();
		for (int i = 0; i < center.length(); i++) {
			char c = center.charAt(i);
			if(c>='0' && c<='9'){
				num.append(c);
			}else{
				if(num.length()>0)
				{
					stack.push(Integer.parseInt(num.toString()));//构成一个完整的数，然后进站
					num.setLength(0);//清空，用于计算下一个数字
				}
				if(c!=' '){
					int b=stack.pop();
					int a=stack.pop();
					switch (c){
						case '*':
							stack.push(a*b);
							break;
						case  '/':
							stack.push(a/b);
							break;
						case  '+':
							stack.push(a+b);
							break;
						case  '-':
							stack.push(a-b);
							break;
					}
				}
			}
		}
		if(num.length()>0) {
			return Integer.parseInt(num.toString());
		} else {
			return stack.pop();
		}
	}

	/**
	 * 求后缀表达式
	 * @param s
	 * @return
	 */
	private StringBuffer last(String s){
		Stack<Character>stack1=new Stack<>();
		StringBuffer center = new StringBuffer();
		//先计算后缀表达式
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(c>='0' && c<='9') {
				center.append(c);//数字
			} else if(c=='+'||c=='-'){
				center.append(' ');//为了区分出字符串中的一个完整数字
				while (!stack1.isEmpty()){
					center.append(stack1.pop());
				}
				stack1.push(c);//弹出后需要将自己入栈
			}
			else if(c=='*'||c=='/'){
				center.append(' ');
				while (!stack1.isEmpty()){
					if(stack1.peek() == '*' || stack1.peek() == '/') {
						center.append(stack1.pop());
					} else {
						break;
					}
				}
				stack1.push(c);//当优先级高于栈顶元素，直接入栈，其他情况弹出
			}
		}
		//最后将栈内的都弹出
		while (!stack1.isEmpty()){
			center.append(stack1.pop());
		}
		return center;
	}
}
