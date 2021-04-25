package com.learn.java.leetcode.offer13;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	// 下、右
	int[][] pos = {{1,0},{0,1}};

	/**
	 * 广度优先搜索
	 * @param m
	 * @param n
	 * @param k
	 * @return
	 */
	public int movingCount(int m, int n, int k) {

		boolean[][] chk = new boolean[m][n];
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{0,0});
		chk[0][0] = true;
		int ans = 1;
		while(!queue.isEmpty()){
			int[] temp = queue.poll();
			for(int i =0;i<2;i++){
				int x = temp[0]+pos[i][0];
				int y = temp[1]+pos[i][1];

				if(x>=m||y>=n||chk[x][y]||cal(x)+cal(y)>k){
					continue;
				}

				queue.offer(new int[]{x,y});
				chk[x][y] = true;
				 ans ++;

			}

		}

		return ans;
	}
	private int cal(int x){
		int ans = 0;
		while(x>0){
			ans += x%10;
			x/=10;
		}
		return ans;
	}

	/**
	 * 动态规划
	 * 定义 vis[i][j] 为 (i, j) 坐标是否可达，如果可达返回 1，否则返回 0。
	 *
	 * 首先 (i, j) 本身需要可以进入，因此需要先判断 i 和 j 的数位之和是否大于 k ，如果大于的话直接设置 vis[i][j] 为不可达即可。
	 *
	 * 否则，前面提到搜索方向只需朝下或朝右，因此 (i, j) 的格子只会从 (i - 1, j) 或者 (i, j - 1) 两个格子走过来（不考虑边界条件），
	 * 那么 vis[i][j] 是否可达的状态则可由如下公式计算得到：
	 *
	 * vis[i][j] = vis[i-1][j] or vis[i][j-1]
	 * @param m
	 * @param n
	 * @param k
	 * @return
	 */
	public int movingCount2(int m, int n, int k) {
		boolean[][] chk = new boolean[m][n];
		chk[0][0] = true;
		int ans = 1;
		for(int i =0;i<m;i++){
			for(int j =0;j<n;j++ ){
				if (i == 0 && j == 0 || cal(i) + cal(j)>k) {
					continue;
				}
				if (j - 1 >= 0) {
					chk[i][j]|=chk[i][j-1];
				}
				if (i - 1 >= 0) {
					chk[i][j]|=chk[i-1][j];
				}

				ans += chk[i][j]?1:0;
			}
		}
		return ans;
	}
}
