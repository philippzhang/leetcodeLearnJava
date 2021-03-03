# [1026. Maximum Difference Between Node and Ancestor][enTitle]

**Medium**

Given the  *root*  of a binary tree, find the maximum value  *V*  for which there exist **different**  nodes  *A*  and  *B*  where  *V = |A.val - B.val|*  and  *A*  is an ancestor of  *B* .

A node  *A*  is an ancestor of  *B*  if either: any child of  *A*  is equal to  *B* , or any child of  *A*  is an ancestor of  *B* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/11/09/tmp-tree.jpg)

```
Input: root = [8,3,10,1,6,null,14,null,null,4,7,13]
Output: 7
Explanation:We have various ancestor-node differences, some of which are given below :
|8 - 3| = 5
|3 - 7| = 4
|8 - 1| = 7
|10 - 13| = 3
Among all possible differences, the maximum value of 7 is obtained by |8 - 1| = 7.
```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/11/09/tmp-tree-1.jpg)

```
Input: root = [1,null,2,null,0,3]
Output: 3

```



**Constraints:** 

- The number of nodes in the tree is in the range  *[2, 5000]* . 
-  *0 <= Node.val <= 105* 


# [1026. 节点与其祖先之间的最大差值][cnTitle]

**中等**

给定二叉树的根节点  *root* ，找出存在于 **不同**  节点  *A*  和  *B*  之间的最大值  *V* ，其中  *V = |A.val - B.val|* ，且  *A*  是  *B*  的祖先。

（如果 A 的任何子节点之一为 B，或者 A 的任何子节点是 B 的祖先，那么我们认为 A 是 B 的祖先）



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2020/11/09/tmp-tree.jpg)

```
输入：root = [8,3,10,1,6,null,14,null,null,4,7,13]
输出：7
解释：
我们有大量的节点与其祖先的差值，其中一些如下：
|8 - 3| = 5
|3 - 7| = 4
|8 - 1| = 7
|10 - 13| = 3
在所有可能的差值中，最大值 7 由 |8 - 1| = 7 得出。

```

**示例 2：** 

![img](https://assets.leetcode.com/uploads/2020/11/09/tmp-tree-1.jpg)

```
输入：root = [1,null,2,null,0,3]
输出：3

```



**提示：** 

- 树中的节点数在  *2*  到  *5000*  之间。 
-  *0 <= Node.val <= 105* 




# 算法思路

# 测试用例
```
1026. Maximum Difference Between Node and Ancestor 1026. 节点与其祖先之间的最大差值 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
[cnTitle]: https://leetcode-cn.com/problems/maximum-difference-between-node-and-ancestor/
