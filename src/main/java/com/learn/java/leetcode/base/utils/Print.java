package com.learn.java.leetcode.base.utils;

import com.learn.java.leetcode.base.structure.Interval;
import com.learn.java.leetcode.base.structure.ListNode;
import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.List;
import java.util.Stack;

/**
 * 各种数据结构打印工具类
 */
public class Print {


	/**
	 * 打印
	 *
	 * @param obj
	 */
	public static void print(Object obj) {
		print(obj, null);
	}

	private static void print(Object obj, String ext) {
		if (obj == null) {
			System.out.println("null");
			return;
		}
		if (obj instanceof Integer || obj instanceof String || obj instanceof Long || obj instanceof Double || obj instanceof Float || obj instanceof Boolean) {
			System.out.println(obj);
		} else if (obj instanceof List) {
			List results = (List) obj;
			System.out.print("[");
			for (int i = 0; i < results.size(); i++) {
				Object item = results.get(i);
				if (item == null) {
					System.out.print("null");
					if (i < results.size() - 1) {
						System.out.print(',');
					}
				}
				if (item instanceof Integer || item instanceof String || item instanceof Long || item instanceof Double || item instanceof Float || item instanceof Boolean) {
					System.out.print(item);
					if (i < results.size() - 1) {
						System.out.print(',');
					}
				}else if (item instanceof List) {
					if (i == 0) {
						System.out.println();
					}

					if (i < results.size() - 1) {
						print(item, ",");
					} else {
						print(item, null);
					}
				}else if (item instanceof Interval) {
					if (i == 0) {
						System.out.println();
					}
					Interval interval = (Interval)item;
					System.out.print("[");
					System.out.print(interval.start+","+interval.end);
					System.out.print("]");
					if (i < results.size() - 1) {
						System.out.print(',');
					}
					System.out.println();
				}
			}
			System.out.print("]");
			if (ext != null) {
				System.out.print(ext);
			}
			System.out.println();
		} else if (obj instanceof ListNode) {
			ListNode listNode = (ListNode) obj;
			StringBuilder str = new StringBuilder("[" + String.valueOf(listNode.val));
			ListNode p = listNode.next;
			while (p != null) {
				str.append("->").append(String.valueOf(p.val));
				p = p.next;
			}
			System.out.print(str.append("]"));
			if (ext != null) {
				System.out.print(ext);
			}
			System.out.println();
		} else if (obj instanceof Interval) {
			Interval interval = (Interval)obj;
			System.out.print("[");
			System.out.print(interval.start+","+interval.end);
			System.out.print("]");
			if (ext != null) {
				System.out.print(ext);
			}
			System.out.println();
		} else if (obj.getClass().isArray()) {
			String className = obj.getClass().getName();
			if (className.equals("[I")) {
				print((int[]) obj);
			} else if (className.equals("[[I")) {
				print((int[][]) obj);
			} else if (className.equals("[D")) {
				print((double[]) obj);
			} else if (className.equals("[[D")) {
				print((double[][]) obj);
			} else if (className.equals("[F")) {
				print((float[]) obj);
			} else if (className.equals("[[F")) {
				print((float[][]) obj);
			} else if (className.equals("[B")) {
				print((boolean[]) obj);
			} else if (className.equals("[[B")) {
				print((boolean[][]) obj);
			} else if (className.equals("[C")) {
				print((char[]) obj);
			} else if (className.equals("[[C")) {
				print((char[][]) obj);
			} else if (className.equals("[Ljava.lang.String;")){
				print((String[]) obj);
			} else if (className.equals("[[Ljava.lang.String;")){
				print((String[][]) obj);
			} else if (className.equals("[Lcom.learn.java.leetcode.base.structure.ListNode;")) {
				print((ListNode[]) obj);
			} else {
				print((Object[]) obj);
			}
		} else if (obj instanceof TreeNode) {
			print((TreeNode) obj);
		} else{
			throw new RuntimeException("未定义的类型，打印失败!");
		}

	}

