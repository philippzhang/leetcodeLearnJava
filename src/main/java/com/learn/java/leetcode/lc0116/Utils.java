package com.learn.java.leetcode.lc0116;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.learn.java.leetcode.base.Utilitys;
import com.learn.java.leetcode.base.utils.Counter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Utils {
	/**
	 * 构建带Next完美二叉树
	 *
	 * @param data
	 * @return
	 */
	static Node buildNode(String data) {
		if (data == null || data.trim().length() <= 0 || data.equals("null") || data.equals("{}")) {
			return null;
		}

		//创建json解析器,注意这里如果用fastJson解析不了
		JsonParser parse = new JsonParser();

		JsonObject jsonObject = (JsonObject) parse.parse(data);

		int val = jsonObject.get("val").getAsInt();
		//根节点
		Node root = new Node(val, null, null, null);

		if (jsonObject != null && jsonObject.size() > 0) {
			JsonElement leftJsonElement = jsonObject.get("left");
			if(leftJsonElement!=null&&!leftJsonElement.isJsonNull()) {
				JsonObject leftJsonObject = leftJsonElement.getAsJsonObject();
				if (leftJsonObject != null) {
					root.left = buildNode(leftJsonObject.toString());
				}
			}
			JsonElement rightJsonElement = jsonObject.get("right");
			if(rightJsonElement!=null&&!rightJsonElement.isJsonNull()) {
				JsonObject rightJsonObject = rightJsonElement.getAsJsonObject();
				if (rightJsonObject != null) {
					root.right = buildNode(rightJsonObject.toString());
				}
			}
		}

		return root;
	}

	static String format(Node node) {
		if (node == null) {

			return "null";
		}

		Counter counter = new Counter();
		counter.index = 0;

		Map<Node,Integer> map = new HashMap<>();

		JsonObject jsonObject = node2JsonObject(node,counter,map);


		return Utilitys.sortJsonObject(jsonObject.toString());
	}

	private static JsonObject node2JsonObject(Node node,Counter counter,Map<Node,Integer> map) {
		if (node == null) {
			return null;
		}
		JsonObject jsonObject = new JsonObject();

		if(!map.containsKey(node)) {
			++counter.index;
			map.put(node, counter.index);


			jsonObject.addProperty("$id", counter.index.toString());

			if (node.left != null) {
				JsonObject leftJsonObject = node2JsonObject(node.left, counter, map);
				jsonObject.add("left", leftJsonObject);
			} else {
				jsonObject.add("left", null);
			}
			if (node.right != null) {
				JsonObject rightJsonObject = node2JsonObject(node.right, counter, map);
				jsonObject.add("right", rightJsonObject);
			} else {
				jsonObject.add("right", null);
			}
			if (node.next != null) {
				JsonObject nextJsonObject = node2JsonObject(node.next, counter, map);
				jsonObject.add("next", nextJsonObject);
			} else {
				jsonObject.add("next", null);
			}

			jsonObject.addProperty("val", node.val);
		}else {
			jsonObject.addProperty("$ref", map.get(node).toString());
		}

		return jsonObject;
	}

}
