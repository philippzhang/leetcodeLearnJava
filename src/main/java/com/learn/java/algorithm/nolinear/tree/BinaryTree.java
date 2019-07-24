package com.learn.java.algorithm.nolinear.tree;

import com.learn.java.algorithm.linear.queue.IQueue;
import com.learn.java.algorithm.linear.queue.LinkQueue;
import com.learn.java.algorithm.linear.stack.IStack;
import com.learn.java.algorithm.linear.stack.LinkStack;
import com.learn.java.algorithm.nolinear.node.BinaryTreeNode;


/**
 * 二叉树的链式存储结构
 */
public class BinaryTree<T> implements Tree{
	//根节点
	private BinaryTreeNode root;

	public BinaryTree(BinaryTreeNode root) {
		this.root = root;
	}

	public BinaryTreeNode getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode root) {
		this.root = root;
	}

	public BinaryTree() {
	}


	/**
	 * 查找结点
	 * @param key
	 * @return
	 */
	public BinaryTreeNode search(Object key) {
		return search(root,key);
	}
	private BinaryTreeNode search(BinaryTreeNode current,Object key) {
		if(current!=null){
			if(current.getData().equals(key)){
				return current;
			}
			BinaryTreeNode obj = search(current.getLchild(),key);
			if(obj!=null){
				return obj;
			}else{
				return search(current.getRchild(),key);
			}
		}
		return null;
	}



	/**
	 * 前序遍历:根节点——》左子树——》右子树
	 */
	@Override
	public void preOrder(){
		preOrder(root);
	}
	private void preOrder(BinaryTreeNode current){
		if(current!=null){
			System.out.print(current.getData());
			preOrder(current.getLchild());
			preOrder(current.getRchild());
		}
	}

	/**
	 * 中序遍历:左子树——》根节点——》右子树
	 */
	@Override
	public void inOrder(){
		inOrder(root);
	}
	private void inOrder(BinaryTreeNode current){
		if(current!=null){
			inOrder(current.getLchild());
			System.out.print(current.getData());
			inOrder(current.getRchild());
		}
	}

	/**
	 * 后序遍历:左子树——》右子树——》根节点
	 */
	@Override
	public void postOrder(){
		postOrder(root);
	}
	private void postOrder(BinaryTreeNode current){
		if(current!=null){
			postOrder(current.getLchild());
			postOrder(current.getRchild());
			System.out.print(current.getData());
		}
	}

	/**
	 * 前序遍历（非递归）
	 */
	public void preOrder2() {
		preOrder2(root);
	}
	private void preOrder2(BinaryTreeNode current) {
		if (current != null) {
			IStack<BinaryTreeNode> stack = new LinkStack<>();
			while (current!=null || !stack.isEmpty()){
				while(current!=null){
					System.out.print(current.getData());
					stack.push(current);
					current = current.getLchild();
				}
				if(!stack.isEmpty()){
					current = stack.pop();
					current = current.getRchild();
				}
			}
		}
	}

	/**
	 * 中序遍历（非递归）
	 */
	public void inOrder2() {
		inOrder2(root);
	}
	private void inOrder2(BinaryTreeNode current){
		if (current != null) {
			IStack<BinaryTreeNode> stack = new LinkStack<>();
			while (current!=null || !stack.isEmpty()){
				while(current!=null){
					stack.push(current);
					current = current.getLchild();
				}
				if(!stack.isEmpty()){
					current = stack.pop();
					System.out.print(current.getData());
					current = current.getRchild();
				}
			}
		}
	}

	/**
	 * 后序遍历（非递归）
	 */
	public void postOrder2() {
		postOrder2(root);
	}
	private void postOrder2(BinaryTreeNode current){
		if (current != null) {
			IStack<BinaryTreeNode> stack = new LinkStack<>();
			BinaryTreeNode pre=null;
			stack.push(current);
			while (!stack.isEmpty()){
				current = stack.peek();
				if((current.getLchild() == null && current.getRchild() == null) || (pre != null && (current.getLchild() == pre || current.getRchild() == pre))){
					pre = stack.pop();
					System.out.print(pre.getData());
				}else {
					if(current.getRchild()!=null){
						stack.push(current.getRchild());
					}
					if(current.getLchild()!=null){
						stack.push(current.getLchild());
					}
				}

			}
		}
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	/**
	 * 层次遍历
	 */
	@Override
	public void levelOrder(){
		levelOrder(root);
	}
	private void levelOrder(BinaryTreeNode current){
		if(current!=null){
			IQueue<BinaryTreeNode> queue = new LinkQueue<>();
			queue.insert(current);
			while(!queue.isEmpty()){
				current = queue.poll();
				System.out.print(current.getData());
				if(current.getLchild()!=null){
					queue.insert(current.getLchild());
				}
				if(current.getRchild()!=null){
					queue.insert(current.getRchild());
				}
			}
		}
	}

	/**
	 * 返回结点个数
	 * @return
	 */
	public int countNode(){
		return countNode(root);
	}
	private int countNode(BinaryTreeNode current){
		if(current!=null){
			return countNode(current.getLchild())+countNode(current.getRchild())+1;
		}else {
			return 0;
		}
	}

	/**
	 * 返回树的高度
	 * @return
	 */
	@Override
	public int getDepth(){
		return getDepth(root);
	}
	private int getDepth(BinaryTreeNode current){
		if(current!=null){
			int lDepth = getDepth(current.getLchild());
			int rDepth = getDepth(current.getRchild());
			return (lDepth>rDepth?lDepth:rDepth)+1;
		}else {
			return 0;
		}
	}

	/**
	 * 相等算法
	 * 注意：传入参数为结点对象
	 */
	public boolean isEqual(BinaryTree T){
		return isEqual(root,T.getRoot());
	}
	private boolean isEqual(BinaryTreeNode root1, BinaryTreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 != null && root2 != null) {
			if (root1.getData().equals(root2.getData())) {
				if (isEqual(root1.getLchild(), root2.getLchild())) {
					if (isEqual(root1.getRchild(), root2.getRchild())) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * 使用树形结构显示
	 */
	public void displayTree(){
		if(root==null){
			return;
		}
		LinkStack<BinaryTreeNode> globalStack=new LinkStack();
		globalStack.push(root);
		int depth = getDepth();
		int nBlank=(int)Math.pow(2,depth+1);
		int ndot = nBlank*2;
		boolean isRowEmpty=false;
		for(int i =0;i<ndot;i++){
			System.out.print('.');
		}
		System.out.println();
		while (isRowEmpty==false){
			LinkStack<BinaryTreeNode> localStack=new LinkStack();
			isRowEmpty=true;
			for (int j=0;j<nBlank;j++)
			{
				System.out.print(" ");
			}
			while (!globalStack.isEmpty()){
				//里面的while循环用于查看全局的栈是否为空
				BinaryTreeNode temp=globalStack.pop();
				if (temp!=null){
					System.out.print(temp.getData());
					System.out.print(' ');
					localStack.push(temp.getLchild());
					localStack.push(temp.getRchild());
					//如果当前的节点下面还有子节点，则必须要进行下一层的循环
					if (temp.getLchild()!=null||temp.getRchild()!=null){
						isRowEmpty=false;
					}
				}else {
					//如果全局的栈则不为空
					System.out.print("# ");
					localStack.push(null);
					localStack.push(null);
				}
				//打印一些空格
				for (int j=0;j<nBlank*2-2;j++){
					System.out.print(" ");
				}
			}//while end
			System.out.println();
			nBlank/=2;
			//这个while循环用来判断，local栈是否为空,不为空的话，则取出来放入全局栈中
			while (!localStack.isEmpty()){
				globalStack.push(localStack.pop());
			}
		}//大while循环结束之后，输出换行
		for(int i =0;i<ndot;i++){
			System.out.print('.');
		}
		System.out.println();
	}

	public static void main(String[] args) {
		/*----------------------
					 A
				B		   C
			 D     E    F     G
			   H
		 -----------------------*/
		//创建一个二叉树(由叶子结点往上依次添加,最后是根结点)

		BinaryTreeNode<String> h = new BinaryTreeNode('H');
		BinaryTreeNode<String> d = new BinaryTreeNode('D',null,h);
		BinaryTreeNode<String> e = new BinaryTreeNode('E');
		BinaryTreeNode<String> b = new BinaryTreeNode('B', d, e);
		BinaryTreeNode<String> f = new BinaryTreeNode('F');
		BinaryTreeNode<String> g = new BinaryTreeNode('G');
		BinaryTreeNode<String> c = new BinaryTreeNode('C', f, g);
		BinaryTreeNode<String> a = new BinaryTreeNode('A', b, c);

		//构建树
		BinaryTree<String> tree = new BinaryTree(a);

		//获取根结点
		System.out.println("-----------------------------");

		//前序遍历
		System.out.print("前序遍历:");
		tree.preOrder();
		System.out.println();
		System.out.println("-----------------------------");

		//中序遍历
		System.out.print("中序遍历:");
		tree.inOrder();
		System.out.println();
		System.out.println("-----------------------------");

		//后序遍历
		System.out.print("后序遍历:");
		tree.postOrder();
		System.out.println();
		System.out.println("-----------------------------");

		//前序遍历
		System.out.print("前序遍历:");
		tree.preOrder2();
		System.out.println();
		System.out.println("-----------------------------");

		//中序遍历
		System.out.print("中序遍历:");
		tree.inOrder2();
		System.out.println();
		System.out.println("-----------------------------");

		//后序遍历
		System.out.print("后序遍历:");
		tree.postOrder2();
		System.out.println();
		System.out.println("-----------------------------");

		//层次遍历
		System.out.print("层次遍历:");
		tree.levelOrder();
		System.out.println();
		System.out.println("-----------------------------");

		System.out.print("树的高度:"+tree.getDepth());
		System.out.println();
		System.out.println("-----------------------------");

		System.out.print("结点个数:"+tree.countNode());
		System.out.println();
		System.out.println("-----------------------------");

		System.out.print("树的比较:"+tree.isEqual(tree));
		System.out.println();
		System.out.println("-----------------------------");

		tree.displayTree();
	}
}
