package com.learn.java.leetcode.offer14ii;

public class Solution {
	public int cuttingRope(int n) {
		if(n<=3){
			return n-1;
		}

		int b= n%3;
		int p = 1000000007;
		long res = 1;
		long x = 3;

		int a = n/3-1;
		while(a>0){
			if((a&1)==1){
				res =(res*x) % p;
			}
			x = (x*x) % p;
			a>>=1;
		}

		if(b==0){
			return (int)(res*3 % p);
		}else if(b==1){
			return (int)(res*4 % p);
		}else{
			return (int)(res*6 % p);
		}
	}

}
