package com.learn.java.leetcode.lc0224;

import java.util.Stack;

/**
 * 224. Basic Calculator 224. 基本计算器 Hard
 */
public class Solution {
	/**
	 * 定义状态
	 */
	enum STATE{
		BEGIN_STATE,
		NUMBER_STATE,
		OPERATION_STATE
	}

	/**
	 * 采用状态机
	 * @param s
	 * @return
	 */
	public int calculate(String s) {
		Stack<Integer> numberStack = new Stack();
		Stack<Character> operationStack = new Stack<>();
		int number = 0;
		STATE state = STATE.BEGIN_STATE;
		int compute_flag = 0;
		for(int i = 0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c==' '){
				continue;
			}
			switch (state){
				case BEGIN_STATE:
					if(c>='0'&&c<='9'){
						state = STATE.NUMBER_STATE;
					}else {
						state = STATE.OPERATION_STATE;
					}
					i--;
					break;
				case NUMBER_STATE:
					if(c>='0'&&c<='9'){
						number = number*10+(c-'0');
					}else {
						numberStack.push(number);
						if(compute_flag==1){
							compute(numberStack,operationStack);
						}
						number = 0;

						state = STATE.OPERATION_STATE;
						i--;
					}
					break;
				case OPERATION_STATE:
					if(c=='+'||c=='-'){
						operationStack.push(c);
						compute_flag = 1;
					}else if (c=='('){
						state = STATE.NUMBER_STATE;
						compute_flag = 0;
					}else if (c==')'){
						compute(numberStack,operationStack);
					}else if(c>='0'&&c<='9'){
						state = STATE.NUMBER_STATE;
						i--;
					}
					break;
			}
		}
		if(number!=0){
			numberStack.push(number);
			compute(numberStack,operationStack);
		}
		if(numberStack.isEmpty()){
			return 0;
		}
		return numberStack.pop();
	}

	private void compute(Stack<Integer> numberStack,Stack<Character> operationStack){

			if(operationStack.isEmpty()){
				//对于操作符已经为空时，退出计算
				return ;
			}
			Integer i1 = numberStack.pop();
			Integer i2 = numberStack.pop();
			Character o = operationStack.pop();
			if (o == '+') {
				numberStack.push((i2 + i1));
			} else if (o == '-') {
				numberStack.push((i2 - i1));
			}


	}


	//若为 '('，入栈；
	//若为 ')'，则依次把栈中的的运算符加入后缀表达式中，直到出现'('，从栈中删除'(' ；
	//若为 除括号外的其他运算符， 当其优先级高于除'('以外的栈顶运算符时，直接入栈。否则从栈顶开始，依次弹出比当前处理的运算符优先级高和优先级相等的运算符，直到一个比它优先级低的或者遇到了一个左括号为止，然后将其自身压入栈中（先出后入）。
	public int calculate2(String s) {
		//求后缀：当其优先级高于栈顶元素，直接入栈。否则从栈顶依次弹出比当前处理的运算符优先级高和优先级相等的运算符，然后才入栈。
		Stack<Integer>stack=new Stack<>();
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
					num.delete(0,num.length());//清空，用于计算下一个数字
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
					if(stack1.peek()!='(') {
						center.append(stack1.pop());
					} else {
						break;
					}
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
			}else if(c=='('){
				stack1.push(c);
			}else if(c==')'){
				while (!stack1.isEmpty() && stack1.peek() != '('){
					center.append(stack1.pop());
				}
				stack1.pop();//删除(
			}
		}
		//最后将栈内的都弹出
		while (!stack1.isEmpty()){
			center.append(stack1.pop());
		}
		return center;
	}
}
