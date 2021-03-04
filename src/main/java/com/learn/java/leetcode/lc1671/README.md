# [1671. Minimum Number of Removals to Make Mountain Array][enTitle]

**Hard**

You may recall that an array  *arr*  is a **mountain array**  if and only if:

-  *arr.length >= 3*  
- There exists some index  *i*  (**0-indexed** ) with  *0 < i < arr.length - 1*  such that: 
 <ul> 
  -  *arr[0] < arr[1] < ... < arr[i - 1] < arr[i]*  
  -  *arr[i] > arr[i + 1] > ... > arr[arr.length - 1]*  
 </ul> 

Given an integer array  *nums* ​​​, return  *the minimum number of elements to remove to make*  *nums*  *a mountain array.* 



**Example 1:** 

```
Input: nums = [1,3,1]
Output: 0
Explanation: The array itself is a mountain array so we do not need to remove any elements.

```

**Example 2:** 

```
Input: nums = [2,1,1,5,6,2,3,1]
Output: 3
Explanation: One solution is to remove the elements at indices 0, 1, and 5, making the array nums = [1,5,6,3,1].

```

**Example 3:** 

```
Input: nums = [4,3,2,1,1,2,3,1]
Output: 4

```

**Example 4:** 

```
Input: nums = [1,2,3,4,4,3,2,1]
Output: 1

```



**Constraints:** 

-  *3 <= nums.length <= 1000*  
-  *1 <= nums[i] <= 109*  
- It is guaranteed that you can make a mountain array out of  *nums* .


# [1671. 得到山形数组的最少删除次数][cnTitle]

**困难**

我们定义  *arr*  是 山形数组 当且仅当它满足：

-  *arr.length >= 3*  
- 存在某个下标  *i*  （**从 0 开始** ） 满足  *0 < i < arr.length - 1*  且： 
 <ul> 
  -  *arr[0] < arr[1] < ... < arr[i - 1] < arr[i]*  
  -  *arr[i] > arr[i + 1] > ... > arr[arr.length - 1]*  
 </ul> 

给你整数数组  *nums* ​ ，请你返回将  *nums*  变成 **山形状数组**  的​ **最少**  删除次数。



**示例 1：** 

```
输入：nums = [1,3,1]
输出：0
解释：数组本身就是山形数组，所以我们不需要删除任何元素。

```

**示例 2：** 

```
输入：nums = [2,1,1,5,6,2,3,1]
输出：3
解释：一种方法是将下标为 0，1 和 5 的元素删除，剩余元素为 [1,5,6,3,1] ，是山形数组。

```

**示例 3：** 

```
输入：nums = [4,3,2,1,1,2,3,1]
输出：4

```

**提示：** 

```
输入：nums = [1,2,3,4,4,3,2,1]
输出：1

```



**提示：** 

-  *3 <= nums.length <= 1000*  
-  *1 <= nums[i] <= 109*  
- 题目保证  *nums*  删除一些元素后一定能得到山形数组。




# 算法思路

# 测试用例
```
1671. Minimum Number of Removals to Make Mountain Array 1671. 得到山形数组的最少删除次数 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-number-of-removals-to-make-mountain-array/
[cnTitle]: https://leetcode-cn.com/problems/minimum-number-of-removals-to-make-mountain-array/
