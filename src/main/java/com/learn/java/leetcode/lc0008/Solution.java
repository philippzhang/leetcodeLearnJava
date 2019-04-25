package com.learn.java.leetcode.lc0008;

public class Solution {
	public int myAtoi(String str) {
		if (str == null || str.length() <= 0) {
			return 0;
		}
		StringBuffer stringBuffer = new StringBuffer();
		boolean flag = false; //是否出现有效数字
		boolean sign = true; //符号
		boolean flagNo0 = false; //是否出现第一个非0
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!flag) {
				if (c == ' ') {

				} else if (c == '-') {
					sign = false;
					flag = true;
				} else if (c == '+') {
					flag = true;
				} else if (c >= '0' && c <= '9') {
					if (flagNo0 || c > '0') {
						flagNo0 = true;
						stringBuffer.append(c);
					}
					flag = true;
				} else {
					break;
				}
			} else if (c >= '0' && c <= '9') {
				if (flagNo0 || c > '0') {
					flagNo0 = true;
					stringBuffer.append(c);
				}
				flag = true;
			} else if (c < '0' || c > '9') {
				break;
			}
		}
		String numberStr = stringBuffer.toString();
		if (numberStr.length() == 0) {
			return 0;
		}

		if (numberStr.length() > 10) {
			if (sign) {
				return Integer.MAX_VALUE;
			} else {
				return Integer.MIN_VALUE;
			}
		}
		return atoi(numberStr, sign);

	}

	private int atoi(String str, boolean sign) {

		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			int ins = (str.charAt(i) - '0') * (sign ? 1 : -1);
			if (sign && result > Integer.MAX_VALUE / 10) {
				return Integer.MAX_VALUE;
			} else if (!sign && result < Integer.MIN_VALUE / 10) {
				return Integer.MIN_VALUE;
			}

			result *= 10;

			if (sign && result > Integer.MAX_VALUE - ins) {
				return Integer.MAX_VALUE;
			}
			if (!sign && result < Integer.MIN_VALUE - ins) {
				return Integer.MIN_VALUE;
			}
			result += ins;

		}
		return result;
	}
}
