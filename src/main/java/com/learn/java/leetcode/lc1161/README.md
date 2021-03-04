# [1161. Maximum Level Sum of a Binary Tree][enTitle]

**Medium**

Given the  *root*  of a binary tree, the level of its root is  *1* , the level of its children is  *2* , and so on.

Return the **smallest**  level  *x*  such that the sum of all the values of nodes at level  *x*  is **maximal** .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/05/03/capture.JPG)

```
Input: root = [1,7,0,7,-8,null,null]
Output: 2
Explanation:
Level 1 sum = 1.
Level 2 sum = 7 + 0 = 7.
Level 3 sum = 7 + -8 = -1.
So we return the level with the maximum sum which is level 2.

```

**Example 2:** 

```
Input: root = [989,null,10250,98693,-89388,null,null,null,-32127]
Output: 2

```



**Constraints:** 

- The number of nodes in the tree is in the range  *[1, 104]* . 
-  *-105 <= Node.val <= 105* 


# [1161. 最大层内元素和][cnTitle]

**中等**

给你一个二叉树的根节点  *root* 。设根节点位于二叉树的第  *1*  层，而根节点的子节点位于第  *2*  层，依此类推。

请你找出层内元素之和 **最大**  的那几层（可能只有一层）的层号，并返回其中 **最小**  的那个。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/08/17/capture.jpeg)

```
输入：root = [1,7,0,7,-8,null,null]
输出：2
解释：
第 1 层各元素之和为 1，
第 2 层各元素之和为 7 + 0 = 7，
第 3 层各元素之和为 7 + -8 = -1，
所以我们返回第 2 层的层号，它的层内元素之和最大。

```

**示例 2：** 

```
输入：root = [989,null,10250,98693,-89388,null,null,null,-32127]
输出：2

```



**提示：** 

- 树中的节点数介于  *1*  和  *10^4*  之间 
-  *-10^5 <= node.val <= 10^5* 




# 算法思路

# 测试用例
```
1161. Maximum Level Sum of a Binary Tree 1161. 最大层内元素和 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
[cnTitle]: https://leetcode-cn.com/problems/maximum-level-sum-of-a-binary-tree/
