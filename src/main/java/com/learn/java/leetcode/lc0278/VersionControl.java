package com.learn.java.leetcode.lc0278;

public class VersionControl {
	int version;
	public void setVersion(int version){
		this.version =version;
	}
	boolean isBadVersion(int version){
		if(version<this.version){
			return false;
		}else {
			return true;
		}
	}
}
