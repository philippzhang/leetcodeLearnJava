# [236. Lowest Common Ancestor of a Binary Tree][enTitle]

**Medium**

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

Given the following binary tree: root = [3,5,1,6,2,0,8,null,null,7,4]

![img](https://assets.leetcode.com/uploads/2018/12/14/binarytree.png)



**Example 1:** 

```
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation:The LCA of nodes 5 and 1 is 3.

```

**Example 2:** 

```
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation:The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.

```



**Note:** 

- All of the nodes' values will be unique. 
- p and q are different and both values will exist in the binary tree.
# [236. 二叉树的最近公共祖先][cnTitle]

**中等**

给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。

百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（**一个节点也可以是它自己的祖先** ）。”

例如，给定如下二叉树: root = [3,5,1,6,2,0,8,null,null,7,4]

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/15/binarytree.png)



**示例 1:** 

```
输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
输出: 3
解释:节点 5和节点 1的最近公共祖先是节点 3。

```

**示例 2:** 

```
输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
输出: 5
解释:节点 5和节点 4的最近公共祖先是节点 5。因为根据定义最近公共祖先节点可以为节点本身。

```



**说明:** 

- 所有节点的值都是唯一的。 
- p、q 为不同节点且均存在于给定的二叉树中。


# 算法思路

# 测试用例
```
236. Lowest Common Ancestor of a Binary Tree 236. 二叉树的最近公共祖先 Medium
Solution.lowestCommonAncestor
---
[3,5,1,6,2,0,8,null,null,7,4]
5
1

=3
---
[3,5,1,6,2,0,8,null,null,7,4]
5
4

=5
```

[enTitle]: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
[cnTitle]: https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/





