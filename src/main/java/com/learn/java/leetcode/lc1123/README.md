# [1123. Lowest Common Ancestor of Deepest Leaves][enTitle]

**Medium**

Given the  *root*  of a binary tree, return  *the lowest common ancestor of its deepest leaves* .

Recall that:

- The node of a binary tree is a leaf if and only if it has no children 
- The depth of the root of the tree is  *0* . if the depth of a node is  *d* , the depth of each of its children is  *d + 1* . 
- The lowest common ancestor of a set  *S*  of nodes, is the node  *A*  with the largest depth such that every node in  *S*  is in the subtree with root  *A* .

**Note:**  This question is the same as 865: https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/



**Example 1:** 

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/01/sketch1.png)

```
Input: root = [3,5,1,6,2,0,8,null,null,7,4]
Output: [2,7,4]
Explanation: We return the node with value 2, colored in yellow in the diagram.
The nodes coloured in blue are the deepest leaf-nodes of the tree.
Note that nodes 6, 0, and 8 are also leaf nodes, but the depth of them is 2, but the depth of nodes 7 and 4 is 3.
```

**Example 2:** 

```
Input: root = [1]
Output: [1]
Explanation: The root is the deepest node in the tree, and it's the lca of itself.

```

**Example 3:** 

```
Input: root = [0,1,3,null,2]
Output: [2]
Explanation: The deepest leaf node in the tree is 2, the lca of one node is itself.

```



**Constraints:** 

- The number of nodes in the tree will be in the range  *[1, 1000]* . 
-  *0 <= Node.val <= 1000*  
- The values of the nodes in the tree are **unique** .


# [1123. 最深叶节点的最近公共祖先][cnTitle]

**中等**

给你一个有根节点的二叉树，找到它最深的叶节点的最近公共祖先。

回想一下：

- **叶节点**  是二叉树中没有子节点的节点 
- 树的根节点的 **深度** 为  *0* ，如果某一节点的深度为  *d* ，那它的子节点的深度就是  *d+1*  
- 如果我们假定  *A*  是一组节点  *S*  的 **最近公共祖先** ， *S*  中的每个节点都在以  *A*  为根节点的子树中，且  *A*  的深度达到此条件下可能的最大值。



注意：本题与力扣 865 重复：https://leetcode-cn.com/problems/smallest-subtree-with-all-the-deepest-nodes/



**示例 1：** 

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/01/sketch1.png)

```
输入：root = [3,5,1,6,2,0,8,null,null,7,4]
输出：[2,7,4]
解释：
我们返回值为 2 的节点，在图中用黄色标记。
在图中用蓝色标记的是树的最深的节点。
注意，节点 6、0 和 8 也是叶节点，但是它们的深度是 2 ，而节点 7 和 4 的深度是 3 。

```

**示例 2：** 

```
输入：root = [1]
输出：[1]
解释：根节点是树中最深的节点，它是它本身的最近公共祖先。

```

**示例 3：** 

```
输入：root = [0,1,3,null,2]
输出：[2]
解释：树中最深的叶节点是 2 ，最近公共祖先是它自己。
```



**提示：** 

- 给你的树中将有 1 到 1000 个节点。 
- 树中每个节点的值都在 1 到 1000 之间。 
- 每个节点的值都是独一无二的。




# 算法思路

# 测试用例
```
1123. Lowest Common Ancestor of Deepest Leaves 1123. 最深叶节点的最近公共祖先 Medium
```

[enTitle]: https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/
[cnTitle]: https://leetcode-cn.com/problems/lowest-common-ancestor-of-deepest-leaves/
