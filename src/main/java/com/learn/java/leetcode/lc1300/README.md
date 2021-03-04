# [1300. Sum of Mutated Array Closest to Target][enTitle]

**Medium**

Given an integer array  *arr*  and a target value  *target* , return the integer  *value*  such that when we change all the integers larger than  *value*  in the given array to be equal to  *value* , the sum of the array gets as close as possible (in absolute difference) to  *target* .

In case of a tie, return the minimum such integer.

Notice that the answer is not neccesarilly a number from  *arr* .



**Example 1:** 

```
Input: arr = [4,9,3], target = 10
Output: 3
Explanation: When using 3 arr converts to [3, 3, 3] which sums 9 and that's the optimal answer.

```

**Example 2:** 

```
Input: arr = [2,3,5], target = 10
Output: 5

```

**Example 3:** 

```
Input: arr = [60864,25176,27249,21296,20204], target = 56803
Output: 11361

```



**Constraints:** 

-  *1 <= arr.length <= 10^4*  
-  *1 <= arr[i], target <= 10^5* 


# [1300. 转变数组后最接近目标值的数组和][cnTitle]

**中等**

给你一个整数数组  *arr*  和一个目标值  *target*  ，请你返回一个整数  *value*  ，使得将数组中所有大于  *value*  的值变成  *value*  后，数组的和最接近  *target*  （最接近表示两者之差的绝对值最小）。

如果有多种使得和最接近  *target*  的方案，请你返回这些整数中的最小值。

请注意，答案不一定是  *arr*  中的数字。



**示例 1：** 

```
输入：arr = [4,9,3], target = 10
输出：3
解释：当选择 value 为 3 时，数组会变成 [3, 3, 3]，和为 9 ，这是最接近 target 的方案。

```

**示例 2：** 

```
输入：arr = [2,3,5], target = 10
输出：5

```

**示例 3：** 

```
输入：arr = [60864,25176,27249,21296,20204], target = 56803
输出：11361

```



**提示：** 

-  *1 <= arr.length <= 10^4*  
-  *1 <= arr[i], target <= 10^5* 




# 算法思路

# 测试用例
```
1300. Sum of Mutated Array Closest to Target 1300. 转变数组后最接近目标值的数组和 Medium
```

[enTitle]: https://leetcode.com/problems/sum-of-mutated-array-closest-to-target/
[cnTitle]: https://leetcode-cn.com/problems/sum-of-mutated-array-closest-to-target/
