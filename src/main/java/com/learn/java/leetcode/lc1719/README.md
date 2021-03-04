# [1719. Number Of Ways To Reconstruct A Tree][enTitle]

**Hard**

You are given an array  *pairs* , where  *pairs[i] = [xi, yi]* , and:

- There are no duplicates. 
-  *xi < yi* 

Let  *ways*  be the number of rooted trees that satisfy the following conditions:

- The tree consists of nodes whose values appeared in  *pairs* . 
- A pair  *[xi, yi]*  exists in  *pairs*  **if and only if**   *xi*  is an ancestor of  *yi*  or  *yi*  is an ancestor of  *xi* . 
- **Note:**  the tree does not have to be a binary tree.

Two ways are considered to be different if there is at least one node that has different parents in both ways.

Return:

-  *0*  if  *ways == 0*  
-  *1*  if  *ways == 1*  
-  *2*  if  *ways > 1* 

A **rooted tree**  is a tree that has a single root node, and all edges are oriented to be outgoing from the root.

An **ancestor**  of a node is any node on the path from the root to that node (excluding the node itself). The root has no ancestors.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/12/03/trees2.png)

```
Input: pairs = [[1,2],[2,3]]
Output: 1
Explanation: There is exactly one valid rooted tree, which is shown in the above figure.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/12/03/tree.png)

```
Input: pairs = [[1,2],[2,3],[1,3]]
Output: 2
Explanation: There are multiple valid rooted trees. Three of them are shown in the above figures.

```

**Example 3:** 

```
Input: pairs = [[1,2],[2,3],[2,4],[1,5]]
Output: 0
Explanation: There are no valid rooted trees.
```



**Constraints:** 

-  *1 <= pairs.length <= 105*  
-  *1 <= xi < yi <= 500*  
- The elements in  *pairs*  are unique.


# [1719. 重构一棵树的方案数][cnTitle]

**困难**

给你一个数组  *pairs*  ，其中  *pairs[i] = [xi, yi]*  ，并且满足：

-  *pairs*  中没有重复元素 
-  *xi < yi* 

令  *ways*  为满足下面条件的有根树的方案数：

- 树所包含的所有节点值都在  *pairs*  中。 
- 一个数对  *[xi, yi]*  出现在  *pairs*  中 **当且仅当** ****  *xi*  是  *yi*  的祖先或者  *yi*  是  *xi* <sub> </sub>的祖先。 
- **注意：** 构造出来的树不一定是二叉树。

两棵树被视为不同的方案当存在至少一个节点在两棵树中有不同的父节点。

请你返回：

- 如果  *ways == 0*  ，返回  *0*  。 
- 如果  *ways == 1*  ，返回  *1*  。 
- 如果  *ways > 1*  ，返回  *2*  。

一棵 **有根树**  指的是只有一个根节点的树，所有边都是从根往外的方向。

我们称从根到一个节点路径上的任意一个节点（除去节点本身）都是该节点的 **祖先**  。根节点没有祖先。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/01/09/trees2.png)

```
输入：pairs = [[1,2],[2,3]]
输出：1
解释：如上图所示，有且只有一个符合规定的有根树。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/01/09/tree.png)

```
输入：pairs = [[1,2],[2,3],[1,3]]
输出：2
解释：有多个符合规定的有根树，其中三个如上图所示。

```

**示例 3：** 

```
输入：pairs = [[1,2],[2,3],[2,4],[1,5]]
输出：0
解释：没有符合规定的有根树。
```



**提示：** 

-  *1 <= pairs.length <= 105*  
-  *1 <= xi < yi <= 500*  
-  *pairs*  中的元素互不相同。




# 算法思路

# 测试用例
```
1719. Number Of Ways To Reconstruct A Tree 1719. 重构一棵树的方案数 Hard
```

[enTitle]: https://leetcode.com/problems/number-of-ways-to-reconstruct-a-tree/
[cnTitle]: https://leetcode-cn.com/problems/number-of-ways-to-reconstruct-a-tree/
