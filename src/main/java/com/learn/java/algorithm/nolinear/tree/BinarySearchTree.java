package com.learn.java.algorithm.nolinear.tree;

import com.learn.java.algorithm.linear.stack.LinkStack;
import com.learn.java.algorithm.nolinear.node.BinaryKeyTreeNode;


public class BinarySearchTree<T extends Comparable<T>,E> implements Tree {

	private BinaryKeyTreeNode<T,E> root;

	/**
	 * 查找
	 * @param key
	 * @return
	 */
	public BinaryKeyTreeNode<T,E> search(T key) {
		BinaryKeyTreeNode<T,E> current = root;
		while(current!=null){
			if(current.getKey().compareTo(key)==0){
				return current;
			}else if(current.getKey().compareTo(key)>0){
				current = current.getLchild();
			}else if(current.getKey().compareTo(key)<0){
				current = current.getRchild();
			}
		}
		return null;
	}


	/**
	 * 插入
	 */
	public void insert(BinaryKeyTreeNode<T,E> node) {
		if(root==null){
			root = node;
		}else {
			BinaryKeyTreeNode<T,E> current = root;
			while(true){
				if(node.getKey().compareTo(current.getKey())<0){
					if(current.getLchild()==null){
						current.setLchild(node);
						return;
					}
					current = current.getLchild();
				}else{
					if(current.getRchild()==null){
						current.setRchild(node);
						return;
					}
					current = current.getRchild();
				}
			}

		}
	}

	/**
	 * 通过递归插入
	 * @param newNode
	 * @return
	 */
	public boolean insertBST(BinaryKeyTreeNode<T,E> newNode) {
		if (newNode == null) {
			return false;						//插入失败
		}
		if (root == null) {
			//树为空，直接插入
			root = newNode;
			return true;
		}
		return insertBST(root, newNode);
	}

	public boolean insertBST(BinaryKeyTreeNode<T,E> currentNode,BinaryKeyTreeNode<T,E> newNode) {
		if(newNode.getKey().compareTo(currentNode.getKey())<0){
			if(currentNode.getLchild()==null){
				currentNode.setLchild(newNode);
				return true;
			}else{
				return insertBST(currentNode.getLchild(),newNode);
			}
		}
		if(newNode.getKey().compareTo(currentNode.getKey())>0){
			if(currentNode.getRchild()==null){
				currentNode.setRchild(newNode);
				return true;
			}else{
				return insertBST(currentNode.getRchild(),newNode);
			}
		}
		return false;
	}

	public BinaryKeyTreeNode<T,E> delete(T key) {
		if(root!=null) {
			BinaryKeyTreeNode<T,E> current = root;
			BinaryKeyTreeNode<T,E> parent = null;
			boolean isLeafLeft = true;
			while(current.getKey().compareTo(key)!=0){
				parent = current;
				if(key.compareTo( current.getKey())<0){
					current = current.getLchild();
					isLeafLeft = true;
				}else{
					current = current.getRchild();
					isLeafLeft = false;
				}
				if(current==null){
					return null;
				}
			}

			if(current.getLchild()==null&&current.getRchild()==null){
				//叶子结点
				if(current==root){
					root = null;
				}else if(isLeafLeft){
					parent.setLchild(null);
				}else{
					parent.setRchild(null);
				}
			}else if(current.getLchild()==null){
				//只有右结点
				if(current==root){
					root = current.getRchild();
				}else if(isLeafLeft){
					parent.setLchild(current.getRchild());
				}else{
					parent.setRchild(current.getRchild());
				}
			}else if(current.getRchild()==null){
				//只有左结点
				if(current==root){
					root = null;
				}else if(isLeafLeft){
					parent.setLchild(current.getLchild());
				}else{
					parent.setRchild(current.getLchild());
				}
			}else{
				//左右结点都要
				//第一步要找到欲删除节点的后继节点
				BinaryKeyTreeNode next = current.getRchild();
				BinaryKeyTreeNode nextParent = null;
				while(next.getLchild()!=null){
					nextParent = next;
					next = next.getLchild();
				}
				if(nextParent==null){
					//欲删除节点的右子节点就是它的后继，证明该后继无左子节点，则将以后继节点为根的子树上移即可
				}else{
					//欲删除节点的后继不是它的右子节点
					nextParent.setLchild(next.getRchild());
					next.setRchild(current.getRchild());
				}
				if(current == root){
					root = next;
				}else if(isLeafLeft){
					parent.setLchild(next);
				}else{
					parent.setRchild(next);
				}
				next.setLchild(current.getLchild());
			}

			return current!=null?new BinaryKeyTreeNode(current.getKey(),current.getData()):null;

		}
		return null;
	}

	/**
	 * 递归方式删除结点
	 * @param key
	 * @return
	 */
	public BinaryKeyTreeNode<T,E> deleteBST(T key) {
		if (root == null || key == null) {
			return null;
		}
		return deleteBST(root, key, null);
	}

