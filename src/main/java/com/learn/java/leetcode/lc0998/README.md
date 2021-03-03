# [998. Maximum Binary Tree II][enTitle]

**Medium**

We are given the  *root*  node of a  *maximum tree:*  a tree where every node has a value greater than any other value in its subtree.

Just as in the previous problem, the given tree was constructed from an list  *A*  ( *root = Construct(A)* ) recursively with the following  *Construct(A)*  routine:

- If  *A*  is empty, return  *null* . 
- Otherwise, let  *A[i]*  be the largest element of  *A* . Create a  *root*  node with value  *A[i]* . 
- The left child of  *root*  will be  *Construct([A[0], A[1], ..., A[i-1]])*  
- The right child of  *root*  will be  *Construct([A[i+1], A[i+2], ..., A[A.length - 1]])*  
- Return  *root* .

Note that we were not given A directly, only a root node  *root = Construct(A)* .

Suppose  *B*  is a copy of  *A*  with the value  *val*  appended to it. It is guaranteed that  *B*  has unique values.

Return  *Construct(B)* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/02/21/maximum-binary-tree-1-1.png)
<img alt="" src="https://assets.leetcode.com/uploads/2019/02/21/maximum-binary-tree-1-2.png" style="width: 169px; height: 160px;">

```
Input:root = [4,1,3,null,null,2], val = 5
Output: [5,4,null,1,3,null,null,2]
Explanation: A = [1,4,2,3], B = [1,4,2,3,5]
```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2019/02/21/maximum-binary-tree-2-1.png)
<img alt="" src="https://assets.leetcode.com/uploads/2019/02/21/maximum-binary-tree-2-2.png" style="width: 214px; height: 160px;">

```
Input:root = [5,2,4,null,1], val = 3
Output: [5,2,4,null,1,null,3]
Explanation: A = [2,1,5,4], B = [2,1,5,4,3]
```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2019/02/21/maximum-binary-tree-3-1.png)
<img alt="" src="https://assets.leetcode.com/uploads/2019/02/21/maximum-binary-tree-3-2.png" style="width: 201px; height: 160px;">

```
Input:root = [5,2,3,null,1], val = 4
Output: [5,2,4,null,1,3]
Explanation: A = [2,1,5,3], B = [2,1,5,3,4]
```



**Constraints:** 

-  *1 <= B.length <= 100* 


# [998. 最大二叉树 II][cnTitle]

**中等**

最大树定义：一个树，其中每个节点的值都大于其子树中的任何其他值。

给出最大树的根节点  *root* 。

就像之前的问题那样，给定的树是从列表  *A* （ *root = Construct(A)* ）递归地使用下述  *Construct(A)*  例程构造的：

- 如果  *A*  为空，返回  *null*  
- 否则，令  *A[i]*  作为 A 的最大元素。创建一个值为  *A[i]*  的根节点  *root*  
-  *root*  的左子树将被构建为  *Construct([A[0], A[1], ..., A[i-1]])*  
-  *root*  的右子树将被构建为  *Construct([A[i+1], A[i+2], ..., A[A.length - 1]])*  
- 返回  *root* 

请注意，我们没有直接给定 A，只有一个根节点  *root = Construct(A)* .

假设  *B*  是  *A*  的副本，并在末尾附加值  *val* 。题目数据保证  *B*  中的值是不同的。

返回  *Construct(B)* 。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/23/maximum-binary-tree-1-1.png)
<img style="height: 160px; width: 169px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/23/maximum-binary-tree-1-2.png" alt="">

```
输入：root = [4,1,3,null,null,2], val = 5
输出：[5,4,null,1,3,null,null,2]
解释：A = [1,4,2,3], B = [1,4,2,3,5]

```


<img style="height: 160px; width: 180px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/23/maximum-binary-tree-2-1.png" alt="">
<img style="height: 160px; width: 214px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/23/maximum-binary-tree-2-2.png" alt="">

```
输入：root = [5,2,4,null,1], val = 3
输出：[5,2,4,null,1,null,3]
解释：A = [2,1,5,4], B = [2,1,5,4,3]

```


<img style="height: 160px; width: 180px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/23/maximum-binary-tree-3-1.png" alt="">
<img style="height: 160px; width: 201px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/23/maximum-binary-tree-3-2.png" alt="">

```
输入：root = [5,2,3,null,1], val = 4
输出：[5,2,4,null,1,3]
解释：A = [2,1,5,3], B = [2,1,5,3,4]

```



**提示：** 

-  *1 <= B.length <= 100* 








# 算法思路

# 测试用例
```
998. Maximum Binary Tree II 998. 最大二叉树 II Medium
```

[enTitle]: https://leetcode.com/problems/maximum-binary-tree-ii/
[cnTitle]: https://leetcode-cn.com/problems/maximum-binary-tree-ii/
