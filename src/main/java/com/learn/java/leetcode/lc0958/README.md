# [958. Check Completeness of a Binary Tree][enTitle]

**Medium**

Given the  *root*  of a binary tree, determine if it is a  *complete binary tree* .

In a **complete binary tree** , every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between  *1*  and  *2h*  nodes inclusive at the last level  *h* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2018/12/15/complete-binary-tree-1.png)

```
Input: root = [1,2,3,4,5,6]
Output: true
Explanation: Every level before the last is full (ie. levels with node-values {1} and {2, 3}), and all nodes in the last level ({4, 5, 6}) are as far left as possible.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2018/12/15/complete-binary-tree-2.png)

```
Input: root = [1,2,3,4,5,null,7]
Output: false
Explanation: The node with value 7 isn't as far left as possible.

```



**Constraints:** 

- The number of nodes in the tree is in the range  *[1, 100]* . 
-  *1 <= Node.val <= 1000* 


# [958. 二叉树的完全性检验][cnTitle]

**中等**

给定一个二叉树，确定它是否是一个 *完全二叉树* 。

**百度百科中对完全二叉树的定义如下：** 

若设二叉树的深度为 h，除第 h 层外，其它各层 (1～h-1) 的结点数都达到最大个数，第 h 层所有的结点都连续集中在最左边，这就是完全二叉树。（注：第 h 层可能包含 1~ 2<sup>h</sup> 个节点。）



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/15/complete-binary-tree-1.png)

```
输入：[1,2,3,4,5,6]
输出：true
解释：最后一层前的每一层都是满的（即，结点值为 {1} 和 {2,3} 的两层），且最后一层中的所有结点（{4,5,6}）都尽可能地向左。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/15/complete-binary-tree-2.png)

```
输入：[1,2,3,4,5,null,7]
输出：false
解释：值为 7 的结点没有尽可能靠向左侧。

```



**提示：** 

1. 树中将会有 1 到 100 个结点。




# 算法思路

# 测试用例
```
958. Check Completeness of a Binary Tree 958. 二叉树的完全性检验 Medium
```

[enTitle]: https://leetcode.com/problems/check-completeness-of-a-binary-tree/
[cnTitle]: https://leetcode-cn.com/problems/check-completeness-of-a-binary-tree/
