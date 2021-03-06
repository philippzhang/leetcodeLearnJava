# [101. Symmetric Tree][enTitle]

**Easy**

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree  *[1,2,2,3,4,4,3]*  is symmetric:

```
    1
   / \
  2   2
 / \ / \
3  4 4  3

```



But the following  *[1,2,2,null,3,null,3]*  is not:

```
    1
   / \
  2   2
   \   \
   3    3

```



Note: Bonus points if you could solve it both recursively and iteratively.
# [101. 对称二叉树][cnTitle]

**简单**

给定一个二叉树，检查它是否是镜像对称的。

例如，二叉树  *[1,2,2,3,4,4,3]*  是对称的。

```
    1
   / \
  2   2
 / \ / \
3  4 4  3

```

但是下面这个  *[1,2,2,null,3,null,3]*  则不是镜像对称的:

```
    1
   / \
  2   2
   \   \
   3    3

```

**说明:** 

如果你可以运用递归和迭代两种方法解决这个问题，会很加分。


# 算法思路

# 测试用例
```
101. Symmetric Tree 101. 对称二叉树 Easy
Solution.isSymmetric
Solution.isSymmetric2
---
[1,2,2,3,4,4,3]

=true
---
[1,2,2,null,3,null,3]

=false
```

[enTitle]: https://leetcode.com/problems/symmetric-tree/
[cnTitle]: https://leetcode-cn.com/problems/symmetric-tree/
