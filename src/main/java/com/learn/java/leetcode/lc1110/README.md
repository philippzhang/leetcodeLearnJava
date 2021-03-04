# [1110. Delete Nodes And Return Forest][enTitle]

**Medium**

Given the  *root*  of a binary tree, each node in the tree has a distinct value.

After deleting all nodes with a value in  *to_delete* , we are left with a forest (a disjoint union of trees).

Return the roots of the trees in the remaining forest. You may return the result in any order.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/07/01/screen-shot-2019-07-01-at-53836-pm.png)

```
Input: root = [1,2,3,4,5,6,7], to_delete = [3,5]
Output: [[1,2,null,4],[6],[7]]

```

**Example 2:** 

```
Input: root = [1,2,4,null,3], to_delete = [3]
Output: [[1,2,4]]

```



**Constraints:** 

- The number of nodes in the given tree is at most  *1000* . 
- Each node has a distinct value between  *1*  and  *1000* . 
-  *to_delete.length <= 1000*  
-  *to_delete*  contains distinct values between  *1*  and  *1000* .


# [1110. 删点成林][cnTitle]

**中等**

给出二叉树的根节点  *root* ，树上每个节点都有一个不同的值。

如果节点值在  *to_delete*  中出现，我们就把该节点从树上删去，最后得到一个森林（一些不相交的树构成的集合）。

返回森林中的每棵树。你可以按任意顺序组织答案。



**示例：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/07/05/screen-shot-2019-07-01-at-53836-pm.png)

```
输入：root = [1,2,3,4,5,6,7], to_delete = [3,5]
输出：[[1,2,null,4],[6],[7]]

```



**提示：** 

- 树中的节点数最大为  *1000* 。 
- 每个节点都有一个介于  *1*  到  *1000*  之间的值，且各不相同。 
-  *to_delete.length <= 1000*  
-  *to_delete*  包含一些从  *1*  到  *1000* 、各不相同的值。




# 算法思路

# 测试用例
```
1110. Delete Nodes And Return Forest 1110. 删点成林 Medium
```

[enTitle]: https://leetcode.com/problems/delete-nodes-and-return-forest/
[cnTitle]: https://leetcode-cn.com/problems/delete-nodes-and-return-forest/
