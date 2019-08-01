package com.learn.java.leetcode.lc0133;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.learn.java.leetcode.base.Utilitys;
import com.learn.java.leetcode.base.utils.Counter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Utils {
	static Node buildNode(String data) {
		Map<String, Node> map = new HashMap<>();
		return buildNode(data, map);
	}

	static Node buildNode(String data, Map<String, Node> map) {
		if (data == null || data.trim().length() <= 0 || data.equals("null") || data.equals("{}")) {
			return null;
		}

		//创建json解析器,注意这里如果用fastJson解析不了
		JsonParser parse = new JsonParser();

		JsonObject jsonObject = (JsonObject) parse.parse(data);

		Node node = null;
		if (jsonObject.has("$id")) {
			String id = jsonObject.get("$id").getAsString();
			int val = jsonObject.get("val").getAsInt();
			//节点
			node = new Node(val, null);
			map.put(id, node);
		} else {
			String id = jsonObject.get("$ref").getAsString();
			node = map.get(id);
		}


		JsonArray childJsonJsonArray = jsonObject.getAsJsonArray("neighbors");
		if (childJsonJsonArray != null && !childJsonJsonArray.isJsonNull()) {
			List<Node> neighbors = new ArrayList<>();
			for (int j = 0; j < childJsonJsonArray.size(); j++) {
				JsonElement childJsonElement = childJsonJsonArray.get(j);
				JsonObject childJsonObject = childJsonElement != null && !childJsonElement.isJsonNull() ? childJsonElement.getAsJsonObject() : null;
				if (childJsonObject != null) {
					String childData = childJsonObject.toString();
					Node temp = buildNode(childData, map);
					neighbors.add(temp);
				}
			}
			node.neighbors = neighbors;
		}

		return node;
	}


	/**
	 * 格式化Node
	 *
	 * @param node
	 */
	static String format(Node node) {
		StringBuffer stringBuffer = new StringBuffer();
		if (node == null) {
			stringBuffer.append("null");
			return stringBuffer.toString();
		}

		Map<String, Integer> map = new HashMap<>();
		Counter counter = new Counter();
		counter.index = 0;

		JsonObject jsonObject = node2JsonObject(node, map, counter);


		stringBuffer.append(Utilitys.sortJsonObject(jsonObject.toString()));
		return stringBuffer.toString();
	}

	private static JsonObject node2JsonObject(Node cur, Map<String, Integer> map, Counter counter) {
		if (cur == null) {
			return null;
		}
		JsonObject jsonObject = new JsonObject();

		counter.index++;
		map.put(cur.toString(), counter.index);
		jsonObject.addProperty("$id", counter.index.toString());


		JsonArray jsonArray = new JsonArray();
		if (cur.neighbors != null) {
			List<Node> child = cur.neighbors;
			if (child != null && child.size() > 0) {

				for (int i = 0; i < child.size(); i++) {
					Node temp = child.get(i);

					JsonObject refJSONObject = new JsonObject();
					if (map.containsKey(temp.toString())) {
						refJSONObject.addProperty("$ref", map.get(temp.toString()).toString());
						jsonArray.add(refJSONObject);
					} else {
						JsonObject neightObject = node2JsonObject(temp, map, counter);
						jsonArray.add(neightObject);
					}
				}
			}
			jsonObject.add("neighbors", jsonArray);
		} else {
			jsonObject.add("neighbors", jsonArray);
		}

		jsonObject.addProperty("val", cur.val);

		return jsonObject;
	}

}
