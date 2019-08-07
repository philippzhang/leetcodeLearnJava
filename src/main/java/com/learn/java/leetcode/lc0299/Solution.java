package com.learn.java.leetcode.lc0299;

public class Solution {
	public String getHint(String secret, String guess) {
		int bulls = 0,cows = 0;
		int[] dict= new int[10];

		for(int i =0;i<secret.length();i++){
			dict[secret.charAt(i)-'0']++;
		}

		for(int i =0;i<guess.length();i++){
			if(guess.charAt(i)==secret.charAt(i)){
				bulls++;
				dict[guess.charAt(i)-'0']--;
				if(dict[guess.charAt(i)-'0']<0){
					cows--;
				}
			}else if(dict[guess.charAt(i)-'0']>0){
				cows++;
				dict[guess.charAt(i)-'0']--;
			}
		}

		return bulls+"A"+cows+"B";
	}
}
