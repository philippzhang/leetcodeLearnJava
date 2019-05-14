package com.learn.java.leetcode.lc0051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	final int[] dx = {-1,1,0,0,-1,-1,1,1};
	final int[] dy = {0,0,-1,1,-1,1,-1,1};
	public List<List<String>> solveNQueens2(int n) {
		//最终结果
		List<List<String>> result = new ArrayList<>();
		//标签棋盘是否可以放置皇后的二位数组
		//List<List<Integer>> mark = new ArrayList<>();
		int [][] mark = new int [n][n];
		//存储某个摆放结果
		//List<List<Character>> location = new ArrayList<>();

		char[][] location = new char[n][n];
		for(int i =0;i<n;i++){
			for(int j=0;j<n;j++){
				mark[i][j] = 0;
				location[i][j] = '.';
			}
		}
		generate( 0 ,n,location,result, mark);
		return result;
	}

	/**
	 *
	 * @param k 代表第几个皇后
	 * @param n
	 * @param location 某次结果存储在location中
	 * @param result 最终结果
	 * @param mark 棋盘的标记
	 */
	private void generate(int k ,int n,char[][]location,List<List<String>> result,int [][] mark){
		if(k==n){
			List<String> ret = new ArrayList<>();
			for(int i =0 ;i<n;i++){
				StringBuffer stringBuffer = new StringBuffer();
				for(int j =0 ;j<n;j++){
					stringBuffer.append(location[i][j]);
				}
				ret.add(stringBuffer.toString());
			}
			result.add(ret);
			return;
		}
		for(int i = 0;i<n;i++){
			if(mark[k][i]==0){
				int[][] tmp_mark = new int[n][n];
				for(int j = 0;j < mark.length;j++) {
					tmp_mark[j] = Arrays.copyOf(mark[j], mark[j].length);
				}
				location[k][i] = 'Q';
				putDownTheQueue(k,i,mark);
				generate(k+1,n,location,result,mark);
				//回溯
				mark = tmp_mark;
				location[k][i] = '.';
			}
		}
	}

	private void putDownTheQueue(int x, int y, int [][] mark){
		mark[x][y]=1;
		for (int i =1;i<mark.length;i++){
			for (int j =0;j<dx.length;j++){
				int new_x = x+i*dx[j];
				int new_y = y+i*dy[j];
				if(new_x>=0&&new_x<mark.length&&new_y>=0&&new_y<mark.length){
					mark[new_x][new_y]=1;
				}
			}
		}
	}

	public List<List<String>> solveNQueens(int n) {
		List<List<String>> res = new ArrayList<List<String>>();
		if(n<=0){
			return res;
		}
		helper(n, 0, new int[n], res);
		return res;
	}
	private void helper(int n, int cur, int [] row, List<List<String>> res){
		//cur stands for current position of row
		//这里表示这一条已经加到头了
		if(cur == n){
			List<String> item = new ArrayList<String>();
			for(int i = 0; i<row.length; i++){
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j<row.length; j++){
					if(row[i] != j){
						sb.append('.');
					}else{
						sb.append('Q');
					}
				}
				item.add(sb.toString());
			}
			res.add(item);
			return;
		}

		//没到头时就从0到n挨个试着加入row
		for(int i = 0; i<n; i++){
			row[cur] = i;
			//检查到目前的cur位置时, row是否合法
			if(isValid(cur, row)){
				helper(n, cur+1, row, res);
			}
		}
	}

	private boolean isValid(int cur, int [] row){
		for(int i = 0; i<cur; i++){
			if(row[i] == row[cur] || Math.abs(row[cur] - row[i]) == cur-i){
				return false;
			}
		}
		return true;
	}
}
