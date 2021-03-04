# [1130. Minimum Cost Tree From Leaf Values][enTitle]

**Medium**

Given an array  *arr*  of positive integers, consider all binary trees such that:

- Each node has either 0 or 2 children; 
- The values of  *arr*  correspond to the values of each **leaf**  in an in-order traversal of the tree.  *(Recall that a node is a leaf if and only if it has 0 children.)*  
- The value of each non-leaf node is equal to the product of the largest leaf value in its left and right subtree respectively.

Among all possible binary trees considered, return the smallest possible sum of the values of each non-leaf node. It is guaranteed this sum fits into a 32-bit integer.



**Example 1:** 

```
Input: arr = [6,2,4]
Output: 32
Explanation:
There are two possible trees.  The first has non-leaf node sum 36, and the second has non-leaf node sum 32.

    24            24
   /  \          /  \
  12   4        6    8
 /  \               / \
6    2             2   4

```



**Constraints:** 

-  *2 <= arr.length <= 40*  
-  *1 <= arr[i] <= 15*  
- It is guaranteed that the answer fits into a 32-bit signed integer (ie. it is less than  *2^31* ).


# [1130. 叶值的最小代价生成树][cnTitle]

**中等**

给你一个正整数数组  *arr* ，考虑所有满足以下条件的二叉树：

- 每个节点都有 0 个或是 2 个子节点。 
- 数组  *arr*  中的值与树的中序遍历中每个叶节点的值一一对应。（知识回顾：如果一个节点有 0 个子节点，那么该节点为叶节点。） 
- 每个非叶节点的值等于其左子树和右子树中叶节点的最大值的乘积。

在所有这样的二叉树中，返回每个非叶节点的值的最小可能总和。这个和的值是一个 32 位整数。



**示例：** 

```
输入：arr = [6,2,4]
输出：32
解释：
有两种可能的树，第一种的非叶节点的总和为 36，第二种非叶节点的总和为 32。

    24            24
   /  \          /  \
  12   4        6    8
 /  \               / \
6    2             2   4
```



**提示：** 

-  *2 <= arr.length <= 40*  
-  *1 <= arr[i] <= 15*  
- 答案保证是一个 32 位带符号整数，即小于  *2^31* 。




# 算法思路

# 测试用例
```
1130. Minimum Cost Tree From Leaf Values 1130. 叶值的最小代价生成树 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-cost-tree-from-leaf-values/
[cnTitle]: https://leetcode-cn.com/problems/minimum-cost-tree-from-leaf-values/