	/**
	 * 打印数组
	 *
	 * @param array
	 */
	public static void print(int[] array) {
		if (array == null) {
			return;
		}
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(',');
			}
		}
		System.out.print("]");
		System.out.println();
	}


	/**
	 * 打印数组
	 *
	 * @param array
	 */
	public static void print(double[] array) {
		if (array == null) {
			return;
		}
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(',');
			}
		}
		System.out.print("]");
		System.out.println();
	}


	/**
	 * 打印数组
	 *
	 * @param array
	 */
	public static void print(float[] array) {
		if (array == null) {
			return;
		}
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(',');
			}
		}
		System.out.print("]");
		System.out.println();
	}

	public static void print(String[] array) {
		if (array == null) {
			return;
		}
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print("\"" + StringUtil.changeStr(array[i]) + "\"");
			if (i < array.length - 1) {
				System.out.print(',');
			}
		}
		System.out.print("]");
		System.out.println();
	}



	private static void print(char[] array) {
		if (array == null) {
			return;
		}
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print("\"" + array[i] + "\"");
			if (i < array.length - 1) {
				System.out.print(',');
			}
		}
		System.out.print("]");
		System.out.println();
	}

	/**
	 * 打印数组
	 *
	 * @param array
	 */
	public static void print(boolean[] array) {
		if (array == null) {
			return;
		}
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(',');
			}
		}
		System.out.print("]");
		System.out.println();
	}

	private static void print(ListNode[] array) {
		if (array == null) {
			return;
		}
		System.out.println("[");
		for (int i = 0; i < array.length; i++) {

			if (i < array.length - 1) {
				print(array[i], ",");
			} else {
				print(array[i]);
			}
		}
		System.out.print("]");
		System.out.println();
	}

	private static void print(Object[] array) {
		if (array == null) {
			return;
		}
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {

			Object dataObj = array[i];
			if (dataObj == null) {
				System.out.print("null");
			} else {
				String data = dataObj.toString();
				if (StringUtil.judgeNumber(data)) {
					System.out.print(data);
				} else {
					System.out.print("\"" + StringUtil.changeStr(data) + "\"");
				}
			}
			if (i < array.length - 1) {
				System.out.print(',');
			}
		}
		System.out.print("]");
		System.out.println();
	}

	/**
	 * 打印矩阵
	 *
	 * @param matrix
	 */
	private static void print(int[][] matrix) {
		if (matrix == null) {
			return;
		}
		int row = matrix.length;
		int cow = matrix[0].length;
		System.out.print("[");
		for (int i = 0; i < row; i++) {
			if (i == 0) {
				System.out.println();
			}
			System.out.print("[");
			for (int j = 0; j < cow; j++) {
				System.out.print(matrix[i][j]);
				if (j < cow - 1) {
					System.out.print(',');
				}
			}
			System.out.print("]");
			if (i < row - 1) {
				System.out.print(',');
			}
			System.out.println();
		}
		System.out.print("]");
		System.out.println();
	}

	/**
	 * 打印矩阵
	 *
	 * @param matrix
	 */
	private static void print(double[][] matrix) {
		if (matrix == null) {
			return;
		}
		int row = matrix.length;
		int cow = matrix[0].length;
		System.out.print("[");
		for (int i = 0; i < row; i++) {
			if (i == 0) {
				System.out.println();
			}
			System.out.print("[");
			for (int j = 0; j < cow; j++) {
				System.out.print(matrix[i][j]);
				if (j < cow - 1) {
					System.out.print(',');
				}
			}
			System.out.print("]");
			if (i < row - 1) {
				System.out.print(',');
			}
			System.out.println();
		}
		System.out.print("]");
		System.out.println();
	}

	/**
	 * 打印矩阵
	 *
	 * @param matrix
	 */
	private static void print(float[][] matrix) {
		if (matrix == null) {
			return;
		}
		int row = matrix.length;
		int cow = matrix[0].length;
		System.out.print("[");
		for (int i = 0; i < row; i++) {
			if (i == 0) {
				System.out.println();
			}
			System.out.print("[");
			for (int j = 0; j < cow; j++) {
				System.out.print(matrix[i][j]);
				if (j < cow - 1) {
					System.out.print(',');
				}
			}
			System.out.print("]");
			if (i < row - 1) {
				System.out.print(',');
			}
			System.out.println();
		}
		System.out.print("]");
		System.out.println();
	}

	/**
	 * 打印矩阵
	 *
	 * @param matrix
	 */
	private static void print(boolean[][] matrix) {
		if (matrix == null) {
			return;
		}
		int row = matrix.length;
		int cow = matrix[0].length;
		System.out.print("[");
		for (int i = 0; i < row; i++) {
			if (i == 0) {
				System.out.println();
			}
			System.out.print("[");
			for (int j = 0; j < cow; j++) {
				System.out.print(matrix[i][j]);
				if (j < cow - 1) {
					System.out.print(',');
				}
			}
			System.out.print("]");
			if (i < row - 1) {
				System.out.print(',');
			}
			System.out.println();
		}
		System.out.print("]");
		System.out.println();
	}

	/**
	 * 打印矩阵
	 *
	 * @param matrix
	 */
	private static void print(char[][] matrix) {
		if (matrix == null) {
			return;
		}
		int row = matrix.length;
		int cow = matrix[0].length;
		System.out.print("[");
		for (int i = 0; i < row; i++) {
			if (i == 0) {
				System.out.println();
			}
			System.out.print("[");
			for (int j = 0; j < cow; j++) {
				System.out.print("\""+matrix[i][j]+"\"");
				if (j < cow - 1) {
					System.out.print(',');
				}
			}
			System.out.print("]");
			if (i < row - 1) {
				System.out.print(',');
			}
			System.out.println();
		}
		System.out.print("]");
		System.out.println();
	}

	/**
	 * 打印矩阵
	 *
	 * @param matrix
	 */
	private static void print(String[][] matrix) {
		if (matrix == null) {
			return;
		}
		int row = matrix.length;
		int cow = matrix[0].length;
		System.out.print("[");
		for (int i = 0; i < row; i++) {
			if (i == 0) {
				System.out.println();
			}
			System.out.print("[");
			for (int j = 0; j < cow; j++) {
				System.out.print("\""+matrix[i][j]+"\"");
				if (j < cow - 1) {
					System.out.print(',');
				}
			}
			System.out.print("]");
			if (i < row - 1) {
				System.out.print(',');
			}
			System.out.println();
		}
		System.out.print("]");
		System.out.println();
	}

	/**
	 * 竖向打印二叉树
	 *
	 * @param root 二叉树根节点
	 */
	private static void print(TreeNode root) {
		if (root == null) {
			return;
		}
		Stack<TreeNode> globalStack = new Stack();
		globalStack.push(root);
		int depth = getDepth(root);
		int nBlank = (int) Math.pow(2, depth + 1);
		int ndot = nBlank * 2;
		boolean isRowEmpty = false;
		for (int i = 0; i < ndot; i++) {
			System.out.print('.');
		}
		System.out.println();
		while (isRowEmpty == false) {
			Stack<TreeNode> localStack = new Stack();
			isRowEmpty = true;
			for (int j = 0; j < nBlank; j++) {
				System.out.print(' ');
			}
			while (!globalStack.isEmpty()) {
				//里面的while循环用于查看全局的栈是否为空
				TreeNode temp = globalStack.pop();
				if (temp != null) {
					System.out.print(temp.val);
					System.out.print(' ');
					localStack.push(temp.left);
					localStack.push(temp.right);
					//如果当前的节点下面还有子节点，则必须要进行下一层的循环
					if (temp.left != null || temp.right != null) {
						isRowEmpty = false;
					}
				} else {
					//如果全局的栈则不为空
					System.out.print("# ");
					localStack.push(null);
					localStack.push(null);
				}
				//打印一些空格
				for (int j = 0; j < nBlank * 2 - 2; j++) {
					System.out.print(' ');
				}
			}//while end
			System.out.println();
			nBlank /= 2;
			//这个while循环用来判断，local栈是否为空,不为空的话，则取出来放入全局栈中
			while (!localStack.isEmpty()) {
				globalStack.push(localStack.pop());
			}
		}//大while循环结束之后，输出换行
		for (int i = 0; i < ndot; i++) {
			System.out.print('.');
		}
		System.out.println();
	}




	/**
	 * 二叉树的高度
	 *
	 * @param root
	 * @return
	 */
	private static int getDepth(TreeNode root) {
		if (root != null) {
			int lDepth = getDepth(root.left);
			int rDepth = getDepth(root.right);
			return (lDepth > rDepth ? lDepth : rDepth) + 1;
		} else {
			return 0;
		}
	}
}