	private BinaryKeyTreeNode<T,E> deleteBST(BinaryKeyTreeNode<T,E> current, T key, BinaryKeyTreeNode<T,E> parent) {
		if(current==null){
			return null;
		}
		if(key.compareTo(current.getKey())<0){
			return deleteBST(current.getLchild(),key,current);
		}
		if(key.compareTo(current.getKey())>0){
			return deleteBST(current.getRchild(),key,current);
		}

		//==0
		if(current.getLchild()!=null&&current.getRchild()!=null){
			BinaryKeyTreeNode<T,E> next = current.getRchild();
			while(next.getLchild()!=null){
				next = next.getLchild();
			}
			BinaryKeyTreeNode<T,E> delete = new BinaryKeyTreeNode(current.getKey(),current.getData());
			current.setKey(next.getKey());
			current.setData(next.getData());
			deleteBST(current.getRchild(),next.getKey(),current);
			return delete;
		}
		if(parent==null){
			if(current.getLchild()!=null){
				root = current.getLchild();
			}else{
				root= current.getRchild();
			}
			return new BinaryKeyTreeNode(current.getKey(),current.getData());
		}
		if(current==parent.getLchild()){
			if(current.getLchild()!=null){
				parent.setLchild(current.getLchild());
			}else{
				parent.setLchild(current.getRchild());
			}
		}else{
			if(current.getLchild()!=null){
				parent.setRchild(current.getLchild());
			}else{
				parent.setRchild(current.getRchild());
			}
		}


		return current!=null?new BinaryKeyTreeNode(current.getKey(),current.getData()):null;
	}

	@Override
	public void preOrder() {

	}

	@Override
	public void inOrder() {

	}

	@Override
	public void postOrder() {

	}

	@Override
	public void levelOrder() {

	}

	/**
	 * 返回树的高度
	 * @return
	 */
	@Override
	public int getDepth(){
		return getDepth(root);
	}
	private int getDepth(BinaryKeyTreeNode current){
		if(current!=null){
			int lDepth = getDepth(current.getLchild());
			int rDepth = getDepth(current.getRchild());
			return (lDepth>rDepth?lDepth:rDepth)+1;
		}else {
			return 0;
		}
	}


	/**
	 * 使用树形结构显示
	 */
	public void displayTree(){
		if(root==null){
			return;
		}
		LinkStack<BinaryKeyTreeNode> globalStack=new LinkStack();
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
			LinkStack<BinaryKeyTreeNode> localStack=new LinkStack();
			isRowEmpty=true;
			for (int j=0;j<nBlank;j++)
			{
				System.out.print(" ");
			}
			while (!globalStack.isEmpty()){
				//里面的while循环用于查看全局的栈是否为空
				BinaryKeyTreeNode temp=globalStack.pop();
				if (temp!=null){
					System.out.print(temp.getKey());
					//System.out.print(' ');
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

	//找到最大值
	public BinaryKeyTreeNode<T,E> findMax(){
		BinaryKeyTreeNode<T,E> current = root;
		BinaryKeyTreeNode<T,E> maxNode = current;
		while(current != null){
			maxNode = current;
			current = current.getRchild();
		}
		return maxNode;
	}
	//找到最小值
	public BinaryKeyTreeNode<T,E> findMin(){
		BinaryKeyTreeNode<T,E> current = root;
		BinaryKeyTreeNode<T,E> minNode = current;
		while(current != null){
			minNode = current;
			current = current.getLchild();
		}
		return minNode;
	}



	public static void main(String[] args) {
		BinarySearchTree<Integer,String> bt = new BinarySearchTree();
		bt.insert(new BinaryKeyTreeNode(50,"A"));
		bt.insert(new BinaryKeyTreeNode(20,"B"));
		bt.insert(new BinaryKeyTreeNode(80,"C"));
		bt.insert(new BinaryKeyTreeNode(10,"D"));
		bt.insert(new BinaryKeyTreeNode(30,"E"));
		bt.insert(new BinaryKeyTreeNode(60,"F"));
		bt.insert(new BinaryKeyTreeNode(90,"G"));
		bt.insert(new BinaryKeyTreeNode(25,"H"));
		bt.insert(new BinaryKeyTreeNode(85,"I"));
		bt.insert(new BinaryKeyTreeNode(99,"J"));

		bt.displayTree();

		bt.insert(new BinaryKeyTreeNode(55,"K"));
		bt.displayTree();

		BinaryKeyTreeNode<Integer,String> d = bt.delete(50);
		System.out.println(d);
		bt.displayTree();

		BinaryKeyTreeNode<Integer,String> searchNode = bt.search(20);
		System.out.println(searchNode);

		bt.insertBST(new BinaryKeyTreeNode(36,"J"));
		bt.insertBST(new BinaryKeyTreeNode(37,"J"));
		bt.displayTree();


		d = bt.deleteBST(30);
		System.out.println(d);
		bt.displayTree();

	}
}
