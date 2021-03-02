# [783. Minimum Distance Between BST Nodes][enTitle]

**Easy**

Given the  *root*  of a Binary Search Tree (BST), return  *the minimum difference between the values of any two different nodes in the tree* .

**Note:**  This question is the same as 530: https://leetcode.com/problems/minimum-absolute-difference-in-bst/



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2021/02/05/bst1.jpg)

```
Input: root = [4,2,6,1,3]
Output: 1

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2021/02/05/bst2.jpg)

```
Input: root = [1,0,48,null,null,12,49]
Output: 1

```



**Constraints:** 

- The number of nodes in the tree is in the range  *[2, 100]* . 
-  *0 <= Node.val <= 105* 


# [783. 二叉搜索树节点最小距离][cnTitle]

**简单**

给定一个二叉搜索树的根节点  *root* ，返回树中任意两节点的差的最小值。



**示例：** 

```
输入: root = [4,2,6,1,3,null,null]
输出: 1
解释:
注意，root是树节点对象(TreeNode object)，而不是数组。

给定的树 [4,2,6,1,3,null,null] 可表示为下图:

          4
        /   \
      2      6
     / \    
    1   3  

最小的差值是 1, 它是节点1和节点2的差值, 也是节点3和节点2的差值。
```



**注意：** 

1. 二叉树的大小范围在  *2*  到  *100* 。 
2. 二叉树总是有效的，每个节点的值都是整数，且不重复。 
3. 本题与 530：https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/ 相同




# 算法思路

# 测试用例
```
783. Minimum Distance Between BST Nodes 783. 二叉搜索树节点最小距离 Easy
```

[enTitle]: https://leetcode.com/problems/minimum-distance-between-bst-nodes/
[cnTitle]: https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/
