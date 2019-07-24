package com.learn.java.algorithm.nolinear.tree;

import com.learn.java.algorithm.linear.stack.LinkStack;
import com.learn.java.algorithm.nolinear.node.AVLTreeNode;


/**
 * AVL树
 * AVL树是高度平衡的而二叉树。它的特点是：AVL树中任何节点的两个子树的高度最大差别为1。
 * @param <T>
 */
public class AVLTree<T extends Comparable<T>> {
	// 根结点
	private AVLTreeNode<T> root;

	public AVLTree() {
	}


	/**
	 * 获取树的高度
	 */
	private int height(AVLTreeNode<T> tree) {
		if (tree != null) {
			return tree.getHeight();
		}

		return 0;
	}

	public int height() {
		return height(root);
	}

	/**
	 * 前序遍历"AVL树"
	 */
	private void preOrder(AVLTreeNode<T> tree) {
		if(tree != null) {
			System.out.print(tree.getKey()+" ");
			preOrder(tree.getLchild());
			preOrder(tree.getRchild());
		}
	}

	public void preOrder() {
		preOrder(root);
	}

	/**
	 * 中序遍历"AVL树"
	 */
	private void inOrder(AVLTreeNode<T> tree) {
		if(tree != null)
		{
			inOrder(tree.getLchild());
			System.out.print(tree.getKey()+" ");
			inOrder(tree.getRchild());
		}
	}

	public void inOrder() {
		inOrder(root);
	}

	/**
	 * 后序遍历"AVL树"
	 */
	private void postOrder(AVLTreeNode<T> tree) {
		if(tree != null) {
			postOrder(tree.getLchild());
			postOrder(tree.getRchild());
			System.out.print(tree.getKey()+" ");
		}
	}

	public void postOrder() {
		postOrder(root);
	}

	/**
	 * (递归实现)查找"AVL树x"中键值为key的节点
	 */
	private AVLTreeNode<T> search(AVLTreeNode<T> x, T key) {
		if (x==null) {
			return x;
		}

		int cmp = key.compareTo(x.getKey());
		if (cmp < 0) {
			return search(x.getLchild(), key);
		} else if (cmp > 0) {
			return search(x.getRchild(), key);
		} else {
			return x;
		}
	}

	public AVLTreeNode<T> search(T key) {
		return search(root, key);
	}

	/**
	 * (非递归实现)查找"AVL树x"中键值为key的节点
	 */
	private AVLTreeNode<T> iterativeSearch(AVLTreeNode<T> x, T key) {
		while (x!=null) {
			int cmp = key.compareTo(x.getKey());

			if (cmp < 0)
				x = x.getLchild();
			else if (cmp > 0)
				x = x.getRchild();
			else
				return x;
		}

		return x;
	}

	public AVLTreeNode<T> iterativeSearch(T key) {
		return iterativeSearch(root, key);
	}

	/**
	 * 查找最小结点：返回tree为根结点的AVL树的最小结点。
	 */
	private AVLTreeNode<T> findMin(AVLTreeNode<T> tree) {
		if (tree == null) {
			return null;
		}

		while(tree.getLchild() != null) {
			tree = tree.getLchild();
		}
		return tree;
	}

	public T findMin() {
		AVLTreeNode<T> p = findMin(root);
		if (p != null) {
			return p.getKey();
		}

		return null;
	}

	/**
	 * 查找最大结点：返回tree为根结点的AVL树的最大结点。
	 */
	private AVLTreeNode<T> findMax(AVLTreeNode<T> tree) {
		if (tree == null) {
			return null;
		}

		while(tree.getRchild() != null) {
			tree = tree.getRchild();
		}
		return tree;
	}

	public T findMax() {
		AVLTreeNode<T> p = findMax(root);
		if (p != null) {
			return p.getKey();
		}

		return null;
	}

	/**
	 * 比较两个值的大小
	 */
	private int max(int a, int b) {
		return a>b ? a : b;
	}

	/**
	 * LL：左左对应的情况(左单旋转)。
	 *
	 * 返回值：旋转后的根节点
	 */
	private AVLTreeNode<T> leftLeftRotation(AVLTreeNode<T> k2) {
		AVLTreeNode<T> k1 = k2.getLchild();
		k2.setLchild(k1.getRchild());
		k1.setRchild(k2);

		k2.setHeight(max(height(k2.getLchild()),height(k2.getRchild()))+1);
		k1.setHeight(max(height(k1.getLchild()),k2.getHeight())+1);

		return k1;
	}

