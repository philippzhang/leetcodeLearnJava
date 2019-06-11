package com.learn.java.leetcode.lc0315;


import java.util.*;

public class Solution {

	/**
	 * 归并排序
	 * @param nums
	 * @return
	 */
	public List<Integer> countSmaller(int[] nums) {
		int[] counts = new int[nums.length];
		List<Map.Entry<Integer,Integer>> list = new ArrayList<>();
		for(int i =0;i<nums.length;i++){
			list.add(new AbstractMap.SimpleEntry<>(nums[i],i));
			counts[i]=0;
		}
		mergeSort(counts,list);
		List<Integer> results = new ArrayList<>();
		for(int i =0;i<counts.length;i++){
			results.add(counts[i]);
		}
		return results;
	}

	private void mergeSort(int[] counts,List<Map.Entry<Integer,Integer>> list){
		if(list.size()<2){
			return ;
		}
		int mid = list.size()/2;
		List<Map.Entry<Integer,Integer>> list1 = new ArrayList<>();
		List<Map.Entry<Integer,Integer>> list2 = new ArrayList<>();
		for(int i = 0;i<mid;i++){
			list1.add(list.get(i));
		}
		for(int i = mid;i<list.size();i++){
			list2.add(list.get(i));
		}
		mergeSort(counts,list1);
		mergeSort(counts,list2);
		list.clear();
		mergeTwoList(list1,list2,list,counts);
	}

	private void mergeTwoList(List<Map.Entry<Integer,Integer>> list1,List<Map.Entry<Integer,Integer>> list2,List<Map.Entry<Integer,Integer>> list,int[] counts){
		int i =0;
		int j =0;
		while(i<list1.size()&&j<list2.size()){
			if(list1.get(i).getKey()<=list2.get(j).getKey()){
				counts[list1.get(i).getValue()]+=j;
				list.add(list1.get(i));
				i++;
			}else{
				list.add(list2.get(j));
				j++;
			}
		}
		for(;i<list1.size();i++){
			counts[list1.get(i).getValue()]+=j;
			list.add(list1.get(i));
		}
		for(;j<list2.size();j++){
			list.add(list2.get(j));
		}
	}


	class BSTNode{
		int val;
		int count;
		BSTNode left;
		BSTNode right;
		BSTNode(int val){
			this.val =val;
			this.count =0;
		}
	}

	public void bstInsert(BSTNode node,BSTNode insertNode,int[] countSmall){
		if(insertNode.val<=node.val){
			node.count++;
			if(node.left!=null){
				bstInsert(node.left,insertNode,countSmall);
			}else{
				node.left=insertNode;
			}
		}else{
			countSmall[0]+=node.count+1;
			if(node.right!=null){
				bstInsert(node.right,insertNode,countSmall);
			}else{
				node.right=insertNode;
			}
		}
	}

	/**
	 * 二叉搜索树算法
	 * @param nums
	 * @return
	 */
	public List<Integer> countSmaller2(int[] nums) {
		List<Integer> results = new ArrayList<>();
		if(nums==null||nums.length==0){
			return results;
		}
		List<BSTNode> treeNodeList = new ArrayList<>();
		List<Integer> counts = new ArrayList<>();
		int[] countSmall = {0};
		//翻转nums
		for(int i= nums.length-1;i>=0;i--){
			treeNodeList.add(new BSTNode(nums[i]));
		}

		counts.add(0);

		for(int i = 1;i<treeNodeList.size();i++){
			countSmall[0]=0;
			bstInsert(treeNodeList.get(0),treeNodeList.get(i),countSmall);
			counts.add(countSmall[0]);
		}

		//翻转nums
		for(int i= counts.size()-1;i>=0;i--){
			results.add(counts.get(i));
		}

		return results;
	}

	class Discreate{
		int num;
		int disNum;
		int id;

		public Discreate(int num, int disNum, int id) {
			this.num = num;
			this.disNum = disNum;
			this.id = id;
		}
	}

	/**
	 * 离散化
	 * @param nums
	 * @param disNumList
	 */
	private void discreateNumber(int[] nums,List<Integer> disNumList){
		List<Discreate> temp = new ArrayList<>();
		for(int i =0;i<nums.length;i++){
			temp.add(new Discreate(nums[i],0,i));
		}
		Collections.sort(temp, Comparator.comparingInt(o -> o.num));
		temp.get(0).disNum = 1;
		for(int i =1;i<temp.size();i++){
			if(temp.get(i).num == temp.get(i-1).num){
				temp.get(i).disNum = temp.get(i-1).disNum;
			}else {
				temp.get(i).disNum = temp.get(i-1).disNum+1;
			}
		}
		Collections.sort(temp, Comparator.comparingInt(o -> o.id));
		for(int i =0;i<temp.size();i++){
			disNumList.add(temp.get(i).disNum);
		}
	}

	private void segmentTreeSearch(List<Integer> tree,int num,int pos,int left,int right,int[] countSmall){
		tree.set(pos,tree.get(pos)+1);
		if(left==right&&left==num){
			return ;
		}
		int mid = (left+right)/2;
		int leftChild = pos*2+1;
		int rightChild = pos*2+2;
		if(num<=mid){
			segmentTreeSearch(tree,num,leftChild,left,mid,countSmall);
		}else{
			countSmall[0]+=tree.get(leftChild);
			segmentTreeSearch(tree,num,rightChild,mid+1,right,countSmall);
		}
	}

	/**
	 * 线段树实现
	 * @param nums
	 * @return
	 */
	public List<Integer> countSmaller3(int[] nums) {
		List<Integer> result = new ArrayList<>();

		if(nums == null||nums.length==0){
			return result;
		}
		List<Integer> tree = new ArrayList<>();

		List<Integer> count = new ArrayList<>();
		List<Integer> disNumList = new ArrayList<>();

		discreateNumber(nums,disNumList);
		for(int i = 0;i<4*disNumList.size();i++){
			tree.add(0);
		}
		/**
		 * 逆序进入线段树
		 */
		for(int i =disNumList.size()-1;i>=0;i--){
			int[] countSmall = new int[1];
			segmentTreeSearch(tree,disNumList.get(i),0,1,disNumList.size(), countSmall);
			count.add(countSmall[0]);
		}
		//逆序输出
		for(int i = count.size()-1;i>=0;i--){
			result.add(count.get(i));
		}
		return result;
	}
}
