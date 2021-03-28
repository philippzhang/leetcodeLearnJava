# [1800. Maximum Ascending Subarray Sum][enTitle]

**Easy**

Given an array of positive integers  *nums* , return the  *maximum possible sum of an ascending subarray in*  *nums* .

A subarray is defined as a contiguous sequence of numbers in an array.

A subarray  *[numsl, numsl+1, ..., numsr-1, numsr]*  is **ascending**  if for all  *i*  where  *l <= i < r* ,  *numsi < numsi+1* . Note that a subarray of size  *1*  is **ascending** .



**Example 1:** 

```
Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation:[5,10,50] is the ascending subarray with the maximum sum of 65.

```

**Example 2:** 

```
Input: nums = [10,20,30,40,50]
Output: 150
Explanation:[10,20,30,40,50] is the ascending subarray with the maximum sum of 150.

```

**Example 3:** 

```
Input: nums = [12,17,15,13,10,11,12]
Output: 33
Explanation:[10,11,12] is the ascending subarray with the maximum sum of 33.

```

**Example 4:** 

```
Input: nums = [100,10,1]
Output: 100

```



**Constraints:** 

-  *1 <= nums.length <= 100*  
-  *1 <= nums[i] <= 100* 


# [1800. 最大升序子数组和][cnTitle]

**简单**

给你一个正整数组成的数组  *nums*  ，返回  *nums*  中一个 **升序** 子数组的最大可能元素和。

子数组是数组中的一个连续数字序列。

已知子数组  *[numsl, numsl+1, ..., numsr-1, numsr]*  ，若对所有  *i* （ *l <= i < r* ）， *numsi < numsi+1*  都成立，则称这一子数组为 **升序**  子数组。注意，大小为  *1*  的子数组也视作 **升序**  子数组。



**示例 1：** 

```
输入：nums = [10,20,30,5,10,50]
输出：65
解释：[5,10,50] 是元素和最大的升序子数组，最大元素和为 65 。

```

**示例 2：** 

```
输入：nums = [10,20,30,40,50]
输出：150
解释：[10,20,30,40,50] 是元素和最大的升序子数组，最大元素和为 150 。 

```

**示例 3：** 

```
输入：nums = [12,17,15,13,10,11,12]
输出：33
解释：[10,11,12] 是元素和最大的升序子数组，最大元素和为 33 。 

```

**示例 4：** 

```
输入：nums = [100,10,1]
输出：100

```



**提示：** 

-  *1 <= nums.length <= 100*  
-  *1 <= nums[i] <= 100* 




# 算法思路

# 测试用例
```
1800. Maximum Ascending Subarray Sum 1800. 最大升序子数组和 Easy
```

[enTitle]: https://leetcode.com/problems/maximum-ascending-subarray-sum/
[cnTitle]: https://leetcode-cn.com/problems/maximum-ascending-subarray-sum/
