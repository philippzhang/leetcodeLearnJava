# [1766. Tree of Coprimes][enTitle]

**Hard**

There is a tree (i.e., a connected, undirected graph that has no cycles) consisting of  *n*  nodes numbered from  *0*  to  *n - 1*  and exactly  *n - 1*  edges. Each node has a value associated with it, and the **root**  of the tree is node  *0* .

To represent this tree, you are given an integer array  *nums*  and a 2D array  *edges* . Each  *nums[i]*  represents the  *ith*  node's value, and each  *edges[j] = [uj, vj]*  represents an edge between nodes  *uj*  and  *vj*  in the tree.

Two values  *x*  and  *y*  are **coprime**  if  *gcd(x, y) == 1*  where  *gcd(x, y)*  is the **greatest common divisor**  of  *x*  and  *y* .

An ancestor of a node  *i*  is any other node on the shortest path from node  *i*  to the **root** . A node is **not** considered an ancestor of itself.

Return  *an array*  *ans*  *of size*  *n* ,  *where*  *ans[i]*  *is the closest ancestor to node*  *i*  *such that*  *nums[i]*   *and*  *nums[ans[i]]*  are **coprime** , or  *-1*  *if there is no such ancestor* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2021/01/06/untitled-diagram.png)

```
Input: nums = [2,3,3,2], edges = [[0,1],[1,2],[1,3]]
Output: [-1,0,0,1]
Explanation: In the above figure, each node's value is in parentheses.
- Node 0 has no coprime ancestors.
- Node 1 has only one ancestor, node 0. Their values are coprime (gcd(2,3) == 1).
- Node 2 has two ancestors, nodes 1 and 0. Node 1's value is not coprime (gcd(3,3) == 3), but node 0's
  value is (gcd(2,3) == 1), so node 0 is the closest valid ancestor.
- Node 3 has two ancestors, nodes 1 and 0. It is coprime with node 1 (gcd(3,2) == 1), so node 1 is its
  closest valid ancestor.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2021/01/06/untitled-diagram1.png)

```
Input: nums = [5,6,10,2,3,6,15], edges = [[0,1],[0,2],[1,3],[1,4],[2,5],[2,6]]
Output: [-1,0,-1,0,0,0,-1]

```



**Constraints:** 

-  *nums.length == n*  
-  *1 <= nums[i] <= 50*  
-  *1 <= n <= 105*  
-  *edges.length == n - 1*  
-  *edges[j].length == 2*  
-  *0 <= uj, vj < n*  
-  *uj != vj* 


# [1766. 互质树][cnTitle]

**困难**

给你一个  *n*  个节点的树（也就是一个无环连通无向图），节点编号从  *0*  到  *n - 1*  ，且恰好有  *n - 1*  条边，每个节点有一个值。树的 **根节点**  为 0 号点。

给你一个整数数组  *nums*  和一个二维数组  *edges*  来表示这棵树。 *nums[i]*  表示第  *i*  个点的值， *edges[j] = [uj, vj]*  表示节点  *uj*  和节点  *vj*  在树中有一条边。

当  *gcd(x, y) == 1*  ，我们称两个数  *x*  和  *y*  是 **互质的**  ，其中  *gcd(x, y)*  是  *x*  和  *y*  的 **最大公约数**  。

从节点  *i*  到 **根**  最短路径上的点都是节点  *i*  的祖先节点。一个节点 **不是**  它自己的祖先节点。

请你返回一个大小为  *n*  的数组  *ans*  ，其中 *ans[i]* 是离节点  *i*  最近的祖先节点且满足 *nums[i]*  和 *nums[ans[i]]*  是 **互质的**  ，如果不存在这样的祖先节点， *ans[i]*  为  *-1*  。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/02/20/untitled-diagram.png)

```
输入：nums = [2,3,3,2], edges = [[0,1],[1,2],[1,3]]
输出：[-1,0,0,1]
解释：上图中，每个节点的值在括号中表示。
- 节点 0 没有互质祖先。
- 节点 1 只有一个祖先节点 0 。它们的值是互质的（gcd(2,3) == 1）。
- 节点 2 有两个祖先节点，分别是节点 1 和节点 0 。节点 1 的值与它的值不是互质的（gcd(3,3) == 3）但节点 0 的值是互质的(gcd(2,3) == 1)，所以节点 0 是最近的符合要求的祖先节点。
- 节点 3 有两个祖先节点，分别是节点 1 和节点 0 。它与节点 1 互质（gcd(3,2) == 1），所以节点 1 是离它最近的符合要求的祖先节点。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/02/20/untitled-diagram1.png)

```
输入：nums = [5,6,10,2,3,6,15], edges = [[0,1],[0,2],[1,3],[1,4],[2,5],[2,6]]
输出：[-1,0,-1,0,0,0,-1]

```



**提示：** 

-  *nums.length == n*  
-  *1 <= nums[i] <= 50*  
-  *1 <= n <= 105*  
-  *edges.length == n - 1*  
-  *edges[j].length == 2*  
-  *0 <= uj, vj < n*  
-  *uj != vj* 




# 算法思路

# 测试用例
```
1766. Tree of Coprimes 1766. 互质树 Hard
```

[enTitle]: https://leetcode.com/problems/tree-of-coprimes/
[cnTitle]: https://leetcode-cn.com/problems/tree-of-coprimes/
