# [968. Binary Tree Cameras][enTitle]

**Hard**

Given a binary tree, we install cameras on the nodes of the tree.

Each camera at a node can monitor **its parent, itself, and its immediate children** .

Calculate the minimum number of cameras needed to monitor all nodes of the tree.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2018/12/29/bst_cameras_01.png)


```
Input:[0,0,null,0,0]
Output: 1
Explanation: One camera is enough to monitor all nodes if placed as shown.
```


**Example 2:** 

![img](https://assets.leetcode.com/uploads/2018/12/29/bst_cameras_02.png)

```
Input:[0,0,null,0,null,0,null,null,0]
Output: 2
Explanation: At least two cameras are needed to monitor all nodes of the tree. The above image shows one of the valid configurations of camera placement.
```

 **Note:** 

1. The number of nodes in the given tree will be in the range  *[1, 1000]* . 
2. **Every**  node has value 0.






# [968. 监控二叉树][cnTitle]

**困难**

给定一个二叉树，我们在树的节点上安装摄像头。

节点上的每个摄影头都可以监视**其父对象、自身及其直接子对象。** 

计算监控树的所有节点所需的最小摄像头数量。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/29/bst_cameras_01.png)

```
输入：[0,0,null,0,0]
输出：1
解释：如图所示，一台摄像头足以监控所有节点。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/29/bst_cameras_02.png)

```
输入：[0,0,null,0,null,0,null,null,0]
输出：2
解释：需要至少两个摄像头来监视树的所有节点。 上图显示了摄像头放置的有效位置之一。

```

 **提示：** 

1. 给定树的节点数的范围是  *[1, 1000]* 。 
2. 每个节点的值都是 0。




# 算法思路

# 测试用例
```
968. Binary Tree Cameras 968. 监控二叉树 Hard
```

[enTitle]: https://leetcode.com/problems/binary-tree-cameras/
[cnTitle]: https://leetcode-cn.com/problems/binary-tree-cameras/
