# [1697. Checking Existence of Edge Length Limited Paths][enTitle]

**Hard**

An undirected graph of  *n*  nodes is defined by  *edgeList* , where  *edgeList[i] = [ui, vi, disi]*  denotes an edge between nodes  *ui*  and  *vi*  with distance  *disi* . Note that there may be **multiple**  edges between two nodes.

Given an array  *queries* , where  *queries[j] = [pj, qj, limitj]* , your task is to determine for each  *queries[j]*  whether there is a path between  *pj*  and  *qj* <sub> </sub>such that each edge on the path has a distance **strictly less than**   *limitj*  .

Return  *a boolean array*  *answer*  *, where*  *answer.length == queries.length*   *and the*  *jth*   *value of*  *answer*   *is*  *true*  *if there is a path for*  *queries[j]*  *is*  *true*  *, and*  *false*  *otherwise* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/12/08/h.png)

```
Input: n = 3, edgeList = [[0,1,2],[1,2,4],[2,0,8],[1,0,16]], queries = [[0,1,2],[0,2,5]]
Output: [false,true]
Explanation: The above figure shows the given graph. Note that there are two overlapping edges between 0 and 1 with distances 2 and 16.
For the first query, between 0 and 1 there is no path where each distance is less than 2, thus we return false for this query.
For the second query, there is a path (0 -> 1 -> 2) of two edges with distances less than 5, thus we return true for this query.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/12/08/q.png)

```
Input: n = 5, edgeList = [[0,1,10],[1,2,5],[2,3,9],[3,4,13]], queries = [[0,4,14],[1,4,13]]
Output: [true,false]
Exaplanation: The above figure shows the given graph.

```



**Constraints:** 

-  *2 <= n <= 105*  
-  *1 <= edgeList.length, queries.length <= 105*  
-  *edgeList[i].length == 3*  
-  *queries[j].length == 3*  
-  *0 <= ui, vi, pj, qj <= n - 1*  
-  *ui != vi*  
-  *pj != qj*  
-  *1 <= disi, limitj <= 109*  
- There may be **multiple**  edges between two nodes.


# [1697. 检查边长度限制的路径是否存在][cnTitle]

**困难**

给你一个  *n*  个点组成的无向图边集  *edgeList*  ，其中  *edgeList[i] = [ui, vi, disi]*  表示点  *ui*  和点  *vi*  之间有一条长度为  *disi*  的边。请注意，两个点之间可能有 **超过一条边** 。

给你一个查询数组 *queries*  ，其中  *queries[j] = [pj, qj, limitj]*  ，你的任务是对于每个查询  *queries[j]*  ，判断是否存在从  *pj*  到  *qj* <sub> </sub>的路径，且这条路径上的每一条边都 **严格小于**   *limitj*  。

请你返回一个 布尔数组 *answer* ，其中 *answer.length == queries.length*  ，当  *queries[j]*  的查询结果为  *true*  时，  *answer*  第 *j*  个值为 *true* ，否则为  *false*  。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/12/19/h.png)

```
输入：n = 3, edgeList = [[0,1,2],[1,2,4],[2,0,8],[1,0,16]], queries = [[0,1,2],[0,2,5]]
输出：[false,true]
解释：上图为给定的输入数据。注意到 0 和 1 之间有两条重边，分别为 2 和 16 。
对于第一个查询，0 和 1 之间没有小于 2 的边，所以我们返回 false 。
对于第二个查询，有一条路径（0 -> 1 -> 2）两条边都小于 5 ，所以这个查询我们返回 true 。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/12/19/q.png)

```
输入：n = 5, edgeList = [[0,1,10],[1,2,5],[2,3,9],[3,4,13]], queries = [[0,4,14],[1,4,13]]
输出：[true,false]
解释：上图为给定数据。

```



**提示：** 

-  *2 <= n <= 105*  
-  *1 <= edgeList.length, queries.length <= 105*  
-  *edgeList[i].length == 3*  
-  *queries[j].length == 3*  
-  *0 <= ui, vi, pj, qj <= n - 1*  
-  *ui != vi*  
-  *pj != qj*  
-  *1 <= disi, limitj <= 109*  
- 两个点之间可能有 **多条**  边。




# 算法思路

# 测试用例
```
1697. Checking Existence of Edge Length Limited Paths 1697. 检查边长度限制的路径是否存在 Hard
```

[enTitle]: https://leetcode.com/problems/checking-existence-of-edge-length-limited-paths/
[cnTitle]: https://leetcode-cn.com/problems/checking-existence-of-edge-length-limited-paths/
