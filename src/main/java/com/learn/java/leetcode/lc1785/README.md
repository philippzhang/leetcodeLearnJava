# [1785. Minimum Elements to Add to Form a Given Sum][enTitle]

**Medium**

You are given an integer array  *nums*  and two integers  *limit*  and  *goal* . The array  *nums*  has an interesting property that  *abs(nums[i]) <= limit* .

Return  *the minimum number of elements you need to add to make the sum of the array equal to*  *goal* . The array must maintain its property that  *abs(nums[i]) <= limit* .

Note that  *abs(x)*  equals  *x*  if  *x >= 0* , and  *-x*  otherwise.



**Example 1:** 

```
Input: nums = [1,-1,1], limit = 3, goal = -4
Output: 2
Explanation: You can add -2 and -3, then the sum of the array will be 1 - 1 + 1 - 2 - 3 = -4.

```

**Example 2:** 

```
Input: nums = [1,-10,9,1], limit = 100, goal = 0
Output: 1

```



**Constraints:** 

-  *1 <= nums.length <= 105*  
-  *1 <= limit <= 106*  
-  *-limit <= nums[i] <= limit*  
-  *-109 <= goal <= 109* 


# [1785. 构成特定和需要添加的最少元素][cnTitle]

**中等**

给你一个整数数组  *nums*  ，和两个整数  *limit*  与  *goal*  。数组  *nums*  有一条重要属性： *abs(nums[i]) <= limit*  。

返回使数组元素总和等于  *goal*  所需要向数组中添加的 **最少元素数量**  ，添加元素 **不应改变**  数组中  *abs(nums[i]) <= limit*  这一属性。

注意，如果  *x >= 0*  ，那么  *abs(x)*  等于  *x*  ；否则，等于  *-x*  。



**示例 1：** 

```
输入：nums = [1,-1,1], limit = 3, goal = -4
输出：2
解释：可以将 -2 和 -3 添加到数组中，数组的元素总和变为 1 - 1 + 1 - 2 - 3 = -4 。

```

**示例 2：** 

```
输入：nums = [1,-10,9,1], limit = 100, goal = 0
输出：1

```



**提示：** 

-  *1 <= nums.length <= 105*  
-  *1 <= limit <= 106*  
-  *-limit <= nums[i] <= limit*  
-  *-109 <= goal <= 109* 




# 算法思路

# 测试用例
```
1785. Minimum Elements to Add to Form a Given Sum 1785. 构成特定和需要添加的最少元素 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-elements-to-add-to-form-a-given-sum/
[cnTitle]: https://leetcode-cn.com/problems/minimum-elements-to-add-to-form-a-given-sum/
