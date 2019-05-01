package com.learn.java.leetcode.base.utils;

import com.learn.java.leetcode.base.structure.ListNode;
import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 各种数据结构输出
 */
public class Format {

	/**
	 * 格式化对象为字符串
	 *
	 * @param obj
	 * @return
	 */
	public static String format(Object obj) {
		StringBuffer stringBuffer = new StringBuffer();
		format(obj, stringBuffer);
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
			stringBuffer.append("\"" + StringUtil.changeStr(obj.toString()) + "\"");
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

				if (StringUtil.judgeNumber(data)) {
					stringBuffer.append(data);
				} else {
					stringBuffer.append("\"").append(StringUtil.changeStr(data)).append("\"");
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

}
