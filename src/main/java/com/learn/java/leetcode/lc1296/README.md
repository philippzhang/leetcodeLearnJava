# [1296. Divide Array in Sets of K Consecutive Numbers][enTitle]

**Medium**

Given an array of integers  *nums*  and a positive integer  *k* , find whether it's possible to divide this array into sets of  *k*  consecutive numbers Return  *True*  if it is possible.**** Otherwise, return  *False* .



**Example 1:** 

```
Input: nums = [1,2,3,3,4,4,5,6], k = 4
Output: true
Explanation: Array can be divided into [1,2,3,4] and [3,4,5,6].

```

**Example 2:** 

```
Input: nums = [3,2,1,2,3,4,3,4,5,9,10,11], k = 3
Output: true
Explanation: Array can be divided into [1,2,3] , [2,3,4] , [3,4,5] and [9,10,11].

```

**Example 3:** 

```
Input: nums = [3,3,2,2,1,1], k = 3
Output: true

```

**Example 4:** 

```
Input: nums = [1,2,3,4], k = 3
Output: false
Explanation: Each array should be divided in subarrays of size 3.

```



**Constraints:** 

-  *1 <= k <= nums.length <= 105*  
-  *1 <= nums[i] <= 109* 




https://leetcode.com/problems/hand-of-straights/


# [1296. 划分数组为连续数字的集合][cnTitle]

**中等**

给你一个整数数组  *nums*  和一个正整数  *k* ，请你判断是否可以把这个数组划分成一些由  *k*  个连续数字组成的集合。 如果可以，请返回  *True* ；否则，返回  *False* 。



**注意：** 此题目与 846 重复：https://leetcode-cn.com/problems/hand-of-straights/



**示例 1：** 

```
输入：nums = [1,2,3,3,4,4,5,6], k = 4
输出：true
解释：数组可以分成 [1,2,3,4] 和 [3,4,5,6]。

```

**示例 2：** 

```
输入：nums = [3,2,1,2,3,4,3,4,5,9,10,11], k = 3
输出：true
解释：数组可以分成 [1,2,3] , [2,3,4] , [3,4,5] 和 [9,10,11]。

```

**示例 3：** 

```
输入：nums = [3,3,2,2,1,1], k = 3
输出：true

```

**示例 4：** 

```
输入：nums = [1,2,3,4], k = 3
输出：false
解释：数组不能分成几个大小为 3 的子数组。

```



**提示：** 

-  *1 <= nums.length <= 10^5*  
-  *1 <= nums[i] <= 10^9*  
-  *1 <= k <= nums.length* 




# 算法思路

# 测试用例
```
1296. Divide Array in Sets of K Consecutive Numbers 1296. 划分数组为连续数字的集合 Medium
```

[enTitle]: https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/
[cnTitle]: https://leetcode-cn.com/problems/divide-array-in-sets-of-k-consecutive-numbers/
