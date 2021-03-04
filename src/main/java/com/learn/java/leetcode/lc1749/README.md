# [1749. Maximum Absolute Sum of Any Subarray][enTitle]

**Medium**

You are given an integer array  *nums* . The **absolute sum**  of a subarray  *[numsl, numsl+1, ..., numsr-1, numsr]*  is  *abs(numsl + numsl+1 + ... + numsr-1 + numsr)* .

Return  *the maximum absolute sum of any (possibly empty) subarray of*  *nums* .

Note that  *abs(x)*  is defined as follows:

- If  *x*  is a negative integer, then  *abs(x) = -x* . 
- If  *x*  is a non-negative integer, then  *abs(x) = x* .



**Example 1:** 

```
Input: nums = [1,-3,2,3,-4]
Output: 5
Explanation: The subarray [2,3] has absolute sum = abs(2+3) = abs(5) = 5.

```

**Example 2:** 

```
Input: nums = [2,-5,1,-4,3,-2]
Output: 8
Explanation: The subarray [-5,1,-4] has absolute sum = abs(-5+1-4) = abs(-8) = 8.

```



**Constraints:** 

-  *1 <= nums.length <= 105*  
-  *-104 <= nums[i] <= 104* 


# [1749. 任意子数组和的绝对值的最大值][cnTitle]

**中等**

给你一个整数数组  *nums*  。一个子数组  *[numsl, numsl+1, ..., numsr-1, numsr]*  的 **和的绝对值**  为  *abs(numsl + numsl+1 + ... + numsr-1 + numsr)*  。

请你找出  *nums*  中 **和的绝对值**  最大的任意子数组（可能为空），并返回该 **最大值**  。

 *abs(x)*  定义如下：

- 如果  *x*  是负整数，那么  *abs(x) = -x*  。 
- 如果  *x*  是非负整数，那么  *abs(x) = x*  。



**示例 1：** 

```
输入：nums = [1,-3,2,3,-4]
输出：5
解释：子数组 [2,3] 和的绝对值最大，为 abs(2+3) = abs(5) = 5 。

```

**示例 2：** 

```
输入：nums = [2,-5,1,-4,3,-2]
输出：8
解释：子数组 [-5,1,-4] 和的绝对值最大，为 abs(-5+1-4) = abs(-8) = 8 。

```



**提示：** 

-  *1 <= nums.length <= 105*  
-  *-104 <= nums[i] <= 104* 




# 算法思路

# 测试用例
```
1749. Maximum Absolute Sum of Any Subarray 1749. 任意子数组和的绝对值的最大值 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/
[cnTitle]: https://leetcode-cn.com/problems/maximum-absolute-sum-of-any-subarray/
