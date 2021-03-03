# [971. Flip Binary Tree To Match Preorder Traversal][enTitle]

**Medium**

**pre-order traversal** 

Any node in the binary tree can be **flipped**  by swapping its left and right subtrees. For example, flipping node 1 will have the following effect:

![img](https://assets.leetcode.com/uploads/2021/02/15/fliptree.jpg)

Flip the **smallest**  number of nodes so that the **pre-order traversal**  of the tree **matches**   *voyage* .

Return  *a list of the values of all flipped nodes. You may return the answer in any order. If it is impossible to flip the nodes in the tree to make the pre-order traversal match*  *voyage*  *, return the list*  *[-1]* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/01/02/1219-01.png)

```
Input: root = [1,2], voyage = [2,1]
Output: [-1]
Explanation: It is impossible to flip the nodes such that the pre-order traversal matches voyage.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2019/01/02/1219-02.png)

```
Input: root = [1,2,3], voyage = [1,3,2]
Output: [1]
Explanation: Flipping node 1 swaps nodes 2 and 3, so the pre-order traversal matches voyage.
```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2019/01/02/1219-02.png)

```
Input: root = [1,2,3], voyage = [1,2,3]
Output: []
Explanation: The tree's pre-order traversal already matches voyage, so no nodes need to be flipped.

```



**Constraints:** 

- The number of nodes in the tree is  *n* . 
-  *n == voyage.length*  
-  *1 <= n <= 100*  
-  *1 <= Node.val, voyage[i] <= n*  
- All the values in the tree are **unique** . 
- All the values in  *voyage*  are **unique** .


# [971. 翻转二叉树以匹配先序遍历][cnTitle]

**中等**

给你一棵二叉树的根节点  *root*  ，树中有  *n*  个节点，每个节点都有一个不同于其他节点且处于  *1*  到  *n*  之间的值。

**先序遍历** 

通过交换节点的左右子树，可以 **翻转**  该二叉树中的任意节点。例，翻转节点 1 的效果如下：

![img](https://assets.leetcode.com/uploads/2021/02/15/fliptree.jpg)

请翻转 **最少** 的树中节点，使二叉树的 **先序遍历**  与预期的遍历行程  *voyage*  **相匹配**  。

如果可以，则返回 **翻转的**  所有节点的值的列表。你可以按任何顺序返回答案。如果不能，则返回列表  *[-1]* 。



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2019/01/02/1219-01.png)

```
输入：root = [1,2], voyage = [2,1]
输出：[-1]
解释：翻转节点无法令先序遍历匹配预期行程。

```

**示例 2：** 

![img](https://assets.leetcode.com/uploads/2019/01/02/1219-02.png)

```
输入：root = [1,2,3], voyage = [1,3,2]
输出：[1]
解释：交换节点 2 和 3 来翻转节点 1 ，先序遍历可以匹配预期行程。
```

**示例 3：** 

![img](https://assets.leetcode.com/uploads/2019/01/02/1219-02.png)

```
输入：root = [1,2,3], voyage = [1,2,3]
输出：[]
解释：先序遍历已经匹配预期行程，所以不需要翻转节点。

```



**提示：** 

- 树中的节点数目为  *n*  
-  *n == voyage.length*  
-  *1 <= n <= 100*  
-  *1 <= Node.val, voyage[i] <= n*  
- 树中的所有值 **互不相同**  
-  *voyage*  中的所有值 **互不相同** 




# 算法思路

# 测试用例
```
971. Flip Binary Tree To Match Preorder Traversal 971. 翻转二叉树以匹配先序遍历 Medium
```

[enTitle]: https://leetcode.com/problems/flip-binary-tree-to-match-preorder-traversal/
[cnTitle]: https://leetcode-cn.com/problems/flip-binary-tree-to-match-preorder-traversal/