	/**
	 * RR：右右对应的情况(右单旋转)。
	 *
	 * 返回值：旋转后的根节点
	 */
	private AVLTreeNode<T> rightRightRotation(AVLTreeNode<T> k1) {
		AVLTreeNode<T> k2 = k1.getRchild();
		k1.setRchild(k2.getLchild());
		k2.setLchild(k1);
		k1.setHeight(max(height(k1.getLchild()),height(k1.getRchild()))+1);
		k2.setHeight(max(height(k2.getRchild()),k1.getHeight())+1);
		return k2;
	}

	/**
	 * LR：左右对应的情况(左双旋转)。
	 *
	 * 返回值：旋转后的根节点
	 */
	private AVLTreeNode<T> leftRightRotation(AVLTreeNode<T> k3) {
		k3.setLchild(rightRightRotation(k3.getLchild()));

		return leftLeftRotation(k3);
	}

	/**
	 * RL：右左对应的情况(右双旋转)。
	 *
	 * 返回值：旋转后的根节点
	 */
	private AVLTreeNode<T> rightLeftRotation(AVLTreeNode<T> k1) {
		k1.setRchild(leftLeftRotation(k1.getRchild()));

		return rightRightRotation(k1);
	}

	/**
	 * 将结点插入到AVL树中，并返回根节点
	 *
	 * 参数说明：
	 *     tree AVL树的根结点
	 *     key 插入的结点的键值
	 * 返回值：
	 *     根节点
	 */
	private AVLTreeNode<T> insert(AVLTreeNode<T> tree, T key) {
		if (tree == null) {
			// 新建节点
			tree = new AVLTreeNode<T>(key, null, null);
			if (tree==null) {
				System.out.println("ERROR: create avltree node failed!");
				return null;
			}
		} else {
			int cmp = key.compareTo(tree.getKey());

			if (cmp < 0) {
				// 应该将key插入到"tree的左子树"的情况
				tree.setLchild(insert(tree.getLchild(), key));
				// 插入节点后，若AVL树失去平衡，则进行相应的调节。
				if (height(tree.getLchild()) - height(tree.getRchild()) == 2) {
					if (key.compareTo(tree.getLchild().getKey()) < 0) {
						//LL
						tree = leftLeftRotation(tree);
					} else {
						//LR
						tree = leftRightRotation(tree);
					}
				}
			} else if (cmp > 0) {
				// 应该将key插入到"tree的右子树"的情况
				tree.setRchild(insert(tree.getRchild(), key));
				// 插入节点后，若AVL树失去平衡，则进行相应的调节。
				if (height(tree.getRchild()) - height(tree.getLchild()) == 2) {
					if (key.compareTo(tree.getRchild().getKey()) > 0) {
						//RR
						tree = rightRightRotation(tree);
					} else {
						//RL
						tree = rightLeftRotation(tree);
					}
				}
			} else {    // cmp==0
				System.out.println("添加失败：不允许添加相同的节点！");
			}
		}
		if(tree!=null) {
			tree.setHeight(max(height(tree.getLchild()), height(tree.getRchild())) + 1);
		}
		return tree;
	}

	public void insert(T key) {
		root = insert(root, key);
	}


