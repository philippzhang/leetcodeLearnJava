package com.learn.java.leetcode.offer20;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean isNumber(String s) {
		if(s==null||s.length()==0)
		{
			return false;
		}
		char[] chars = s.toCharArray();
		boolean exists_double = false;
		boolean exists_e = false;
		boolean exists_number =false;

		int start = 0;
		while(start<=chars.length-1&&chars[start]==' '){
			start++;
		}
		int end = chars.length-1;
		while(end>=0&&chars[end]==' '){
			end --;
		}
		if(start>end){
			return false;
		}
		if(chars[start]!='.'&&chars[start]!='+'&&chars[start]!='-' &&(chars[start]<'0'||chars[start]>'9')){
			return false;
		}
		if(start<end && (chars[start]=='.'||chars[start]=='+'||chars[start]=='-')){
			if(chars[start]=='.') {
				exists_double = true;
			}
			start++;
		}


		if(start<end && (chars[end]=='.')){
			if(exists_double){
				return false;
			}
		}
		else if((chars[end]<'0'||chars[end]>'9')){
			return false;
		}

		for(int i = start;i<=end;i++){
			if(chars[i]=='e'||chars[i]=='E'){
				if(i==chars.length-1){
					return false;
				}
				exists_e = true;
				start = i+1;
				break;
			}
			if(chars[i]=='.'){
				if(!exists_double){
					exists_double = true;
					continue;
				}else{
					return false;
				}

			}
			if(chars[i]<'0'||chars[i]>'9'){
				return false;
			}else{
				exists_number = true;
			}
		}


		if(exists_e){

			if(start<end && (chars[start]=='+'||chars[start]=='-')){
				start++;
			}

			for(int i = start;i<=end;i++){
				if(chars[i]<'0'||chars[i]>'9'){
					return false;
				}
			}
		}

		return exists_number;
	}

	/**
	 * 采用有限状态机
	 * @param s
	 * @return
	 */
	public boolean isNumber2(String s) {
		Map<State, Map<CharType, State>> transfer = new HashMap<State, Map<CharType, State>>();
		Map<CharType, State> initialMap = new HashMap<CharType, State>() {{
			put(CharType.CHAR_SPACE, State.STATE_INITIAL);
			put(CharType.CHAR_NUMBER, State.STATE_INTEGER);
			put(CharType.CHAR_POINT, State.STATE_POINT_WITHOUT_INT);
			put(CharType.CHAR_SIGN, State.STATE_INT_SIGN);
		}};
		transfer.put(State.STATE_INITIAL, initialMap);
		Map<CharType, State> intSignMap = new HashMap<CharType, State>() {{
			put(CharType.CHAR_NUMBER, State.STATE_INTEGER);
			put(CharType.CHAR_POINT, State.STATE_POINT_WITHOUT_INT);
		}};
		transfer.put(State.STATE_INT_SIGN, intSignMap);
		Map<CharType, State> integerMap = new HashMap<CharType, State>() {{
			put(CharType.CHAR_NUMBER, State.STATE_INTEGER);
			put(CharType.CHAR_EXP, State.STATE_EXP);
			put(CharType.CHAR_POINT, State.STATE_POINT);
			put(CharType.CHAR_SPACE, State.STATE_END);
		}};
		transfer.put(State.STATE_INTEGER, integerMap);
		Map<CharType, State> pointMap = new HashMap<CharType, State>() {{
			put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
			put(CharType.CHAR_EXP, State.STATE_EXP);
			put(CharType.CHAR_SPACE, State.STATE_END);
		}};
		transfer.put(State.STATE_POINT, pointMap);
		Map<CharType, State> pointWithoutIntMap = new HashMap<CharType, State>() {{
			put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
		}};
		transfer.put(State.STATE_POINT_WITHOUT_INT, pointWithoutIntMap);
		Map<CharType, State> fractionMap = new HashMap<CharType, State>() {{
			put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
			put(CharType.CHAR_EXP, State.STATE_EXP);
			put(CharType.CHAR_SPACE, State.STATE_END);
		}};
		transfer.put(State.STATE_FRACTION, fractionMap);
		Map<CharType, State> expMap = new HashMap<CharType, State>() {{
			put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
			put(CharType.CHAR_SIGN, State.STATE_EXP_SIGN);
		}};
		transfer.put(State.STATE_EXP, expMap);
		Map<CharType, State> expSignMap = new HashMap<CharType, State>() {{
			put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
		}};
		transfer.put(State.STATE_EXP_SIGN, expSignMap);
		Map<CharType, State> expNumberMap = new HashMap<CharType, State>() {{
			put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
			put(CharType.CHAR_SPACE, State.STATE_END);
		}};
		transfer.put(State.STATE_EXP_NUMBER, expNumberMap);
		Map<CharType, State> endMap = new HashMap<CharType, State>() {{
			put(CharType.CHAR_SPACE, State.STATE_END);
		}};
		transfer.put(State.STATE_END, endMap);

		int length = s.length();
		State state = State.STATE_INITIAL;

		for (int i = 0; i < length; i++) {
			CharType type = toCharType(s.charAt(i));
			if (!transfer.get(state).containsKey(type)) {
				return false;
			} else {
				state = transfer.get(state).get(type);
			}
		}
		return state == State.STATE_INTEGER || state == State.STATE_POINT || state == State.STATE_FRACTION || state == State.STATE_EXP_NUMBER || state == State.STATE_END;
	}

	public CharType toCharType(char ch) {
		if (ch >= '0' && ch <= '9') {
			return CharType.CHAR_NUMBER;
		} else if (ch == 'e' || ch == 'E') {
			return CharType.CHAR_EXP;
		} else if (ch == '.') {
			return CharType.CHAR_POINT;
		} else if (ch == '+' || ch == '-') {
			return CharType.CHAR_SIGN;
		} else if (ch == ' ') {
			return CharType.CHAR_SPACE;
		} else {
			return CharType.CHAR_ILLEGAL;
		}
	}



	enum State {
		STATE_INITIAL, //起始的空格
		STATE_INT_SIGN, //符号位
		STATE_INTEGER, //整数部分
		STATE_POINT, //左侧有整数的小数点
		STATE_POINT_WITHOUT_INT,//左侧无整数的小数点（根据前面的第二条额外规则，需要对左侧有无整数的两种小数点做区分）
		STATE_FRACTION, //小数部分
		STATE_EXP, //字符e
		STATE_EXP_SIGN, //指数部分的符号位
		STATE_EXP_NUMBER, //指数部分的整数部分
		STATE_END, //末尾的空格
	}

	enum CharType {
		CHAR_NUMBER,
		CHAR_EXP,
		CHAR_POINT,
		CHAR_SIGN,
		CHAR_SPACE,
		CHAR_ILLEGAL,
	}

}
