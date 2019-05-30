package com.learn.java.leetcode.lc0006;


import java.util.ArrayList;
import java.util.List;

public class Solution {
	public String convert(String s, int numRows) {
		if (numRows <= 1) {
			return s;
		}

		//计算列
		int numCols = 0;
		if(numRows==2){
			numCols = s.length() / numRows + (s.length() % numRows == 0 ? 0 : 1);
		}else{
			int len = s.length();
			//true向下，false向斜
			boolean flag = true;
			int len1 = numRows-2;
			int i = 0;
			while(len>0){
				if(flag){
					len-=numRows;
					numCols++;
					flag = false;
					i = 0;
				}else{
					len-=1;
					numCols++;
					i++;
					if(i==len1){
						flag =true;
					}
				}
			}
		}


		int[][] matrix = new int[numRows][numCols];
		int col = 0, row = 0;
		//true向下，false向斜
		boolean flag = true;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			matrix[row][col] = c;
			if (flag) {
				row++;
				if (row == numRows) {
					row = numRows-2;
					col++;
					if(row>0){
						flag = false;
					}
				}
			}else{
				row--;
				col++;
				if(row==0){
					flag=true;
				}
			}
		}

		StringBuffer stringBuffer = new StringBuffer();

		for(int i = 0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				int n = matrix[i][j];
				if(n>0){
					stringBuffer.append((char)n);
				}
			}
		}

		return stringBuffer.toString();
	}


	public String convert2(String s, int numRows) {
		if(numRows<=1) {
			return s;
		}
		List<List<Character>> list=new ArrayList<>();
		StringBuilder SB=new StringBuilder();
		int index=0;
		boolean flag=true;
		for(int i=0;i<numRows;i++)
		{
			list.add(new ArrayList());
		}
		for(char c:s.toCharArray())
		{
			list.get(index).add(c);
			if(index==0) {
				flag=true;
			}
			if(index==numRows-1) {
				flag=false;
			}
			if(flag) {
				index++;
			} else {
				index--;
			}
		}
		for(List<Character> x:list)
		{
			for(char y:x) {
				SB.append(y);
			}
		}
		return SB.toString();

	}
}
