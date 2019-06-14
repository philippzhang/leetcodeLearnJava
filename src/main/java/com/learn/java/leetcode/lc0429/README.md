# [429. N-ary Tree Level Order Traversal][enTitle]

**Easy**

Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example, given a  *3-ary*  tree:



![img](https://assets.leetcode.com/uploads/2018/10/12/narytreeexample.png)



We should return its level order traversal:

```
[
     [1],
     [3,2,4],
     [5,6]
]

```



Note:

1. The depth of the tree is at most  *1000* . 
2. The total number of nodes is at most  *5000* .
# [429. N叉树的层序遍历][cnTitle]

**简单**

给定一个 N 叉树，返回其节点值的 *层序遍历* 。 (即从左到右，逐层遍历)。

例如，给定一个  *3叉树*  :



![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/narytreeexample.png)



返回其层序遍历:

```
[
     [1],
     [3,2,4],
     [5,6]
]

```



**说明:** 

1. 树的深度不会超过  *1000* 。 
2. 树的节点总数不会超过  *5000* 。


# 算法思路

# 测试用例
```
429. N-ary Tree Level Order Traversal 429. N叉树的层序遍历 Easy
Solution.levelOrder
---
{"$id":"1","children":[{"$id":"2","children":[{"$id":"5","children":[],"val":5},{"$id":"6","children":[],"val":6}],"val":3},{"$id":"3","children":[],"val":2},{"$id":"4","children":[],"val":4}],"val":1}

=[[1],[3,2,4],[5,6]]
```

[enTitle]: https://leetcode.com/problems/n-ary-tree-level-order-traversal/
[cnTitle]: https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/
