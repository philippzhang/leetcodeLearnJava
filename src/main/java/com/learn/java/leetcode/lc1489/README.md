# [1489. Find Critical and Pseudo-Critical Edges in Minimum Spanning Tree][enTitle]

**Hard**

Given a weighted undirected connected graph with  *n*  vertices numbered from  *0*  to  *n - 1* , and an array  *edges*  where  *edges[i] = [ai, bi, weighti]*  represents a bidirectional and weighted edge between nodes  *ai*  and  *bi* . A minimum spanning tree (MST) is a subset of the graph's edges that connects all vertices without cycles and with the minimum possible total edge weight.

Find  *all the critical and pseudo-critical edges in the given graph's minimum spanning tree (MST)* . An MST edge whose deletion from the graph would cause the MST weight to increase is called a  *critical edge* . On the other hand, a pseudo-critical edge is that which can appear in some MSTs but not all.

Note that you can return the indices of the edges in any order.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/06/04/ex1.png)


<pre><strong>Input:</strong> n = 5, edges = [[0,1,1],[1,2,1],[2,3,2],[0,3,2],[0,4,3],[3,4,3],[1,4,6]]
<strong>Output:</strong> [[0,1],[2,3,4,5]]
<strong>Explanation:</strong> The figure above describes the graph.
The following figure shows all the possible MSTs:
<img alt="" src="https://assets.leetcode.com/uploads/2020/06/04/msts.png" style="width: 540px; height: 553px;">
Notice that the two edges 0 and 1 appear in all MSTs, therefore they are critical edges, so we return them in the first list of the output.
The edges 2, 3, 4, and 5 are only part of some MSTs, therefore they are considered pseudo-critical edges. We add them to the second list of the output.
</pre>

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/06/04/ex2.png)

```
Input: n = 4, edges = [[0,1,1],[1,2,1],[2,3,1],[0,3,1]]
Output: [[],[0,1,2,3]]
Explanation: We can observe that since all 4 edges have equal weight, choosing any 3 edges from the given 4 will yield an MST. Therefore all 4 edges are pseudo-critical.

```



**Constraints:** 

-  *2 <= n <= 100*  
-  *1 <= edges.length <= min(200, n * (n - 1) / 2)*  
-  *edges[i].length == 3*  
-  *0 <= ai < bi < n*  
-  *1 <= weighti <= 1000*  
- All pairs  *(ai, bi)*  are **distinct** .


# [1489. 找到最小生成树里的关键边和伪关键边][cnTitle]

**困难**

给你一个  *n*  个点的带权无向连通图，节点编号为  *0*  到  *n-1*  ，同时还有一个数组  *edges*  ，其中  *edges[i] = [from*  *i, toi, weighti]*  表示在  *fromi*  和  *toi*  节点之间有一条带权无向边。最小生成树 (MST) 是给定图中边的一个子集，它连接了所有节点且没有环，而且这些边的权值和最小。

请你找到给定图中最小生成树的所有关键边和伪关键边。如果从图中删去某条边，会导致最小生成树的权值和增加，那么我们就说它是一条关键边。伪关键边则是可能会出现在某些最小生成树中但不会出现在所有最小生成树中的边。

请注意，你可以分别以任意顺序返回关键边的下标和伪关键边的下标。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/06/21/ex1.png)


<pre><strong>输入：</strong>n = 5, edges = [[0,1,1],[1,2,1],[2,3,2],[0,3,2],[0,4,3],[3,4,3],[1,4,6]]
<strong>输出：</strong>[[0,1],[2,3,4,5]]
<strong>解释：</strong>上图描述了给定图。
下图是所有的最小生成树。
<img style="height: 553px; width: 540px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/06/21/msts.png" alt="">
注意到第 0 条边和第 1 条边出现在了所有最小生成树中，所以它们是关键边，我们将这两个下标作为输出的第一个列表。
边 2，3，4 和 5 是所有 MST 的剩余边，所以它们是伪关键边。我们将它们作为输出的第二个列表。
</pre>

**示例 2 ：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/06/21/ex2.png)

```
输入：n = 4, edges = [[0,1,1],[1,2,1],[2,3,1],[0,3,1]]
输出：[[],[0,1,2,3]]
解释：可以观察到 4 条边都有相同的权值，任选它们中的 3 条可以形成一棵 MST 。所以 4 条边都是伪关键边。

```



**提示：** 

-  *2 <= n <= 100*  
-  *1 <= edges.length <= min(200, n * (n - 1) / 2)*  
-  *edges[i].length == 3*  
-  *0 <= fromi < toi < n*  
-  *1 <= weighti <= 1000*  
- 所有  *(fromi, toi)*  数对都是互不相同的。




# 算法思路

# 测试用例
```
1489. Find Critical and Pseudo-Critical Edges in Minimum Spanning Tree 1489. 找到最小生成树里的关键边和伪关键边 Hard
```

[enTitle]: https://leetcode.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/
[cnTitle]: https://leetcode-cn.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/
