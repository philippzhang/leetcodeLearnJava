package com.learn.java.algorithm.nolinear.tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ZigzagPrint {
	public static class Node{
		public int data;
		public Node left;
		public Node right;
		public Node(int data){
			this.data = data;
		}
	}

	//二叉树按层打印
	public static void layerPrint(Node head){
		if(head==null){
			return;
		}
		//运用队列
		Queue<Node> queue = new LinkedList();
		int level = 1;
		Node last = head; //当前行的最后节点
		Node nlast = null; //下一行的最后节点
		queue.offer(head);
		System.out.println("Level:"+(level++)+":");
		while(!queue.isEmpty()){
			head = queue.poll();
			System.out.print(head.data+" ");
			if(head.left!=null){
				queue.add(head.left);
				nlast = head.left;
			}
			if(head.right!=null){
				nlast = head.right;
			}
			if(head == last && !queue.isEmpty()){
				last = nlast;
			}
		}
		System.out.println();
	}

	public static void ZigzagPrint(Node head){
		if(head==null)
		{
			return;
		}
		Deque<Node> dq = new LinkedList();
		int level = 1;
		boolean lr = true;//记录打印的方向
		Node last = head; //当前行的最后节点
		Node nlast = null; //下一行的最后节点
		dq.offerFirst(head);
		printLevelAndOrientation(level++,lr);
		while(!dq.isEmpty()){
			if(lr){
				head = dq.pollFirst();
				if(head.left!=null){
					nlast = nlast==null?head.left:nlast;
					dq.offerLast(head.left);
				}
				if(head.right!=null){
					nlast = nlast==null?head.right:nlast;
					dq.offerLast(head.right);
				}
			}else{
				head = dq.pollLast();
				if(head.right!=null){
					nlast = nlast==null?head.right:nlast;
					dq.offerFirst(head.right);
				}
				if(head.left!=null){
					nlast = nlast==null?head.left:nlast;
					dq.offerFirst(head.left);
				}
			}
			System.out.print(head.data+" ");

			if(head == last && !dq.isEmpty()){
				lr = !lr;
				last = nlast;
				nlast = null;
				System.out.println();
				printLevelAndOrientation(level++,lr);
			}

			System.out.println();




		}
	}

	//显示打印的方向
	public static void printLevelAndOrientation(int level,boolean lr)
	{
		System.out.print("Level"+level+" from ");
		System.out.print(lr?"left to right ":"right to left: ");
	}


	public static void  main(String []args)
	{

		Node node=new Node(1);
		node.left=new Node(2);
		node.right=new Node(3);
		node.left.left=new Node(4);
		node.right.left=new Node(5);
		node.right.right=new Node(6);
		node.right.left.left=new Node(7);
		node.right.left.right=new Node(8);

		System.out.println("按照层遍历:");
		layerPrint(node);
		System.out.println("按照Zigzag遍历:");
		ZigzagPrint(node);


	}








}
