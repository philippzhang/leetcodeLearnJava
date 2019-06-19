package com.learn.java.leetcode.lc0065;

public class Solution {
	/**
	 * 定义状态
	 */
	enum STATE{
		BEGIN_STATE,
		NUMBER_STATE,
		OPERATION_STATE,
		POINT_STATE,
		EXPONENT_STATE,
		EXPONENT_NUMBER_STATE,
		EXPONENT_OPERATION_STATE,
		END_STATE
	}

	public boolean isNumber(String s) {
		if (s == null || s.length() == 0) {
			return false;
		}
		s = s+" ";
		STATE state = STATE.BEGIN_STATE;

		boolean existPoint = false;
		boolean existExponent = false;
		boolean existNumber = false;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (state) {
				case BEGIN_STATE: {
					if (c == ' '|| c==160) {

					} else if (c >= '0' && c <= '9') {
						state = STATE.NUMBER_STATE;
					} else if (c == '.') {
						if (existPoint) {
							return false;
						}
						state = STATE.POINT_STATE;
						existPoint = true;
					} else if (c == '-' || c == '+') {
						state = STATE.OPERATION_STATE;
					} else {
						return false;
					}
					break;
				}
				case OPERATION_STATE: {
					if (c >= '0' && c <= '9') {
						state = STATE.NUMBER_STATE;
					} else if (c == '.') {
						if (existPoint) {
							return false;
						}
						state = STATE.POINT_STATE;
						existPoint = true;
					}
					else {
						return false;
					}
					break;
				}
				case NUMBER_STATE: {
					existNumber = true;
					if (c >= '0' && c <= '9') {
						state = STATE.NUMBER_STATE;
					} else if (c == '.') {
						if (existPoint) {
							return false;
						}
						state = STATE.POINT_STATE;
						existPoint = true;
					} else if (c == 'e') {
						if (existExponent) {
							return false;
						}
						state = STATE.EXPONENT_STATE;
						existExponent = true;
					} else if (c == ' '|| c==160) {
						state = STATE.END_STATE;
					} else {
						return false;
					}
					break;
				}
				case POINT_STATE: {
					if (c >= '0' && c <= '9') {
						state = STATE.NUMBER_STATE;
					} else if (c == ' '|| c==160) {
						state = STATE.END_STATE;
					} else if (c == 'e') {
						if (existExponent) {
							return false;
						}
						state = STATE.EXPONENT_STATE;
						existExponent = true;
					} else {
						return false;
					}
					break;
				}
				case EXPONENT_STATE: {
					if (c >= '0' && c <= '9') {
						state = STATE.EXPONENT_NUMBER_STATE;
					} else if (c == '-'||c == '+') {
						state = STATE.EXPONENT_OPERATION_STATE;
					} else {
						return false;
					}
					break;
				}
				case EXPONENT_NUMBER_STATE: {
					if (c >= '0' && c <= '9') {
						state = STATE.EXPONENT_NUMBER_STATE;
					} else if (c == ' '|| c==160) {
						state = STATE.END_STATE;
					} else {
						return false;
					}
					break;
				}
				case EXPONENT_OPERATION_STATE: {
					if (c >= '0' && c <= '9') {
						state = STATE.EXPONENT_NUMBER_STATE;
					} else {
						return false;
					}
					break;
				}
				case END_STATE: {
					if (c == ' '|| c==160) {
						state = STATE.END_STATE;
					} else {
						return false;
					}
					break;
				}
			}



		}
		if(!existNumber){
			return false;
		}
		return true;
	}
}
