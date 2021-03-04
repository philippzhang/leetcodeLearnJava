# [1339. Maximum Product of Splitted Binary Tree][enTitle]

**Medium**

Given a binary tree  *root* . Split the binary tree into two subtrees by removing 1 edge such that the product of the sums of the subtrees are maximized.

Since the answer may be too large, return it modulo 10^9 + 7.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/01/21/sample_1_1699.png)

```
Input: root = [1,2,3,4,5,6]
Output: 110
Explanation: Remove the red edge and get 2 binary trees with sum 11 and 10. Their product is 110 (11*10)

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/01/21/sample_2_1699.png)

```
Input: root = [1,null,2,3,4,null,null,5,6]
Output: 90
Explanation:  Remove the red edge and get 2 binary trees with sum 15 and 6.Their product is 90 (15*6)

```

**Example 3:** 

```
Input: root = [2,3,9,10,7,8,6,5,4,11,1]
Output: 1025

```

**Example 4:** 

```
Input: root = [1,1]
Output: 1

```



**Constraints:** 

- Each tree has at most  *50000*  nodes and at least  *2*  nodes. 
- Each node's value is between  *[1, 10000]* .


# [1339. 分裂二叉树的最大乘积][cnTitle]

**中等**

给你一棵二叉树，它的根为  *root*  。请你删除 1 条边，使二叉树分裂成两棵子树，且它们子树和的乘积尽可能大。

由于答案可能会很大，请你将结果对 10^9 + 7 取模后再返回。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/02/02/sample_1_1699.png)

```
输入：root = [1,2,3,4,5,6]
输出：110
解释：删除红色的边，得到 2 棵子树，和分别为 11 和 10 。它们的乘积是 110 （11*10）

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/02/02/sample_2_1699.png)

```
输入：root = [1,null,2,3,4,null,null,5,6]
输出：90
解释：移除红色的边，得到 2 棵子树，和分别是 15 和 6 。它们的乘积为 90 （15*6）

```

**示例 3：** 

```
输入：root = [2,3,9,10,7,8,6,5,4,11,1]
输出：1025

```

**示例 4：** 

```
输入：root = [1,1]
输出：1

```



**提示：** 

- 每棵树最多有  *50000*  个节点，且至少有  *2*  个节点。 
- 每个节点的值在  *[1, 10000]*  之间。




# 算法思路

# 测试用例
```
1339. Maximum Product of Splitted Binary Tree 1339. 分裂二叉树的最大乘积 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/
[cnTitle]: https://leetcode-cn.com/problems/maximum-product-of-splitted-binary-tree/
