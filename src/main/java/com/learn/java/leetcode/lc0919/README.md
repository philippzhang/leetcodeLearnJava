# [919. Complete Binary Tree Inserter][enTitle]

**Medium**

A  *complete*  binary tree is a binary tree in which every level, except possibly the last, is completely filled, and all nodes are as far left as possible.

Write a data structure  *CBTInserter*  that is initialized with a complete binary tree and supports the following operations:

-  *CBTInserter(TreeNode root)*  initializes the data structure on a given tree with head node  *root* ; 
-  *CBTInserter.insert(int v)*  will insert a  *TreeNode*  into the tree with value  *node.val = v*  so that the tree remains complete, <strong>and returns the value of the parent of the inserted  *TreeNode* </strong>; 
-  *CBTInserter.get_root()*  will return the head node of the tree.






**Example 1:** 

```
Input:inputs = ["CBTInserter","insert","get_root"], inputs = [[[1]],[2],[]]
Output: [null,1,[1,2]]
```


**Example 2:** 

```
Input:inputs = ["CBTInserter","insert","insert","get_root"], inputs = [[[1,2,3,4,5,6]],[7],[8],[]]
Output: [null,3,4,[1,2,3,4,5,6,7,8]]
```






**Note:** 

1. The initial given tree is complete and contains between  *1*  and  *1000*  nodes. 
2.  *CBTInserter.insert*  is called at most  *10000*  times per test case. 
3. Every value of a given or inserted node is between  *0*  and  *5000* .














# [919. 完全二叉树插入器][cnTitle]

**中等**

完全二叉树是每一层（除最后一层外）都是完全填充（即，节点数达到最大）的，并且所有的节点都尽可能地集中在左侧。

设计一个用完全二叉树初始化的数据结构  *CBTInserter* ，它支持以下几种操作：

-  *CBTInserter(TreeNode root)*  使用头节点为  *root*  的给定树初始化该数据结构； 
-  *CBTInserter.insert(int v)*  向树中插入一个新节点，节点类型为  *TreeNode* ，值为  *v*  。使树保持完全二叉树的状态，**并返回插入的新节点的父节点的值** ； 
-  *CBTInserter.get_root()*  将返回树的头节点。





**示例 1：** 

```
输入：inputs = ["CBTInserter","insert","get_root"], inputs = [[[1]],[2],[]]
输出：[null,1,[1,2]]

```

**示例 2：** 

```
输入：inputs = ["CBTInserter","insert","insert","get_root"], inputs = [[[1,2,3,4,5,6]],[7],[8],[]]
输出：[null,3,4,[1,2,3,4,5,6,7,8]]

```



**提示：** 

1. 最初给定的树是完全二叉树，且包含  *1*  到  *1000*  个节点。 
2. 每个测试用例最多调用  *CBTInserter.insert*  操作  *10000*  次。 
3. 给定节点或插入节点的每个值都在  *0*  到  *5000*  之间。




# 算法思路

# 测试用例
```
919. Complete Binary Tree Inserter 919. 完全二叉树插入器 Medium
```

[enTitle]: https://leetcode.com/problems/complete-binary-tree-inserter/
[cnTitle]: https://leetcode-cn.com/problems/complete-binary-tree-inserter/
