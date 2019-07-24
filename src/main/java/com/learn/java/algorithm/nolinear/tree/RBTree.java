package com.learn.java.algorithm.nolinear.tree;

import com.learn.java.algorithm.linear.stack.LinkStack;
import com.learn.java.algorithm.nolinear.node.RBTNode;

/**
 * 红黑树
 * @param <T>
 * 1.每个节点不是红色就是黑色的；
 *
 * 2.根节点总是黑色的；
 *
 * 3.如果节点是红色的，则它的子节点必须是黑色的（反之不一定）,(也就是从每个叶子到根的所有路径上不能有两个连续的红色节点)；
 *
 * 4.从根节点到叶节点或空子节点的每条路径，必须包含相同数目的黑色节点（即相同的黑色高度）。
 *
 * 5.新插入的节点颜色总是红色的
 */
public class RBTree<T extends Comparable<T>> implements Tree{
	public static final boolean RED   = false;
	public static final boolean BLACK = true;
	// 根结点
	private RBTNode<T> root;

	public RBTree() {
	}

	private RBTNode<T> parentOf(RBTNode<T> node) {
		return node!=null ? node.getParent() : null;
	}
	private boolean colorOf(RBTNode<T> node) {
		return node!=null ? node.isColor() : BLACK;
	}
	private boolean isRed(RBTNode<T> node) {
		return ((node!=null)&&(node.isColor()==RED)) ? true : false;
	}
	private boolean isBlack(RBTNode<T> node) {
		return !isRed(node);
	}
	private void setBlack(RBTNode<T> node) {
		if (node!=null) {
			node.setColor(BLACK);
		}
	}
	private void setRed(RBTNode<T> node) {
		if (node!=null) {
			node.setColor(RED);
		}
	}
	private void setParent(RBTNode<T> node, RBTNode<T> parent) {
		if (node!=null) {
			node.setParent(parent);
		}
	}
	private void setColor(RBTNode<T> node, boolean color) {
		if (node!=null) {
			node.setColor(color);
		}
	}

	@Override
	public void preOrder() {
		preOrder(root);
	}
	private void preOrder(RBTNode<T> tree) {
		if(tree != null) {
			System.out.print(tree.getKey() + " ");
			preOrder(tree.getLchild());
			preOrder(tree.getRchild());
		}
	}

	@Override
	public void inOrder() {
		inOrder(root);
	}
	private void inOrder(RBTNode<T> tree) {
		if(tree != null) {
			preOrder(tree.getLchild());
			System.out.print(tree.getKey() + " ");
			preOrder(tree.getRchild());
		}
	}

	@Override
	public void postOrder() {
		postOrder(root);
	}
	private void postOrder(RBTNode<T> tree) {
		if(tree != null) {
			preOrder(tree.getLchild());
			preOrder(tree.getRchild());
			System.out.print(tree.getKey() + " ");
		}
	}

	@Override
	public void levelOrder() {

	}

	@Override
	public int getDepth() {
		return 0;
	}

	/**
	 * (递归实现)查找"红黑树x"中键值为key的节点
	 */
	private RBTNode<T> search(RBTNode<T> current,T key){
		if(current==null){
			return null;
		}
		int cmp = key.compareTo(current.getKey());
		if(cmp==0){
			return current;
		}else if(cmp<0){
			return search(current.getLchild(),key);
		}else{
			return search(current.getRchild(),key);
		}
	}
	public RBTNode<T> search(T key){
		return search(root,key);
	}

