# [724. Find Pivot Index][enTitle]

**Easy**

Given an array of integers  *nums* , calculate the **pivot index**  of this array.

The **pivot index**  is the index where the sum of all the numbers **strictly**  to the left of the index is equal to the sum of all the numbers **strictly**  to the index's right.

If the index is on the left edge of the array, then the left sum is  *0*  because there are no elements to the left. This also applies to the right edge of the array.

Return  *the leftmost pivot index* . If no such index exists, return -1.



**Example 1:** 

```
Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11

```

**Example 2:** 

```
Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.
```

**Example 3:** 

```
Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0

```



**Constraints:** 

-  *1 <= nums.length <= 104*  
-  *-1000 <= nums[i] <= 1000* 


# [724. 寻找数组的中心索引][cnTitle]

**简单**

给你一个整数数组  *nums* ，请编写一个能够返回数组 **“中心索引”** 的方法。

数组**中心索引** 是数组的一个索引，其左侧所有元素相加的和等于右侧所有元素相加的和。

如果数组不存在中心索引，返回  *-1*  。如果数组有多个中心索引，应该返回最靠近左边的那一个。

**注意：** 中心索引可能出现在数组的两端。



**示例 1：** 

```
输入：nums = [1, 7, 3, 6, 5, 6]
输出：3
解释：
中心索引是 3 。
左侧数之和 (1 + 7 + 3 = 11)，
右侧数之和 (5 + 6 = 11) ，二者相等。

```

**示例 2：** 

```
输入：nums = [1, 2, 3]
输出：-1
解释：
数组中不存在满足此条件的中心索引。
```

**示例 3：** 

```
输入：nums = [2, 1, -1]
输出：0
解释：
中心索引是 0 。
索引 0 左侧不存在元素，视作和为 0 ；
右侧数之和为 1 + (-1) = 0 ，二者相等。

```



**提示：** 

-  *nums*  的长度范围为  *[0, 10000]* 。 
- 任何一个  *nums[i]*  将会是一个范围在  *[-1000, 1000]* 的整数。




# 算法思路

# 测试用例
```
724. Find Pivot Index 724. 寻找数组的中心索引 Easy
```

[enTitle]: https://leetcode.com/problems/find-pivot-index/
[cnTitle]: https://leetcode-cn.com/problems/find-pivot-index/
