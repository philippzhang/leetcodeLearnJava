# [1713. Minimum Operations to Make a Subsequence][enTitle]

**Hard**

You are given an array  *target*  that consists of **distinct**  integers and another integer array  *arr*  that **can**  have duplicates.

In one operation, you can insert any integer at any position in  *arr* . For example, if  *arr = [1,4,1,2]* , you can add  *3*  in the middle and make it  *[1,4,3,1,2]* . Note that you can insert the integer at the very beginning or end of the array.

Return  *the minimum number of operations needed to make*  *target*  *a subsequence of*  *arr*  *.* 

A **subsequence**  of an array is a new array generated from the original array by deleting some elements (possibly none) without changing the remaining elements' relative order. For example,  *[2,7,4]*  is a subsequence of  *[4,2,3,7,2,1,4]*  (the underlined elements), while  *[2,4,2]*  is not.



**Example 1:** 

```
Input: target = [5,1,3], arr = [9,4,2,3,4]
Output: 2
Explanation: You can add 5 and 1 in such a way that makes arr = [5,9,4,1,2,3,4], then target will be a subsequence of arr.

```

**Example 2:** 

```
Input: target = [6,4,8,1,3,2], arr = [4,7,6,2,3,8,6,1]
Output: 3

```



**Constraints:** 

-  *1 <= target.length, arr.length <= 105*  
-  *1 <= target[i], arr[i] <= 109*  
-  *target*  contains no duplicates.


# [1713. 得到子序列的最少操作次数][cnTitle]

**困难**

给你一个数组  *target*  ，包含若干 **互不相同**  的整数，以及另一个整数数组  *arr*  ， *arr*  **可能**  包含重复元素。

每一次操作中，你可以在  *arr*  的任意位置插入任一整数。比方说，如果  *arr = [1,4,1,2]*  ，那么你可以在中间添加  *3*  得到  *[1,4,3,1,2]*  。你可以在数组最开始或最后面添加整数。

请你返回 **最少**  操作次数，使得 *target* 成为  *arr*  的一个子序列。

一个数组的 **子序列**  指的是删除原数组的某些元素（可能一个元素都不删除），同时不改变其余元素的相对顺序得到的数组。比方说， *[2,7,4]*  是  *[4,2,3,7,2,1,4]*  的子序列（加粗元素），但  *[2,4,2]*  不是子序列。



**示例 1：** 

```
输入：target = [5,1,3], arr = [9,4,2,3,4]
输出：2
解释：你可以添加 5 和 1 ，使得 arr 变为 [5,9,4,1,2,3,4] ，target 为 arr 的子序列。

```

**示例 2：** 

```
输入：target = [6,4,8,1,3,2], arr = [4,7,6,2,3,8,6,1]
输出：3

```



**提示：** 

-  *1 <= target.length, arr.length <= 105*  
-  *1 <= target[i], arr[i] <= 109*  
-  *target*  不包含任何重复元素。




# 算法思路

# 测试用例
```
1713. Minimum Operations to Make a Subsequence 1713. 得到子序列的最少操作次数 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-operations-to-make-a-subsequence/
[cnTitle]: https://leetcode-cn.com/problems/minimum-operations-to-make-a-subsequence/
