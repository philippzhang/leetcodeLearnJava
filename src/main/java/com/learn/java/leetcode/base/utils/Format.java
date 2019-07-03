package com.learn.java.leetcode.base.utils;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.learn.java.leetcode.base.Utilitys;
import com.learn.java.leetcode.base.structure.*;


import java.util.*;

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
		if(stringBuffer.length()>0&&stringBuffer.charAt(stringBuffer.length()-1)==','){
			stringBuffer.deleteCharAt(stringBuffer.length()-1);
		}
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
				if (item instanceof Integer || item instanceof Long || item instanceof Double || item instanceof Float || item instanceof Boolean) {
					stringBuffer.append(item);
				}else if(item instanceof String ){
					stringBuffer.append("\"" + StringUtil.changeStr(item.toString()) + "\"");
				} else if (item instanceof List) {
					format(item, stringBuffer);
				} else if (item instanceof Interval) {
					Interval interval = (Interval) item;
					stringBuffer.append('[').append(String.valueOf(interval.start)).append(',').append(String.valueOf(interval.end));
					stringBuffer.append(']');
				} else if(item instanceof TreeNode){
					format((TreeNode) item, stringBuffer);
				} else if (item instanceof Node) {
					format((Node) item, stringBuffer);
				} else if(item!=null){
					throw new RuntimeException("未定义的List泛型，转换失败!");
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
		} else if (obj instanceof Interval) {
			Interval interval = (Interval) obj;
			stringBuffer.append('[').append(String.valueOf(interval.start)).append(',').append(String.valueOf(interval.end));
			stringBuffer.append(']');
		} else if (obj.getClass().isArray()) {
			String className = obj.getClass().getName();
			if (className.equals("[I")) {
				format((int[]) obj, stringBuffer);
			} else if (className.equals("[[I")) {
				format((int[][]) obj, stringBuffer);
			} else if (className.equals("[D")) {
				format((double[]) obj, stringBuffer);
			} else if (className.equals("[[D")) {
				format((double[][]) obj);
			} else if (className.equals("[F")) {
				format((float[]) obj, stringBuffer);
			} else if (className.equals("[[F")) {
				format((float[][]) obj);
			} else if (className.equals("[B")) {
				format((boolean[]) obj, stringBuffer);
			} else if (className.equals("[[B")) {
				format((boolean[][]) obj);
			} else if (className.equals("[C")) {
				format((char[]) obj, stringBuffer);
			} else if (className.equals("[[C")) {
				format((char[][]) obj, stringBuffer);
			} else if (className.equals("[Ljava.lang.String;")){
				format((String[]) obj);
			} else if (className.equals("[[Ljava.lang.String;")){
				format((String[][]) obj);
			} else if (className.equals("[Lcom.learn.java.leetcode.base.structure.ListNode;")) {
				format((ListNode[]) obj, stringBuffer);
			} else {
				format((Object[]) obj, stringBuffer);
			}
		} else if (obj instanceof TreeNode) {
			format((TreeNode) obj, stringBuffer);
		} else if (obj instanceof Node) {
			format((Node) obj, stringBuffer);
		} else if(obj instanceof NestedInteger){
			format((NestedInteger) obj,stringBuffer);
		} else{
			throw new RuntimeException("未定义的类型，转换失败!");
		}
	}


	private static void format(int[] array, StringBuffer stringBuffer) {
		if (array == null) {
			stringBuffer.append("null");
			return;
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

	private static void format(boolean[] array, StringBuffer stringBuffer) {
		if (array == null) {
			stringBuffer.append("null");
			return;
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

	private static void format(double[] array, StringBuffer stringBuffer) {
		if (array == null) {
			stringBuffer.append("null");
			return;
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


	private static void format(float[] array, StringBuffer stringBuffer) {
		if (array == null) {
			stringBuffer.append("null");
			return;
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


	private static void format(boolean[][] matrix, StringBuffer stringBuffer) {
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

	private static void format(double[][] matrix, StringBuffer stringBuffer) {
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

	private static void format(float[][] matrix, StringBuffer stringBuffer) {
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
			return;
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

	private static void format(char[][] matrix, StringBuffer stringBuffer) {
		if (matrix == null) {
			return;
		}
		int row = matrix.length;
		int cow = matrix[0].length;
		stringBuffer.append("[");
		for (int i = 0; i < row; i++) {
			stringBuffer.append("[");
			for (int j = 0; j < cow; j++) {
				stringBuffer.append("\"").append(matrix[i][j]).append("\"");
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

	private static void format(String[] array, StringBuffer stringBuffer) {
		if (array == null) {
			stringBuffer.append("null");
			return;
		}
		stringBuffer.append("[");
		for (int i = 0; i < array.length; i++) {
			Object dataObj = array[i];
			if (dataObj == null) {
				stringBuffer.append("null");
			} else {
				String data = dataObj.toString();
				stringBuffer.append("\"" + StringUtil.changeStr(data) + "\"");
			}
			if (i < array.length - 1) {
				stringBuffer.append(',');
			}
		}
		stringBuffer.append("]");
	}

	private static void format(String[][] matrix, StringBuffer stringBuffer) {
		if (matrix == null) {
			return;
		}
		int row = matrix.length;
		int cow = matrix[0].length;
		stringBuffer.append("[");
		for (int i = 0; i < row; i++) {
			stringBuffer.append("[");
			for (int j = 0; j < cow; j++) {
				stringBuffer.append("\"").append(matrix[i][j]).append("\"");
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
			return;
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
			return;
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
	 * 格式化Node
	 * @param node
	 * @param stringBuffer
	 */
	private static void format(Node node, StringBuffer stringBuffer) {
		if (node == null) {
			stringBuffer.append("null");
			return;
		}
		JsonObject jsonObject = node2JsonObject(node);

		nodeAddId(jsonObject);

		stringBuffer.append(Utilitys.sortJsonObject(jsonObject.toString()));
	}


	private static JsonObject node2JsonObject(Node cur) {
		if (cur == null) {
			return null;
		}
		JsonObject jsonObject = new JsonObject();

		JsonArray jsonArray = new JsonArray();
		if (cur.children != null) {
			List<Node> child = cur.children;
			if(child!=null&&child.size()>0){

				for(int i = 0;i<child.size();i++){
					Node temp = child.get(i);
					jsonArray.add(node2JsonObject(temp));
				}
			}
			jsonObject.add("children",jsonArray);
		}else {
			jsonObject.add("children",jsonArray);
		}

		jsonObject.addProperty("val", cur.val);

		return jsonObject;
	}

	private static void nodeAddId(JsonObject rootObject){
		int index = 1;
		Queue<JsonObject> queue = new LinkedList<>();
		queue.offer(rootObject);
		while(!queue.isEmpty()){
			JsonObject jsonObject = queue.poll();
			jsonObject.addProperty("$id", String.valueOf(index++));
			JsonArray jsonArray = jsonObject.getAsJsonArray("children");
			if(jsonArray!=null&&jsonArray.size()>0){
				for(int i = 0;i< jsonArray.size();i++){
					JsonElement childJsonElement = jsonArray.get(i);
					JsonObject childJsonObject = childJsonElement != null && !childJsonElement.isJsonNull() ? childJsonElement.getAsJsonObject() : null;
					if (childJsonObject != null) {
						queue.offer(childJsonObject);
					}
				}
			}
		}
	}

	private static void format(NestedInteger nestedInteger, StringBuffer stringBuffer) {
		if(nestedInteger.isInteger()){
			stringBuffer.append(nestedInteger.getInteger()).append(",");
		}else {
			stringBuffer.append("[");
			List<NestedInteger> list = nestedInteger.getList();
			if(list!=null&&list.size()>0){
				for(int i =0;i<list.size();i++) {
					format(list.get(i), stringBuffer);
				}
			}
			if(stringBuffer.length()>0&&stringBuffer.charAt(stringBuffer.length()-1)==','){
				stringBuffer.deleteCharAt(stringBuffer.length()-1);
			}
			stringBuffer.append("]");
		}


	}

}
