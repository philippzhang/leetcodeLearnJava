# [1325. Delete Leaves With a Given Value][enTitle]

**Medium**

Given a binary tree  *root*  and an integer  *target* , delete all the **leaf nodes**  with value  *target* .

Note that once you delete a leaf node with value  *target* **,** if it's parent node becomes a leaf node and has the value  *target* , it should also be deleted (you need to continue doing that until you can't).



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/01/09/sample_1_1684.png)

```
Input: root = [1,2,3,2,null,2,4], target = 2
Output: [1,null,3,null,4]
Explanation: Leaf nodes in green with value (target = 2) are removed (Picture in left). 
After removing, new nodes become leaf nodes with value (target = 2) (Picture in center).

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/01/09/sample_2_1684.png)

```
Input: root = [1,3,3,3,2], target = 3
Output: [1,3,null,null,2]

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2020/01/15/sample_3_1684.png)

```
Input: root = [1,2,null,2,null,2], target = 2
Output: [1]
Explanation: Leaf nodes in green with value (target = 2) are removed at each step.

```

**Example 4:** 

```
Input: root = [1,1,1], target = 1
Output: []

```

**Example 5:** 

```
Input: root = [1,2,3], target = 1
Output: [1,2,3]

```



**Constraints:** 

-  *1 <= target <= 1000*  
- The given binary tree will have between  *1*  and  *3000*  nodes. 
- Each node's value is between  *[1, 1000]* .


# [1325. 删除给定值的叶子节点][cnTitle]

**中等**

给你一棵以  *root*  为根的二叉树和一个整数  *target*  ，请你删除所有值为  *target*  的 **叶子节点**  。

注意，一旦删除值为  *target*  的叶子节点，它的父节点就可能变成叶子节点；如果新叶子节点的值恰好也是  *target*  ，那么这个节点也应该被删除。

也就是说，你需要重复此过程直到不能继续删除。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/01/16/sample_1_1684.png)

```
输入：root = [1,2,3,2,null,2,4], target = 2
输出：[1,null,3,null,4]
解释：上面左边的图中，绿色节点为叶子节点，且它们的值与 target 相同（同为 2 ），它们会被删除，得到中间的图。
有一个新的节点变成了叶子节点且它的值与 target 相同，所以将再次进行删除，从而得到最右边的图。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/01/16/sample_2_1684.png)

```
输入：root = [1,3,3,3,2], target = 3
输出：[1,3,null,null,2]

```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/01/16/sample_3_1684.png)

```
输入：root = [1,2,null,2,null,2], target = 2
输出：[1]
解释：每一步都删除一个绿色的叶子节点（值为 2）。
```

**示例 4：** 

```
输入：root = [1,1,1], target = 1
输出：[]

```

**示例 5：** 

```
输入：root = [1,2,3], target = 1
输出：[1,2,3]

```



**提示：** 

-  *1 <= target <= 1000*  
- 每一棵树最多有  *3000*  个节点。 
- 每一个节点值的范围是  *[1, 1000]*  。




# 算法思路

# 测试用例
```
1325. Delete Leaves With a Given Value 1325. 删除给定值的叶子节点 Medium
```

[enTitle]: https://leetcode.com/problems/delete-leaves-with-a-given-value/
[cnTitle]: https://leetcode-cn.com/problems/delete-leaves-with-a-given-value/
