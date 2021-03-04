# [1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree][enTitle]

**Medium**

Given two binary trees  *original*  and  *cloned*  and given a reference to a node  *target*  in the original tree.

The  *cloned*  tree is a **copy of**  the  *original*  tree.

Return  *a reference to the same node*  in the  *cloned*  tree.

**Note**  that you are **not allowed**  to change any of the two trees or the  *target*  node and the answer **must be**  a reference to a node in the  *cloned*  tree.

**Follow up:**  Solve the problem if repeated values on the tree are allowed.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/02/21/e1.png)

```
Input: tree = [7,4,3,null,null,6,19], target = 3
Output: 3
Explanation: In all examples the original and cloned trees are shown. The target node is a green node from the original tree. The answer is the yellow node from the cloned tree.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/02/21/e2.png)

```
Input: tree = [7], target =  7
Output: 7

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2020/02/21/e3.png)

```
Input: tree = [8,null,6,null,5,null,4,null,3,null,2,null,1], target = 4
Output: 4

```

**Example 4:** 

![img](https://assets.leetcode.com/uploads/2020/02/21/e4.png)

```
Input: tree = [1,2,3,4,5,6,7,8,9,10], target = 5
Output: 5

```

**Example 5:** 

![img](https://assets.leetcode.com/uploads/2020/02/21/e5.png)

```
Input: tree = [1,2,null,3], target = 2
Output: 2

```



**Constraints:** 

- The number of nodes in the  *tree*  is in the range  *[1, 10^4]* . 
- The values of the nodes of the  *tree*  are unique. 
-  *target*  node is a node from the  *original*  tree and is not  *null* .


# [1379. 找出克隆二叉树中的相同节点][cnTitle]

**中等**

给你两棵二叉树，原始树  *original*  和克隆树  *cloned* ，以及一个位于原始树  *original*  中的目标节点  *target* 。

其中，克隆树  *cloned*  是原始树  *original*  的一个**副本** 。

请找出在树  *cloned*  中，与  *target*  **相同** 的节点，并返回对该节点的引用（在 C/C++ 等有指针的语言中返回 节点指针，其他语言返回节点本身）。



**注意：** 

1. 你 **不能**  对两棵二叉树，以及  *target*  节点进行更改。 
2. **只能**  返回对克隆树  *cloned*  中已有的节点的引用。



**进阶：** 如果树中允许出现值相同的节点，你将如何解答？





**示例 1:** 

![img](https://assets.leetcode.com/uploads/2020/02/21/e1.png)

```
输入: tree = [7,4,3,null,null,6,19], target = 3
输出: 3
解释: 上图画出了树 original 和 cloned。target 节点在树 original 中，用绿色标记。答案是树 cloned 中的黄颜色的节点（其他示例类似）。
```

**示例 2:** 

![img](https://assets.leetcode.com/uploads/2020/02/21/e2.png)

```
输入: tree = [7], target =  7
输出: 7

```

**示例 3:** 

![img](https://assets.leetcode.com/uploads/2020/02/21/e3.png)

```
输入: tree = [8,null,6,null,5,null,4,null,3,null,2,null,1], target = 4
输出: 4

```

**示例 4:** 

![img](https://assets.leetcode.com/uploads/2020/02/21/e4.png)

```
输入: tree = [1,2,3,4,5,6,7,8,9,10], target = 5
输出: 5

```

**示例 5:** 

![img](https://assets.leetcode.com/uploads/2020/02/21/e5.png)

```
输入: tree = [1,2,null,3], target = 2
输出: 2
```



**提示：** 

- 树中节点的数量范围为  *[1, 10^4]*  。 
- 同一棵树中，没有值相同的节点。 
-  *target*  节点是树  *original*  中的一个节点，并且不会是  *null*  。




# 算法思路

# 测试用例
```
1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree 1379. 找出克隆二叉树中的相同节点 Medium
```

[enTitle]: https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
[cnTitle]: https://leetcode-cn.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
