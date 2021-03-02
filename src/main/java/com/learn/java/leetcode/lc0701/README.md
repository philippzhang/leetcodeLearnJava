# [701. Insert into a Binary Search Tree][enTitle]

**Medium**

You are given the  *root*  node of a binary search tree (BST) and a  *value*  to insert into the tree. Return  *the root node of the BST after the insertion* . It is **guaranteed**  that the new value does not exist in the original BST.

**Notice**  that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return **any of them** .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/10/05/insertbst.jpg)


<pre><strong>Input:</strong> root = [4,2,7,1,3], val = 5
<strong>Output:</strong> [4,2,7,1,3,5]
<strong>Explanation:</strong> Another accepted tree is:
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/05/bst.jpg" style="width: 352px; height: 301px;">
</pre>

**Example 2:** 

```
Input: root = [40,20,60,10,30,50,70], val = 25
Output: [40,20,60,10,30,50,70,null,null,25]

```

**Example 3:** 

```
Input: root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
Output: [4,2,7,1,3,5]

```



**Constraints:** 

- The number of nodes in the tree will be in the range  *[0, 104]* . 
-  *-108 <= Node.val <= 108*  
- All the values  *Node.val*  are **unique** . 
-  *-108 <= val <= 108*  
- It's **guaranteed**  that  *val*  does not exist in the original BST.


# [701. 二叉搜索树中的插入操作][cnTitle]

**中等**

给定二叉搜索树（BST）的根节点和要插入树中的值，将值插入二叉搜索树。 返回插入后二叉搜索树的根节点。 输入数据 **保证**  ，新值和原始二叉搜索树中的任意节点值都不同。

**注意** ，可能存在多种有效的插入方式，只要树在插入后仍保持为二叉搜索树即可。 你可以返回 **任意有效的结果**  。



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2020/10/05/insertbst.jpg)


<pre><strong>输入：</strong>root = [4,2,7,1,3], val = 5
<strong>输出：</strong>[4,2,7,1,3,5]
<strong>解释：</strong>另一个满足题目要求可以通过的树是：
<img style="width: 352px; height: 301px;" src="https://assets.leetcode.com/uploads/2020/10/05/bst.jpg" alt="">
</pre>

**示例 2：** 

```
输入：root = [40,20,60,10,30,50,70], val = 25
输出：[40,20,60,10,30,50,70,null,null,25]

```

**示例 3：** 

```
输入：root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
输出：[4,2,7,1,3,5]

```





**提示：** 

- 给定的树上的节点数介于  *0*  和  *10^4*  之间 
- 每个节点都有一个唯一整数值，取值范围从  *0*  到  *10^8*  
-  *-10^8 <= val <= 10^8*  
- 新值和原始二叉搜索树中的任意节点值都不同




# 算法思路

# 测试用例
```
701. Insert into a Binary Search Tree 701. 二叉搜索树中的插入操作 Medium
```

[enTitle]: https://leetcode.com/problems/insert-into-a-binary-search-tree/
[cnTitle]: https://leetcode-cn.com/problems/insert-into-a-binary-search-tree/
