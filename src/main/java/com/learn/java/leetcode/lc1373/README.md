# [1373. Maximum Sum BST in Binary Tree][enTitle]

**Hard**

Given a **binary tree**   *root* , the task is to return the maximum sum of all keys of **any**  sub-tree which is also a Binary Search Tree (BST).

Assume a BST is defined as follows:

- The left subtree of a node contains only nodes with keys **less than**  the node's key. 
- The right subtree of a node contains only nodes with keys **greater than**  the node's key. 
- Both the left and right subtrees must also be binary search trees.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/01/30/sample_1_1709.png)

```
Input: root = [1,4,3,2,4,2,5,null,null,null,null,null,null,4,6]
Output: 20
Explanation: Maximum sum in a valid Binary search tree is obtained in root node with key equal to 3.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/01/30/sample_2_1709.png)

```
Input: root = [4,3,null,1,2]
Output: 2
Explanation: Maximum sum in a valid Binary search tree is obtained in a single root node with key equal to 2.

```

**Example 3:** 

```
Input: root = [-4,-2,-5]
Output: 0
Explanation: All values are negatives. Return an empty BST.

```

**Example 4:** 

```
Input: root = [2,1,3]
Output: 6

```

**Example 5:** 

```
Input: root = [5,4,8,3,null,6,3]
Output: 7

```



**Constraints:** 

- The given binary tree will have between  *1*  and  *40000*  nodes. 
- Each node's value is between  *[-4 * 10^4 , 4 * 10^4]* .


# [1373. 二叉搜索子树的最大键值和][cnTitle]

**困难**

给你一棵以  *root*  为根的 **二叉树**  ，请你返回 **任意**  二叉搜索子树的最大键值和。

二叉搜索树的定义如下：

- 任意节点的左子树中的键值都 **小于**  此节点的键值。 
- 任意节点的右子树中的键值都 **大于**  此节点的键值。 
- 任意节点的左子树和右子树都是二叉搜索树。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/03/07/sample_1_1709.png)

```
输入：root = [1,4,3,2,4,2,5,null,null,null,null,null,null,4,6]
输出：20
解释：键值为 3 的子树是和最大的二叉搜索树。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/03/07/sample_2_1709.png)

```
输入：root = [4,3,null,1,2]
输出：2
解释：键值为 2 的单节点子树是和最大的二叉搜索树。

```

**示例 3：** 

```
输入：root = [-4,-2,-5]
输出：0
解释：所有节点键值都为负数，和最大的二叉搜索树为空。

```

**示例 4：** 

```
输入：root = [2,1,3]
输出：6

```

**示例 5：** 

```
输入：root = [5,4,8,3,null,6,3]
输出：7

```



**提示：** 

- 每棵树最多有  *40000*  个节点。 
- 每个节点的键值在  *[-4 * 10^4 , 4 * 10^4]*  之间。




# 算法思路

# 测试用例
```
1373. Maximum Sum BST in Binary Tree 1373. 二叉搜索子树的最大键值和 Hard
```

[enTitle]: https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/
[cnTitle]: https://leetcode-cn.com/problems/maximum-sum-bst-in-binary-tree/
