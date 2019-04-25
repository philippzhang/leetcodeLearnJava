package com.learn.java.leetcode.base;


import com.google.gson.*;
import com.learn.java.leetcode.base.structure.ListNode;
import com.learn.java.leetcode.base.structure.TreeNode;
import org.apache.commons.lang.StringUtils;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Leetcode测试工具类
 *
 * @author zhangyangshuo
 */
public class Utilitys {

	private static Pattern inputPattern = Pattern.compile("^I[0-9]=.+$");

	/**
	 * 计数器
	 */
	public static class Counter {
		public Integer index;
	}


	/**
	 * 字符串构建数组
	 * 例如[1,2,3]
	 *
	 * @param data
	 * @return
	 */
	public static int[] buildArray(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		data = data.trim();
		data = data.replaceAll("\\[", "").replaceAll("\\]", "");

		String[] arr = data.split(",", -1);
		int length = arr.length;
		int[] results = new int[length];
		for (int i = 0; i < length; i++) {
			results[i] = Integer.parseInt(arr[i]);
		}
		return results;
	}

	/**
	 * 字符串构建字符串数组
	 * 例如["flower","flow","flight"]
	 *
	 * @param data
	 * @return
	 */
	public static String[] buildArrayString(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		data = data.trim();
		data = data.replaceAll("\\[", "").replaceAll("\\]", "");

		String[] arr = data.split(",", -1);
		int length = arr.length;
		String[] results = new String[length];
		for (int i = 0; i < length; i++) {
			results[i] = chageStr(arr[i]);
		}
		return results;
	}

	/**
	 * 构建字符数组
	 *
	 * @param data
	 * @return
	 */
	public static char[] buildArrayChar(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		data = data.trim();
		data = data.replaceAll("\\[", "").replaceAll("\\]", "");

		String[] arr = data.split(",", -1);
		int length = arr.length;
		char[] results = new char[length];
		for (int i = 0; i < length; i++) {
			results[i] = chageStr(arr[i]).charAt(0);
		}
		return results;
	}


	/**
	 * 处理字符串
	 *
	 * @param temp
	 * @return
	 */
	public static String chageStr(String temp) {
		if (temp.startsWith("\"")) {
			temp = temp.substring(1);
		}
		if (temp.endsWith("\"")) {
			temp = temp.substring(0, temp.length() - 1);
		}
		return temp;
	}

	/**
	 * 构建二维数组
	 * 例如[[1,2,3],[4,5,6],[7,8,9]]
	 *
	 * @param data
	 * @return
	 */
	public static int[][] buildMatrix(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		data = data.replaceAll(" ", "").substring(2, data.length() - 2);
		String[] arr = data.split("],\\[", -1);
		int row = arr.length;
		int cow = countString(arr[0], ',') + 1;
		int[][] results = new int[row][cow];
		for (int i = 0; i < row; i++) {
			String[] arr2 = arr[i].split(",", -1);
			for (int j = 0; j < cow; j++) {
				results[i][j] = Integer.valueOf(arr2[j]);
			}
		}

		return results;
	}

