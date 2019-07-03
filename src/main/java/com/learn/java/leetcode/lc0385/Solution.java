package com.learn.java.leetcode.lc0385;


import com.learn.java.leetcode.base.structure.NestedInteger;

public class Solution {
	/**
	 *        java solution 递归构造嵌套列表
	 *        递归终止条件： 这个字符串是一个数，无 "[", "]"
	 *        遍历字符串过程中利用栈记录能否划分出一个新的列表
	 *        即遇到 "[" 则入栈，遇到 "]"则出栈
	 *        cnt 记录 "[" 数量
	 *        当cnt == 0，我们可以从index（起始点）到该位置获取一个
	 *        一个新的嵌套列表string，并递归调用deseriable解析它
	 *
	 */
	public NestedInteger deserialize(String s) {
		if (s.charAt(0) != '[') {
			return new NestedInteger(Integer.parseInt(s));
		} else {
			NestedInteger result = new NestedInteger();
			int index = -1, cnt = 0;
			for (int i = 1; i < s.length() - 1; ++i) {
				char ch = s.charAt(i);
				if (ch == '[') {
					if (index == -1) {
						index = i;
					}
					cnt++;
				} else if (ch == ']') {
					cnt--;
				} else if (ch == ',') {
					if (cnt > 0) {
						continue;
					}
					result.add(deserialize(s.substring(index, i)));
					index = -1;
				} else {
					if (index == -1) {
						index = i;
					}
				}
			}
			if (index != -1) {
				result.add(deserialize(s.substring(index, s.length()-1)));
			}
			return result;
		}
	}
}
