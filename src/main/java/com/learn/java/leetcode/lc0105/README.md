# [105. Construct Binary Tree from Preorder and Inorder Traversal][enTitle]

**Medium**

Given preorder and inorder traversal of a tree, construct the binary tree.

**Note:**  You may assume that duplicates do not exist in the tree.

For example, given

```
preorder = [3,9,20,15,7]
inorder = [9,3,15,20,7]
```

Return the following binary tree:

```
    3
   / \
  9  20
    /  \
   15   7
```
# [105. 从前序与中序遍历序列构造二叉树][cnTitle]

**中等**

根据一棵树的前序遍历与中序遍历构造二叉树。

**注意:**  你可以假设树中没有重复的元素。

例如，给出

```
前序遍历 preorder = [3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]
```

返回如下的二叉树：

```
    3
   / \
  9  20
    /  \
   15   7
```


# 算法思路

# 测试用例
```
105. Construct Binary Tree from Preorder and Inorder Traversal 105. 从前序与中序遍历序列构造二叉树 Medium
Solution.buildTree
---
[3,9,20,15,7]
[9,3,15,20,7]

=[3,9,20,null,null,15,7]
```

[enTitle]: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
[cnTitle]: https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
