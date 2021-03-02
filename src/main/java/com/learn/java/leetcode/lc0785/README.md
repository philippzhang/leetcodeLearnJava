# [785. Is Graph Bipartite?][enTitle]

**Medium**

There is an **undirected**  graph with  *n*  nodes, where each node is numbered between  *0*  and  *n - 1* . You are given a 2D array  *graph* , where  *graph[u]*  is an array of nodes that node  *u*  is adjacent to. More formally, for each  *v*  in  *graph[u]* , there is an undirected edge between node  *u*  and node  *v* . The graph has the following properties:

- There are no self-edges ( *graph[u]*  does not contain  *u* ). 
- There are no parallel edges ( *graph[u]*  does not contain duplicate values). 
- If  *v*  is in  *graph[u]* , then  *u*  is in  *graph[v]*  (the graph is undirected). 
- The graph may not be connected, meaning there may be two nodes  *u*  and  *v*  such that there is no path between them.

A graph is **bipartite**  if the nodes can be partitioned into two independent sets  *A*  and  *B*  such that **every**  edge in the graph connects a node in set  *A*  and a node in set  *B* .

Return  *true*  *if and only if it is bipartite* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/10/21/bi2.jpg)

```
Input: graph = [[1,2,3],[0,2],[0,1,3],[0,2]]
Output: false
Explanation: There is no way to partition the nodes into two independent sets such that every edge connects a node in one and a node in the other.
```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/10/21/bi1.jpg)

```
Input: graph = [[1,3],[0,2],[1,3],[0,2]]
Output: true
Explanation: We can partition the nodes into two sets: {0, 2} and {1, 3}.
```



**Constraints:** 

-  *graph.length == n*  
-  *1 <= n <= 100*  
-  *0 <= graph[u].length < n*  
-  *0 <= graph[u][i] <= n - 1*  
-  *graph[u]*  does not contain  *u* . 
- All the values of  *graph[u]*  are **unique** . 
- If  *graph[u]*  contains  *v* , then  *graph[v]*  contains  *u* .


# [785. 判断二分图][cnTitle]

**中等**












- 不存在自环（ *graph[u]*  不包含  *u* ）。 
- 不存在平行边（ *graph[u]*  不包含重复值）。 
- 如果  *v*  在  *graph[u]*  内，那么  *u*  也应该在  *graph[v]*  内（该图是无向图） 
- 这个图可能不是连通图，也就是说两个节点  *u*  和  *v*  之间可能不存在一条连通彼此的路径。

**二分图**  定义：如果能将一个图的节点集合分割成两个独立的子集  *A*  和  *B*  ，并使图中的每一条边的两个节点一个来自  *A*  集合，一个来自  *B*  集合，就将这个图称为 **二分图**  。

如果图是二分图，返回  *true* ；否则，返回  *false*  。



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2020/10/21/bi2.jpg)

```
输入：graph = [[1,2,3],[0,2],[0,1,3],[0,2]]
输出：false
解释：不能将节点分割成两个独立的子集，以使每条边都连通一个子集中的一个节点与另一个子集中的一个节点。
```

**示例 2：** 

![img](https://assets.leetcode.com/uploads/2020/10/21/bi1.jpg)

```
输入：graph = [[1,3],[0,2],[1,3],[0,2]]
输出：true
解释：可以将节点分成两组: {0, 2} 和 {1, 3} 。
```



**提示：** 

-  *graph.length == n*  
-  *1 <= n <= 100*  
-  *0 <= graph[u].length < n*  
-  *0 <= graph[u][i] <= n - 1*  
-  *graph[u]*  不会包含  *u*  
-  *graph[u]*  的所有值 **互不相同**  
- 如果  *graph[u]*  包含  *v* ，那么  *graph[v]*  也会包含  *u* 




# 算法思路

# 测试用例
```
785. Is Graph Bipartite? 785. 判断二分图 Medium
```

[enTitle]: https://leetcode.com/problems/is-graph-bipartite/
[cnTitle]: https://leetcode-cn.com/problems/is-graph-bipartite/
