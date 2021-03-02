# [814. Binary Tree Pruning][enTitle]

**Medium**

We are given the head node  *root*  of a binary tree, where additionally every node's value is either a 0 or a 1.

Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.

(Recall that the subtree of a node X is X, plus every node that is a descendant of X.)


<pre><strong>Example 1:</strong>
<strong>Input:</strong> [1,null,0,0,1]
<strong>Output: </strong>[1,null,0,null,1]
 
<strong>Explanation:</strong> 
Only the red nodes satisfy the property "every subtree not containing a 1".
The diagram on the right represents the answer.

<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/04/06/1028_2.png" style="width:450px">
</pre>


<pre><strong>Example 2:</strong>
<strong>Input:</strong> [1,0,1,0,0,0,1]
<strong>Output: </strong>[1,null,1,null,1]


<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/04/06/1028_1.png" style="width:450px">
</pre>


<pre><strong>Example 3:</strong>
<strong>Input:</strong> [1,1,0,1,1,0,1,0]
<strong>Output: </strong>[1,1,0,1,1,null,1]


<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/04/05/1028.png" style="width:450px">
</pre>

**Note:** 

- The binary tree will have at most  *200 nodes* . 
- The value of each node will only be  *0*  or  *1* .


# [814. 二叉树剪枝][cnTitle]

**中等**

给定二叉树根结点  *root*  ，此外树的每个结点的值要么是 0，要么是 1。

返回移除了所有不包含 1 的子树的原二叉树。

( 节点 X 的子树为 X 本身，以及所有 X 的后代。)


<pre><strong>示例1:</strong>
<strong>输入:</strong> [1,null,0,0,1]
<strong>输出: </strong>[1,null,0,null,1]
 
<strong>解释:</strong> 
只有红色节点满足条件“所有不包含 1 的子树”。
右图为返回的答案。

<img style="width:450px" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/04/06/1028_2.png" alt="">
</pre>


<pre><strong>示例2:</strong>
<strong>输入:</strong> [1,0,1,0,0,0,1]
<strong>输出: </strong>[1,null,1,null,1]


<img style="width:450px" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/04/06/1028_1.png" alt="">
</pre>


<pre><strong>示例3:</strong>
<strong>输入:</strong> [1,1,0,1,1,0,1,0]
<strong>输出: </strong>[1,1,0,1,1,null,1]


<img style="width:450px" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/04/05/1028.png" alt="">
</pre>

**说明:** 

- 给定的二叉树最多有  *100*  个节点。 
- 每个节点的值只会为  *0*  或  *1*  。




# 算法思路

# 测试用例
```
814. Binary Tree Pruning 814. 二叉树剪枝 Medium
```

[enTitle]: https://leetcode.com/problems/binary-tree-pruning/
[cnTitle]: https://leetcode-cn.com/problems/binary-tree-pruning/
