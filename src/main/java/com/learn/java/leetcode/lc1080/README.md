# [1080. Insufficient Nodes in Root to Leaf Paths][enTitle]

**Medium**

Given the  *root*  of a binary tree, consider all  *root to leaf paths* : paths from the root to any leaf. (A leaf is a node with no children.)

A  *node*  is  *insufficient*  if **every**  such root to leaf path intersecting this  *node*  has sum strictly less than  *limit* .

Delete all insufficient nodes simultaneously, and return the root of the resulting binary tree.



**Example 1:** 


<pre><strong><img alt="" src="https://assets.leetcode.com/uploads/2019/06/05/insufficient-11.png" style="width: 482px; height: 200px;">
Input: </strong>root = <span id="example-input-1-1">[1,2,3,4,-99,-99,7,8,9,-99,-99,12,13,-99,14], limit = <span id="example-input-1-2">1
<strong><img alt="" src="https://assets.leetcode.com/uploads/2019/06/05/insufficient-2.png" style="width: 258px; height: 200px;">
Output: </strong><span id="example-output-1">[1,2,3,4,null,null,7,8,9,null,14]
</span></span></span></pre>


**Example 2:** 


<pre><strong><img alt="" src="https://assets.leetcode.com/uploads/2019/06/05/insufficient-3.png" style="width: 292px; height: 200px;">
Input: </strong>root = <span id="example-input-2-1">[5,4,8,11,null,17,4,7,1,null,null,5,3], limit = <span id="example-input-2-2">22
<strong><img alt="" src="https://assets.leetcode.com/uploads/2019/06/05/insufficient-4.png" style="width: 264px; height: 200px;">
Output: </strong><span id="example-output-2">[5,4,8,11,null,17,4,7,null,null,null,5]</span></span></span></pre>



**Example 3:** 


<pre><strong><img alt="" src="https://assets.leetcode.com/uploads/2019/06/11/screen-shot-2019-06-11-at-83301-pm.png" style="width: 188px; height: 150px;">
Input: </strong>root = [1,2,-3,-5,null,4,null], limit = -1
<img alt="" src="https://assets.leetcode.com/uploads/2019/06/11/screen-shot-2019-06-11-at-83517-pm.png" style="width: 122px; height: 150px;"><strong>
Output: </strong>[1,null,-3,4]</pre>





**Note:** 

1. The given tree will have between  *1*  and  *5000*  nodes. 
2.  *-10^5 <= node.val <= 10^5*  
3.  *-10^9 <= limit <= 10^9* 








# [1080. 根到叶路径上的不足节点][cnTitle]

**中等**

给定一棵二叉树的根  *root* ，请你考虑它所有 **从根到叶的路径** ：从根到任何叶的路径。（所谓一个叶子节点，就是一个没有子节点的节点）

假如通过节点  *node*  的每种可能的 “根-叶” 路径上值的总和全都小于给定的  *limit* ，则该节点被称之为「不足节点」，需要被删除。

请你删除所有不足节点，并返回生成的二叉树的根。



**示例 1：** 


<pre><strong><img style="height: 200px; width: 482px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/06/08/insufficient-1.png" alt="">
输入：</strong>root = [1,2,3,4,-99,-99,7,8,9,-99,-99,12,13,-99,14], limit = 1
<strong><img style="height: 200px; width: 258px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/06/08/insufficient-2.png" alt="">
输出：</strong>[1,2,3,4,null,null,7,8,9,null,14]
</pre>

**示例 2：** 


<pre><strong><img style="height: 200px; width: 292px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/06/08/insufficient-3.png" alt="">
输入：</strong>root = [5,4,8,11,null,17,4,7,1,null,null,5,3], limit = 22
<strong><img style="height: 200px; width: 264px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/06/08/insufficient-4.png" alt="">
输出：</strong>[5,4,8,11,null,17,4,7,null,null,null,5]</pre>

**示例 3：** 


<pre><strong><img style="height: 100px; width: 140px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/06/08/insufficient-5.png" alt="">
输入：</strong>root = [5,-6,-6], limit = 0<strong>
输出：</strong>[]</pre>



**提示：** 

1. 给定的树有  *1*  到  *5000*  个节点 
2.  *-10^5 <= node.val <= 10^5*  
3.  *-10^9 <= limit <= 10^9* 






# 算法思路

# 测试用例
```
1080. Insufficient Nodes in Root to Leaf Paths 1080. 根到叶路径上的不足节点 Medium
```

[enTitle]: https://leetcode.com/problems/insufficient-nodes-in-root-to-leaf-paths/
[cnTitle]: https://leetcode-cn.com/problems/insufficient-nodes-in-root-to-leaf-paths/
