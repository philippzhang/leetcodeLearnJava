# [740. Delete and Earn][enTitle]

**Medium**

Given an array  *nums*  of integers, you can perform operations on the array.

In each operation, you pick any  *nums[i]*  and delete it to earn  *nums[i]*  points. After, you must delete every element equal to  *nums[i] - 1*  or  *nums[i] + 1* .

You start with  *0*  points. Return the maximum number of points you can earn by applying such operations.



**Example 1:** 

```
Input: nums = [3,4,2]
Output: 6
Explanation: Delete 4 to earn 4 points, consequently 3 is also deleted.
Then, delete 2 to earn 2 points.
6 total points are earned.

```

**Example 2:** 

```
Input: nums = [2,2,3,3,3,4]
Output: 9
Explanation: Delete 3 to earn 3 points, deleting both 2's and the 4.
Then, delete 3 again to earn 3 points, and 3 again to earn 3 points.
9 total points are earned.

```



**Constraints:** 

-  *1 <= nums.length <= 2 * 104*  
-  *1 <= nums[i] <= 104* 


# [740. 删除与获得点数][cnTitle]

**中等**

给定一个整数数组  *nums*  ，你可以对它进行一些操作。

每次操作中，选择任意一个  *nums[i]*  ，删除它并获得  *nums[i]*  的点数。之后，你必须删除**每个** 等于  *nums[i] - 1*  或  *nums[i] + 1*  的元素。

开始你拥有 0 个点数。返回你能通过这些操作获得的最大点数。

**示例 1:** 

```
输入: nums = [3, 4, 2]
输出: 6
解释: 
删除 4 来获得 4 个点数，因此 3 也被删除。
之后，删除 2 来获得 2 个点数。总共获得 6 个点数。

```

**示例 2:** 

```
输入: nums = [2, 2, 3, 3, 3, 4]
输出: 9
解释: 
删除 3 来获得 3 个点数，接着要删除两个 2 和 4 。
之后，再次删除 3 获得 3 个点数，再次删除 3 获得 3 个点数。
总共获得 9 个点数。

```

**注意:** 

-  *nums* 的长度最大为 *20000* 。 
- 每个整数 *nums[i]* 的大小都在 *[1, 10000]* 范围内。




# 算法思路

# 测试用例
```
740. Delete and Earn 740. 删除与获得点数 Medium
```

[enTitle]: https://leetcode.com/problems/delete-and-earn/
[cnTitle]: https://leetcode-cn.com/problems/delete-and-earn/
