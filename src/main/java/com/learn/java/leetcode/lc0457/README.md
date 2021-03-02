# [457. Circular Array Loop][enTitle]

**Medium**

You are given a **circular**  array  *nums*  of positive and negative integers where you should:

- Move  *nums[i]*  steps forward if  *nums[i]*  is positive, and 
- Move  *nums[i]*  steps backward if  *nums[i]*  is negative.

Since the array is **circular** , you may assume that the last element's next element is the first element, and the first element's previous element is the last element.

Return  *true*  if there is a loop (or a **cycle** ) in  *nums* , and  *false*  otherwise.

A **cycle**  must start and end at the same index, and the cycle's length is greater than  *1* . Furthermore, movements in a cycle must all follow a single direction. In other words, a cycle must not consist of both forward and backward movements.



**Example 1:** 

```
Input: nums = [2,-1,1,2,2]
Output: true
Explanation: There is a cycle, from index 0 -> 2 -> 3 -> 0. The cycle's length is 3.

```

**Example 2:** 

```
Input: nums = [-1,2]
Output: false
Explanation: The movement from index 1 -> 1 -> 1 ... is not a cycle, because the cycle's length is 1. By definition the cycle's length must be greater than 1.

```

**Example 3:** 

```
Input: nums = [-2,1,-1,-2,-2]
Output: false
Explanation: The movement from index 1 -> 2 -> 1 -> ... is not a cycle, because movement from index 1 -> 2 is a forward movement, but movement from index 2 -> 1 is a backward movement. All movements in a cycle must follow a single direction.
```



**Constraints:** 

-  *1 <= nums.length <= 5000*  
-  *-1000 <= nums[i] <= 1000*  
-  *nums[i] != 0* 



**Follow up:**  Could you solve it in  *O(n)*  time complexity and  *O(1)*  extra space complexity?


# [457. 环形数组循环][cnTitle]

**中等**

给定一个含有正整数和负整数的**环形** 数组  *nums* 。 如果某个索引中的数  *k*  为正数，则向前移动  *k*  个索引。相反，如果是负数 ( *-k* )，则向后移动  *k*  个索引。因为数组是环形的，所以可以假设最后一个元素的下一个元素是第一个元素，而第一个元素的前一个元素是最后一个元素。

确定  *nums*  中是否存在循环（或周期）。循环必须在相同的索引处开始和结束并且循环长度 > 1。此外，一个循环中的所有运动都必须沿着同一方向进行。换句话说，一个循环中不能同时包括向前的运动和向后的运动。

**示例 1：** 

```
输入：[2,-1,1,2,2]
输出：true
解释：存在循环，按索引 0 -> 2 -> 3 -> 0 。循环长度为 3 。

```

**示例 2：** 

```
输入：[-1,2]
输出：false
解释：按索引 1 -> 1 -> 1 ... 的运动无法构成循环，因为循环的长度为 1 。根据定义，循环的长度必须大于 1 。

```

**示例 3:** 

```
输入：[-2,1,-1,-2,-2]
输出：false
解释：按索引 1 -> 2 -> 1 -> ... 的运动无法构成循环，因为按索引 1 -> 2 的运动是向前的运动，而按索引 2 -> 1 的运动是向后的运动。一个循环中的所有运动都必须沿着同一方向进行。
```



**提示：** 

1. -1000 ≤ nums[i] ≤ 1000 
2. nums[i] ≠ 0 
3. 0 ≤ nums.length ≤ 5000



**进阶：** 

你能写出时间时间复杂度为 **O(n)**  和额外空间复杂度为 **O(1)**  的算法吗？




# 算法思路

# 测试用例
```
457. Circular Array Loop 457. 环形数组循环 Medium
```

[enTitle]: https://leetcode.com/problems/circular-array-loop/
[cnTitle]: https://leetcode-cn.com/problems/circular-array-loop/
