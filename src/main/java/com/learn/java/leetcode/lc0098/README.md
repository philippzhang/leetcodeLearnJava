# [98. Validate Binary Search Tree][enTitle]

**Medium**

Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

- The left subtree of a node contains only nodes with keys **less than**  the node's key. 
- The right subtree of a node contains only nodes with keys **greater than**  the node's key. 
- Both the left and right subtrees must also be binary search trees.



**Example 1:** 

```
    2
   / \
  1   3

Input: [2,1,3]
Output: true

```

**Example 2:** 

```
    5
   / \
  1   4
     / \
    3   6

Input: [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.

```
# [98. 验证二叉搜索树][cnTitle]

**中等**

给定一个二叉树，判断其是否是一个有效的二叉搜索树。

假设一个二叉搜索树具有如下特征：

- 节点的左子树只包含**小于** 当前节点的数。 
- 节点的右子树只包含**大于** 当前节点的数。 
- 所有左子树和右子树自身必须也是二叉搜索树。

**示例 1:** 

```
输入:
    2
   / \
  1   3
输出: true

```

**示例 2:** 

```
输入:    5
   / \
  1   4
     / \
    3   6
输出: false
解释: 输入为: [5,1,4,null,null,3,6]。
     根节点的值为 5 ，但是其右子节点值为 4 。

```


# 算法思路

# 测试用例
```
98. Validate Binary Search Tree 98. 验证二叉搜索树 Medium
Solution.isValidBST
---
[2,1,3]

=true
[5,1,4,null,null,3,6]

=false
---
[1,1]

=false
---
[10,5,15,null,null,6,20]

=false
```

[enTitle]: https://leetcode.com/problems/validate-binary-search-tree/
[cnTitle]: https://leetcode-cn.com/problems/validate-binary-search-tree/
