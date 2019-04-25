package com.learn.java.leetcode.lc0043;

/**
 * 43. Multiply Strings 43. 字符串相乘 Medium
 */
public class Solution {
	public String multiply(String num1, String num2) {
		if (num1 == null || num1.trim().length() == 0 || num2 == null || num2.trim().length() == 0) {
			return "0";
		}
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}
		StringBuffer stringBuffer = new StringBuffer();
		int m = num1.length();
		int n = num2.length();
		int[] result = new int[m + n];
		for (int i = 0; i < m + n - 1; i++) {
			result[i] = 0;
		}
		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				result[i + j + 1] += mul;
			}
		}
		int carry = 0;
		for (int i = m + n - 1; i >= 0; i--) {
			int temp = (result[i] + carry) / 10;
			result[i] = (result[i] + carry) % 10;
			carry = temp;
		}
		boolean flag = false;
		for (int i = 0; i <= m + n - 1; i++) {
			if (flag || result[i] != 0) {
				flag = true;
				stringBuffer.append(result[i]);
			}
		}

		return stringBuffer.toString();

	}

	/**
	 * `num1[i] * num2[j]` will be placed at indices `[i + j`, `i + j + 1]
	 *
	 * @param num1
	 * @param num2
	 * @return
	 */
	public String multiply2(String num1, String num2) {
		if (num1 == null || num1.trim().length() == 0 || num2 == null || num2.trim().length() == 0) {
			return "0";
		}
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}
		int m = num1.length(), n = num2.length();
		int[] pos = new int[m + n];
		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int p1 = i + j, p2 = i + j + 1;
				int sum = mul + pos[p2];
				pos[p1] += sum / 10;
				pos[p2] = (sum) % 10;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int p : pos) {
			if (!(sb.length() == 0 && p == 0)) {
				sb.append(p);
			}
		}
		return sb.length() == 0 ? "0" : sb.toString();
	}
}
