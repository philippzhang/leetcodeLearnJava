# [1457. Pseudo-Palindromic Paths in a Binary Tree][enTitle]

**Medium**

Given a binary tree where node values are digits from 1 to 9. A path in the binary tree is said to be **pseudo-palindromic**  if at least one permutation of the node values in the path is a palindrome.

 *Return the number of pseudo-palindromic paths going from the root node to leaf nodes.* 



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/05/06/palindromic_paths_1.png)

```
Input: root = [2,3,1,3,1,null,1]
Output: 2 
Explanation: The figure above represents the given binary tree. There are three paths going from the root node to leaf nodes: the red path [2,3,3], the green path [2,1,1], and the path [2,3,1]. Among these paths only red path and green path are pseudo-palindromic paths since the red path [2,3,3] can be rearranged in [3,2,3] (palindrome) and the green path [2,1,1] can be rearranged in [1,2,1] (palindrome).

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/05/07/palindromic_paths_2.png)

```
Input: root = [2,1,1,1,3,null,null,null,null,null,1]
Output: 1 
Explanation: The figure above represents the given binary tree. There are three paths going from the root node to leaf nodes: the green path [2,1,1], the path [2,1,3,1], and the path [2,1]. Among these paths only the green path is pseudo-palindromic since [2,1,1] can be rearranged in [1,2,1] (palindrome).

```

**Example 3:** 

```
Input: root = [9]
Output: 1

```



**Constraints:** 

- The number of nodes in the tree is in the range  *[1, 105]* . 
-  *1 <= Node.val <= 9* 


# [1457. 二叉树中的伪回文路径][cnTitle]

**中等**

给你一棵二叉树，每个节点的值为 1 到 9 。我们称二叉树中的一条路径是 「**伪回文** 」的，当它满足：路径经过的所有节点值的排列中，存在一个回文序列。

请你返回从根到叶子节点的所有路径中 **伪回文** 路径的数目。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/05/23/palindromic_paths_1.png)

```
输入：root = [2,3,1,3,1,null,1]
输出：2 
解释：上图为给定的二叉树。总共有 3 条从根到叶子的路径：红色路径 [2,3,3] ，绿色路径 [2,1,1] 和路径 [2,3,1] 。
     在这些路径中，只有红色和绿色的路径是伪回文路径，因为红色路径 [2,3,3] 存在回文排列 [3,2,3] ，绿色路径 [2,1,1] 存在回文排列 [1,2,1] 。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/05/23/palindromic_paths_2.png)

```
输入：root = [2,1,1,1,3,null,null,null,null,null,1]
输出：1 
解释：上图为给定二叉树。总共有 3 条从根到叶子的路径：绿色路径 [2,1,1] ，路径 [2,1,3,1] 和路径 [2,1] 。
     这些路径中只有绿色路径是伪回文路径，因为 [2,1,1] 存在回文排列 [1,2,1] 。

```

**示例 3：** 

```
输入：root = [9]
输出：1

```



**提示：** 

- 给定二叉树的节点数目在  *1*  到  *10^5*  之间。 
- 节点值在  *1*  到  *9*  之间。




# 算法思路

# 测试用例
```
1457. Pseudo-Palindromic Paths in a Binary Tree 1457. 二叉树中的伪回文路径 Medium
```

[enTitle]: https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/
[cnTitle]: https://leetcode-cn.com/problems/pseudo-palindromic-paths-in-a-binary-tree/
