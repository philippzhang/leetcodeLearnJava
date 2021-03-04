# [1354. Construct Target Array With Multiple Sums][enTitle]

**Hard**

Given an array of integers  *target* . From a starting array,  *A*  consisting of all 1's, you may perform the following procedure :

- let  *x*  be the sum of all elements currently in your array. 
- choose index  *i* , such that  *0 <= i < target.size*  and set the value of  *A*  at index  *i*  to  *x* . 
- You may repeat this procedure as many times as needed.

Return True if it is possible to construct the  *target*  array from  *A*  otherwise return False.



**Example 1:** 

```
Input: target = [9,3,5]
Output: true
Explanation: Start with [1, 1, 1] 
[1, 1, 1], sum = 3 choose index 1
[1, 3, 1], sum = 5 choose index 2
[1, 3, 5], sum = 9 choose index 0
[9, 3, 5] Done

```

**Example 2:** 

```
Input: target = [1,1,1,2]
Output: false
Explanation: Impossible to create target array from [1,1,1,1].

```

**Example 3:** 

```
Input: target = [8,5]
Output: true

```



**Constraints:** 

-  *N == target.length*  
-  *1 <= target.length <= 5 * 10^4*  
-  *1 <= target[i] <= 10^9* 


# [1354. 多次求和构造目标数组][cnTitle]

**困难**

给你一个整数数组  *target*  。一开始，你有一个数组  *A*  ，它的所有元素均为 1 ，你可以执行以下操作：

- 令  *x*  为你数组里所有元素的和 
- 选择满足  *0 <= i < target.size*  的任意下标  *i*  ，并让  *A*  数组里下标为  *i*  处的值为  *x*  。 
- 你可以重复该过程任意次

如果能从  *A*  开始构造出目标数组  *target*  ，请你返回 True ，否则返回 False 。



**示例 1：** 

```
输入：target = [9,3,5]
输出：true
解释：从 [1, 1, 1] 开始
[1, 1, 1], 和为 3 ，选择下标 1
[1, 3, 1], 和为 5， 选择下标 2
[1, 3, 5], 和为 9， 选择下标 0
[9, 3, 5] 完成

```

**示例 2：** 

```
输入：target = [1,1,1,2]
输出：false
解释：不可能从 [1,1,1,1] 出发构造目标数组。

```

**示例 3：** 

```
输入：target = [8,5]
输出：true

```



**提示：** 

-  *N == target.length*  
-  *1 <= target.length <= 5 * 10^4*  
-  *1 <= target[i] <= 10^9* 




# 算法思路

# 测试用例
```
1354. Construct Target Array With Multiple Sums 1354. 多次求和构造目标数组 Hard
```

[enTitle]: https://leetcode.com/problems/construct-target-array-with-multiple-sums/
[cnTitle]: https://leetcode-cn.com/problems/construct-target-array-with-multiple-sums/
