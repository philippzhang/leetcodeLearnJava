# [1483. Kth Ancestor of a Tree Node][enTitle]

**Hard**

You are given a tree with  *n*  nodes numbered from  *0*  to  *n-1*  in the form of a parent array where  *parent[i]*  is the parent of node  *i* . The root of the tree is node  *0* .

Implement the function  *getKthAncestor*  *(int node, int k)*  to return the  *k* -th ancestor of the given  *node* . If there is no such ancestor, return  *-1* .

The  *k-th*  *ancestor*  of a tree node is the  *k* -th node in the path from that node to the root.



**Example:** 

![img](https://assets.leetcode.com/uploads/2019/08/28/1528_ex1.png)

```
Input:
["TreeAncestor","getKthAncestor","getKthAncestor","getKthAncestor"]
[[7,[-1,0,0,1,1,2,2]],[3,1],[5,2],[6,3]]

Output:
[null,1,0,-1]

Explanation:
TreeAncestor treeAncestor = new TreeAncestor(7, [-1, 0, 0, 1, 1, 2, 2]);

treeAncestor.getKthAncestor(3, 1);  // returns 1 which is the parent of 3
treeAncestor.getKthAncestor(5, 2);  // returns 0 which is the grandparent of 5
treeAncestor.getKthAncestor(6, 3);  // returns -1 because there is no such ancestor

```



**Constraints:** 

-  *1 <= k <= n <= 5*10^4*  
-  *parent[0] == -1*  indicating that  *0*  is the root node. 
-  *0 <= parent[i] < n*  for all  *0 < i < n*  
-  *0 <= node < n*  
- There will be at most  *5*10^4*  queries.


# [1483. 树节点的第 K 个祖先][cnTitle]

**困难**

给你一棵树，树上有  *n*  个节点，按从  *0*  到  *n-1*  编号。树以父节点数组的形式给出，其中  *parent[i]*  是节点  *i*  的父节点。树的根节点是编号为  *0*  的节点。

请你设计并实现  *getKthAncestor*  *(int node, int k)*  函数，函数返回节点  *node*  的第  *k*  个祖先节点。如果不存在这样的祖先节点，返回  *-1*  。

树节点的第  *k* 个祖先节点是从该节点到根节点路径上的第  *k*  个节点。



**示例：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/06/14/1528_ex1.png)

```
输入：
["TreeAncestor","getKthAncestor","getKthAncestor","getKthAncestor"]
[[7,[-1,0,0,1,1,2,2]],[3,1],[5,2],[6,3]]

输出：
[null,1,0,-1]

解释：
TreeAncestor treeAncestor = new TreeAncestor(7, [-1, 0, 0, 1, 1, 2, 2]);

treeAncestor.getKthAncestor(3, 1);  // 返回 1 ，它是 3 的父节点
treeAncestor.getKthAncestor(5, 2);  // 返回 0 ，它是 5 的祖父节点
treeAncestor.getKthAncestor(6, 3);  // 返回 -1 因为不存在满足要求的祖先节点

```



**提示：** 

-  *1 <= k <= n <= 5*10^4*  
-  *parent[0] == -1*  表示编号为  *0*  的节点是根节点。 
- 对于所有的  *0 < i < n*  ， *0 <= parent[i] < n*  总成立 
-  *0 <= node < n*  
- 至多查询  *5*10^4*  次




# 算法思路

# 测试用例
```
1483. Kth Ancestor of a Tree Node 1483. 树节点的第 K 个祖先 Hard
```

[enTitle]: https://leetcode.com/problems/kth-ancestor-of-a-tree-node/
[cnTitle]: https://leetcode-cn.com/problems/kth-ancestor-of-a-tree-node/
