# [1129. Shortest Path with Alternating Colors][enTitle]

**Medium**

Consider a directed graph, with nodes labelled  *0, 1, ..., n-1* . In this graph, each edge is either red or blue, and there could be self-edges or parallel edges.

Each  *[i, j]*  in  *red_edges*  denotes a red directed edge from node  *i*  to node  *j* . Similarly, each  *[i, j]*  in  *blue_edges*  denotes a blue directed edge from node  *i*  to node  *j* .

Return an array  *answer*  of length  *n* , where each  *answer[X]*  is the length of the shortest path from node  *0*  to node  *X*  such that the edge colors alternate along the path (or  *-1*  if such a path doesn't exist).



**Example 1:** 

```
Input: n = 3, red_edges = [[0,1],[1,2]], blue_edges = []
Output: [0,1,-1]

```

**Example 2:** 

```
Input: n = 3, red_edges = [[0,1]], blue_edges = [[2,1]]
Output: [0,1,-1]

```

**Example 3:** 

```
Input: n = 3, red_edges = [[1,0]], blue_edges = [[2,1]]
Output: [0,-1,-1]

```

**Example 4:** 

```
Input: n = 3, red_edges = [[0,1]], blue_edges = [[1,2]]
Output: [0,1,2]

```

**Example 5:** 

```
Input: n = 3, red_edges = [[0,1],[0,2]], blue_edges = [[1,0]]
Output: [0,1,1]

```



**Constraints:** 

-  *1 <= n <= 100*  
-  *red_edges.length <= 400*  
-  *blue_edges.length <= 400*  
-  *red_edges[i].length == blue_edges[i].length == 2*  
-  *0 <= red_edges[i][j], blue_edges[i][j] < n* 


# [1129. 颜色交替的最短路径][cnTitle]

**中等**

在一个有向图中，节点分别标记为  *0, 1, ..., n-1* 。这个图中的每条边不是红色就是蓝色，且存在自环或平行边。

 *red_edges*  中的每一个  *[i, j]*  对表示从节点  *i*  到节点  *j*  的红色有向边。类似地， *blue_edges*  中的每一个  *[i, j]*  对表示从节点  *i*  到节点  *j*  的蓝色有向边。

返回长度为  *n*  的数组  *answer* ，其中  *answer[X]*  是从节点  *0*  到节点  *X*  的红色边和蓝色边交替出现的最短路径的长度。如果不存在这样的路径，那么  *answer[x] = -1* 。



**示例 1：** 

```
输入：n = 3, red_edges = [[0,1],[1,2]], blue_edges = []
输出：[0,1,-1]

```

**示例 2：** 

```
输入：n = 3, red_edges = [[0,1]], blue_edges = [[2,1]]
输出：[0,1,-1]

```

**示例 3：** 

```
输入：n = 3, red_edges = [[1,0]], blue_edges = [[2,1]]
输出：[0,-1,-1]

```

**示例 4：** 

```
输入：n = 3, red_edges = [[0,1]], blue_edges = [[1,2]]
输出：[0,1,2]

```

**示例 5：** 

```
输入：n = 3, red_edges = [[0,1],[0,2]], blue_edges = [[1,0]]
输出：[0,1,1]

```



**提示：** 

-  *1 <= n <= 100*  
-  *red_edges.length <= 400*  
-  *blue_edges.length <= 400*  
-  *red_edges[i].length == blue_edges[i].length == 2*  
-  *0 <= red_edges[i][j], blue_edges[i][j] < n* 




# 算法思路

# 测试用例
```
1129. Shortest Path with Alternating Colors 1129. 颜色交替的最短路径 Medium
```

[enTitle]: https://leetcode.com/problems/shortest-path-with-alternating-colors/
[cnTitle]: https://leetcode-cn.com/problems/shortest-path-with-alternating-colors/
