# [669. Trim a Binary Search Tree][enTitle]

**Medium**

Given the  *root*  of a binary search tree and the lowest and highest boundaries as  *low*  and  *high* , trim the tree so that all its elements lies in  *[low, high]* . Trimming the tree should **not**  change the relative structure of the elements that will remain in the tree (i.e., any node's descendant should remain a descendant). It can be proven that there is a **unique answer** .

Return  *the root of the trimmed binary search tree* . Note that the root may change depending on the given bounds.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/09/09/trim1.jpg)

```
Input: root = [1,0,2], low = 1, high = 2
Output: [1,null,2]

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/09/09/trim2.jpg)

```
Input: root = [3,0,4,null,2,null,null,1], low = 1, high = 3
Output: [3,2,null,1]

```

**Example 3:** 

```
Input: root = [1], low = 1, high = 2
Output: [1]

```

**Example 4:** 

```
Input: root = [1,null,2], low = 1, high = 3
Output: [1,null,2]

```

**Example 5:** 

```
Input: root = [1,null,2], low = 2, high = 4
Output: [2]

```



**Constraints:** 

- The number of nodes in the tree in the range  *[1, 104]* . 
-  *0 <= Node.val <= 104*  
- The value of each node in the tree is **unique** . 
-  *root*  is guaranteed to be a valid binary search tree. 
-  *0 <= low <= high <= 104* 


# [669. 修剪二叉搜索树][cnTitle]

**中等**

给你二叉搜索树的根节点  *root*  ，同时给定最小边界 *low*  和最大边界  *high* 。通过修剪二叉搜索树，使得所有节点的值在 *[low, high]* 中。修剪树不应该改变保留在树中的元素的相对结构（即，如果没有被移除，原有的父代子代关系都应当保留）。 可以证明，存在唯一的答案。

所以结果应当返回修剪好的二叉搜索树的新的根节点。注意，根节点可能会根据给定的边界发生改变。



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2020/09/09/trim1.jpg)

```
输入：root = [1,0,2], low = 1, high = 2
输出：[1,null,2]

```

**示例 2：** 

![img](https://assets.leetcode.com/uploads/2020/09/09/trim2.jpg)

```
输入：root = [3,0,4,null,2,null,null,1], low = 1, high = 3
输出：[3,2,null,1]

```

**示例 3：** 

```
输入：root = [1], low = 1, high = 2
输出：[1]

```

**示例 4：** 

```
输入：root = [1,null,2], low = 1, high = 3
输出：[1,null,2]

```

**示例 5：** 

```
输入：root = [1,null,2], low = 2, high = 4
输出：[2]

```



**提示：** 

- 树中节点数在范围  *[1, 104]*  内 
-  *0 <= Node.val <= 104*  
- 树中每个节点的值都是唯一的 
- 题目数据保证输入是一棵有效的二叉搜索树 
-  *0 <= low <= high <= 104* 




# 算法思路

# 测试用例
```
669. Trim a Binary Search Tree 669. 修剪二叉搜索树 Medium
```

[enTitle]: https://leetcode.com/problems/trim-a-binary-search-tree/
[cnTitle]: https://leetcode-cn.com/problems/trim-a-binary-search-tree/
