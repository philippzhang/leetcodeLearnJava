# [872. Leaf-Similar Trees][enTitle]

**Easy**

Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a **leaf value sequence**  *.* 

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/16/tree.png)

For example, in the given tree above, the leaf value sequence is  *(6, 7, 4, 9, 8)* .

Two binary trees are considered  *leaf-similar*  if their leaf value sequence is the same.

Return  *true*  if and only if the two given trees with head nodes  *root1*  and  *root2*  are leaf-similar.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/09/03/leaf-similar-1.jpg)

```
Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
Output: true

```

**Example 2:** 

```
Input: root1 = [1], root2 = [1]
Output: true

```

**Example 3:** 

```
Input: root1 = [1], root2 = [2]
Output: false

```

**Example 4:** 

```
Input: root1 = [1,2], root2 = [2,2]
Output: true

```

**Example 5:** 

![img](https://assets.leetcode.com/uploads/2020/09/03/leaf-similar-2.jpg)

```
Input: root1 = [1,2,3], root2 = [1,3,2]
Output: false

```



**Constraints:** 

- The number of nodes in each tree will be in the range  *[1, 200]* . 
- Both of the given trees will have values in the range  *[0, 200]* .


# [872. 叶子相似的树][cnTitle]

**简单**

请考虑一棵二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个  *叶值序列*  。

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/16/tree.png)

举个例子，如上图所示，给定一棵叶值序列为  *(6, 7, 4, 9, 8)*  的树。

如果有两棵二叉树的叶值序列是相同，那么我们就认为它们是  *叶相似* 的。

如果给定的两个头结点分别为  *root1*  和  *root2*  的树是叶相似的，则返回  *true* ；否则返回  *false*  。



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2020/09/03/leaf-similar-1.jpg)

```
输入：root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
输出：true

```

**示例 2：** 

```
输入：root1 = [1], root2 = [1]
输出：true

```

**示例 3：** 

```
输入：root1 = [1], root2 = [2]
输出：false

```

**示例 4：** 

```
输入：root1 = [1,2], root2 = [2,2]
输出：true

```

**示例 5：** 

![img](https://assets.leetcode.com/uploads/2020/09/03/leaf-similar-2.jpg)

```
输入：root1 = [1,2,3], root2 = [1,3,2]
输出：false

```



**提示：** 

- 给定的两棵树可能会有  *1*  到  *200*  个结点。 
- 给定的两棵树上的值介于  *0*  到  *200*  之间。




# 算法思路

# 测试用例
```
872. Leaf-Similar Trees 872. 叶子相似的树 Easy
```

[enTitle]: https://leetcode.com/problems/leaf-similar-trees/
[cnTitle]: https://leetcode-cn.com/problems/leaf-similar-trees/
