# [847. Shortest Path Visiting All Nodes][enTitle]

**Hard**

An undirected, connected graph of N nodes (labeled  *0, 1, 2, ..., N-1* ) is given as  *graph* .

 *graph.length = N* , and  *j != i*  is in the list  *graph[i]*  exactly once, if and only if nodes  *i*  and  *j*  are connected.

Return the length of the shortest path that visits every node. You may start and stop at any node, you may revisit nodes multiple times, and you may reuse edges.





**Example 1:** 

```
Input:[[1,2,3],[0],[0],[0]]
Output:4
Explanation: One possible path is [1,0,2,0,3]
```

**Example 2:** 

```
Input:[[1],[0,2,4],[1,3,4],[2],[1,2]]
Output:4
Explanation: One possible path is [0,1,4,2,3]

```



**Note:** 

1.  *1 <= graph.length <= 12*  
2.  *0 <= graph[i].length < graph.length* 


# [847. 访问所有节点的最短路径][cnTitle]

**困难**

给出  *graph*  为有 N 个节点（编号为  *0, 1, 2, ..., N-1* ）的无向连通图。

 *graph.length = N* ，且只有节点  *i*  和  *j*  连通时， *j != i*  在列表  *graph[i]*  中恰好出现一次。

返回能够访问所有节点的最短路径的长度。你可以在任一节点开始和停止，也可以多次重访节点，并且可以重用边。





**示例 1：** 

```
输入：[[1,2,3],[0],[0],[0]]
输出：4
解释：一个可能的路径为 [1,0,2,0,3]
```

**示例 2：** 

```
输入：[[1],[0,2,4],[1,3,4],[2],[1,2]]
输出：4
解释：一个可能的路径为 [0,1,4,2,3]

```



**提示：** 

1.  *1 <= graph.length <= 12*  
2.  *0 <= graph[i].length < graph.length* 




# 算法思路

# 测试用例
```
847. Shortest Path Visiting All Nodes 847. 访问所有节点的最短路径 Hard
```

[enTitle]: https://leetcode.com/problems/shortest-path-visiting-all-nodes/
[cnTitle]: https://leetcode-cn.com/problems/shortest-path-visiting-all-nodes/
