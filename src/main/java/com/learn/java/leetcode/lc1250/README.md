# [1250. Check If It Is a Good Array][enTitle]

**Hard**

Given an array  *nums*  of positive integers. Your task is to select some subset of  *nums* , multiply each element by an integer and add all these numbers. The array is said to be **good** if you can obtain a sum of  *1*  from the array by any possible subset and multiplicand.

Return  *True*  if the array is **good** otherwise return  *False* .



**Example 1:** 

```
Input: nums = [12,5,7,23]
Output: true
Explanation: Pick numbers 5 and 7.
5*3 + 7*(-2) = 1

```

**Example 2:** 

```
Input: nums = [29,6,10]
Output: true
Explanation: Pick numbers 29, 6 and 10.
29*1 + 6*(-3) + 10*(-1) = 1

```

**Example 3:** 

```
Input: nums = [3,6]
Output: false

```



**Constraints:** 

-  *1 <= nums.length <= 10^5*  
-  *1 <= nums[i] <= 10^9* 


# [1250. 检查「好数组」][cnTitle]

**困难**

给你一个正整数数组  *nums* ，你需要从中任选一些子集，然后将子集中每一个数乘以一个 **任意整数** ，并求出他们的和。

假如该和结果为  *1* ，那么原数组就是一个「**好数组** 」，则返回  *True* ；否则请返回  *False* 。



**示例 1：** 

```
输入：nums = [12,5,7,23]
输出：true
解释：挑选数字 5 和 7。
5*3 + 7*(-2) = 1

```

**示例 2：** 

```
输入：nums = [29,6,10]
输出：true
解释：挑选数字 29, 6 和 10。
29*1 + 6*(-3) + 10*(-1) = 1

```

**示例 3：** 

```
输入：nums = [3,6]
输出：false

```



**提示：** 

-  *1 <= nums.length <= 10^5*  
-  *1 <= nums[i] <= 10^9* 




# 算法思路

# 测试用例
```
1250. Check If It Is a Good Array 1250. 检查「好数组」 Hard
```

[enTitle]: https://leetcode.com/problems/check-if-it-is-a-good-array/
[cnTitle]: https://leetcode-cn.com/problems/check-if-it-is-a-good-array/
