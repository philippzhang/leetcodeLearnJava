# [1530. Number of Good Leaf Nodes Pairs][enTitle]

**Medium**

Given the  *root*  of a binary tree and an integer  *distance* . A pair of two different **leaf**  nodes of a binary tree is said to be good if the length of **the shortest path**  between them is less than or equal to  *distance* .

Return  *the number of good leaf node pairs*  in the tree.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/07/09/e1.jpg)

```
Input: root = [1,2,3,null,4], distance = 3
Output: 1
Explanation: The leaf nodes of the tree are 3 and 4 and the length of the shortest path between them is 3. This is the only good pair.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/07/09/e2.jpg)

```
Input: root = [1,2,3,4,5,6,7], distance = 3
Output: 2
Explanation: The good pairs are [4,5] and [6,7] with shortest path = 2. The pair [4,6] is not good because the length of ther shortest path between them is 4.

```

**Example 3:** 

```
Input: root = [7,1,4,6,null,5,3,null,null,null,null,null,2], distance = 3
Output: 1
Explanation: The only good pair is [2,5].

```

**Example 4:** 

```
Input: root = [100], distance = 1
Output: 0

```

**Example 5:** 

```
Input: root = [1,1,1], distance = 2
Output: 1

```



**Constraints:** 

- The number of nodes in the  *tree*  is in the range  *[1, 2^10].*  
- Each node's value is between  *[1, 100]* . 
-  *1 <= distance <= 10* 


# [1530. 好叶子节点对的数量][cnTitle]

**中等**

给你二叉树的根节点  *root*  和一个整数  *distance*  。

如果二叉树中两个 **叶**  节点之间的 **最短路径长度**  小于或者等于  *distance*  ，那它们就可以构成一组 **好叶子节点对**  。

返回树中 **好叶子节点对的数量**  。



**示例 1：** 



![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/07/26/e1.jpg)

```
输入：root = [1,2,3,null,4], distance = 3
输出：1
解释：树的叶节点是 3 和 4 ，它们之间的最短路径的长度是 3 。这是唯一的好叶子节点对。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/07/26/e2.jpg)

```
输入：root = [1,2,3,4,5,6,7], distance = 3
输出：2
解释：好叶子节点对为 [4,5] 和 [6,7] ，最短路径长度都是 2 。但是叶子节点对 [4,6] 不满足要求，因为它们之间的最短路径长度为 4 。

```

**示例 3：** 

```
输入：root = [7,1,4,6,null,5,3,null,null,null,null,null,2], distance = 3
输出：1
解释：唯一的好叶子节点对是 [2,5] 。

```

**示例 4：** 

```
输入：root = [100], distance = 1
输出：0

```

**示例 5：** 

```
输入：root = [1,1,1], distance = 2
输出：1

```



**提示：** 

-  *tree*  的节点数在  *[1, 2^10]*  范围内。 
- 每个节点的值都在  *[1, 100]*  之间。 
-  *1 <= distance <= 10* 




# 算法思路

# 测试用例
```
1530. Number of Good Leaf Nodes Pairs 1530. 好叶子节点对的数量 Medium
```

[enTitle]: https://leetcode.com/problems/number-of-good-leaf-nodes-pairs/
[cnTitle]: https://leetcode-cn.com/problems/number-of-good-leaf-nodes-pairs/
