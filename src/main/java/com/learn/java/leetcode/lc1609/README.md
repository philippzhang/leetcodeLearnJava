# [1609. Even Odd Tree][enTitle]

**Medium**

A binary tree is named **Even-Odd**  if it meets the following conditions:

- The root of the binary tree is at level index  *0* , its children are at level index  *1* , their children are at level index  *2* , etc. 
- For every **even-indexed**  level, all nodes at the level have **odd**  integer values in **strictly increasing**  order (from left to right). 
- For every odd-indexed level, all nodes at the level have even integer values in **strictly decreasing**  order (from left to right).

Given the  *root*  of a binary tree,  *return*  *true*  *if the binary tree is Even-Odd, otherwise return*  *false*  *.* 



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/09/15/sample_1_1966.png)

```
Input: root = [1,10,4,3,null,7,9,12,8,6,null,null,2]
Output: true
Explanation: The node values on each level are:
Level 0: [1]
Level 1: [10,4]
Level 2: [3,7,9]
Level 3: [12,8,6,2]
Since levels 0 and 2 are all odd and increasing, and levels 1 and 3 are all even and decreasing, the tree is Even-Odd.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/09/15/sample_2_1966.png)

```
Input: root = [5,4,2,3,3,7]
Output: false
Explanation: The node values on each level are:
Level 0: [5]
Level 1: [4,2]
Level 2: [3,3,7]
Node values in the level 2 must be in strictly increasing order, so the tree is not Even-Odd.

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2020/09/22/sample_1_333_1966.png)

```
Input: root = [5,9,1,3,5,7]
Output: false
Explanation: Node values in the level 1 should be even integers.

```

**Example 4:** 

```
Input: root = [1]
Output: true

```

**Example 5:** 

```
Input: root = [11,8,6,1,3,9,11,30,20,18,16,12,10,4,2,17]
Output: true

```



**Constraints:** 

- The number of nodes in the tree is in the range  *[1, 105]* . 
-  *1 <= Node.val <= 106* 


# [1609. 奇偶树][cnTitle]

**中等**

如果一棵二叉树满足下述几个条件，则可以称为 **奇偶树**  ：

- 二叉树根节点所在层下标为  *0*  ，根的子节点所在层下标为  *1*  ，根的孙节点所在层下标为  *2*  ，依此类推。 
- **偶数下标**  层上的所有节点的值都是 **奇**  整数，从左到右按顺序 **严格递增**  
- **奇数下标**  层上的所有节点的值都是 **偶**  整数，从左到右按顺序 **严格递减** 

给你二叉树的根节点，如果二叉树为 **奇偶树** ，则返回  *true*  ，否则返回  *false*  。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/04/sample_1_1966.png)

```
输入：root = [1,10,4,3,null,7,9,12,8,6,null,null,2]
输出：true
解释：每一层的节点值分别是：
0 层：[1]
1 层：[10,4]
2 层：[3,7,9]
3 层：[12,8,6,2]
由于 0 层和 2 层上的节点值都是奇数且严格递增，而 1 层和 3 层上的节点值都是偶数且严格递减，因此这是一棵奇偶树。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/04/sample_2_1966.png)

```
输入：root = [5,4,2,3,3,7]
输出：false
解释：每一层的节点值分别是：
0 层：[5]
1 层：[4,2]
2 层：[3,3,7]
2 层上的节点值不满足严格递增的条件，所以这不是一棵奇偶树。

```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/04/sample_1_333_1966.png)

```
输入：root = [5,9,1,3,5,7]
输出：false
解释：1 层上的节点值应为偶数。

```

**示例 4：** 

```
输入：root = [1]
输出：true

```

**示例 5：** 

```
输入：root = [11,8,6,1,3,9,11,30,20,18,16,12,10,4,2,17]
输出：true

```



**提示：** 

- 树中节点数在范围  *[1, 105]*  内 
-  *1 <= Node.val <= 106* 




# 算法思路

# 测试用例
```
1609. Even Odd Tree 1609. 奇偶树 Medium
```

[enTitle]: https://leetcode.com/problems/even-odd-tree/
[cnTitle]: https://leetcode-cn.com/problems/even-odd-tree/
