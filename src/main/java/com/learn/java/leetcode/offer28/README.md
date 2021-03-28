# [剑指 Offer 28. 对称的二叉树][cnTitle]

**简单**

请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。

例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

 *1 / \ 2 2 / \ / \ 3 4 4 3*  但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

 *1 / \ 2 2 \ \ 3 3* 



**示例 1：** 

```
输入：root = [1,2,2,3,4,4,3]
输出：true

```

**示例 2：** 

```
输入：root = [1,2,2,null,3,null,3]
输出：false
```



**限制：** 

 *0 <= 节点个数 <= 1000* 

注意：本题与主站 101 题相同：https://leetcode-cn.com/problems/symmetric-tree/




# 算法思路

# 测试用例
```
剑指 Offer 28. 对称的二叉树
Solution.isSymmetric
---
[1,2,2,3,4,4,3]

=true
---
[1,2,2,null,3,null,3]

=false
---
[]

=true
```

[cnTitle]: https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
