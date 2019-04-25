# [108. Convert Sorted Array to Binary Search Tree][enTitle]

**Easy**

Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of  *every*  node never differ by more than 1.

**Example:** 

```
Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5

```
# [108. 将有序数组转换为二叉搜索树][cnTitle]

**简单**

将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。

本题中，一个高度平衡二叉树是指一个二叉树 *每个节点* 的左右两个子树的高度差的绝对值不超过 1。

**示例:** 

```
给定有序数组: [-10,-3,0,5,9],

一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：

      0
     / \
   -3   9
   /   /
 -10  5

```


# 算法思路

# 测试用例
```
108. Convert Sorted Array to Binary Search Tree 108. 将有序数组转换为二叉搜索树 Easy
Solution.sortedArrayToBST
---
[-10,-3,0,5,9]

=[0,-10,5,null,-3,null,9]
=[0,-3,9,-10,null,5]
```

[enTitle]: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
[cnTitle]: https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
