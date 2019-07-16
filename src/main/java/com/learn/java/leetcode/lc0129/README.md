# [129. Sum Root to Leaf Numbers][enTitle]

**Medium**

Given a binary tree containing digits from  *0-9*  only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path  *1->2->3*  which represents the number  *123* .

Find the total sum of all root-to-leaf numbers.

**Note:**  A leaf is a node with no children.

**Example:** 

```
Input: [1,2,3]
    1
   / \
  2   3
Output: 25
Explanation:
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.
Therefore, sum = 12 + 13 = 25.
```

**Example 2:** 

```
Input: [4,9,0,5,1]
    4
   / \
  9   0
 / \
5   1
Output: 1026
Explanation:
The root-to-leaf path 4->9->5 represents the number 495.
The root-to-leaf path 4->9->1 represents the number 491.
The root-to-leaf path 4->0 represents the number 40.
Therefore, sum = 495 + 491 + 40 = 1026.
```


# [129. 求根到叶子节点数字之和][cnTitle]

**中等**

给定一个二叉树，它的每个结点都存放一个  *0-9*  的数字，每条从根到叶子节点的路径都代表一个数字。

例如，从根到叶子节点路径  *1->2->3*  代表数字  *123* 。

计算从根到叶子节点生成的所有数字之和。

**说明:**  叶子节点是指没有子节点的节点。

**示例 1:** 

```
输入: [1,2,3]
    1
   / \
  2   3
输出: 25
解释:
从根到叶子节点路径 1->2 代表数字 12.
从根到叶子节点路径 1->3 代表数字 13.
因此，数字总和 = 12 + 13 = 25.
```

**示例 2:** 

```
输入: [4,9,0,5,1]
    4
   / \
  9   0
 / \
5   1
输出: 1026
解释:
从根到叶子节点路径 4->9->5 代表数字 495.
从根到叶子节点路径 4->9->1 代表数字 491.
从根到叶子节点路径 4->0 代表数字 40.
因此，数字总和 = 495 + 491 + 40 = 1026.
```




# 算法思路

# 测试用例
```
129. Sum Root to Leaf Numbers 129. 求根到叶子节点数字之和 Medium
Solution.sumNumbers
---
[1,2,3]

=25
---
[4,9,0,5,1]

=1026
```

[enTitle]: https://leetcode.com/problems/sum-root-to-leaf-numbers/
[cnTitle]: https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/
