package com.learn.java.leetcode.lc0591;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
	public boolean isValid(String code) {
		Stack<String> stack = new Stack<>();
		Map<String,String> tagMap = new HashMap<>();
		//index为扫描下标
		int length = code.length(),index =0;
		while(index<length){
			if(code.charAt(index)=='<'){
				int tempIndex = index+1;
				if(code.charAt(tempIndex)=='!'){
					//第一种情况：遇到感叹号，检测<![CDATA[CDATA_CONTENT]]>
					tempIndex ++;
					if(tempIndex>=length||stack.isEmpty()){
						//"<![CDATA[wahaha]]]><![CDATA[]> wahaha]]>"这种没有被合法标签对包围
						return false;
					}
					if((tempIndex+"[CDATA[".length())<length) {
						String cdataStr = code.substring(tempIndex, tempIndex + "[CDATA[".length());
						if (!cdataStr.equals("[CDATA[")) {
							return false;
						}
						tempIndex += 7;
					}
					//寻找<![CDATA[CDATA_CONTENT]]>的尾端“]]>”
					while (tempIndex+"]]>".length() < length && !code.substring(tempIndex, tempIndex+"]]>".length()) .equals( "]]>")) {
						tempIndex += 1;
					}

					if (tempIndex == length || !code.substring(tempIndex, tempIndex+"]]>".length()) .equals( "]]>")) {
						return false;
					}
					tempIndex += 3;

				}else if(code.charAt(tempIndex)=='/'){
					//第二种情况：遇到反斜杠，检测闭标签
					String endTag = "</";
					tempIndex +=1;
					while(tempIndex<length&&code.charAt(tempIndex)!='>'){
						endTag +=code.charAt(tempIndex++);
					}
					//当栈为空，说明这个闭标签没有配对的起始标签，当tempIndex走到了尾端，说明这个闭标签没有'>'
					if(stack.isEmpty()||tempIndex == length){
						return false;
					}
					tempIndex += 1;
					endTag += '>';
					if(!tagMap.get(stack.peek()).equals(endTag)){
						return false;
					}
					//endTag标签与栈顶标签匹配成功
					stack.pop();

				}else {
					//第三种情况：否则当做起始标签来处理
					String startTag = "<";
					while (tempIndex < length && code.charAt(tempIndex) != '>') {
						if (code.charAt(tempIndex) < 'A' || code.charAt(tempIndex) > 'Z') {
							//<TAG_NAME>是起始标签, 仅含有大写字母
							return false;
						}
						startTag += code.charAt(tempIndex++);
					}
					startTag += '>';
					//起始标签没有找到'>',<TAG_NAME>是起始标签, TAG_NAME 长度在范围 [1,9] 之间
					//当再次遇到起始标签时dataStack.size() != 0，防止这种"<A></A><B></B>"，这个code没有被一个大标签包围
					if (tempIndex == length || (index != 0 && stack.isEmpty()) || startTag.length() < 3 || startTag.length() > 11) {
						return false;
					}
					tempIndex += 1;
					//放入栈中
					stack.push(startTag);
					//计算startTag的闭标签，放入map
					tagMap.put(startTag,( "</" + startTag.substring(1, 1+startTag.length() - 2) + ">"));

				}
				index = tempIndex;
			}else if(stack.isEmpty()){
				//第四种情况：防止这种情况"hed<DIV>This is the first line <![CDATA[<div>]]></DIV>"中的“hed”不在标签内的输入字符
				return false;
			}else {
				//第五种情况：跳过"<DIV>This is the first line <![CDATA[<div>]]></DIV>"中的“This is the”等内容，直到遇到了“<”
				while (index < length && code.charAt(index) != '<') {
					index += 1;
				}
			}
		}
		//最后扫描完成后，栈中的所有标签都应该匹配完
		return stack.size() == 0;
	}
}
