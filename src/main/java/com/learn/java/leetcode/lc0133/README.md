# [133. Clone Graph][enTitle]

**Medium**

**deep copy** 



**Example:** 

![img](https://assets.leetcode.com/uploads/2019/02/19/113_sample.png)

```
Input:{"$id":"1","neighbors":[{"$id":"2","neighbors":[{"$ref":"1"},{"$id":"3","neighbors":[{"$ref":"2"},{"$id":"4","neighbors":[{"$ref":"3"},{"$ref":"1"}],"val":4}],"val":3}],"val":2},{"$ref":"4"}],"val":1}

Explanation:
Node 1's value is 1, and it has two neighbors: Node 2 and 4.
Node 2's value is 2, and it has two neighbors: Node 1 and 3.
Node 3's value is 3, and it has two neighbors: Node 2 and 4.
Node 4's value is 4, and it has two neighbors: Node 1 and 3.

```



**Note:** 

1. The number of nodes will be between 1 and 100. 
2. The undirected graph is a simple graph, which means no repeated edges and no self-loops in the graph. 
3. Since the graph is undirected, if node  *p*  has node  *q*  as neighbor, then node  *q*  must have node  *p*  as neighbor too. 
4. You must return the **copy of the given node**  as a reference to the cloned graph.


# [133. 克隆图][cnTitle]

**中等**

**深拷贝** 

**示例：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/23/113_sample.png)

```
输入：{"$id":"1","neighbors":[{"$id":"2","neighbors":[{"$ref":"1"},{"$id":"3","neighbors":[{"$ref":"2"},{"$id":"4","neighbors":[{"$ref":"3"},{"$ref":"1"}],"val":4}],"val":3}],"val":2},{"$ref":"4"}],"val":1}

解释：
节点 1 的值是 1，它有两个邻居：节点 2 和 4 。
节点 2 的值是 2，它有两个邻居：节点 1 和 3 。
节点 3 的值是 3，它有两个邻居：节点 2 和 4 。
节点 4 的值是 4，它有两个邻居：节点 1 和 3 。

```



**提示：** 

1. 节点数介于 1 到 100 之间。 
2. 无向图是一个简单图，这意味着图中没有重复的边，也没有自环。 
3. 由于图是无向的，如果节点  *p*  是节点  *q*  的邻居，那么节点  *q*  也必须是节点  *p*  的邻居。 
4. 必须将**给定节点的拷贝** 作为对克隆图的引用返回。




# 算法思路

# 测试用例
```
133. Clone Graph 133. 克隆图 Medium
Solution.cloneGraph
---
{"$id":"1","neighbors":[{"$id":"2","neighbors":[{"$ref":"1"},{"$id":"3","neighbors":[{"$ref":"2"},{"$id":"4","neighbors":[{"$ref":"3"},{"$ref":"1"}],"val":4}],"val":3}],"val":2},{"$ref":"4"}],"val":1}

={"$id":"1","neighbors":[{"$id":"2","neighbors":[{"$ref":"1"},{"$id":"3","neighbors":[{"$ref":"2"},{"$id":"4","neighbors":[{"$ref":"3"},{"$ref":"1"}],"val":4}],"val":3}],"val":2},{"$ref":"4"}],"val":1}
```

[enTitle]: https://leetcode.com/problems/clone-graph/
[cnTitle]: https://leetcode-cn.com/problems/clone-graph/