	/**
	 * (非递归实现)查找"红黑树x"中键值为key的节点
	 */
	private RBTNode<T> iterativeSearch(RBTNode<T> x, T key) {
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

	public RBTNode<T> iterativeSearch(T key) {
		return iterativeSearch(root, key);
	}

	//找到最大值
	public T findMax() {
		RBTNode<T> node = findMax(root);
		if(node != null) {
			return node.getKey();
		}
		return null;
	}

	private RBTNode<T> findMax(RBTNode<T> current){
		RBTNode<T> maxNode = current;
		while(current != null){
			maxNode = current;
			current = current.getRchild();
		}
		return maxNode;
	}
	//找到最小值
	public T findMin() {
		RBTNode<T> node = findMin(root);
		if(node != null) {
			return node.getKey();
		}
		return null;
	}

	private RBTNode<T> findMin(RBTNode<T> current){

		RBTNode<T> minNode = current;
		while(current != null){
			minNode = current;
			current = current.getLchild();
		}
		return minNode;
	}

	/**
	 * 找结点(x)的后继结点。即，查找"红黑树中数据值大于该结点"的"最小结点"。
	 */
	public RBTNode<T> successor(RBTNode<T> x) {
		// 如果x存在右孩子，则"x的后继结点"为 "以其右孩子为根的子树的最小结点"。
		if (x.getRchild() != null) {
			return findMin(x.getRchild());
		}

		// 如果x没有右孩子。则x有以下两种可能：
		// (01) x是"一个左孩子"，则"x的后继结点"为 "它的父结点"。
		// (02) x是"一个右孩子"，则查找"x的最低的父结点，并且该父结点要具有左孩子"，找到的这个"最低的父结点"就是"x的后继结点"。
		RBTNode<T> y = x.getParent();
		while ((y!=null) && (x==y.getRchild())) {
			x = y;
			y = y.getParent();
		}

		return y;
	}

	/*
	 * 找结点(x)的前驱结点。即，查找"红黑树中数据值小于该结点"的"最大结点"。
	 */
	public RBTNode<T> predecessor(RBTNode<T> x) {
		// 如果x存在左孩子，则"x的前驱结点"为 "以其左孩子为根的子树的最大结点"。
		if (x.getLchild() != null) {
			return findMax(x.getLchild());
		}

		// 如果x没有左孩子。则x有以下两种可能：
		// (01) x是"一个右孩子"，则"x的前驱结点"为 "它的父结点"。
		// (01) x是"一个左孩子"，则查找"x的最低的父结点，并且该父结点要具有右孩子"，找到的这个"最低的父结点"就是"x的前驱结点"。
		RBTNode<T> y = x.getParent();
		while ((y!=null) && (x==y.getLchild())) {
			x = y;
			y = y.getParent();
		}

		return y;
	}

	/**
	 * 对红黑树的节点(x)进行左旋转
	 *
	 * 左旋示意图(对节点x进行左旋)：
	 *      px                              px
	 *     /                               /
	 *    x                               y
	 *   /  \      --(左旋)-.             / \                #
	 *  lx   y                          x  ry
	 *     /  \                        / \
	 *    ly  ry                     lx  ly
	 *
	 *  左旋做了三件事：
	 *      * 1. 将y的左子节点赋给x的右子节点,并将x赋给y左子节点的父节点(y左子节点非空时)
	 *      * 2. 将x的父节点px(非空时)赋给y的父节点，同时更新p的子节点为y(左或右)
	 *      * 3. 将y的左子节点设为x，将x的父节点设为y
	 */
	private void leftRotate(RBTNode<T> x) {
		// 设置x的右孩子为y
		RBTNode<T> y = x.getRchild();

		// 将 “y的左孩子” 设为 “x的右孩子”；
		// 如果y的左孩子非空，将 “x” 设为 “y的左孩子的父亲”
		x.setRchild(y.getLchild());
		if(y.getLchild()!=null){
			y.getLchild().setParent(x);
		}

		// 将 “x的父亲” 设为 “y的父亲”
		y.setParent(x.getParent());
		if(x.getParent()==null){
			root = y;
		}else{
			if(x.getParent().getLchild()==x){
				x.getParent().setLchild(y);
			}else{
				x.getParent().setRchild(y);
			}
		}

		// 将 “x” 设为 “y的左孩子”
		y.setLchild(x);
		// 将 “x的父节点” 设为 “y”
		x.setParent(y);
	}

	/**
	 * 对红黑树的节点(y)进行右旋转
	 *
	 * 右旋示意图(对节点y进行左旋)：
	 *            py                              py
	 *           /                               /
	 *          y                               x
	 *         /  \      --(右旋)-.            /  \                     #
	 *        x   ry                         lx   y
	 *       / \                                 / \                   #
	 *      lx  rx                             rx  ry
	 *
	 *  右旋做了三件事：
	 *      * 1. 将x的右子节点赋给y的左子节点,并将y赋给x右子节点的父节点(x右子节点非空时)
	 *      * 2. 将y的父节点py(非空时)赋给x的父节点，同时更新p的子节点为x(左或右)
	 *      * 3. 将x的右子节点设为y，将y的父节点设为x
	 */
	private void rightRotate(RBTNode<T> y) {
		// 设置x是当前节点的左孩子。
		RBTNode<T> x = y.getLchild();

		// 将 “x的右孩子” 设为 “y的左孩子”；
		// 如果"x的右孩子"不为空的话，将 “y” 设为 “x的右孩子的父亲”
		y.setLchild(x.getRchild());
		if(x.getRchild()!=null){
			x.getRchild().setParent(y);
		}

		// 将 “y的父亲” 设为 “x的父亲”
		x.setParent(y.getParent());
		if(y.getParent()==null){
			root =x;
		}else{
			if(y.getParent().getLchild()==y){
				y.getParent().setLchild(x);
			}else{
				y.getParent().setRchild(x);
			}
		}

		// 将 “y” 设为 “x的右孩子”
		x.setRchild(y);
		// 将 “y的父节点” 设为 “x”
		y.setParent(x);

	}

	/*
	 * 将结点插入到红黑树中
	 *
	 * 参数说明：
	 *     node 插入的结点        // 对应《算法导论》中的node
	 */
	private void insert(RBTNode<T> node) {
		int cmp;
		RBTNode<T> current = null;
		RBTNode<T> x = this.root;

		// 1. 将红黑树当作一颗二叉查找树，将节点添加到二叉查找树中。
		while (x != null) {
			current = x;
			cmp = node.getKey().compareTo(x.getKey());
			if (cmp < 0) {
				x = x.getLchild();
			} else {
				x = x.getRchild();
			}
		}
		//找到了位置，将当前current作为node的父节点
		node.setParent(current);
		if (current!=null) {
			cmp = node.getKey().compareTo(current.getKey());
			if (cmp < 0) {
				current.setLchild(node);
			} else {
				current.setRchild(node);
			}
		} else {
			this.root = node;
		}

		// 2. 设置节点的颜色为红色
		node.setColor(RED);

		// 3. 将它重新修正为一颗二叉查找树
		insertFixUp(node);
	}

	/**
	 * 新建结点(key)，并将其插入到红黑树中
	 *
	 * 参数说明：
	 *     key 插入结点的键值
	 */
	public void insert(T key) {
		RBTNode<T> node=new RBTNode<>(key,BLACK,null,null,null);

		// 如果新建结点失败，则返回。
		insert(node);
	}

	/**
	 * 红黑树插入修正函数
	 *
	 * 在向红黑树中插入节点之后(失去平衡)，再调用该函数；
	 * 目的是将它重新塑造成一颗红黑树。
	 *
	 * 参数说明：
	 *     node 插入的结点
	 */
	private void insertFixUp(RBTNode<T> node) {
		RBTNode<T> parent, gparent;
		// 若“父节点存在，并且父节点的颜色是红色”
		while (((parent = parentOf(node))!=null) && isRed(parent)) {
			//获得祖父节点
			gparent = parentOf(parent);
			//若“父节点”是“祖父节点的左孩子”
			if (parent == gparent.getLchild()) {
				//获得叔叔节点
				RBTNode<T> uncle = gparent.getRchild();
				//case1: 叔叔节点也是红色
				if(uncle != null && isRed(uncle)) {
					//把父节点和叔叔节点涂黑
					setBlack(parent);
					setBlack(uncle);
					//把祖父节点涂红
					setRed(gparent);
					//将位置放到祖父节点处
					node = gparent;
					//继续while，重新判断
					continue;
				}
				if(node==parent.getRchild()){
					//从父节点处左旋
					leftRotate(parent);
					//然后将父节点和自己调换一下，为下面右旋做准备
					RBTNode<T> tmp = parent;
					parent = node;
					node = tmp;
				}
				//case3: 叔叔节点是黑色，且当前节点是左子节点
				setBlack(parent);
				setRed(gparent);
				rightRotate(gparent);
			}else{
				//若父节点是祖父节点的右子节点
				RBTNode<T> uncle = gparent.getLchild();
				//case1: 叔叔节点也是红色
				if(uncle!=null && isRed(uncle)){
					//把父节点和叔叔节点涂黑
					setBlack(parent);
					setBlack(uncle);
					//把祖父节点涂红
					setRed(gparent);
					//将位置放到祖父节点处
					node = gparent;
					//继续while，重新判断
					continue;
				}
				//case2: 叔叔节点是黑色的，且当前节点是左子节点
				if(node == parent.getLchild()) {
					rightRotate(parent);
					RBTNode<T> tmp = parent;
					parent = node;
					node = tmp;
				}

				//case3: 叔叔节点是黑色的，且当前节点是右子节点
				setBlack(parent);
				setRed(gparent);
				leftRotate(gparent);
			}

		}

		// 将根节点设为黑色
		setBlack(this.root);
	}

	/**
	 * 删除红黑树种的结点
	 * @param key
	 */
	public void remove(T key) {
		RBTNode<T> node;
		if((node = search(root, key)) != null) {
			remove(node);
		}
	}

	/*
	 * 删除结点(node)，并返回被删除的结点
	 *
	 * 参数说明：
	 *     node 删除的结点
	 */
	private void remove(RBTNode<T> node) {
		RBTNode<T> child, parent;
		boolean color;

		// 被删除节点的"左右孩子都不为空"的情况。
		if ((node.getLchild() != null) && (node.getRchild() != null)) {
			// 被删节点的后继节点。(称为"取代节点")
			// 用它来取代"被删节点"的位置，然后再将"被删节点"去掉。
			RBTNode<T> replace = node;

			// 获取后继节点
			replace = replace.getRchild();
			while (replace.getLchild() != null){
				replace = replace.getLchild();
			}
			// "node节点"不是根节点(只有根节点不存在父节点)
			if (parentOf(node)!=null) {
				if (parentOf(node).getLchild() == node) {
					parentOf(node).setLchild(replace);
				} else {
					parentOf(node).setRchild(replace);
				}
			} else {
				// "node节点"是根节点，更新根节点。
				this.root = replace;
			}

			// child是"取代节点"的右孩子，也是需要"调整的节点"。
			// "取代节点"肯定不存在左孩子！因为它是一个后继节点。
			child = replace.getRchild();
			parent = parentOf(replace);
			// 保存"取代节点"的颜色
			color = colorOf(replace);

			// "被删除节点"是"它的后继节点的父节点"
			if (parent == node) {
				parent = replace;
			} else {
				// child不为空
				if (child!=null) {
					child.setParent(parent);
				}
				parent.setLchild(child);
				replace.setRchild(node.getRchild());
				if(node.getRchild()!=null) {
					node.getRchild().setParent(replace);
				}
			}

			replace.setParent( node.getParent());
			//保持原来位置的颜色
			replace.setColor(node.isColor());
			replace.setLchild(node.getLchild());
			if(node.getLchild()!=null) {
				node.getLchild().setParent(replace);
			}
			//如果移走的后继节点颜色是黑色，重新修整红黑树
			if (color == BLACK) {
				//将后继节点的child和parent传进去
				removeFixUp(child, parent);
			}

			node = null;
			return ;
			
		}
	}

	//node表示待修正的节点，即后继节点的子节点（因为后继节点被挪到删除节点的位置去了）
	private void removeFixUp(RBTNode<T> node, RBTNode<T> parent) {
		while((node == null || isBlack(node)) && (node != this.root)) {
			if(parent.getLchild() == node) {
				//node是左子节点
				//node的兄弟节点
				RBTNode<T> other = parent.getRchild();
				if(isRed(other)) {
					//case1: node的兄弟节点other是红色的
					setBlack(other);
					setRed(parent);
					leftRotate(parent);
					other = parent.getRchild();
				}

				//case2: node的兄弟节点other是黑色的，且other的两个子节点也都是黑色的
				if((other.getLchild() == null || isBlack(other.getLchild())) &&
						(other.getRchild() == null || isBlack(other.getRchild()))) {
					setRed(other);
					node = parent;
					parent = parentOf(node);
				}else {
					//case3: node的兄弟节点other是黑色的，且other的左子节点是红色，右子节点是黑色
					if(other.getRchild() == null || isBlack(other.getRchild())) {
						setBlack(other.getLchild());
						setRed(other);
						rightRotate(other);
						other = parent.getRchild();
					}

					//case4: node的兄弟节点other是黑色的，且other的右子节点是红色，左子节点任意颜色
					setColor(other, colorOf(parent));
					setBlack(parent);
					setBlack(other.getRchild());
					leftRotate(parent);
					node = this.root;
					break;
				}

			}else{
				//node是右子节点
				//node的兄弟节点
				RBTNode<T> other = parent.getLchild();

				if (isRed(other)) {
					// Case 1: node的兄弟other是红色的
					setBlack(other);
					setRed(parent);
					rightRotate(parent);
					other = parent.getLchild();
				}

				if ((other.getLchild()==null || isBlack(other.getLchild())) &&
						(other.getRchild()==null || isBlack(other.getRchild()))) {
					// Case 2: node的兄弟other是黑色，且other的俩个子节点都是黑色的
					setRed(other);
					node = parent;
					parent = parentOf(node);
				} else {

					if (other.getLchild()==null || isBlack(other.getLchild())) {
						// Case 3: node的兄弟other是黑色的，并且other的左子节点是红色，右子节点为黑色。
						setBlack(other.getRchild());
						setRed(other);
						leftRotate(other);
						other = parent.getLchild();
					}

					// Case 4: node的兄弟other是黑色的；并且other的左子节点是红色的，右子节点任意颜色
					setColor(other, colorOf(parent));
					setBlack(parent);
					setBlack(other.getLchild());
					rightRotate(parent);
					node = this.root;
					break;
				}
			}

			if (node!=null) {
				setBlack(node);
			}
		}
	}


	/****************** 销毁红黑树 *********************/
	public void clear() {
		destroy(root);
		root = null;
	}

	private void destroy(RBTNode<T> tree) {
		if(tree == null) {
			return;
		}
		if(tree.getLchild() != null) {
			destroy(tree.getLchild());
		}
		if(tree.getRchild() != null) {
			destroy(tree.getRchild());
		}
		tree = null;
	}

	/******************* 打印红黑树 *********************/
	public void print() {
		if(root != null) {
			print(root, root.getKey(), 0);
		}
	}
	/*
	 * key---节点的键值
	 * direction--- 0:表示该节点是根节点
	 *              1:表示该节点是它的父节点的左子节点
	 *              2:表示该节点是它的父节点的右子节点
	 */
	private void print(RBTNode<T> tree, T key, int direction) {
		if(tree != null) {
			if(0 == direction) {
				System.out.printf("%2d(B) is root\n", tree.getKey());
			} else {
				System.out.printf("%2d(%s) is %2d's %6s child\n",
						tree.getKey(), isRed(tree)?"R":"b", key, direction == 1?"right":"left");
			}
			print(tree.getLchild(), tree.getKey(), -1);
			print(tree.getRchild(), tree.getKey(), 1);
		}
	}

	/**
	 * 使用树形结构显示
	 */
	public void displayTree(){
		if(root==null){
			return;
		}
		LinkStack<RBTNode<T>> globalStack=new LinkStack();
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
			LinkStack<RBTNode<T>> localStack=new LinkStack();
			isRowEmpty=true;
			for (int j=0;j<nBlank;j++)
			{
				System.out.print("   ");
			}
			while (!globalStack.isEmpty()){
				//里面的while循环用于查看全局的栈是否为空
				RBTNode<T> temp=globalStack.pop();
				if (temp!=null){
					System.out.print(temp.getKey());
					System.out.print(isBlack(temp)?"B":"R");
					System.out.print("   ");
					localStack.push(temp.getLchild());
					localStack.push(temp.getRchild());
					//如果当前的节点下面还有子节点，则必须要进行下一层的循环
					if (temp.getLchild()!=null||temp.getRchild()!=null){
						isRowEmpty=false;
					}
				}else {
					//如果全局的栈则不为空
					System.out.print(" # ");
					localStack.push(null);
					localStack.push(null);
				}
				//打印一些空格
				for (int j=0;j<nBlank*2-2;j++){
					System.out.print("   ");
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

	private static final boolean mDebugInsert = true;    // "插入"动作的检测开关(false，关闭；true，打开)
	private static final boolean mDebugDelete = true;    // "删除"动作的检测开关(false，关闭；true，打开)

	public static void main(String[] args) {
		final int a[] = {10, 40, 30, 60, 90, 70, 20, 50, 80};

		int i, ilen = a.length;
		RBTree<Integer> tree = new RBTree<Integer>();

		System.out.printf("== 原始数据: ");
		for(i=0; i<ilen; i++) {
			System.out.printf("%d ", a[i]);
		}
		System.out.printf("\n");

		for(i=0; i<ilen; i++) {
			tree.insert(a[i]);
			// 设置mDebugInsert=true,测试"添加函数"
			if (mDebugInsert) {
				System.out.printf("== 添加节点: %d\n", a[i]);
				System.out.printf("== 树的详细信息: \n");
				//tree.print();
				tree.displayTree();
				System.out.printf("\n");
			}
		}

		System.out.printf("== 前序遍历: ");
		tree.preOrder();

		System.out.printf("\n== 中序遍历: ");
		tree.inOrder();

		System.out.printf("\n== 后序遍历: ");
		tree.postOrder();
		System.out.printf("\n");

		System.out.printf("== 最小值: %s\n", tree.findMin());
		System.out.printf("== 最大值: %s\n", tree.findMax());
		System.out.printf("== 树的详细信息: \n");
		//tree.print();
		tree.displayTree();
		System.out.printf("\n");

		// 设置mDebugDelete=true,测试"删除函数"
		if (mDebugDelete) {
			for(i=0; i<ilen; i++)
			{
				tree.remove(a[i]);

				System.out.printf("== 删除节点: %d\n", a[i]);
				System.out.printf("== 树的详细信息: \n");
				//tree.print();
				tree.displayTree();
				System.out.printf("\n");
			}
		}
	}
}
