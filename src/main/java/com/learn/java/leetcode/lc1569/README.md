# [1569. Number of Ways to Reorder Array to Get Same BST][enTitle]

**Hard**

Given an array  *nums*  that represents a permutation of integers from  *1*  to  *n* . We are going to construct a binary search tree (BST) by inserting the elements of  *nums*  in order into an initially empty BST. Find the number of different ways to reorder  *nums*  so that the constructed BST is identical to that formed from the original array  *nums* .

For example, given  *nums = [2,1,3]* , we will have 2 as the root, 1 as a left child, and 3 as a right child. The array  *[2,3,1]*  also yields the same BST but  *[3,2,1]*  yields a different BST.

Return  *the number of ways to reorder*   *nums*   *such that the BST formed is identical to the original BST formed from*   *nums* .

Since the answer may be very large, **return it modulo**  *10^9 + 7* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/08/12/bb.png)

```
Input: nums = [2,1,3]
Output: 1
Explanation:We can reorder nums to be [2,3,1] which will yield the same BST. There are no other ways to reorder nums which will yield the same BST.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/08/12/ex1.png)

```
Input: nums = [3,4,5,1,2]
Output: 5
Explanation:The following 5 arrays will yield the same BST: 
[3,1,2,4,5]
[3,1,4,2,5]
[3,1,4,5,2]
[3,4,1,2,5]
[3,4,1,5,2]

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2020/08/12/ex4.png)

```
Input: nums = [1,2,3]
Output: 0
Explanation:There are no other orderings of nums that will yield the same BST.

```

**Example 4:** 

![img](https://assets.leetcode.com/uploads/2020/08/12/abc.png)

```
Input: nums = [3,1,2,5,4,6]
Output: 19

```

**Example 5:** 

```
Input: nums = [9,4,2,1,3,6,5,7,8,14,11,10,12,13,16,15,17,18]
Output: 216212978
Explanation:The number of ways to reorder nums to get the same BST is 3216212999. Taking this number modulo 10^9 + 7 gives 216212978.

```



**Constraints:** 

-  *1 <= nums.length <= 1000*  
-  *1 <= nums[i] <= nums.length*  
- All integers in  *nums*  are **distinct** .


# [1569. 将子数组重新排序得到同一个二叉查找树的方案数][cnTitle]

**困难**

给你一个数组  *nums*  表示  *1*  到  *n*  的一个排列。我们按照元素在  *nums*  中的顺序依次插入一个初始为空的二叉查找树（BST）。请你统计将  *nums*  重新排序后，统计满足如下条件的方案数：重排后得到的二叉查找树与  *nums*  原本数字顺序得到的二叉查找树相同。

比方说，给你  *nums = [2,1,3]* ，我们得到一棵 2 为根，1 为左孩子，3 为右孩子的树。数组  *[2,3,1]*  也能得到相同的 BST，但  *[3,2,1]*  会得到一棵不同的 BST 。

请你返回重排  *nums*  后，与原数组  *nums*  得到相同二叉查找树的方案数。

由于答案可能会很大，请将结果对****  *10^9 + 7*  取余数。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/30/bb.png)

```
输入：nums = [2,1,3]
输出：1
解释：我们将 nums 重排， [2,3,1] 能得到相同的 BST 。没有其他得到相同 BST 的方案了。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/30/ex1.png)

```
输入：nums = [3,4,5,1,2]
输出：5
解释：下面 5 个数组会得到相同的 BST：
[3,1,2,4,5]
[3,1,4,2,5]
[3,1,4,5,2]
[3,4,1,2,5]
[3,4,1,5,2]

```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/30/ex4.png)

```
输入：nums = [1,2,3]
输出：0
解释：没有别的排列顺序能得到相同的 BST 。

```

**示例 4：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/30/abc.png)

```
输入：nums = [3,1,2,5,4,6]
输出：19

```

**示例 5：** 

```
输入：nums = [9,4,2,1,3,6,5,7,8,14,11,10,12,13,16,15,17,18]
输出：216212978
解释：得到相同 BST 的方案数是 3216212999。将它对 10^9 + 7 取余后得到 216212978。

```



**提示：** 

-  *1 <= nums.length <= 1000*  
-  *1 <= nums[i] <= nums.length*  
-  *nums*  中所有数 **互不相同**  。




# 算法思路

# 测试用例
```
1569. Number of Ways to Reorder Array to Get Same BST 1569. 将子数组重新排序得到同一个二叉查找树的方案数 Hard
```

[enTitle]: https://leetcode.com/problems/number-of-ways-to-reorder-array-to-get-same-bst/
[cnTitle]: https://leetcode-cn.com/problems/number-of-ways-to-reorder-array-to-get-same-bst/
