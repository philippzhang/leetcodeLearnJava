# [1712. Ways to Split Array Into Three Subarrays][enTitle]

**Medium**

A split of an integer array is **good**  if:

- The array is split into three **non-empty**  contiguous subarrays - named  *left* ,  *mid* ,  *right*  respectively from left to right. 
- The sum of the elements in  *left*  is less than or equal to the sum of the elements in  *mid* , and the sum of the elements in  *mid*  is less than or equal to the sum of the elements in  *right* .

Given  *nums* , an array of **non-negative**  integers, return  *the number of good ways to split*   *nums* . As the number may be too large, return it **modulo**   *109 + 7* .



**Example 1:** 

```
Input: nums = [1,1,1]
Output: 1
Explanation: The only good way to split nums is [1] [1] [1].
```

**Example 2:** 

```
Input: nums = [1,2,2,2,5,0]
Output: 3
Explanation: There are three good ways of splitting nums:
[1] [2] [2,2,5,0]
[1] [2,2] [2,5,0]
[1,2] [2,2] [5,0]

```

**Example 3:** 

```
Input: nums = [3,2,1]
Output: 0
Explanation: There is no good way to split nums.
```



**Constraints:** 

-  *3 <= nums.length <= 105*  
-  *0 <= nums[i] <= 104* 


# [1712. 将数组分成三个子数组的方案数][cnTitle]

**中等**

我们称一个分割整数数组的方案是 **好的**  ，当它满足：

- 数组被分成三个 **非空**  连续子数组，从左至右分别命名为  *left*  ，  *mid*  ，  *right*  。 
-  *left*  中元素和小于等于  *mid*  中元素和， *mid*  中元素和小于等于  *right*  中元素和。

给你一个 **非负**  整数数组  *nums*  ，请你返回 **好的**  分割  *nums*  方案数目。由于答案可能会很大，请你将结果对  *109 + 7*  取余后返回。



**示例 1：** 

```
输入：nums = [1,1,1]
输出：1
解释：唯一一种好的分割方案是将 nums 分成 [1] [1] [1] 。
```

**示例 2：** 

```
输入：nums = [1,2,2,2,5,0]
输出：3
解释：nums 总共有 3 种好的分割方案：
[1] [2] [2,2,5,0]
[1] [2,2] [2,5,0]
[1,2] [2,2] [5,0]

```

**示例 3：** 

```
输入：nums = [3,2,1]
输出：0
解释：没有好的分割方案。
```



**提示：** 

-  *3 <= nums.length <= 105*  
-  *0 <= nums[i] <= 104* 




# 算法思路

# 测试用例
```
1712. Ways to Split Array Into Three Subarrays 1712. 将数组分成三个子数组的方案数 Medium
```

[enTitle]: https://leetcode.com/problems/ways-to-split-array-into-three-subarrays/
[cnTitle]: https://leetcode-cn.com/problems/ways-to-split-array-into-three-subarrays/
