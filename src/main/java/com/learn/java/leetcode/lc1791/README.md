# [1791. Find Center of Star Graph][enTitle]

**Medium**

There is an undirected **star**  graph consisting of  *n*  nodes labeled from  *1*  to  *n* . A star graph is a graph where there is one **center**  node and **exactly**   *n - 1*  edges that connect the center node with every other node.

You are given a 2D integer array  *edges*  where each  *edges[i] = [ui, vi]*  indicates that there is an edge between the nodes  *ui*  and  *vi* . Return the center of the given star graph.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2021/02/24/star_graph.png)

```
Input: edges = [[1,2],[2,3],[4,2]]
Output: 2
Explanation: As shown in the figure above, node 2 is connected to every other node, so 2 is the center.

```

**Example 2:** 

```
Input: edges = [[1,2],[5,1],[1,3],[1,4]]
Output: 1

```



**Constraints:** 

-  *3 <= n <= 105*  
-  *edges.length == n - 1*  
-  *edges[i].length == 2*  
-  *1 <= ui, vi <= n*  
-  *ui != vi*  
- The given  *edges*  represent a valid star graph.


# [1791. 找出星型图的中心节点][cnTitle]

**中等**

有一个无向的 **星型**  图，由  *n*  个编号从  *1*  到  *n*  的节点组成。星型图有一个 **中心**  节点，并且恰有  *n - 1*  条边将中心节点与其他每个节点连接起来。

给你一个二维整数数组  *edges*  ，其中  *edges[i] = [ui, vi]*  表示在节点  *ui*  和  *vi*  之间存在一条边。请你找出并返回  *edges*  所表示星型图的中心节点。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/03/14/star_graph.png)

```
输入：edges = [[1,2],[2,3],[4,2]]
输出：2
解释：如上图所示，节点 2 与其他每个节点都相连，所以节点 2 是中心节点。

```

**示例 2：** 

```
输入：edges = [[1,2],[5,1],[1,3],[1,4]]
输出：1

```



**提示：** 

-  *3 <= n <= 105*  
-  *edges.length == n - 1*  
-  *edges[i].length == 2*  
-  *1 <= ui, vi <= n*  
-  *ui != vi*  
- 题目数据给出的  *edges*  表示一个有效的星型图




# 算法思路

# 测试用例
```
1791. Find Center of Star Graph 1791. 找出星型图的中心节点 Medium
```

[enTitle]: https://leetcode.com/problems/find-center-of-star-graph/
[cnTitle]: https://leetcode-cn.com/problems/find-center-of-star-graph/
