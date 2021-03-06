package com.learn.java.leetcode.base.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.learn.java.leetcode.base.structure.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 构建各种数据结构
 */
public class Build {
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
		if (data.equals("[]")) {
			return new int[]{};
		}
		data = data.replaceAll("\\[", "").replaceAll("\\]", "");

		String[] arr = data.split(",", -1);
		int length = arr.length;
		int[] results = new int[length];
		for (int i = 0; i < length; i++) {
			results[i] = Integer.parseInt(arr[i].trim());
		}
		return results;
	}

	public static int[] buildArray(List list) {
		if (list == null || list.size() == 0) {
			return null;
		}
		int[] results = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			results[i] = Integer.parseInt(list.get(i).toString());
		}
		return results;
	}

	public static boolean[] buildArrayBoolean(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		data = data.trim();
		if (data.equals("[]")) {
			return new boolean[]{};
		}
		data = data.replaceAll("\\[", "").replaceAll("\\]", "");

		String[] arr = data.split(",", -1);
		int length = arr.length;
		boolean[] results = new boolean[length];
		for (int i = 0; i < length; i++) {
			results[i] = Boolean.parseBoolean(arr[i].trim());
		}
		return results;
	}

	public static boolean[] buildArrayBoolean(List list) {
		if (list == null || list.size() == 0) {
			return null;
		}
		boolean[] results = new boolean[list.size()];
		for (int i = 0; i < list.size(); i++) {
			results[i] = Boolean.parseBoolean(list.get(i).toString());
		}
		return results;
	}

	public static double[] buildArrayDouble(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		data = data.trim();
		if (data.equals("[]")) {
			return new double[]{};
		}
		data = data.replaceAll("\\[", "").replaceAll("\\]", "");

		String[] arr = data.split(",", -1);
		int length = arr.length;
		double[] results = new double[length];
		for (int i = 0; i < length; i++) {
			results[i] = Double.parseDouble(arr[i].trim());
		}
		return results;
	}

	public static double[] buildArrayDouble(List list) {
		if (list == null || list.size() == 0) {
			return null;
		}
		double[] results = new double[list.size()];
		for (int i = 0; i < list.size(); i++) {
			results[i] = Double.parseDouble(list.get(i).toString());
		}
		return results;
	}

	public static float[] buildArrayFloat(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		data = data.trim();
		if (data.equals("[]")) {
			return new float[]{};
		}
		data = data.replaceAll("\\[", "").replaceAll("\\]", "");

		String[] arr = data.split(",", -1);
		int length = arr.length;
		float[] results = new float[length];
		for (int i = 0; i < length; i++) {
			results[i] = Float.parseFloat(arr[i].trim());
		}
		return results;
	}

	public static float[] buildArrayFloat(List list) {
		if (list == null || list.size() == 0) {
			return null;
		}
		float[] results = new float[list.size()];
		for (int i = 0; i < list.size(); i++) {
			results[i] = Float.parseFloat(list.get(i).toString());
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
		if (data.equals("[]")) {
			return new String[]{};
		}
		data = data.replaceAll("\\[", "").replaceAll("\\]", "");

		String[] arr = data.split(",", -1);
		int length = arr.length;
		String[] results = new String[length];
		for (int i = 0; i < length; i++) {
			results[i] = StringUtil.changeStr(arr[i]);
		}
		return results;
	}

	public static String[] buildArrayString(List list) {
		if (list == null || list.size() == 0) {
			return null;
		}
		String[] results = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			results[i] = StringUtil.changeStr(list.get(i).toString());
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
		if (data.equals("[]")) {
			return new char[]{};
		}
		data = data.replaceAll("\\[", "").replaceAll("\\]", "");

		String[] arr = data.split(",", -1);
		int length = arr.length;
		char[] results = new char[length];
		for (int i = 0; i < length; i++) {
			results[i] = StringUtil.changeStr(arr[i].trim()).charAt(0);
		}
		return results;
	}

	public static char[] buildArrayChar(List list) {
		if (list == null || list.size() == 0) {
			return null;
		}
		char[] results = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			results[i] = StringUtil.changeStr(list.get(i).toString()).charAt(0);
		}
		return results;
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
		if (data.equals("[]")) {
			return new int[][]{};
		}
		if (data.equals("[[]]")) {
			return new int[][]{};
		}
		data = data.replaceAll(" ", "");
		data = data.substring(2, data.length() - 2);
		String[] arr = data.split("],\\[", -1);
		int row = arr.length;
		int cow = StringUtil.countString(arr[0], ',') + 1;
		int[][] results = new int[row][cow];
		for (int i = 0; i < row; i++) {
			String[] arr2 = arr[i].split(",", -1);
			for (int j = 0; j < cow; j++) {
				results[i][j] = Integer.parseInt(arr2[j].trim());
			}
		}

		return results;
	}


	public static int[][] buildMatrix(List list) {
		if (list == null ) {
			return null;
		}
		if (list.size() == 0) {
			return new int[][]{};
		}
		if(list.get(0)==null|| !(list.get(0) instanceof List)|| ((List)list.get(0)).size()==0){
			return new int[][]{};
		}

		int row = list.size();
		int cow = ((List)list.get(0)).size();
		int[][] results = new int[row][cow];
		for (int i = 0; i < row; i++) {
			List childList = (List)list.get(i);
			for (int j = 0; j < cow; j++) {
				results[i][j] = Integer.parseInt(childList.get(j).toString());
			}
		}

		return results;
	}

	/**
	 * 构建二维字符数组
	 * 例如[["1","1","0","0","0"],["1","1","0","0","0"],["0","0","1","0","0"],["0","0","0","1","1"]]
	 *
	 * @param data
	 * @return
	 */
	public static char[][] buildMatrixChar(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		if (data.equals("[]")) {
			return new char[][]{};
		}
		data = data.replaceAll(" ", "");
		data = data.substring(2, data.length() - 2);
		String[] arr = data.split("],\\[", -1);
		int row = arr.length;
		int cow = StringUtil.countString(arr[0], ',') + 1;
		char[][] results = new char[row][cow];
		for (int i = 0; i < row; i++) {
			String[] arr2 = arr[i].split(",", -1);
			for (int j = 0; j < cow; j++) {
				results[i][j] = StringUtil.changeStr(arr2[j].trim()).charAt(0);
			}
		}

		return results;
	}

	public static char[][] buildMatrixChar(List list) {
		if (list == null ) {
			return null;
		}
		if (list.size() == 0) {
			return new char[][]{};
		}

		if(list.get(0)==null|| !(list.get(0) instanceof List)|| ((List)list.get(0)).size()==0){
			return new char[][]{};
		}

		int row = list.size();
		int cow = ((List)list.get(0)).size();
		char[][] results = new char[row][cow];
		for (int i = 0; i < row; i++) {
			List childList = (List)list.get(i);
			for (int j = 0; j < cow; j++) {
				results[i][j] = StringUtil.changeStr(childList.get(j).toString()).charAt(0);
			}
		}

		return results;
	}

	/**
	 * 构建二维字符串数组
	 * 例如[["1","1","0","0","0"],["1","1","0","0","0"],["0","0","1","0","0"],["0","0","0","1","1"]]
	 *
	 * @param data
	 * @return
	 */
	public static String[][] buildMatrixString(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		if (data.equals("[]")) {
			return new String[][]{};
		}
		data = data.replaceAll(" ", "");
		data = data.substring(2, data.length() - 2);
		String[] arr = data.split("],\\[", -1);
		int row = arr.length;
		int cow = StringUtil.countString(arr[0], ',') + 1;
		String[][] results = new String[row][cow];
		for (int i = 0; i < row; i++) {
			String[] arr2 = arr[i].split(",", -1);
			for (int j = 0; j < cow; j++) {
				results[i][j] = StringUtil.changeStr(arr2[j].trim());
			}
		}

		return results;
	}

	public static String[][] buildMatrixString(List list) {
		if (list == null ) {
			return null;
		}
		if (list.size() == 0) {
			return new String[][]{};
		}

		if(list.get(0)==null|| !(list.get(0) instanceof List)|| ((List)list.get(0)).size()==0){
			return new String[][]{};
		}

		int row = list.size();
		int cow = ((List)list.get(0)).size();
		String[][] results = new String[row][cow];
		for (int i = 0; i < row; i++) {
			List childList = (List)list.get(i);
			for (int j = 0; j < cow; j++) {
				results[i][j] = StringUtil.changeStr(childList.get(j).toString().trim());
			}
		}

		return results;
	}


	public static boolean[][] buildMatrixBoolean(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		if (data.equals("[]")) {
			return new boolean[][]{};
		}
		data = data.replaceAll(" ", "");
		data = data.substring(2, data.length() - 2);
		String[] arr = data.split("],\\[", -1);
		int row = arr.length;
		int cow = StringUtil.countString(arr[0], ',') + 1;
		boolean[][] results = new boolean[row][cow];
		for (int i = 0; i < row; i++) {
			String[] arr2 = arr[i].split(",", -1);
			for (int j = 0; j < cow; j++) {
				results[i][j] = Boolean.parseBoolean(arr2[j].trim());
			}
		}

		return results;
	}

	public static boolean[][] buildMatrixBoolean(List list) {
		if (list == null ) {
			return null;
		}
		if (list.size() == 0) {
			return new boolean[][]{};
		}

		if(list.get(0)==null|| !(list.get(0) instanceof List)|| ((List)list.get(0)).size()==0){
			return new boolean[][]{};
		}

		int row = list.size();
		int cow = ((List)list.get(0)).size();
		boolean[][] results = new boolean[row][cow];
		for (int i = 0; i < row; i++) {
			List childList = (List)list.get(i);
			for (int j = 0; j < cow; j++) {
				results[i][j] = Boolean.parseBoolean(childList.get(j).toString());
			}
		}

		return results;
	}

	public static double[][] buildMatrixDouble(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		if (data.equals("[]")) {
			return new double[][]{};
		}
		data = data.replaceAll(" ", "");
		data = data.substring(2, data.length() - 2);
		String[] arr = data.split("],\\[", -1);
		int row = arr.length;
		int cow = StringUtil.countString(arr[0], ',') + 1;
		double[][] results = new double[row][cow];
		for (int i = 0; i < row; i++) {
			String[] arr2 = arr[i].split(",", -1);
			for (int j = 0; j < cow; j++) {
				results[i][j] = Double.parseDouble(arr2[j].trim());
			}
		}

		return results;
	}

	public static double[][] buildMatrixDouble(List list) {
		if (list == null ) {
			return null;
		}
		if (list.size() == 0) {
			return new double[][]{};
		}

		if(list.get(0)==null|| !(list.get(0) instanceof List)|| ((List)list.get(0)).size()==0){
			return new double[][]{};
		}

		int row = list.size();
		int cow = ((List)list.get(0)).size();
		double[][] results = new double[row][cow];
		for (int i = 0; i < row; i++) {
			List childList = (List)list.get(i);
			for (int j = 0; j < cow; j++) {
				results[i][j] = Double.parseDouble(childList.get(j).toString());
			}
		}

		return results;
	}


	public static float[][] buildMatrixFloat(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		if (data.equals("[]")) {
			return new float[][]{};
		}
		data = data.replaceAll(" ", "");
		data = data.substring(2, data.length() - 2);
		String[] arr = data.split("],\\[", -1);
		int row = arr.length;
		int cow = StringUtil.countString(arr[0], ',') + 1;
		float[][] results = new float[row][cow];
		for (int i = 0; i < row; i++) {
			String[] arr2 = arr[i].split(",", -1);
			for (int j = 0; j < cow; j++) {
				results[i][j] = Float.parseFloat(arr2[j].trim());
			}
		}

		return results;
	}

	public static float[][] buildMatrixFloat(List list) {
		if (list == null ) {
			return null;
		}
		if (list.size() == 0) {
			return new float[][]{};
		}

		if(list.get(0)==null|| !(list.get(0) instanceof List)|| ((List)list.get(0)).size()==0){
			return new float[][]{};
		}

		int row = list.size();
		int cow = ((List)list.get(0)).size();
		float[][] results = new float[row][cow];
		for (int i = 0; i < row; i++) {
			List childList = (List)list.get(i);
			for (int j = 0; j < cow; j++) {
				results[i][j] = Float.parseFloat(childList.get(j).toString());
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
		listNode[0] = new ListNode(Integer.valueOf(split[0].trim()));
		for (int i = 1; i < len; i++) {
			listNode[i] = new ListNode(Integer.valueOf(split[i]));
			listNode[i - 1].next = listNode[i];
		}
		return listNode[0];
	}

	public static ListNode buildListNode(List list) {
		if (list == null || list.size() == 0) {
			return null;
		}
		int len = list.size();
		ListNode[] listNode = new ListNode[len + 1];
		listNode[0] = new ListNode(Integer.valueOf(list.get(0).toString()));
		for (int i = 1; i < len; i++) {
			listNode[i] = new ListNode(Integer.valueOf(list.get(i).toString()));
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
		data = data.replaceAll(" ", "");
		data = data.substring(2, data.length() - 2);
		String[] arr = data.split("],\\[", -1);
		int row = arr.length;
		ListNode[] results = new ListNode[row];
		for (int i = 0; i < row; i++) {
			ListNode listNode = buildListNode("[" + arr[i].trim() + "]");
			results[i] = listNode;
		}

		return results;

	}

	public static ListNode[] buildListNodeArray(List list) {
		if (list == null || list.size() == 0) {
			return null;
		}
		int row = list.size();
		ListNode[] results = new ListNode[row];
		for (int i = 0; i < row; i++) {
			ListNode listNode = buildListNode((List) list.get(i));
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
		String s1 = data.startsWith("[")&&data.endsWith("]") ? data.substring(1, data.length() - 1) :data;
		String[] partTree = s1.split(",", -1);

		TreeNode root = new TreeNode(Integer.parseInt(partTree[0]));
		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.offer(root);
		int i = 1;
		while (!queue.isEmpty() && i < partTree.length) {
			TreeNode node = queue.poll();
			if (i < partTree.length && partTree[i] != null && !partTree[i].trim().equals("null")) {
				node.left = new TreeNode(Integer.parseInt(partTree[i].trim()));
				queue.offer(node.left);
			}
			if (i + 1 < partTree.length && partTree[i + 1] != null && !partTree[i + 1].trim().equals("null")) {
				node.right = new TreeNode(Integer.parseInt(partTree[i + 1].trim()));
				queue.offer(node.right);
			}
			i += 2;
		}
		queue.clear();
		return root;
	}

	public static TreeNode buildBinaryTree(List list) {
		if (list == null || list.size() == 0) {
			return null;
		}
		TreeNode root = new TreeNode(Integer.parseInt(list.get(0).toString()));
		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.offer(root);
		int i = 1;
		while (!queue.isEmpty() && i < list.size()) {
			TreeNode node = queue.poll();
			if (i < list.size() && (list.get(i) != null) && !list.get(i).toString().equals("null")) {
				node.left = new TreeNode(Integer.parseInt(list.get(i).toString()));
				queue.offer(node.left);
			}
			if (i + 1 < list.size() && list.get(i + 1) != null && !list.get(i + 1).toString().equals("null")) {
				node.right = new TreeNode(Integer.parseInt(list.get(i + 1).toString()));
				queue.offer(node.right);
			}
			i += 2;
		}
		queue.clear();
		return root;
	}

	/**
	 * 构建N叉树
	 *
	 * @param data
	 * @return
	 */
	public static Node buildMultiTree(String data) {
		if (data == null || data.trim().length() <= 0 || data.equals("null") || data.equals("{}")) {
			return null;
		}

		//创建json解析器,注意这里如果用fastJson解析不了
		JsonParser parse = new JsonParser();

		JsonObject jsonObject = (JsonObject) parse.parse(data);

		int val = jsonObject.get("val").getAsInt();
		//根节点
		Node root = new Node(val, null);

		JsonArray childJsonJsonArray = jsonObject.getAsJsonArray("children");
		if (childJsonJsonArray!=null&&!childJsonJsonArray.isJsonNull()) {
			List<Node> tempList = new ArrayList<>();
			for (int j = 0; j < childJsonJsonArray.size(); j++) {
				JsonElement childJsonElement = childJsonJsonArray.get(j);
				JsonObject childJsonObject = childJsonElement != null && !childJsonElement.isJsonNull() ? childJsonElement.getAsJsonObject() : null;
				if (childJsonObject != null) {
					String childData = childJsonObject.toString();
					Node temp = buildMultiTree(childData);
					tempList.add(temp);
				}
			}
			root.children = tempList;
		}

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
		//去掉最外层的[]
		data = data.substring(1, data.length() - 1);

		String splitStr;

		String[] arr = null;
		if (data.indexOf("[") >= 0) {
			List<String> vList = new ArrayList<>();
			int count = 0;
			StringBuffer stringBuffer = new StringBuffer();
			for (int i = 0; i < data.length(); i++) {
				char c = data.charAt(i);
				stringBuffer.append(c);
				if (c == '[') {
					count++;
				} else if (c == ']') {
					count--;
				} else if (c == ',' && count == 0) {
					stringBuffer.deleteCharAt(stringBuffer.length() - 1);
					vList.add(stringBuffer.toString());
					stringBuffer = new StringBuffer();
				}
			}
			vList.add(stringBuffer.toString());
			arr = new String[vList.size()];
			for (int i = 0; i < vList.size(); i++) {
				arr[i] = vList.get(i);
			}

		} else {
			splitStr = ",";
			arr = data.split(splitStr, -1);
		}

		boolean flag;
		int length = arr.length;
		List list = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			String newData = arr[i];
			if(newData!=null){
				newData = newData.trim();
			}
			flag = false;
			if (newData.indexOf("[") >= 0) {
				flag = true;
			}
			if (flag) {
				list.add(buildList(newData));
			} else {
				if (newData == null || newData.length() == 0) {
					list.add(null);
				} else {
					if (StringUtil.judgeNumber(newData)) {
						list.add(Integer.parseInt(newData));
					} else {
						list.add(StringUtil.changeStr(newData));
					}
				}
			}
		}
		return list;
	}

	/**
	 * 构建区间，已废弃
	 *
	 * @param data
	 * @return
	 */
	public static Interval buildListInterval(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		if (data.equals("[]")) {
			return null;
		}
		data = data.trim();
		//去掉最外层的[]
		data = data.substring(1, data.length() - 1);
		String[] newDataArr = data.split(",");
		Interval interval = new Interval(Integer.parseInt(newDataArr[0]), Integer.parseInt(newDataArr[1]));
		return interval;
	}

	/**
	 * 构建区间列表，已废弃
	 *
	 * @param data
	 * @return
	 */
	public static List<Interval> buildListIntervalList(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		if (data.equals("[]")) {
			return new ArrayList<>();
		}
		data = data.trim();
		//去掉最外层的[]
		data = data.substring(1, data.length() - 1);

		String splitStr;

		String[] arr = null;
		if (data.indexOf("[") >= 0) {
			List<String> vList = new ArrayList<>();
			int count = 0;
			StringBuffer stringBuffer = new StringBuffer();
			for (int i = 0; i < data.length(); i++) {
				char c = data.charAt(i);
				stringBuffer.append(c);
				if (c == '[') {
					count++;
				} else if (c == ']') {
					count--;
				} else if (c == ',' && count == 0) {
					stringBuffer.deleteCharAt(stringBuffer.length() - 1);
					vList.add(stringBuffer.toString());
					stringBuffer = new StringBuffer();
				}
			}
			vList.add(stringBuffer.toString());
			arr = new String[vList.size()];
			for (int i = 0; i < vList.size(); i++) {
				arr[i] = vList.get(i);
			}

		} else {
			splitStr = ",";
			arr = data.split(splitStr, -1);
		}

		boolean flag;
		int length = arr.length;
		List list = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			String newData = arr[i];
			flag = false;
			if (newData.indexOf("[") >= 0) {
				flag = true;
			}
			if (flag) {
				newData = newData.substring(1, newData.length() - 1);
				String[] newDataArr = newData.split(",");
				Interval interval = new Interval(Integer.parseInt(newDataArr[0]), Integer.parseInt(newDataArr[1]));
				list.add(interval);
			}
		}
		return list;
	}

	public static List<NestedInteger> buildNestedIntegerList(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		if (data.equals("[]")) {
			return new ArrayList<>();
		}
		data = data.trim();
		//去掉最外层的[]
		data = data.substring(1, data.length() - 1);

		String splitStr;

		String[] arr = null;
		if (data.indexOf("[") >= 0) {
			List<String> vList = new ArrayList<>();
			int count = 0;
			StringBuffer stringBuffer = new StringBuffer();
			for (int i = 0; i < data.length(); i++) {
				char c = data.charAt(i);
				stringBuffer.append(c);
				if (c == '[') {
					count++;
				} else if (c == ']') {
					count--;
				} else if (c == ',' && count == 0) {
					stringBuffer.deleteCharAt(stringBuffer.length() - 1);
					vList.add(stringBuffer.toString());
					stringBuffer = new StringBuffer();
				}
			}
			vList.add(stringBuffer.toString());
			arr = new String[vList.size()];
			for (int i = 0; i < vList.size(); i++) {
				arr[i] = vList.get(i);
			}

		} else {
			splitStr = ",";
			arr = data.split(splitStr, -1);
		}

		boolean flag;
		int length = arr.length;
		List<NestedInteger> list = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			String newData = arr[i];
			if(newData!=null){
				newData = newData.trim();
			}
			flag = false;
			if (newData.indexOf("[") >= 0) {
				flag = true;
			}
			if (flag) {
				list.add(new NestedInteger(buildNestedIntegerList(newData)));
			} else {
				if (newData == null || newData.length() == 0) {
					list.add(null);
				} else {
					if (StringUtil.judgeNumber(newData)) {
						list.add(new NestedInteger(Integer.parseInt(newData)));
					}
				}
			}
		}
		return list;
	}
}