	/**
	 * 删除结点(z)，返回根节点
	 *
	 * 参数说明：
	 *     tree AVL树的根结点
	 *     z 待删除的结点
	 * 返回值：
	 *     根节点
	 */
	private AVLTreeNode<T> delete(AVLTreeNode<T> tree, AVLTreeNode<T> z) {
		// 根为空 或者 没有要删除的节点，直接返回null。
		if (tree==null || z==null) {
			return null;
		}

		int cmp = z.getKey().compareTo(tree.getKey());
		if (cmp < 0) {
			// 待删除的节点在"tree的左子树"中
			tree.setLchild(delete(tree.getLchild(), z));
			// 删除节点后，若AVL树失去平衡，则进行相应的调节。
			if (height(tree.getRchild()) - height(tree.getLchild()) == 2) {
				AVLTreeNode<T> r =  tree.getRchild();
				if (height(r.getLchild()) > height(r.getRchild())) {
					//RL
					tree = rightLeftRotation(tree);
				} else {
					//RR
					tree = rightRightRotation(tree);
				}
			}
		} else if (cmp > 0) {
			// 待删除的节点在"tree的右子树"中
			tree.setRchild(delete(tree.getRchild(), z));
			// 删除节点后，若AVL树失去平衡，则进行相应的调节。
			if (height(tree.getLchild()) - height(tree.getRchild()) == 2) {
				AVLTreeNode<T> l =  tree.getLchild();
				if (height(l.getRchild()) > height(l.getLchild())) {
					//LR
					tree = leftRightRotation(tree);
				} else {
					//LL
					tree = leftLeftRotation(tree);
				}
			}
		} else {    // tree是对应要删除的节点。
			// tree的左右孩子都非空
			if ((tree.getLchild()!=null) && (tree.getRchild()!=null)) {
				if (height(tree.getLchild()) > height(tree.getRchild())) {
					// 如果tree的左子树比右子树高；
					// 则(01)找出tree的左子树中的最大节点
					//   (02)将该最大节点的值赋值给tree。
					//   (03)删除该最大节点。
					// 这类似于用"tree的左子树中最大节点"做"tree"的替身；
					// 采用这种方式的好处是：删除"tree的左子树中最大节点"之后，AVL树仍然是平衡的。
					AVLTreeNode<T> max = findMax(tree.getLchild());
					tree.setKey(max.getKey());
					tree.setLchild( delete(tree.getLchild(), max));
				} else {
					// 如果tree的左子树不比右子树高(即它们相等，或右子树比左子树高1)
					// 则(01)找出tree的右子树中的最小节点
					//   (02)将该最小节点的值赋值给tree。
					//   (03)删除该最小节点。
					// 这类似于用"tree的右子树中最小节点"做"tree"的替身；
					// 采用这种方式的好处是：删除"tree的右子树中最小节点"之后，AVL树仍然是平衡的。
					AVLTreeNode<T> min = findMin(tree.getRchild());
					tree.setKey(min.getKey());
					tree.setRchild(delete(tree.getRchild(), min));
				}
			} else {
				AVLTreeNode<T> tmp = tree;
				tree = (tree.getLchild()!=null) ? tree.getLchild() : tree.getRchild();
				tmp = null;
			}
		}

		return tree;
	}

	public void delete(T key) {
		AVLTreeNode<T> z;

		if ((z = search(root, key)) != null) {
			root = delete(root, z);
		}
	}

	/*
	 * 销毁AVL树
	 */
	private void destroy(AVLTreeNode<T> tree) {
		if (tree==null) {
			return ;
		}

		if (tree.getLchild() != null) {
			destroy(tree.getLchild());
		}
		if (tree.getRchild() != null) {
			destroy(tree.getRchild());
		}

		tree = null;
	}

	public void destroy() {
		destroy(root);
	}

	/**
	 * 使用树形结构显示
	 */
	public void displayTree(){
		if(root==null){
			return;
		}
		LinkStack<AVLTreeNode<T>> globalStack=new LinkStack();
		globalStack.push(root);
		int depth = root.getHeight();
		int nBlank=(int)Math.pow(2,depth+1);
		int ndot = nBlank*2;
		boolean isRowEmpty=false;
		for(int i =0;i<ndot;i++){
			System.out.print('.');
		}
		System.out.println();
		while (isRowEmpty==false){
			LinkStack<AVLTreeNode<T>> localStack=new LinkStack();
			isRowEmpty=true;
			for (int j=0;j<nBlank;j++)
			{
				System.out.print(" ");
			}
			while (!globalStack.isEmpty()){
				//里面的while循环用于查看全局的栈是否为空
				AVLTreeNode<T> temp=globalStack.pop();
				if (temp!=null){
					String pringVal = temp.getKey().toString();
					System.out.print(pringVal);
					if(pringVal.length()==1){
						System.out.print(' ');
					}
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


	public static void main(String[] args) {
		int arr[]= {3,2,1,4,5,6,7,16,15,14,13,12,11,10,8,9};
		int i;
		AVLTree<Integer> tree = new AVLTree<Integer>();

		System.out.printf("== 依次添加: ");
		for(i=0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
			tree.insert(arr[i]);
		}

		System.out.printf("== 树的详细信息: \n");
		tree.displayTree();

		System.out.printf("\n== 前序遍历: ");
		tree.preOrder();

		System.out.printf("\n== 中序遍历: ");
		tree.inOrder();

		System.out.printf("\n== 后序遍历: ");
		tree.postOrder();
		System.out.printf("\n");

		System.out.printf("== 高度: %d\n", tree.height());
		System.out.printf("== 最小值: %d\n", tree.findMin());
		System.out.printf("== 最大值: %d\n", tree.findMax());


		i = 8;
		System.out.printf("\n== 删除根节点: %d", i);
		tree.delete(i);

		System.out.printf("\n== 高度: %d", tree.height());
		System.out.printf("\n== 中序遍历: ");
		tree.inOrder();
		System.out.printf("\n== 树的详细信息: \n");
		tree.displayTree();

		// 销毁二叉树
		tree.destroy();
	}
}
