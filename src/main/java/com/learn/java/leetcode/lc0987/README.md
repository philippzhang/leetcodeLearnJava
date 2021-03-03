# [987. Vertical Order Traversal of a Binary Tree][enTitle]

**Hard**

Given the  *root*  of a binary tree, calculate the **vertical order traversal**  of the binary tree.

For each node at position  *(row, col)* , its left and right children will be at positions  *(row + 1, col - 1)*  and  *(row + 1, col + 1)*  respectively. The root of the tree is at  *(0, 0)* .

The **vertical order traversal**  of a binary tree is a list of top-to-bottom orderings for each column index starting from the leftmost column and ending on the rightmost column. There may be multiple nodes in the same row and same column. In such a case, sort these nodes by their values.

Return  *the vertical order traversal of the binary tree* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2021/01/29/vtree1.jpg)

```
Input: root = [3,9,20,null,null,15,7]
Output: [[9],[3,15],[20],[7]]
Explanation:
Column -1: Only node 9 is in this column.
Column 0: Nodes 3 and 15 are in this column in that order from top to bottom.
Column 1: Only node 20 is in this column.
Column 2: Only node 7 is in this column.
```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2021/01/29/vtree2.jpg)

```
Input: root = [1,2,3,4,5,6,7]
Output: [[4],[2],[1,5,6],[3],[7]]
Explanation:
Column -2: Only node 4 is in this column.
Column -1: Only node 2 is in this column.
Column 0: Nodes 1, 5, and 6 are in this column.
          1 is at the top, so it comes first.
          5 and 6 are at the same position (2, 0), so we order them by their value, 5 before 6.
Column 1: Only node 3 is in this column.
Column 2: Only node 7 is in this column.

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2021/01/29/vtree3.jpg)

```
Input: root = [1,2,3,4,6,5,7]
Output: [[4],[2],[1,5,6],[3],[7]]
Explanation:
This case is the exact same as example 2, but with nodes 5 and 6 swapped.
Note that the solution remains the same since 5 and 6 are in the same location and should be ordered by their values.

```



**Constraints:** 

- The number of nodes in the tree is in the range  *[1, 1000]* . 
-  *0 <= Node.val <= 1000* 


# [987. 二叉树的垂序遍历][cnTitle]

**困难**

给你二叉树的根结点  *root*  ，请你设计算法计算二叉树的**垂序遍历**  序列。

对位于  *(row, col)*  的每个结点而言，其左右子结点分别位于  *(row + 1, col - 1)*  和  *(row + 1, col + 1)*  。树的根结点位于  *(0, 0)*  。

二叉树的 **垂序遍历**  从最左边的列开始直到最右边的列结束，按列索引每一列上的所有结点，形成一个按出现位置从上到下排序的有序列表。如果同行同列上有多个结点，则按结点的值从小到大进行排序。

返回二叉树的 **垂序遍历**  序列。



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2021/01/29/vtree1.jpg)

```
输入：root = [3,9,20,null,null,15,7]
输出：[[9],[3,15],[20],[7]]
解释：
列 -1 ：只有结点 9 在此列中。
列  0 ：只有结点 3 和 15 在此列中，按从上到下顺序。
列  1 ：只有结点 20 在此列中。
列  2 ：只有结点 7 在此列中。
```

**示例 2：** 

![img](https://assets.leetcode.com/uploads/2021/01/29/vtree2.jpg)

```
输入：root = [1,2,3,4,5,6,7]
输出：[[4],[2],[1,5,6],[3],[7]]
解释：
列 -2 ：只有结点 4 在此列中。
列 -1 ：只有结点 2 在此列中。
列  0 ：结点 1 、5 和 6 都在此列中。
          1 在上面，所以它出现在前面。
          5 和 6 位置都是 (2, 0) ，所以按值从小到大排序，5 在 6 的前面。
列  1 ：只有结点 3 在此列中。
列  2 ：只有结点 7 在此列中。

```

**示例 3：** 

![img](https://assets.leetcode.com/uploads/2021/01/29/vtree3.jpg)

```
输入：root = [1,2,3,4,6,5,7]
输出：[[4],[2],[1,5,6],[3],[7]]
解释：
这个示例实际上与示例 2 完全相同，只是结点 5 和 6 在树中的位置发生了交换。
因为 5 和 6 的位置仍然相同，所以答案保持不变，仍然按值从小到大排序。
```



**提示：** 

- 树中结点数目总数在范围  *[1, 1000]*  内 
-  *0 <= Node.val <= 1000* 




# 算法思路

# 测试用例
```
987. Vertical Order Traversal of a Binary Tree 987. 二叉树的垂序遍历 Hard
```

[enTitle]: https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
[cnTitle]: https://leetcode-cn.com/problems/vertical-order-traversal-of-a-binary-tree/
