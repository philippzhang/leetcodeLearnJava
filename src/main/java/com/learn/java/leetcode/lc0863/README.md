# [863. All Nodes Distance K in Binary Tree][enTitle]

**Medium**

We are given a binary tree (with root node  *root* ), a  *target*  node, and an integer value  *K* .

Return a list of the values of all nodes that have a distance  *K*  from the  *target*  node. The answer can be returned in any order.






**Example 1:** 


<pre><strong>Input: </strong>root = <span id="example-input-1-1">[3,5,1,6,2,0,8,null,null,7,4], target = <span id="example-input-1-2">5, K = <span id="example-input-1-3">2

<strong>Output: </strong><span id="example-output-1">[7,4,1]

<strong>Explanation: </strong>
The nodes that are a distance 2 from the target node (with value 5)
have values 7, 4, and 1.

<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/06/28/sketch0.png" style="width: 280px; height: 240px;">

Note that the inputs "root" and "target" are actually TreeNodes.
The descriptions of the inputs above are just serializations of these objects.
</span></span></span></span></pre>



**Note:** 

1. The given tree is non-empty. 
2. Each node in the tree has unique values  *0 <= node.val <= 500* . 
3. The  *target*  node is a node in the tree. 
4.  *0 <= K <= 1000* .




# [863. 二叉树中所有距离为 K 的结点][cnTitle]

**中等**

给定一个二叉树（具有根结点  *root* ）， 一个目标结点  *target*  ，和一个整数值  *K*  。

返回到目标结点  *target*  距离为  *K*  的所有结点的值的列表。 答案可以以任何顺序返回。





**示例 1：** 


<pre><strong>输入：</strong>root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, K = 2
<strong>输出：</strong>[7,4,1]
<strong>解释：</strong>
所求结点为与目标结点（值为 5）距离为 2 的结点，
值分别为 7，4，以及 1

<img style="height: 240px; width: 280px;" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/06/28/sketch0.png" alt="">

注意，输入的 "root" 和 "target" 实际上是树上的结点。
上面的输入仅仅是对这些对象进行了序列化描述。
</pre>



**提示：** 

1. 给定的树是非空的。 
2. 树上的每个结点都具有唯一的值  *0 <= node.val <= 500*  。 
3. 目标结点  *target*  是树上的结点。 
4.  *0 <= K <= 1000* .




# 算法思路

# 测试用例
```
863. All Nodes Distance K in Binary Tree 863. 二叉树中所有距离为 K 的结点 Medium
```

[enTitle]: https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
[cnTitle]: https://leetcode-cn.com/problems/all-nodes-distance-k-in-binary-tree/
