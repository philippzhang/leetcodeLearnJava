# [1786. Number of Restricted Paths From First to Last Node][enTitle]

**Medium**

There is an undirected weighted connected graph. You are given a positive integer  *n*  which denotes that the graph has  *n*  nodes labeled from  *1*  to  *n* , and an array  *edges*  where each  *edges[i] = [ui, vi, weighti]*  denotes that there is an edge between nodes  *ui*  and  *vi*  with weight equal to  *weighti* .

A path from node  *start*  to node  *end*  is a sequence of nodes  *[z0, z1, z2, ..., zk]*  such that  *z0 = start*  and  *zk = end*  and there is an edge between  *zi*  and  *zi+1*  where  *0 <= i <= k-1* .

The distance of a path is the sum of the weights on the edges of the path. Let  *distanceToLastNode(x)*  denote the shortest distance of a path between node  *n*  and node  *x* . A **restricted path**  is a path that also satisfies that  *distanceToLastNode(zi) > distanceToLastNode(zi+1)*  where  *0 <= i <= k-1* .

Return  *the number of restricted paths from node*   *1*   *to node*   *n* . Since that number may be too large, return it **modulo**   *109 + 7* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2021/02/17/restricted_paths_ex1.png)

```
Input: n = 5, edges = [[1,2,3],[1,3,3],[2,3,1],[1,4,2],[5,2,2],[3,5,1],[5,4,10]]
Output: 3
Explanation: Each circle contains the node number in black and its distanceToLastNode value in blue.The three restricted paths are:
1) 1 --> 2 --> 5
2) 1 --> 2 --> 3 --> 5
3) 1 --> 3 --> 5

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2021/02/17/restricted_paths_ex22.png)

```
Input: n = 7, edges = [[1,3,1],[4,1,2],[7,3,4],[2,5,3],[5,6,1],[6,7,2],[7,5,3],[2,6,4]]
Output: 1
Explanation: Each circle contains the node number in black and its distanceToLastNode value in blue.The only restricted path is 1 --> 3 --> 7.

```



**Constraints:** 

-  *1 <= n <= 2 * 104*  
-  *n - 1 <= edges.length <= 4 * 104*  
-  *edges[i].length == 3*  
-  *1 <= ui, vi <= n*  
-  *ui != vi*  
-  *1 <= weighti <= 105*  
- There is at most one edge between any two nodes. 
- There is at least one path between any two nodes.


# [1786. 从第一个节点出发到最后一个节点的受限路径数][cnTitle]

**中等**

现有一个加权无向连通图。给你一个正整数  *n*  ，表示图中有  *n*  个节点，并按从  *1*  到  *n*  给节点编号；另给你一个数组  *edges*  ，其中每个  *edges[i] = [ui, vi, weighti]*  表示存在一条位于节点  *ui*  和  *vi*  之间的边，这条边的权重为  *weighti*  。

从节点  *start*  出发到节点  *end*  的路径是一个形如  *[z0, z1, z2, ..., zk]*  的节点序列，满足  *z0 = start*  、 *zk = end*  且在所有符合  *0 <= i <= k-1*  的节点  *zi*  和  *zi+1*  之间存在一条边。

路径的距离定义为这条路径上所有边的权重总和。用  *distanceToLastNode(x)*  表示节点  *n*  和  *x*  之间路径的最短距离。**受限路径**  为满足  *distanceToLastNode(zi) > distanceToLastNode(zi+1)*  的一条路径，其中  *0 <= i <= k-1*  。

返回从节点  *1*  出发到节点  *n*  的 **受限路径数**  。由于数字可能很大，请返回对  *109 + 7*  **取余**  的结果。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/03/07/restricted_paths_ex1.png)

```
输入：n = 5, edges = [[1,2,3],[1,3,3],[2,3,1],[1,4,2],[5,2,2],[3,5,1],[5,4,10]]
输出：3
解释：每个圆包含黑色的节点编号和蓝色的 distanceToLastNode 值。三条受限路径分别是：
1) 1 --> 2 --> 5
2) 1 --> 2 --> 3 --> 5
3) 1 --> 3 --> 5

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/03/07/restricted_paths_ex22.png)

```
输入：n = 7, edges = [[1,3,1],[4,1,2],[7,3,4],[2,5,3],[5,6,1],[6,7,2],[7,5,3],[2,6,4]]
输出：1
解释：每个圆包含黑色的节点编号和蓝色的 distanceToLastNode 值。唯一一条受限路径是：1 --> 3 --> 7 。
```



**提示：** 

-  *1 <= n <= 2 * 104*  
-  *n - 1 <= edges.length <= 4 * 104*  
-  *edges[i].length == 3*  
-  *1 <= ui, vi <= n*  
-  *ui != vi*  
-  *1 <= weighti <= 105*  
- 任意两个节点之间至多存在一条边 
- 任意两个节点之间至少存在一条路径




# 算法思路

# 测试用例
```
1786. Number of Restricted Paths From First to Last Node 1786. 从第一个节点出发到最后一个节点的受限路径数 Medium
```

[enTitle]: https://leetcode.com/problems/number-of-restricted-paths-from-first-to-last-node/
[cnTitle]: https://leetcode-cn.com/problems/number-of-restricted-paths-from-first-to-last-node/
