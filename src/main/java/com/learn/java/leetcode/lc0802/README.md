# [802. Find Eventual Safe States][enTitle]

**Medium**

We start at some node in a directed graph, and every turn, we walk along a directed edge of the graph. If we reach a terminal node (that is, it has no outgoing directed edges), we stop.

We define a starting node to be **safe**  if we must eventually walk to a terminal node. More specifically, there is a natural number  *k* , so that we must have stopped at a terminal node in less than  *k*  steps for **any choice of where to walk** .

Return  *an array containing all the safe nodes of the graph* . The answer should be sorted in **ascending**  order.

The directed graph has  *n*  nodes with labels from  *0*  to  *n - 1* , where  *n*  is the length of  *graph* . The graph is given in the following form:  *graph[i]*  is a list of labels  *j*  such that  *(i, j)*  is a directed edge of the graph, going from node  *i*  to node  *j* .



**Example 1:** 

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/03/17/picture1.png)

```
Input: graph = [[1,2],[2,3],[5],[0],[5],[],[]]
Output: [2,4,5,6]
Explanation: The given graph is shown above.

```

**Example 2:** 

```
Input: graph = [[1,2,3,4],[1,2],[3,4],[0,4],[]]
Output: [4]

```



**Constraints:** 

-  *n == graph.length*  
-  *1 <= n <= 104*  
-  *0 <= graph[i].legnth <= n*  
-  *graph[i]*  is sorted in a strictly increasing order. 
- The graph may contain self-loops. 
- The number of edges in the graph will be in the range  *[1, 4 * 104]* .


# [802. 找到最终的安全状态][cnTitle]

**中等**

在有向图中，从某个节点和每个转向处开始出发，沿着图的有向边走。如果到达的节点是终点（即它没有连出的有向边），则停止。

如果从起始节点出发，最后必然能走到终点，就认为起始节点是 **最终安全**  的。更具体地说，对于最终安全的起始节点而言，存在一个自然数  *k*  ，**无论选择沿哪条有向边行走**  ，走了不到  *k*  步后必能停止在一个终点上。

返回一个由图中所有最终安全的起始节点组成的数组作为答案。答案数组中的元素应当按 **升序**  排列。

该有向图有  *n*  个节点，按  *0*  到  *n - 1*  编号，其中  *n*  是  *graph*  的节点数。图以下述形式给出： *graph[i]*  是编号  *j*  节点的一个列表，满足  *(i, j)*  是图的一条有向边。





**示例 1：** 

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/03/17/picture1.png)

```
输入：graph = [[1,2],[2,3],[5],[0],[5],[],[]]
输出：[2,4,5,6]
解释：示意图如上。

```

**示例 2：** 

```
输入：graph = [[1,2,3,4],[1,2],[3,4],[0,4],[]]
输出：[4]

```



**提示：** 

-  *n == graph.length*  
-  *1 <= n <= 104*  
-  *0 <= graph[i].legnth <= n*  
-  *graph[i]*  按严格递增顺序排列。 
- 图中可能包含自环。 
- 图中边的数目在范围  *[1, 4 * 104]*  内。








# 算法思路

# 测试用例
```
802. Find Eventual Safe States 802. 找到最终的安全状态 Medium
```

[enTitle]: https://leetcode.com/problems/find-eventual-safe-states/
[cnTitle]: https://leetcode-cn.com/problems/find-eventual-safe-states/
