# [1008. Construct Binary Search Tree from Preorder Traversal][enTitle]

**Medium**

Return the root node of a binary **search**  tree that matches the given  *preorder*  traversal.

 *(Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val. Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)* 

It's guaranteed that for the given test cases there is always possible to find a binary search tree with the given requirements.

**Example 1:** 


<pre><strong>Input: </strong><span id="example-input-1-1">[8,5,1,7,10,12]
<strong>Output: </strong><span id="example-output-1">[8,5,10,1,7,null,12]
<img alt="" src="https://assets.leetcode.com/uploads/2019/03/06/1266.png" style="height: 200px; width: 306px;">
</span></span></pre>



**Constraints:** 

-  *1 <= preorder.length <= 100*  
-  *1 <= preorder[i] <= 10^8*  
- The values of  *preorder*  are distinct.


# [1008. 前序遍历构造二叉搜索树][cnTitle]

**中等**

返回与给定前序遍历  *preorder*  相匹配的二叉搜索树（binary **search**  tree）的根结点。

 *(回想一下，二叉搜索树是二叉树的一种，其每个节点都满足以下规则，对于 node.left 的任何后代，值总 < node.val，而 node.right 的任何后代，值总 > node.val。此外，前序遍历首先显示节点 node 的值，然后遍历 node.left，接着遍历 node.right。）* 

题目保证，对于给定的测试用例，总能找到满足要求的二叉搜索树。



**示例：** 


<pre><strong>输入：</strong>[8,5,1,7,10,12]
<strong>输出：</strong>[8,5,10,1,7,null,12]
<img style="height: 200px; width: 306px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/03/08/1266.png" alt="">
</pre>



**提示：** 

-  *1 <= preorder.length <= 100*  
-  *1 <= preorder[i] <= 10^8*  
-  *preorder*  中的值互不相同




# 算法思路

# 测试用例
```
1008. Construct Binary Search Tree from Preorder Traversal 1008. 前序遍历构造二叉搜索树 Medium
```

[enTitle]: https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
[cnTitle]: https://leetcode-cn.com/problems/construct-binary-search-tree-from-preorder-traversal/
