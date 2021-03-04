# [1315. Sum of Nodes with Even-Valued Grandparent][enTitle]

**Medium**

Given a binary tree, return the sum of values of nodes with even-valued grandparent. (A  *grandparent*  of a node is the parent of its parent, if it exists.)

If there are no nodes with an even-valued grandparent, return  *0* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/07/24/1473_ex1.png)

```
Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
Output: 18
Explanation: The red nodes are the nodes with even-value grandparent while the blue nodes are the even-value grandparents.

```



**Constraints:** 

- The number of nodes in the tree is between  *1*  and  *10^4* . 
- The value of nodes is between  *1*  and  *100* .


# [1315. 祖父节点值为偶数的节点和][cnTitle]

**中等**

给你一棵二叉树，请你返回满足以下条件的所有节点的值之和：

- 该节点的祖父节点的值为偶数。（一个节点的祖父节点是指该节点的父节点的父节点。）

如果不存在祖父节点值为偶数的节点，那么返回  *0*  。



**示例：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/01/10/1473_ex1.png)

```
输入：root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
输出：18
解释：图中红色节点的祖父节点的值为偶数，蓝色节点为这些红色节点的祖父节点。

```



**提示：** 

- 树中节点的数目在  *1*  到  *10^4*  之间。 
- 每个节点的值在  *1*  到  *100*  之间。




# 算法思路

# 测试用例
```
1315. Sum of Nodes with Even-Valued Grandparent 1315. 祖父节点值为偶数的节点和 Medium
```

[enTitle]: https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
[cnTitle]: https://leetcode-cn.com/problems/sum-of-nodes-with-even-valued-grandparent/
