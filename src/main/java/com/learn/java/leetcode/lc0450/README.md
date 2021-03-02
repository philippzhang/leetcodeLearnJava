# [450. Delete Node in a BST][enTitle]

**Medium**

Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.

Basically, the deletion can be divided into two stages:

1. Search for a node to remove. 
2. If the node is found, delete the node.

Follow up: Can you solve it with time complexity  *O(height of tree)* ?



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/09/04/del_node_1.jpg)


<pre><strong>Input:</strong> root = [5,3,6,2,4,null,7], key = 3
<strong>Output:</strong> [5,4,6,2,null,null,7]
<strong>Explanation:</strong> Given key to delete is 3. So we find the node with value 3 and delete it.
One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/04/del_node_supp.jpg" style="width: 350px; height: 255px;">
</pre>

**Example 2:** 

```
Input: root = [5,3,6,2,4,null,7], key = 0
Output: [5,3,6,2,4,null,7]
Explanation: The tree does not contain a node with value = 0.

```

**Example 3:** 

```
Input: root = [], key = 0
Output: []

```



**Constraints:** 

- The number of nodes in the tree is in the range  *[0, 104]* . 
-  *-105 <= Node.val <= 105*  
- Each node has a **unique**  value. 
-  *root*  is a valid binary search tree. 
-  *-105 <= key <= 105* 


# [450. 删除二叉搜索树中的节点][cnTitle]

**中等**

给定一个二叉搜索树的根节点 **root** 和一个值 **key** ，删除二叉搜索树中的 **key** 对应的节点，并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的根节点的引用。

一般来说，删除节点可分为两个步骤：

1. 首先找到需要删除的节点； 
2. 如果找到了，删除它。

**说明：**  要求算法时间复杂度为 O(h)，h 为树的高度。

**示例:** 

```
root = [5,3,6,2,4,null,7]
key = 3

    5
   / \
  3   6
 / \   \
2   4   7

给定需要删除的节点值是 3，所以我们首先找到 3 这个节点，然后删除它。

一个正确的答案是 [5,4,6,2,null,null,7], 如下图所示。

    5
   / \
  4   6
 /     \
2       7

另一个正确答案是 [5,2,6,null,4,null,7]。

    5
   / \
  2   6
   \   \
    4   7

```




# 算法思路

# 测试用例
```
450. Delete Node in a BST 450. 删除二叉搜索树中的节点 Medium
```

[enTitle]: https://leetcode.com/problems/delete-node-in-a-bst/
[cnTitle]: https://leetcode-cn.com/problems/delete-node-in-a-bst/
