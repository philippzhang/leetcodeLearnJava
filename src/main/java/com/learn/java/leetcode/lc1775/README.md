# [1775. Equal Sum Arrays With Minimum Number of Operations][enTitle]

**Medium**

You are given two arrays of integers  *nums1*  and  *nums2* , possibly of different lengths. The values in the arrays are between  *1*  and  *6* , inclusive.

In one operation, you can change any integer's value in **any** of the arrays to **any**  value between  *1*  and  *6* , inclusive.

Return  *the minimum number of operations required to make the sum of values in*  *nums1*  *equal to the sum of values in*  *nums2*  *.*  Return  *-1* ​​​​​ if it is not possible to make the sum of the two arrays equal.



**Example 1:** 

```
Input: nums1 = [1,2,3,4,5,6], nums2 = [1,1,2,2,2,2]
Output: 3
Explanation: You can make the sums of nums1 and nums2 equal with 3 operations. All indices are 0-indexed.
- Change nums2[0] to 6. nums1 = [1,2,3,4,5,6], nums2 = [6,1,2,2,2,2].
- Change nums1[5] to 1. nums1 = [1,2,3,4,5,1], nums2 = [6,1,2,2,2,2].
- Change nums1[2] to 2. nums1 = [1,2,2,4,5,1], nums2 = [6,1,2,2,2,2].

```

**Example 2:** 

```
Input: nums1 = [1,1,1,1,1,1,1], nums2 = [6]
Output: -1
Explanation: There is no way to decrease the sum of nums1 or to increase the sum of nums2 to make them equal.

```

**Example 3:** 

```
Input: nums1 = [6,6], nums2 = [1]
Output: 3
Explanation: You can make the sums of nums1 and nums2 equal with 3 operations. All indices are 0-indexed. 
- Change nums1[0] to 2. nums1 = [2,6], nums2 = [1].
- Change nums1[1] to 2. nums1 = [2,2], nums2 = [1].
- Change nums2[0] to 4. nums1 = [2,2], nums2 = [4].

```



**Constraints:** 

-  *1 <= nums1.length, nums2.length <= 105*  
-  *1 <= nums1[i], nums2[i] <= 6* 


# [1775. 通过最少操作次数使数组的和相等][cnTitle]

**中等**

给你两个长度可能不等的整数数组  *nums1*  和  *nums2*  。两个数组中的所有值都在  *1*  到  *6*  之间（包含  *1*  和  *6* ）。

每次操作中，你可以选择 **任意**  数组中的任意一个整数，将它变成  *1*  到  *6*  之间 **任意**  的值（包含  *1*  和  *6* ）。

请你返回使  *nums1*  中所有数的和与  *nums2*  中所有数的和相等的最少操作次数。如果无法使两个数组的和相等，请返回  *-1*  。



**示例 1：** 

```
输入：nums1 = [1,2,3,4,5,6], nums2 = [1,1,2,2,2,2]
输出：3
解释：你可以通过 3 次操作使 nums1 中所有数的和与 nums2 中所有数的和相等。以下数组下标都从 0 开始。
- 将 nums2[0] 变为 6 。 nums1 = [1,2,3,4,5,6], nums2 = [6,1,2,2,2,2] 。
- 将 nums1[5] 变为 1 。 nums1 = [1,2,3,4,5,1], nums2 = [6,1,2,2,2,2] 。
- 将 nums1[2] 变为 2 。 nums1 = [1,2,2,4,5,1], nums2 = [6,1,2,2,2,2] 。

```

**示例 2：** 

```
输入：nums1 = [1,1,1,1,1,1,1], nums2 = [6]
输出：-1
解释：没有办法减少 nums1 的和或者增加 nums2 的和使二者相等。

```

**示例 3：** 

```
输入：nums1 = [6,6], nums2 = [1]
输出：3
解释：你可以通过 3 次操作使 nums1 中所有数的和与 nums2 中所有数的和相等。以下数组下标都从 0 开始。
- 将 nums1[0] 变为 2 。 nums1 = [2,6], nums2 = [1] 。
- 将 nums1[1] 变为 2 。 nums1 = [2,2], nums2 = [1] 。
- 将 nums2[0] 变为 4 。 nums1 = [2,2], nums2 = [4] 。

```



**提示：** 

-  *1 <= nums1.length, nums2.length <= 105*  
-  *1 <= nums1[i], nums2[i] <= 6* 




# 算法思路

# 测试用例
```
1775. Equal Sum Arrays With Minimum Number of Operations 1775. 通过最少操作次数使数组的和相等 Medium
```

[enTitle]: https://leetcode.com/problems/equal-sum-arrays-with-minimum-number-of-operations/
[cnTitle]: https://leetcode-cn.com/problems/equal-sum-arrays-with-minimum-number-of-operations/
