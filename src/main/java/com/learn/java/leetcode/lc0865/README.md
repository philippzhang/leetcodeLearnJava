# [865. Smallest Subtree with all the Deepest Nodes][enTitle]

**Medium**

Given the  *root*  of a binary tree, the depth of each node is **the shortest distance to the root** .

Return  *the smallest subtree*  such that it contains **all the deepest nodes**  in the original tree.

A node is called **the deepest**  if it has the largest depth possible among any node in the entire tree.

The **subtree**  of a node is tree consisting of that node, plus the set of all descendants of that node.

**Note:**  This question is the same as 1123: https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/



**Example 1:** 

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/01/sketch1.png)

```
Input: root = [3,5,1,6,2,0,8,null,null,7,4]
Output: [2,7,4]
Explanation: We return the node with value 2, colored in yellow in the diagram.
The nodes coloured in blue are the deepest nodes of the tree.
Notice that nodes 5, 3 and 2 contain the deepest nodes in the tree but node 2 is the smallest subtree among them, so we return it.

```

**Example 2:** 

```
Input: root = [1]
Output: [1]
Explanation: The root is the deepest node in the tree.

```

**Example 3:** 

```
Input: root = [0,1,3,null,2]
Output: [2]
Explanation: The deepest node in the tree is 2, the valid subtrees are the subtrees of nodes 2, 1 and 0 but the subtree of node 2 is the smallest.

```



**Constraints:** 

- The number of nodes in the tree will be in the range  *[1, 500]* . 
-  *0 <= Node.val <= 500*  
- The values of the nodes in the tree are **unique** .


# [865. 具有所有最深节点的最小子树][cnTitle]

**中等**

给定一个根为  *root*  的二叉树，每个节点的深度是 **该节点到根的最短距离**  。

如果一个节点在 **整个树** 的任意节点之间具有最大的深度，则该节点是 **最深的**  。

一个节点的 **子树**  是该节点加上它的所有后代的集合。

返回能满足 **以该节点为根的子树中包含所有最深的节点**  这一条件的具有最大深度的节点。



**注意：** 本题与力扣 1123 重复：https://leetcode-cn.com/problems/lowest-common-ancestor-of-deepest-leaves/



**示例 1：** 

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/01/sketch1.png)

```
输入：root = [3,5,1,6,2,0,8,null,null,7,4]
输出：[2,7,4]
解释：
我们返回值为 2 的节点，在图中用黄色标记。
在图中用蓝色标记的是树的最深的节点。
注意，节点 5、3 和 2 包含树中最深的节点，但节点 2 的子树最小，因此我们返回它。

```

**示例 2：** 

```
输入：root = [1]
输出：[1]
解释：根节点是树中最深的节点。
```

**示例 3：** 

```
输入：root = [0,1,3,null,2]
输出：[2]
解释：树中最深的节点为 2 ，有效子树为节点 2、1 和 0 的子树，但节点 2 的子树最小。
```



**提示：** 

- 树中节点的数量介于 1 和 500 之间。 
-  *0 <= Node.val <= 500*  
- 每个节点的值都是独一无二的。




# 算法思路

# 测试用例
```
865. Smallest Subtree with all the Deepest Nodes 865. 具有所有最深节点的最小子树 Medium
```

[enTitle]: https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/
[cnTitle]: https://leetcode-cn.com/problems/smallest-subtree-with-all-the-deepest-nodes/
