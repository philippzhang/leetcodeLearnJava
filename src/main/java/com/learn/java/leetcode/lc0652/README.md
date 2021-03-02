# [652. Find Duplicate Subtrees][enTitle]

**Medium**

Given the  *root*  of a binary tree, return all **duplicate subtrees** .

For each kind of duplicate subtrees, you only need to return the root node of any one of them.

Two trees are **duplicate**  if they have the **same structure**  with the **same node values** .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/08/16/e1.jpg)

```
Input: root = [1,2,3,4,null,2,4,null,null,4]
Output: [[2,4],[4]]

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/08/16/e2.jpg)

```
Input: root = [2,1,1]
Output: [[1]]

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2020/08/16/e33.jpg)

```
Input: root = [2,2,2,3,null,3,null]
Output: [[2,3],[3]]

```



**Constraints:** 

- The number of the nodes in the tree will be in the range  *[1, 10^4]*  
-  *-200 <= Node.val <= 200* 


# [652. 寻找重复的子树][cnTitle]

**中等**

给定一棵二叉树，返回所有重复的子树。对于同一类的重复子树，你只需要返回其中任意**一棵** 的根结点即可。

两棵树重复是指它们具有相同的结构以及相同的结点值。

**示例 1：** 

```
        1
       / \
      2   3
     /   / \
    4   2   4
       /
      4

```

下面是两个重复的子树：

```
      2
     /
    4

```

和

```
    4

```

因此，你需要以列表的形式返回上述重复子树的根结点。




# 算法思路

# 测试用例
```
652. Find Duplicate Subtrees 652. 寻找重复的子树 Medium
```

[enTitle]: https://leetcode.com/problems/find-duplicate-subtrees/
[cnTitle]: https://leetcode-cn.com/problems/find-duplicate-subtrees/
