# [685. Redundant Connection II][enTitle]

**Hard**

In this problem, a rooted tree is a directed graph such that, there is exactly one node (the root) for which all other nodes are descendants of this node, plus every node has exactly one parent, except for the root node which has no parents.

The given input is a directed graph that started as a rooted tree with  *n*  nodes (with distinct values from  *1*  to  *n* ), with one additional directed edge added. The added edge has two different vertices chosen from  *1*  to  *n* , and was not an edge that already existed.

The resulting graph is given as a 2D-array of  *edges* . Each element of  *edges*  is a pair  *[ui, vi]*  that represents a directed edge connecting nodes  *ui*  and  *vi* , where  *ui*  is a parent of child  *vi* .

Return  *an edge that can be removed so that the resulting graph is a rooted tree of*   *n*   *nodes* . If there are multiple answers, return the answer that occurs last in the given 2D-array.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/12/20/graph1.jpg)

```
Input: edges = [[1,2],[1,3],[2,3]]
Output: [2,3]

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/12/20/graph2.jpg)

```
Input: edges = [[1,2],[2,3],[3,4],[4,1],[1,5]]
Output: [4,1]

```



**Constraints:** 

-  *n == edges.length*  
-  *3 <= n <= 1000*  
-  *edges[i].length == 2*  
-  *1 <= ui, vi <= n* 


# [685. 冗余连接 II][cnTitle]

**困难**

在本问题中，有根树指满足以下条件的 **有向**  图。该树只有一个根节点，所有其他节点都是该根节点的后继。该树除了根节点之外的每一个节点都有且只有一个父节点，而根节点没有父节点。

输入一个有向图，该图由一个有着  *n*  个节点（节点值不重复，从  *1*  到  *n* ）的树及一条附加的有向边构成。附加的边包含在  *1*  到  *n*  中的两个不同顶点间，这条附加的边不属于树中已存在的边。

结果图是一个以边组成的二维数组  *edges*  。 每个元素是一对  *[ui, vi]* ，用以表示 **有向** 图中连接顶点  *ui*  和顶点  *vi*  的边，其中  *ui*  是  *vi*  的一个父节点。

返回一条能删除的边，使得剩下的图是有  *n*  个节点的有根树。若有多个答案，返回最后出现在给定二维数组的答案。



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2020/12/20/graph1.jpg)

```
输入：edges = [[1,2],[1,3],[2,3]]
输出：[2,3]

```

**示例 2：** 

![img](https://assets.leetcode.com/uploads/2020/12/20/graph2.jpg)

```
输入：edges = [[1,2],[2,3],[3,4],[4,1],[1,5]]
输出：[4,1]

```



**提示：** 

-  *n == edges.length*  
-  *3 <= n <= 1000*  
-  *edges[i].length == 2*  
-  *1 <= ui, vi <= n* 




# 算法思路

# 测试用例
```
685. Redundant Connection II 685. 冗余连接 II Hard
```

[enTitle]: https://leetcode.com/problems/redundant-connection-ii/
[cnTitle]: https://leetcode-cn.com/problems/redundant-connection-ii/
