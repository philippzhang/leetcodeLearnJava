# [1028. Recover a Tree From Preorder Traversal][enTitle]

**Hard**

We run a preorder depth-first search (DFS) on the  *root*  of a binary tree.

At each node in this traversal, we output  *D*  dashes (where  *D*  is the depth of this node), then we output the value of this node. If the depth of a node is  *D* , the depth of its immediate child is  *D + 1* . The depth of the  *root*  node is  *0* .

If a node has only one child, that child is guaranteed to be **the left child** .

Given the output  *S*  of this traversal, recover the tree and return  *its*   *root* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/04/08/recover-a-tree-from-preorder-traversal.png)

```
Input: S = "1-2--3--4-5--6--7"
Output: [1,2,5,3,4,6,7]

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2019/04/11/screen-shot-2019-04-10-at-114101-pm.png)

```
Input: S = "1-2--3---4-5--6---7"
Output: [1,2,5,3,null,6,null,4,null,7]

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2019/04/11/screen-shot-2019-04-10-at-114955-pm.png)

```
Input: S = "1-401--349---90--88"
Output: [1,401,null,349,88,90]

```



**Constraints:** 

- The number of nodes in the original tree is in the range  *[1, 1000]* . 
-  *1 <= Node.val <= 109* 


# [1028. 从先序遍历还原二叉树][cnTitle]

**困难**

我们从二叉树的根节点  *root*  开始进行深度优先搜索。

在遍历中的每个节点处，我们输出  *D*  条短划线（其中  *D*  是该节点的深度），然后输出该节点的值。（<em>如果节点的深度为  *D* ，则其直接子节点的深度为 <code>D + 1</code>。根节点的深度为 <code>0</code>）。</em>

如果节点只有一个子节点，那么保证该子节点为左子节点。

给出遍历输出  *S* ，还原树并返回其根节点  *root* 。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/04/12/recover-a-tree-from-preorder-traversal.png)

```
输入："1-2--3--4-5--6--7"
输出：[1,2,5,3,4,6,7]

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/04/12/screen-shot-2019-04-10-at-114101-pm.png)

```
输入："1-2--3---4-5--6---7"
输出：[1,2,5,3,null,6,null,4,null,7]

```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/04/12/screen-shot-2019-04-10-at-114955-pm.png)

```
输入："1-401--349---90--88"
输出：[1,401,null,349,88,90]

```



**提示：** 

- 原始树中的节点数介于  *1*  和  *1000*  之间。 
- 每个节点的值介于  *1*  和  *10 ^ 9*  之间。




# 算法思路

# 测试用例
```
1028. Recover a Tree From Preorder Traversal 1028. 从先序遍历还原二叉树 Hard
```

[enTitle]: https://leetcode.com/problems/recover-a-tree-from-preorder-traversal/
[cnTitle]: https://leetcode-cn.com/problems/recover-a-tree-from-preorder-traversal/
