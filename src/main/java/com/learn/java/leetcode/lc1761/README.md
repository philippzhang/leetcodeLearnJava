# [1761. Minimum Degree of a Connected Trio in a Graph][enTitle]

**Hard**

You are given an undirected graph. You are given an integer  *n*  which is the number of nodes in the graph and an array  *edges* , where each  *edges[i] = [ui, vi]*  indicates that there is an undirected edge between  *ui*  and  *vi* .

A **connected trio**  is a set of **three**  nodes where there is an edge between every pair of them.

The **degree of a connected trio**  is the number of edges where one endpoint is in the trio, and the other is not.

Return  *the minimum degree of a connected trio in the graph, or*   *-1*   *if the graph has no connected trios.* 



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2021/01/26/trios1.png)

```
Input: n = 6, edges = [[1,2],[1,3],[3,2],[4,1],[5,2],[3,6]]
Output: 3
Explanation: There is exactly one trio, which is [1,2,3]. The edges that form its degree are bolded in the figure above.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2021/01/26/trios2.png)

```
Input: n = 7, edges = [[1,3],[4,1],[4,3],[2,5],[5,6],[6,7],[7,5],[2,6]]
Output: 0
Explanation: There are exactly three trios:
1) [1,4,3] with degree 0.
2) [2,5,6] with degree 2.
3) [5,6,7] with degree 2.

```



**Constraints:** 

-  *2 <= n <= 400*  
-  *edges[i].length == 2*  
-  *1 <= edges.length <= n * (n-1) / 2*  
-  *1 <= ui, vi <= n*  
-  *ui != vi*  
- There are no repeated edges.


# [1761. 一个图中连通三元组的最小度数][cnTitle]

**困难**

给你一个无向图，整数  *n*  表示图中节点的数目， *edges*  数组表示图中的边，其中  *edges[i] = [ui, vi]*  ，表示  *ui*  和  *vi* <sub> </sub>之间有一条无向边。

一个 **连通三元组**  指的是 **三个**  节点组成的集合且这三个点之间 **两两**  有边。

**连通三元组的度数**  是所有满足此条件的边的数目：一个顶点在这个三元组内，而另一个顶点不在这个三元组内。

请你返回所有连通三元组中度数的 **最小值**  ，如果图中没有连通三元组，那么返回  *-1*  。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/02/14/trios1.png)

```
输入：n = 6, edges = [[1,2],[1,3],[3,2],[4,1],[5,2],[3,6]]
输出：3
解释：只有一个三元组 [1,2,3] 。构成度数的边在上图中已被加粗。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/02/14/trios2.png)

```
输入：n = 7, edges = [[1,3],[4,1],[4,3],[2,5],[5,6],[6,7],[7,5],[2,6]]
输出：0
解释：有 3 个三元组：
1) [1,4,3]，度数为 0 。
2) [2,5,6]，度数为 2 。
3) [5,6,7]，度数为 2 。

```



**提示：** 

-  *2 <= n <= 400*  
-  *edges[i].length == 2*  
-  *1 <= edges.length <= n * (n-1) / 2*  
-  *1 <= ui, vi <= n*  
-  *ui != vi*  
- 图中没有重复的边。




# 算法思路

# 测试用例
```
1761. Minimum Degree of a Connected Trio in a Graph 1761. 一个图中连通三元组的最小度数 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-degree-of-a-connected-trio-in-a-graph/
[cnTitle]: https://leetcode-cn.com/problems/minimum-degree-of-a-connected-trio-in-a-graph/
