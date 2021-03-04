# [1752. Check if Array Is Sorted and Rotated][enTitle]

**Easy**

Given an array  *nums* , return  *true*  *if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero)* . Otherwise, return  *false* .

There may be **duplicates**  in the original array.

**Note:**  An array  *A*  rotated by  *x*  positions results in an array  *B*  of the same length such that  *A[i] == B[(i+x) % A.length]* , where  *%*  is the modulo operation.



**Example 1:** 

```
Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].

```

**Example 2:** 

```
Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.

```

**Example 3:** 

```
Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.

```

**Example 4:** 

```
Input: nums = [1,1,1]
Output: true
Explanation: [1,1,1] is the original sorted array.
You can rotate any number of positions to make nums.

```

**Example 5:** 

```
Input: nums = [2,1]
Output: true
Explanation: [1,2] is the original sorted array.
You can rotate the array by x = 5 positions to begin on the element of value 2: [2,1].

```



**Constraints:** 

-  *1 <= nums.length <= 100*  
-  *1 <= nums[i] <= 100* 


# [1752. 检查数组是否经排序和轮转得到][cnTitle]

**简单**

给你一个数组  *nums*  。 *nums*  的源数组中，所有元素与  *nums*  相同，但按非递减顺序排列。

如果  *nums*  能够由源数组轮转若干位置（包括 0 个位置）得到，则返回  *true* ；否则，返回  *false*  。

源数组中可能存在 **重复项**  。

**注意：** 我们称数组  *A*  在轮转  *x*  个位置后得到长度相同的数组  *B*  ，当它们满足  *A[i] == B[(i+x) % A.length]*  ，其中  *%*  为取余运算。



**示例 1：** 

```
输入：nums = [3,4,5,1,2]
输出：true
解释：[1,2,3,4,5] 为有序的源数组。
可以轮转 x = 3 个位置，使新数组从值为 3 的元素开始：[3,4,5,1,2] 。

```

**示例 2：** 

```
输入：nums = [2,1,3,4]
输出：false
解释：源数组无法经轮转得到 nums 。

```

**示例 3：** 

```
输入：nums = [1,2,3]
输出：true
解释：[1,2,3] 为有序的源数组。
可以轮转 x = 0 个位置（即不轮转）得到 nums 。

```

**示例 4：** 

```
输入：nums = [1,1,1]
输出：true
解释：[1,1,1] 为有序的源数组。
轮转任意个位置都可以得到 nums 。

```

**示例 5：** 

```
输入：nums = [2,1]
输出：true
解释：[1,2] 为有序的源数组。
可以轮转 x = 5 个位置，使新数组从值为 2 的元素开始：[2,1] 。

```



**提示：** 

-  *1 <= nums.length <= 100*  
-  *1 <= nums[i] <= 100* 




# 算法思路

# 测试用例
```
1752. Check if Array Is Sorted and Rotated 1752. 检查数组是否经排序和轮转得到 Easy
```

[enTitle]: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
[cnTitle]: https://leetcode-cn.com/problems/check-if-array-is-sorted-and-rotated/
