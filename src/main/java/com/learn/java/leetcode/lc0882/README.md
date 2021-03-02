# [882. Reachable Nodes In Subdivided Graph][enTitle]

**Hard**

You are given an undirected graph (the **"original graph"** ) with  *n*  nodes labeled from  *0*  to  *n - 1* . You decide to **subdivide**  each edge in the graph into a chain of nodes, with the number of new nodes varying between each edge.

The graph is given as a 2D array of  *edges*  where  *edges[i] = [ui, vi, cnti]*  indicates that there is an edge between nodes  *ui*  and  *vi*  in the original graph, and  *cnti*  is the total number of new nodes that you will **subdivide**  the edge into. Note that  *cnti == 0*  means you will not subdivide the edge.

To **subdivide**  the edge  *[ui, vi]* , replace it with  *(cnti + 1)*  new edges and  *cnti*  new nodes. The new nodes are  *x1* ,  *x2* , ...,  *xcnti* , and the new edges are  *[ui, x1]* ,  *[x1, x2]* ,  *[x2, x3]* , ...,  *[xcnti+1, xcnti]* ,  *[xcnti, vi]* .

In this **new graph** , you want to know how many nodes are **reachable**  from the node  *0* , where a node is **reachable**  if the distance is  *maxMoves*  or less.

Given the original graph and  *maxMoves* , return  *the number of nodes that are reachable from node*  *0*  *in the new graph* .



**Example 1:** 

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/08/01/origfinal.png)

```
Input: edges = [[0,1,10],[0,2,1],[1,2,2]], maxMoves = 6, n = 3
Output: 13
Explanation: The edge subdivisions are shown in the image above.
The nodes that are reachable are highlighted in yellow.

```

**Example 2:** 

```
Input: edges = [[0,1,4],[1,2,6],[0,2,8],[1,3,1]], maxMoves = 10, n = 4
Output: 23

```

**Example 3:** 

```
Input: edges = [[1,2,4],[1,4,5],[1,3,1],[2,3,4],[3,4,5]], maxMoves = 17, n = 5
Output: 1
Explanation: Node 0 is disconnected from the rest of the graph, so only node 0 is reachable.

```



**Constraints:** 

-  *0 <= edges.length <= min(n * (n - 1) / 2, 104)*  
-  *edges[i].length == 3*  
-  *0 <= ui < vi < n*  
- There are **no multiple edges**  in the graph. 
-  *0 <= cnti <= 104*  
-  *0 <= maxMoves <= 109*  
-  *1 <= n <= 3000* 


# [882. 细分图中的可到达结点][cnTitle]

**困难**

给你一个无向图（**原始图** ），图中有  *n*  个节点，编号从  *0*  到  *n - 1*  。你决定将图中的每条边细分为一条节点链，每条边之间的新节点数各不相同。

图用由边组成的二维数组  *edges*  表示，其中  *edges[i] = [ui, vi, cnti]*  表示原始图中节点  *ui*  和  *vi*  之间存在一条边， *cnti*  是将边细分后的新节点总数。注意， *cnti == 0*  表示边不可细分。

要细分边  *[ui, vi]*  ，需要将其替换为  *(cnti + 1)*  条新边，和  *cnti*  个新节点。新节点为  *x1* ,  *x2* , ...,  *xcnti*  ，新边为  *[ui, x1]* ,  *[x1, x2]* ,  *[x2, x3]* , ...,  *[xcnti+1, xcnti]* ,  *[xcnti, vi]*  。

现在得到一个新的 **细分图**  ，请你计算从节点  *0*  出发，可以到达多少个节点？节点 **是否可以到达的判断条件**  为：如果节点间距离是  *maxMoves*  或更少，则视为可以到达；否则，不可到达。

给你原始图和  *maxMoves*  ，返回新的细分图中从节点  *0*  出发**可到达的节点数** 。



**示例 1：** 

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/08/01/origfinal.png)

```
输入：edges = [[0,1,10],[0,2,1],[1,2,2]], maxMoves = 6, n = 3
输出：13
解释：边的细分情况如上图所示。
可以到达的节点已经用黄色标注出来。

```

**示例 2：** 

```
输入：edges = [[0,1,4],[1,2,6],[0,2,8],[1,3,1]], maxMoves = 10, n = 4
输出：23

```

**示例 3：** 

```
输入：edges = [[1,2,4],[1,4,5],[1,3,1],[2,3,4],[3,4,5]], maxMoves = 17, n = 5
输出：1
解释：节点 0 与图的其余部分没有连通，所以只有节点 0 可以到达。

```



**提示：** 

-  *0 <= edges.length <= min(n * (n - 1) / 2, 104)*  
-  *edges[i].length == 3*  
-  *0 <= ui < vi < n*  
- 图中 **不存在平行边**  
-  *0 <= cnti <= 104*  
-  *0 <= maxMoves <= 109*  
-  *1 <= n <= 3000* 




# 算法思路

# 测试用例
```
882. Reachable Nodes In Subdivided Graph 882. 细分图中的可到达结点 Hard
```

[enTitle]: https://leetcode.com/problems/reachable-nodes-in-subdivided-graph/
[cnTitle]: https://leetcode-cn.com/problems/reachable-nodes-in-subdivided-graph/
