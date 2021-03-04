# [1361. Validate Binary Tree Nodes][enTitle]

**Medium**

You have  *n*  binary tree nodes numbered from  *0*  to  *n - 1*  where node  *i*  has two children  *leftChild[i]*  and  *rightChild[i]* , return  *true*  if and only if **all**  the given nodes form **exactly one**  valid binary tree.

If node  *i*  has no left child then  *leftChild[i]*  will equal  *-1* , similarly for the right child.

Note that the nodes have no values and that we only use the node numbers in this problem.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/08/23/1503_ex1.png)

```
Input: n = 4, leftChild = [1,-1,3,-1], rightChild = [2,-1,-1,-1]
Output: true

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2019/08/23/1503_ex2.png)

```
Input: n = 4, leftChild = [1,-1,3,-1], rightChild = [2,3,-1,-1]
Output: false

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2019/08/23/1503_ex3.png)

```
Input: n = 2, leftChild = [1,0], rightChild = [-1,-1]
Output: false

```

**Example 4:** 

![img](https://assets.leetcode.com/uploads/2019/08/23/1503_ex4.png)

```
Input: n = 6, leftChild = [1,-1,-1,4,-1,-1], rightChild = [2,-1,-1,5,-1,-1]
Output: false

```



**Constraints:** 

-  *1 <= n <= 104*  
-  *leftChild.length == rightChild.length == n*  
-  *-1 <= leftChild[i], rightChild[i] <= n - 1* 


# [1361. 验证二叉树][cnTitle]

**中等**

二叉树上有  *n*  个节点，按从  *0*  到  *n - 1*  编号，其中节点  *i*  的两个子节点分别是  *leftChild[i]*  和  *rightChild[i]* 。

只有 **所有**  节点能够形成且 **只**  形成 **一颗**  有效的二叉树时，返回  *true* ；否则返回  *false* 。

如果节点  *i*  没有左子节点，那么  *leftChild[i]*  就等于  *-1* 。右子节点也符合该规则。

注意：节点没有值，本问题中仅仅使用节点编号。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/02/23/1503_ex1.png)

```
输入：n = 4, leftChild = [1,-1,3,-1], rightChild = [2,-1,-1,-1]
输出：true

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/02/23/1503_ex2.png)

```
输入：n = 4, leftChild = [1,-1,3,-1], rightChild = [2,3,-1,-1]
输出：false

```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/02/23/1503_ex3.png)

```
输入：n = 2, leftChild = [1,0], rightChild = [-1,-1]
输出：false

```

**示例 4：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/02/23/1503_ex4.png)

```
输入：n = 6, leftChild = [1,-1,-1,4,-1,-1], rightChild = [2,-1,-1,5,-1,-1]
输出：false

```



**提示：** 

-  *1 <= n <= 10^4*  
-  *leftChild.length == rightChild.length == n*  
-  *-1 <= leftChild[i], rightChild[i] <= n - 1* 




# 算法思路

# 测试用例
```
1361. Validate Binary Tree Nodes 1361. 验证二叉树 Medium
```

[enTitle]: https://leetcode.com/problems/validate-binary-tree-nodes/
[cnTitle]: https://leetcode-cn.com/problems/validate-binary-tree-nodes/
