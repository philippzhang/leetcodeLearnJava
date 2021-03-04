# [1608. Special Array With X Elements Greater Than or Equal X][enTitle]

**Easy**

You are given an array  *nums*  of non-negative integers.  *nums*  is considered **special**  if there exists a number  *x*  such that there are **exactly**   *x*  numbers in  *nums*  that are **greater than or equal to**   *x* .

Notice that  *x*  **does not**  have to be an element in  *nums* .

Return  *x*   *if the array is special, otherwise, return*  *-1* . It can be proven that if  *nums*  is special, the value for  *x*  is **unique** .



**Example 1:** 

```
Input: nums = [3,5]
Output: 2
Explanation: There are 2 values (3 and 5) that are greater than or equal to 2.

```

**Example 2:** 

```
Input: nums = [0,0]
Output: -1
Explanation: No numbers fit the criteria for x.
If x = 0, there should be 0 numbers >= x, but there are 2.
If x = 1, there should be 1 number >= x, but there are 0.
If x = 2, there should be 2 numbers >= x, but there are 0.
x cannot be greater since there are only 2 numbers in nums.

```

**Example 3:** 

```
Input: nums = [0,4,3,0,4]
Output: 3
Explanation: There are 3 values that are greater than or equal to 3.

```

**Example 4:** 

```
Input: nums = [3,6,7,7,0]
Output: -1

```



**Constraints:** 

-  *1 <= nums.length <= 100*  
-  *0 <= nums[i] <= 1000* 


# [1608. 特殊数组的特征值][cnTitle]

**简单**

给你一个非负整数数组  *nums*  。如果存在一个数  *x*  ，使得  *nums*  中恰好有  *x*  个元素 **大于或者等于**   *x*  ，那么就称  *nums*  是一个 **特殊数组**  ，而  *x*  是该数组的 **特征值**  。

注意：  *x*  **不必**  是  *nums*  的中的元素。

如果数组  *nums*  是一个 **特殊数组**  ，请返回它的特征值  *x*  。否则，返回 *-1*  。可以证明的是，如果  *nums*  是特殊数组，那么其特征值  *x*  是 **唯一的**  。



**示例 1：** 

```
输入：nums = [3,5]
输出：2
解释：有 2 个元素（3 和 5）大于或等于 2 。

```

**示例 2：** 

```
输入：nums = [0,0]
输出：-1
解释：没有满足题目要求的特殊数组，故而也不存在特征值 x 。
如果 x = 0，应该有 0 个元素 >= x，但实际有 2 个。
如果 x = 1，应该有 1 个元素 >= x，但实际有 0 个。
如果 x = 2，应该有 2 个元素 >= x，但实际有 0 个。
x 不能取更大的值，因为 nums 中只有两个元素。
```

**示例 3：** 

```
输入：nums = [0,4,3,0,4]
输出：3
解释：有 3 个元素大于或等于 3 。

```

**示例 4：** 

```
输入：nums = [3,6,7,7,0]
输出：-1

```



**提示：** 

-  *1 <= nums.length <= 100*  
-  *0 <= nums[i] <= 1000* 




# 算法思路

# 测试用例
```
1608. Special Array With X Elements Greater Than or Equal X 1608. 特殊数组的特征值 Easy
```

[enTitle]: https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
[cnTitle]: https://leetcode-cn.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
