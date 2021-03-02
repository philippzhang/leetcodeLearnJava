# [665. Non-decreasing Array][enTitle]

**Medium**

Given an array  *nums*  with  *n*  integers, your task is to check if it could become non-decreasing by modifying **at most one element** .

We define an array is non-decreasing if  *nums[i] <= nums[i + 1]*  holds for every  *i*  (**0-based** ) such that ( *0 <= i <= n - 2* ).



**Example 1:** 

```
Input: nums = [4,2,3]
Output: true
Explanation: You could modify the first 4 to 1 to get a non-decreasing array.

```

**Example 2:** 

```
Input: nums = [4,2,1]
Output: false
Explanation: You can't get a non-decreasing array by modify at most one element.

```



**Constraints:** 

-  *n == nums.length*  
-  *1 <= n <= 104*  
-  *-105 <= nums[i] <= 105* 


# [665. 非递减数列][cnTitle]

**简单**

给你一个长度为  *n*  的整数数组，请你判断在 **最多** 改变  *1*  个元素的情况下，该数组能否变成一个非递减数列。

我们是这样定义一个非递减数列的： 对于数组中任意的  *i*   *(0 <= i <= n-2)* ，总满足  *nums[i] <= nums[i + 1]* 。



**示例 1:** 

```
输入: nums = [4,2,3]
输出: true
解释: 你可以通过把第一个4变成1来使得它成为一个非递减数列。

```

**示例 2:** 

```
输入: nums = [4,2,1]
输出: false
解释: 你不能在只改变一个元素的情况下将其变为非递减数列。

```



**提示：** 

-  *1 <= n <= 10 ^ 4*  
-  *- 10 ^ 5 <= nums[i] <= 10 ^ 5* 




# 算法思路

# 测试用例
```
665. Non-decreasing Array 665. 非递减数列 Medium
```

[enTitle]: https://leetcode.com/problems/non-decreasing-array/
[cnTitle]: https://leetcode-cn.com/problems/non-decreasing-array/
