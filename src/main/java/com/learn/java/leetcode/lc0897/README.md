# [897. Increasing Order Search Tree][enTitle]

**Easy**

Given the  *root*  of a binary search tree, rearrange the tree in **in-order**  so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/11/17/ex1.jpg)

```
Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/11/17/ex2.jpg)

```
Input: root = [5,1,7]
Output: [1,null,5,null,7]

```



**Constraints:** 

- The number of nodes in the given tree will be in the range  *[1, 100]* . 
-  *0 <= Node.val <= 1000* 


# [897. 递增顺序查找树][cnTitle]

**简单**

给你一个树，请你 **按中序遍历**  重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。



**示例 ：** 

```
输入：[5,3,6,2,4,null,8,1,null,null,null,7,9]

       5
      / \
    3    6
   / \    \
  2   4    8
 /        / \ 
1        7   9

输出：[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

 1
  \
   2
    \
     3
      \
       4
        \
         5
          \
           6
            \
             7
              \
               8
                \
                 9  
```



**提示：** 

1. 给定树中的结点数介于  *1*  和  *100*  之间。 
2. 每个结点都有一个从  *0*  到  *1000*  范围内的唯一整数值。




# 算法思路

# 测试用例
```
897. Increasing Order Search Tree 897. 递增顺序查找树 Easy
```

[enTitle]: https://leetcode.com/problems/increasing-order-search-tree/
[cnTitle]: https://leetcode-cn.com/problems/increasing-order-search-tree/