	/**
	 * 构建链表
	 *
	 * @param data
	 * @return
	 */
	public static ListNode buildListNode(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.equals("[]")) {
			return null;
		}
		data = data.replaceAll(" ", "");
		data = data.substring(1, data.length() - 1);
		String[] split = data.split(",", -1);
		int len = split.length;
		ListNode[] listNode = new ListNode[len + 1];
		listNode[0] = new ListNode(Integer.valueOf(split[0]));
		for (int i = 1; i < len; i++) {
			listNode[i] = new ListNode(Integer.valueOf(split[i]));
			listNode[i - 1].next = listNode[i];
		}
		return listNode[0];
	}

	/**
	 * 构建链表数组
	 *
	 * @param data
	 * @return
	 */
	public static ListNode[] buildListNodeArray(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.equals("[]")) {
			return null;
		}
		data = data.replaceAll(" ", "").substring(2, data.length() - 2);
		String[] arr = data.split("],\\[", -1);
		int row = arr.length;
		ListNode[] results = new ListNode[row];
		for (int i = 0; i < row; i++) {
			ListNode listNode = buildListNode("[" + arr[i] + "]");
			results[i] = listNode;
		}

		return results;

	}

	/**
	 * 构建带环形链表，pos是环的位置
	 *
	 * @param listNode
	 * @param pos
	 */
	public static void buildCycleListNode(ListNode listNode, int pos) {
		if (pos >= 0) {
			ListNode cur = listNode;
			if (cur == null) {
				return;
			}
			int i = 0;
			ListNode cycleNode = null;
			while (cur.next != null) {
				if (i == pos) {
					cycleNode = cur;
				}
				cur = cur.next;
				i++;
			}
			cur.next = cycleNode;
		}
	}

	/**
	 * 构造相交链表
	 *
	 * @param listA
	 * @param listB
	 * @param skipA
	 * @param skipB
	 */
	public static ListNode[] buildIntersectListNode(ListNode listA, ListNode listB, int skipA, int skipB) {
		ListNode[] listNodesArr = new ListNode[2];
		listNodesArr[0] = listA;
		listNodesArr[1] = listB;
		if (listA == null || listB == null || skipA < 0 || skipB < 0) {
			return listNodesArr;
		}
		int a = 1;
		ListNode p1 = listA;
		while (skipA > 0 && p1 != null) {
			if (a == skipA) {
				break;
			}
			p1 = p1.next;
			a++;
		}

		int b = 1;
		ListNode p2 = listB;
		while (skipB > 0 && p2 != null) {
			if (b == skipB) {
				break;
			}
			p2 = p2.next;
			b++;
		}
		if (p1 != null && p2 != null) {
			if (skipA == 0 && skipA == 0) {
				listNodesArr[1] = listA;
			} else if (skipA == 0) {
				p2.next = p1;
			} else if (skipB == 0) {
				p1.next = p2;
			} else {
				p1.next = null;
				p1.next = p2.next;
			}
		}

		return listNodesArr;

	}

	/**
	 * 构建树
	 *
	 * @param data
	 * @return
	 */
	public static TreeNode buildBinaryTree(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.equals("[]")) {
			return null;
		}

		data = data.replaceAll(" ", "");
		String s1 = data.substring(1, data.length() - 1);
		String[] partTree = s1.split(",", -1);

		TreeNode root = new TreeNode(Integer.parseInt(partTree[0]));
		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.offer(root);
		int i = 1;
		while (!queue.isEmpty() && i < partTree.length) {
			TreeNode node = queue.poll();
			if (i < partTree.length && partTree[i] != null && !partTree[i].equals("null")) {
				node.left = new TreeNode(Integer.parseInt(partTree[i]));
				queue.offer(node.left);
			}
			if (i + 1 < partTree.length && partTree[i + 1] != null && !partTree[i + 1].equals("null")) {
				node.right = new TreeNode(Integer.parseInt(partTree[i + 1]));
				queue.offer(node.right);
			}
			i += 2;
		}
		queue.clear();
		return root;
	}

	/**
	 * 字符串构建List
	 * 例如[1,2,3]
	 *
	 * @param data
	 * @return
	 */
	public static List buildList(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		if (data.equals("[]")) {
			return new ArrayList<>();
		}
		data = data.trim();
		data = data.substring(1, data.length() - 1);

		String splitStr;
		boolean flag = false;
		if (data.indexOf("[") >= 0) {
			splitStr = "],\\[";
			data = data.substring(1, data.length() - 1);
			flag = true;
		} else {
			splitStr = ",";
		}


		String[] arr = data.split(splitStr, -1);
		int length = arr.length;
		List list = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			String newData = arr[i];
			if (flag) {
				list.add(buildList("[" + newData + "]"));
			} else {
				if (arr[i] == null || arr[i].trim().length() == 0) {
					list.add(null);
				} else {
					if (judgeNumber(data)) {
						list.add(Integer.parseInt(arr[i]));
					} else {
						list.add(chageStr(arr[i]));
					}
				}
			}
		}
		return list;
	}


	/**
	 * 统计字符串中出现的某个字符个数
	 *
	 * @param str
	 * @param s
	 * @return
	 */
	private static int countString(String str, char s) {
		int count = 0;
		while (str.indexOf(s) != -1) {
			str = str.substring(str.indexOf(s) + 1, str.length());
			count++;
		}
		return count;
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


	public static void print(char[] array) {
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

	public static void print(ListNode[] array) {
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

	public static void print(Object[] array) {
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
				if (judgeNumber(data)) {
					System.out.print(data);
				} else {
					System.out.print("\"" + chageStr(data) + "\"");
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
	public static void print(int[][] matrix) {
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

	/**
	 * 竖向打印二叉树
	 *
	 * @param root 二叉树根节点
	 */
	public static void print(TreeNode root) {
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
	 * 打印
	 *
	 * @param obj
	 */
	public static void print(Object obj) {
		print(obj, null);
	}

	public static void print(Object obj, String ext) {
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
				} else if (item instanceof List) {
					if (i == 0) {
						System.out.println();
					}

					if (i < results.size() - 1) {
						print(item, ",");
					} else {
						print(item, null);
					}
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
				str.append(",").append(String.valueOf(p.val));
				p = p.next;
			}
			System.out.print(str.append("]"));
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
			} else if (className.equals("[C")) {
				print((char[]) obj);
			} else if (className.equals("[Lcom.learn.java.leetcode.base.structure.ListNode;")) {
				print((ListNode[]) obj);
			} else {
				print((Object[]) obj);
			}
		} else if (obj instanceof TreeNode) {
			print((TreeNode) obj);
		}

	}

	/**
	 * 判读字符串是否数字
	 *
	 * @param str
	 * @return
	 */
	private static boolean judgeNumber(String str) {
		return str.matches("-?[0-9]+.*[0-9]*");

	}

	/**
	 * 格式化对象为字符串
	 *
	 * @param obj
	 * @return
	 */
	public static String format(Object obj) {
		StringBuffer stringBuffer = new StringBuffer();
		Utilitys.format(obj, stringBuffer);
		String testInputResult = stringBuffer.toString();
		return testInputResult;
	}

	private static void format(Object obj, StringBuffer stringBuffer) {
		if (obj == null) {
			stringBuffer.append("null");
			return;
		}
		if (obj instanceof Integer || obj instanceof Long || obj instanceof Double || obj instanceof Float || obj instanceof Boolean) {
			stringBuffer.append(obj.toString());
		} else if (obj instanceof String) {
			stringBuffer.append("\"" + chageStr(obj.toString()) + "\"");
		} else if (obj instanceof List) {

			List results = (List) obj;
			stringBuffer.append("[");
			for (int i = 0; i < results.size(); i++) {
				Object item = results.get(i);
				if (item == null) {
					stringBuffer.append("null");
				}
				if (item instanceof Integer || item instanceof String || item instanceof Long || item instanceof Double || item instanceof Float || item instanceof Boolean) {
					stringBuffer.append(item);
				} else if (item instanceof List) {
					format(item, stringBuffer);
				}
				if (i < results.size() - 1) {
					stringBuffer.append(',');
				}
			}
			stringBuffer.append("]");
		} else if (obj instanceof ListNode) {
			ListNode listNode = (ListNode) obj;
			stringBuffer.append("[" + String.valueOf(listNode.val));
			ListNode p = listNode.next;
			while (p != null) {
				stringBuffer.append(",").append(String.valueOf(p.val));
				p = p.next;
			}
			stringBuffer.append("]");
		} else if (obj.getClass().isArray()) {
			String className = obj.getClass().getName();
			if (className.equals("[I")) {
				format((int[]) obj, stringBuffer);
			} else if (className.equals("[[I")) {
				format((int[][]) obj, stringBuffer);
			} else if (className.equals("[C")) {
				format((char[]) obj, stringBuffer);
			} else if (className.equals("[Lcom.learn.java.leetcode.base.structure.ListNode;")) {
				format((ListNode[]) obj, stringBuffer);
			} else {
				format((Object[]) obj, stringBuffer);
			}
		} else if (obj instanceof TreeNode) {
			format((TreeNode) obj, stringBuffer);
		}
	}


	private static void format(int[] array, StringBuffer stringBuffer) {
		if (array == null) {
			stringBuffer.append("null");
		}
		stringBuffer.append("[");
		for (int i = 0; i < array.length; i++) {
			Object dataObj = array[i];
			if (dataObj == null) {
				stringBuffer.append("null");
			} else {
				String data = dataObj.toString();
				stringBuffer.append(data);
			}
			if (i < array.length - 1) {
				stringBuffer.append(',');
			}
		}
		stringBuffer.append("]");
	}


	private static void format(int[][] matrix, StringBuffer stringBuffer) {
		if (matrix == null) {
			return;
		}
		int row = matrix.length;
		int cow = matrix[0].length;
		stringBuffer.append("[");
		for (int i = 0; i < row; i++) {
			stringBuffer.append("[");
			for (int j = 0; j < cow; j++) {
				stringBuffer.append(matrix[i][j]);
				if (j < cow - 1) {
					stringBuffer.append(',');
				}
			}
			stringBuffer.append("]");
			if (i < row - 1) {
				stringBuffer.append(',');
			}
		}
		stringBuffer.append("]");
	}

	private static void format(char[] array, StringBuffer stringBuffer) {
		if (array == null) {
			stringBuffer.append("null");
		}
		stringBuffer.append("[");
		for (int i = 0; i < array.length; i++) {
			Object dataObj = array[i];
			if (dataObj == null) {
				stringBuffer.append("null");
			} else {
				String data = dataObj.toString();
				stringBuffer.append("\"").append(data).append("\"");
			}
			if (i < array.length - 1) {
				stringBuffer.append(',');
			}
		}
		stringBuffer.append("]");
	}

	private static void format(ListNode[] array, StringBuffer stringBuffer) {
		if (array == null) {
			stringBuffer.append("[]");
		}
		stringBuffer.append("[");
		for (int i = 0; i < array.length; i++) {
			ListNode listNode = array[i];
			if (listNode == null) {
				stringBuffer.append("[]");
			} else {
				format(listNode, stringBuffer);
			}
			if (i < array.length - 1) {
				stringBuffer.append(',');
			}
		}
		stringBuffer.append("]");
	}

	private static void format(Object[] array, StringBuffer stringBuffer) {
		if (array == null) {
			stringBuffer.append("null");
		}
		stringBuffer.append("[");
		for (int i = 0; i < array.length; i++) {
			Object dataObj = array[i];
			if (dataObj == null) {
				stringBuffer.append("null");
			} else {
				String data = dataObj.toString();

				if (judgeNumber(data)) {
					stringBuffer.append(data);
				} else {
					stringBuffer.append("\"").append(chageStr(data)).append("\"");
				}

			}
			if (i < array.length - 1) {
				stringBuffer.append(',');
			}
		}
		stringBuffer.append("]");
	}


	private static void format(TreeNode treeNode, StringBuffer stringBuffer) {
		if (treeNode == null) {
			stringBuffer.append("null");
		}
		stringBuffer.append("[");
		stringBuffer.append(levelOrderFormat(treeNode));
		stringBuffer.append("]");

	}


	private static String levelOrderFormat(TreeNode root) {
		TreeNode current = root;
		StringBuffer stringBuffer = new StringBuffer();
		if (current != null) {
			Queue<TreeNode> queue = new LinkedList();
			Stack<TreeNode> stack = new Stack<>();
			queue.offer(current);
			while (!queue.isEmpty()) {
				current = queue.poll();
				if (current != null) {
					stack.push(current);
					//stringBuffer.append(current.val).append(',');
					if (current.left != null) {
						queue.offer(current.left);
					} else {
						queue.offer(null);
					}
					if (current.right != null) {
						queue.offer(current.right);
					} else {
						queue.offer(null);
					}
				} else {
					//stringBuffer.append("null").append(',');
					stack.push(null);
				}
			}
			while (!stack.isEmpty()) {
				if (stack.peek() == null) {
					stack.pop();
				} else {
					break;
				}
			}


			while (!stack.isEmpty()) {
				TreeNode treeNode = stack.pop();
				String item = treeNode != null ? (treeNode.val + ",") : "null,";
				stringBuffer.insert(0, item);
			}
			if (stringBuffer.length() > 0) {
				stringBuffer.deleteCharAt(stringBuffer.length() - 1);
			}
		}
		return stringBuffer.toString();
	}


	/**
	 * 批量测试
	 *
	 * @param mainClass
	 */
	public static boolean test(Class<? extends CallBack> mainClass) {
		List<List<String>> testList = Utilitys.readTxtFile(mainClass);
		//类方法定义
		List<String> classList = testList.get(0);
		//备注
		String algorithmRemark = classList.get(0);


		System.out.println(algorithmRemark);
		System.out.println("-----------------------------");

		boolean testFlag = true;
		if (classList.size() <= 1) {
			//throw new RuntimeException("未定义算法主类和方法!");
			System.out.println("未定义算法主类和方法!");
			System.out.println("-----------------------------");
			return false;
		}

		for (int i = 1; i < classList.size(); i++) {
			String funcStr = classList.get(i);
			if (funcStr.trim().length() <= 0) {
				continue;
			}
			String funcRemark = null;
			int index = funcStr.indexOf("#");
			if (index >= 0) {
				funcRemark = funcStr.substring(index + 1);
				funcStr = funcStr.substring(0, index);
			}
			String[] funcArr = funcStr.split("\\.");
			if (funcArr.length < 2) {
				throw new RuntimeException("方法参数定义错误,应该是: className.funcName");
			}
			String algorithmClassName = funcArr[0];
			String algorithmFuncName = funcArr[1].trim();
			if (StringUtils.isBlank(funcRemark)) {
				funcRemark = algorithmFuncName;
			} else {
				funcRemark = algorithmFuncName + " " + funcRemark;
			}

			System.out.println(funcRemark);
			System.out.println("-----------------------------");

			int jCount = 1;
			for (int j = 1; j < testList.size(); j++) {
				//数据
				List<String> dataList = testList.get(j);
				if(dataList!=null&&dataList.size()>0) {
					System.out.println("第" + jCount + "组数据:");
					boolean resultFlag = Utilitys.test(mainClass, algorithmClassName, algorithmFuncName, dataList);
					if (!resultFlag) {
						testFlag = false;
					}
					System.out.println("-----------------------------");
					jCount++;
				}
			}
		}
		if (!testFlag) {
			System.out.println("存在错误!");
			System.out.println("-----------------------------");
		}
		return testFlag;
	}

	/**
	 * 测试单条
	 *
	 * @param mainClass
	 * @param algorithmClassName
	 * @param algorithmFuncName
	 * @param dataList
	 */
	public static boolean test(Class<? extends CallBack> mainClass, String algorithmClassName, String algorithmFuncName, List<String> dataList) {
		boolean testFlag = true;
		try {
			String packageName = mainClass.getPackage().getName();
			CallBack callBack = mainClass.newInstance();
			Class<?> algorithmClass = Class.forName(packageName + "." + algorithmClassName);
			Method[] methods = algorithmClass.getMethods();
			//algorithmClass.getDeclaredMethods();

			for (int i = 0; i < methods.length; i++) {
				Method method = methods[i];
				if (algorithmFuncName.equals(methods[i].getName())) {

					boolean invokeFlag = true;
					// 得到方法的返回值类型的类型
					Class<?> returnType = methods[i].getReturnType();
					String returnTypeName = returnType.getName();

					Class<?>[] parameterTypes = methods[i].getParameterTypes();
					int paramLength = parameterTypes.length;
					Object[] inputObjArr = new Object[paramLength];

					//临时集合，用于输入和输出之间传递
					List tempList = new ArrayList();

					System.out.println("输入:");
					//打印输入参数
					try {
						callBack.printInput(dataList, paramLength);
					} catch (Exception e) {
						e.printStackTrace();
						testFlag = false;
						invokeFlag = false;
					}

					//如果入参需要重构
					try {
						callBack.inputBuild(parameterTypes, inputObjArr, dataList, tempList);
					} catch (Exception e) {
						e.printStackTrace();
						testFlag = false;
						invokeFlag = false;
					}
					long startTime = System.currentTimeMillis();
					//调用算法
					Object outputObj = null;
					try {
						if (invokeFlag) {
							outputObj = method.invoke(algorithmClass.newInstance(), inputObjArr);
						}
					} catch (Exception e) {
						e.printStackTrace();
						testFlag = false;
					}
					long endTime = System.currentTimeMillis();
					//测试
					if (!"void".equals(returnTypeName)) {
						//打印输出
						try {
							callBack.printOutput(outputObj);
						} catch (Exception e) {
							e.printStackTrace();
							testFlag = false;
						}
					}

					List<String> trueResultOutputList = new ArrayList<>();
					for (int k = paramLength; k < dataList.size(); k++) {

						String trueResult = dataList.get(k);
						if (StringUtils.isNotBlank(trueResult)) {
							if (trueResult.startsWith("=")) {
								trueResult = trueResult.substring(1);
								if (StringUtils.isNotBlank(trueResult)) {
									trueResultOutputList.add(trueResult);
								}
							} else if (inputPattern.matcher(trueResult).matches()) {
								/**
								 * 验证输入参数
								 */
								int inputIndex = Integer.parseInt(trueResult.substring(1, 2));
								String trueInputResult = trueResult.substring(3);
								if (StringUtils.isNotBlank(trueInputResult) && inputIndex >= 0 && inputIndex < inputObjArr.length) {
									try {
										boolean resultFlag = callBack.inputVerify(inputObjArr, trueInputResult, outputObj, inputIndex, tempList);
										if (!resultFlag) {
											testFlag = false;
										}
									} catch (Exception e) {
										e.printStackTrace();
										testFlag = false;
										callBack.printInputVerify(trueInputResult, e.getMessage(), false);
									}
								}
							}
						}
					}

					if (trueResultOutputList.size() > 0) {
						/**
						 * 验证输出结果
						 */
						try {
							boolean resultFlag = callBack.outputVerify(inputObjArr, trueResultOutputList, outputObj, dataList, tempList);
							if (!resultFlag) {
								testFlag = false;
							}
						} catch (Exception e) {
							e.printStackTrace();
							testFlag = false;
							callBack.printOutVerify(trueResultOutputList, e.getMessage(), false);
						}
					}

					System.out.println("计算时长: " + (endTime - startTime) + "ms");

					break;

				}

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			testFlag = false;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			testFlag = false;
		} catch (InstantiationException e) {
			e.printStackTrace();
			testFlag = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testFlag;
	}

	/**
	 * 用于实现调用多个方法的列表执行
	 *
	 * @param mainClass
	 * @param funcList
	 * @param paramList
	 * @return
	 */
	public static List funcListTest(Class<? extends CallBack> mainClass, List funcList, List paramList) {
		List retList = new ArrayList();
		if (funcList != null && funcList.size() > 0 && paramList != null && paramList.size() > 0) {
			Object obj = null;
			Class<?> algorithmClass = null;
			String packageName = mainClass.getPackage().getName();
			for (int i = 0; i < funcList.size(); i++) {
				String funcName = funcList.get(i).toString();
				List<Integer> params = (List<Integer>) paramList.get(i);
				if (i == 0) {
					//第一个值是构造方法
					try {
						algorithmClass = Class.forName(packageName + "." + funcName);

						Constructor<?>[] constructors = algorithmClass.getConstructors();
						for (int j = 0; j < constructors.length; j++) {
							Constructor c = constructors[j];
							//通过参数个数判断,可能有更好的办法
							if (c.getParameterTypes().length == params.size()) {
								obj = params.size() == 0 ? c.newInstance() : c.newInstance(params.toArray());
								break;
							}

						}
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					//构造函数返回结果
					retList.add(null);
				} else {
					Method[] methods = algorithmClass.getDeclaredMethods();
					for (int k = 0; k < methods.length; k++) {
						Method method = methods[k];
						if (funcName.equals(method.getName())) {
							Class<?>[] parameterTypes = method.getParameterTypes();
							int paramLength = parameterTypes.length;
							Object[] inputObjArr = new Object[paramLength];
							for (int j = 0; j < paramLength; j++) {
								String parameterName = parameterTypes[j].getName();
								Object data = params.get(j);
								if (parameterName.equals("int")) {
									inputObjArr[j] = Integer.parseInt(data.toString());
								} else if (parameterName.equals("long")) {
									inputObjArr[j] = Long.parseLong(data.toString());
								} else if (parameterName.equals("double")) {
									inputObjArr[j] = Double.parseDouble(data.toString());
								} else if (parameterName.equals("float")) {
									inputObjArr[j] = Float.parseFloat(data.toString());
								} else if (parameterName.equals("boolean")) {
									inputObjArr[j] = Boolean.parseBoolean(data.toString());
								} else if (parameterName.equals("java.lang.Integer")) {
									inputObjArr[j] = Integer.valueOf(data.toString());
								} else if (parameterName.equals("java.lang.Long")) {
									inputObjArr[j] = Long.valueOf(data.toString());
								} else if (parameterName.equals("java.lang.Double")) {
									inputObjArr[j] = Double.valueOf(data.toString());
								} else if (parameterName.equals("java.lang.Float")) {
									inputObjArr[j] = Float.valueOf(data.toString());
								} else if (parameterName.equals("java.lang.Boolean")) {
									inputObjArr[j] = Boolean.valueOf(data.toString());
								} else if (parameterName.equals("java.lang.String")) {
									inputObjArr[j] = chageStr(data.toString());
								} else if (parameterName.equals("[I")) {
									int[] array = buildArray(data.toString());
									inputObjArr[j] = array;
								} else if (parameterName.equals("[C")) {
									char[] array = Utilitys.buildArrayChar(data.toString());
									inputObjArr[j] = array;
								} else if (parameterName.equals("[[I")) {
									int[][] matrix = buildMatrix(data.toString());
									inputObjArr[j] = matrix;
								} else if (parameterName.equals("[Ljava.lang.String;")) {
									String[] array = buildArrayString(data.toString());
									inputObjArr[j] = array;
								} else if (parameterName.equals("java.util.List")) {
									List list = buildList(data.toString());
									inputObjArr[j] = list;
								}
							}
							//调用方法
							try {
								Object outputObj = method.invoke(obj, inputObjArr);
								retList.add(outputObj);
							} catch (IllegalAccessException e) {
								e.printStackTrace();
							} catch (InvocationTargetException e) {
								e.printStackTrace();
							}

						}
					}
				}

			}
		}
		return retList;
	}

	/**
	 * 读入数据
	 *
	 * @param clazz
	 * @return
	 */
	public static List<List<String>> readTxtFile(Class clazz) {
		String packageName = clazz.getPackage().getName();
		String path = "/" + packageName.replaceAll("\\.", "/") + "/README.md";
		String str = Utilitys.readTxtFile(path);
		String[] strArr = str.split("---\r", -1);
		List<List<String>> dataList = new ArrayList<>();
		for (int i = 0; i < strArr.length; i++) {
			List<String> itemsList = new ArrayList<>();
			String[] strArr2 = strArr[i].split("\r", -1);
			for (int j = 0; j < strArr2.length; j++) {
				String tempTrim = strArr2[j].trim();
				if (tempTrim.length() > 0 && !tempTrim.startsWith("#")) {
					String temp = strArr2[j];
					itemsList.add(temp);
				}
			}
			dataList.add(itemsList);
		}
		return dataList;
	}


	public static String readTxtFile(String path) {
		StringBuilder lastJson = new StringBuilder();
		BufferedReader reader = null;
		try {
			InputStream is = Utilitys.class.getResourceAsStream(path);
			reader = new BufferedReader(new InputStreamReader(is));
			String tempString = null;

			int i = 0;
			// 一次读入一行，直到读入null为文件结束
			boolean flag = false;
			while ((tempString = reader.readLine()) != null) {
				if (tempString.equals("# 测试用例")) {
					flag = true;
				}
				if (flag && tempString.equals("```")) {
					i++;
				} else {
					if (i == 1) {
						lastJson.append(tempString).append("\r");
					}
				}
				if (i == 2) {
					break;
				}

			}

		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return lastJson.toString();
	}

	/**
	 * 根据trueResult对应的长度，截取testInputResult对应的数组并转化成字符串
	 * 适用于026,027
	 *
	 * @param testInputResult
	 * @param trueResult
	 * @return
	 */
	public static String copyNewArrayToString(String testInputResult, String trueResult) {
		int[] array = buildArray(testInputResult);
		int[] newArray = Arrays.copyOf(array, Integer.parseInt(trueResult));
		StringBuffer stringBuffer = new StringBuffer();
		format(newArray, stringBuffer);
		testInputResult = stringBuffer.toString();
		return testInputResult;
	}

	public static boolean compareArrays(int[] array1, int[] array2) {
		if (array1 == null && array2 == null) {
			return true;
		}
		if (array1 == null || array2 == null) {
			return false;
		}
		if (array1.length != array2.length) {
			return false;
		}


		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean compareMatrices(int[][] m1, int[][] m2) {
		if (m1 == null && m2 == null) {
			return true;
		}
		if (m1 == null || m2 == null) {
			return false;
		}
		if (m1.length != m2.length || m1[0].length != m2[0].length) {
			return false;
		}
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Compare 2 lists ignoring order.
	 */
	public static <T> boolean compareListsIgnoreOrder(List<T> list1, List<T> list2) {
		if (list1 == null && list2 == null) {
			return true;
		}
		if (list1 == null || list2 == null) {
			return false;
		}
		if (list1.size() != list2.size()) {
			return false;
		}
		Set<T> set1 = new HashSet<>(list1);
		Set<T> set2 = new HashSet<>(list2);
		return set1.equals(set2);
	}

	public static boolean compareTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		if (root1.val != root2.val) {
			return false;
		}
		return compareTrees(root1.left, root2.left) && compareTrees(root1.right, root2.right);
	}

	/**
	 * 二叉树搜索结点
	 *
	 * @param root
	 * @param val
	 * @return
	 */
	public static TreeNode searchBinaryTree(TreeNode root, int val) {
		if (root == null) {
			return null;
		}
		if (root.val == val) {
			return root;
		} else {
			TreeNode search = searchBinaryTree(root.left, val);
			if (search != null) {
				return search;
			} else {
				return searchBinaryTree(root.right, val);
			}
		}
	}

	/**
	 * 搜索链表
	 *
	 * @param head
	 * @param val
	 * @return
	 */
	public static ListNode searchListNode(ListNode head, int val) {
		if (head == null) {
			return null;
		}
		ListNode p = head;
		while (p != null) {
			if (p.val == val) {
				return p;
			}
			p = p.next;
		}
		return null;
	}

	/**
	 * 调用test
	 *
	 * @param className
	 * @return
	 */
	public static boolean funcInvoke(String className) {
		try {
			Class<?> algorithmClass = Class.forName(className);
			CallBack callBack = (CallBack) algorithmClass.newInstance();
			return test(callBack.getClass());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 获取某个文件夹下的所有文件
	 *
	 * @param packageList 存放包名称的list
	 * @param path        文件夹的路径
	 * @return
	 */
	public static void getAllFileName(String path, List<String> packageList) {
		File file = new File(path);
		File[] tempList = file.listFiles();
		for (int i = 0; i < tempList.length; i++) {
			if (tempList[i].isDirectory()) {
				String packageName = tempList[i].getName();
				if (packageName.indexOf("lc") >= 0) {
					packageList.add(packageName);
				}
			}
		}
	}


	private static Comparator<String> getComparator()
	{
		Comparator<String> c = new Comparator<String>()
		{
			public int compare(String o1, String o2)
			{
				return o1.compareTo(o2);
			}
		};

		return c;
	}

	public static void sort(JsonElement e)
	{
		if (e.isJsonNull())
		{
			return;
		}

		if (e.isJsonPrimitive())
		{
			return;
		}

		if (e.isJsonArray())
		{
			JsonArray a = e.getAsJsonArray();
			for (Iterator<JsonElement> it = a.iterator(); it.hasNext();)
			{
				sort(it.next());
			}
			return;
		}

		if (e.isJsonObject())
		{
			Map<String, JsonElement> tm = new TreeMap<String, JsonElement>(getComparator());
			for (Map.Entry<String, JsonElement> en : e.getAsJsonObject().entrySet())
			{
				tm.put(en.getKey(), en.getValue());
			}

			for (Map.Entry<String, JsonElement> en : tm.entrySet())
			{
				e.getAsJsonObject().remove(en.getKey());
				e.getAsJsonObject().add(en.getKey(), en.getValue());
				sort(en.getValue());
			}
			return;
		}
	}

	/**
	 * 排序Json字符串
	 * @param json
	 * @return
	 */
	public static String sortJsonObject(String json){
		Gson g = new GsonBuilder()./*setPrettyPrinting().*/create();

		JsonParser p = new JsonParser();
		JsonElement e = p.parse(json);

		sort(e);
		//return g.toJson(e);
		return e.toString();
	}


	/*public static TreeNode buildTree(String data) {
		if (data.equals("[]")) {
			return null;
		}
		data = data.substring(1, data.length() - 1);
		String[] split = data.split(",");
		int len  = split.length;
		TreeNode[] treeNodes = new TreeNode[len];
		//data = data.substring(1, data.length() - 1);
		for (int i = 0; i < len; i++) {
			if (!split[i].equals("null")) {
				treeNodes[i] = new TreeNode(Integer.valueOf(split[i]));
			}
		}
		for (int i = 0; i < len; i++) {
			if (treeNodes[i] != null) {
				int leftIndex = i * 2 + 1;
				if (leftIndex < len) {
					treeNodes[i].left = treeNodes[leftIndex];
				}
				int rightIndex = leftIndex + 1;
				if (rightIndex < len) {
					treeNodes[i].right = treeNodes[rightIndex];
				}
			}
		}
		return treeNodes[0];
	}


	public static String[] intialInput(String s) {
		String s1=s.substring(1,s.length()-1);
		String[] partTree=s1.split(",");
		return partTree;
	}

	public static TreeNode createNode(TreeNode rot,int index,String[] partTree) {				//传入root给rot后，由于rot会new一下，从而指向别的地方，
		if(index>= partTree.length ) {						//从而root实际指向位置不变，所以返回值类型为TreeNode
			return null;
		}
		if(partTree[index].equals("null")  ) {					//equals判断，而不是==
			return null;
		}
		rot=new TreeNode(Integer.parseInt(partTree[index]));
		rot.left=createNode(rot.left,2*index+1,partTree);
		rot.right=createNode(rot.right,2*index+2,partTree);
		return rot;
	}

	public static TreeNode createTree(String s) {
		String[] partTree=intialInput(s);
		TreeNode root=createNode(null,0,partTree);
		return root;
	}*/


	/*public static void print(TreeNode root) {
		print(root, 0);
	}

	private static final String space = "      ";

	private static void print(TreeNode node, int deep) {
		if (node == null) {
			printSpace(deep);
			System.out.println("#");
			return;
		}
		print(node.right, deep + 1);
		printSpace(deep);
		printNode(node.val);
		print(node.left, deep + 1);
	}

	private static void printSpace(int count) {
		for (int i = 0; i < count; i++) {
			System.out.printf(space);
		}
	}

	private static void printNode(int val) {
		StringBuilder res = new StringBuilder(val + "<");
		int spaceNum = space.length() - res.length();
		for (int i = 0; i < spaceNum; i++) {
			res.append(" ");
		}
		System.out.println(res);
	}*/


}
