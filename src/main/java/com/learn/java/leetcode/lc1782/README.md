# [1782. Count Pairs Of Nodes][enTitle]

**Hard**

You are given an undirected graph represented by an integer  *n* , which is the number of nodes, and  *edges* , where  *edges[i] = [ui, vi]*  which indicates that there is an undirected edge between  *ui*  and  *vi* . You are also given an integer array  *queries* .

The answer to the  *jth*  query is the number of pairs of nodes  *(a, b)*  that satisfy the following conditions:

-  *a < b*  
-  *cnt*  is **strictly greater**  than  *queries[j]* , where  *cnt*  is the number of edges incident to  *a*  **or**   *b* .

Return an array  *answers*  such that  *answers.length == queries.length*  and  *answers[j]*  is the answer of the  *jth*  query.

Note that there can be **repeated edges** .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2021/02/11/screenshot-from-2021-02-11-23-07-35.png)

```
Input: n = 4, edges = [[1,2],[2,4],[1,3],[2,3],[2,1]], queries = [2,3]
Output: [6,5]
Explanation: The number of edges incident to at least one of each pair is shown above.

```

**Example 2:** 

```
Input: n = 5, edges = [[1,5],[1,5],[3,4],[2,5],[1,3],[5,1],[2,3],[2,5]], queries = [1,2,3,4,5]
Output: [10,10,9,8,6]

```



**Constraints:** 

-  *2 <= n <= 2 * 104*  
-  *1 <= edges.length <= 105*  
-  *1 <= ui, vi <= n*  
-  *ui != vi*  
-  *1 <= queries.length <= 20*  
-  *0 <= queries[j] < edges.length* 


# [1782. 统计点对的数目][cnTitle]

**困难**

给你一个无向图，无向图由整数  *n*  ，表示图中节点的数目，和  *edges*  组成，其中  *edges[i] = [ui, vi]*  表示  *ui*  和  *vi* <sub> </sub>之间有一条无向边。同时给你一个代表查询的整数数组  *queries*  。

第  *j*  个查询的答案是满足如下条件的点对  *(a, b)*  的数目：

-  *a < b*  
-  *cnt*  是与  *a*  **或者**  *b*  相连的边的数目，且  *cnt*  **严格大于**  *queries[j]*  。

请你返回一个数组  *answers*  ，其中  *answers.length == queries.length*  且  *answers[j]*  是第  *j*  个查询的答案。

请注意，图中可能会有 **重复边**  。



**示例 1：** 

![img](https://pic.leetcode-cn.com/1614828447-GMnLVg-image.png)

```
输入：n = 4, edges = [[1,2],[2,4],[1,3],[2,3],[2,1]], queries = [2,3]
输出：[6,5]
解释：每个点对中，与至少一个点相连的边的数目如上图所示。

```

**示例 2：** 

```
输入：n = 5, edges = [[1,5],[1,5],[3,4],[2,5],[1,3],[5,1],[2,3],[2,5]], queries = [1,2,3,4,5]
输出：[10,10,9,8,6]

```



**提示：** 

-  *2 <= n <= 2 * 104*  
-  *1 <= edges.length <= 105*  
-  *1 <= ui, vi <= n*  
-  *ui != vi*  
-  *1 <= queries.length <= 20*  
-  *0 <= queries[j] < edges.length* 




# 算法思路

# 测试用例
```
1782. Count Pairs Of Nodes 1782. 统计点对的数目 Hard
```

[enTitle]: https://leetcode.com/problems/count-pairs-of-nodes/
[cnTitle]: https://leetcode-cn.com/problems/count-pairs-of-nodes/
