# [1577. Number of Ways Where Square of Number Is Equal to Product of Two Numbers][enTitle]

**Medium**

Given two arrays of integers  *nums1*  and  *nums2* , return the number of triplets formed (type 1 and type 2) under the following rules:

- Type 1: Triplet (i, j, k) if  *nums1[i]2 == nums2[j] * nums2[k]*  where  *0 <= i < nums1.length*  and  *0 <= j < k < nums2.length* . 
- Type 2: Triplet (i, j, k) if  *nums2[i]2 == nums1[j] * nums1[k]*  where  *0 <= i < nums2.length*  and  *0 <= j < k < nums1.length* .



**Example 1:** 

```
Input: nums1 = [7,4], nums2 = [5,2,8,9]
Output: 1
Explanation: Type 1: (1,1,2), nums1[1]^2 = nums2[1] * nums2[2]. (4^2 = 2 * 8). 

```

**Example 2:** 

```
Input: nums1 = [1,1], nums2 = [1,1,1]
Output: 9
Explanation: All Triplets are valid, because 1^2 = 1 * 1.
Type 1: (0,0,1), (0,0,2), (0,1,2), (1,0,1), (1,0,2), (1,1,2).  nums1[i]^2 = nums2[j] * nums2[k].
Type 2: (0,0,1), (1,0,1), (2,0,1). nums2[i]^2 = nums1[j] * nums1[k].

```

**Example 3:** 

```
Input: nums1 = [7,7,8,3], nums2 = [1,2,9,7]
Output: 2
Explanation: There are 2 valid triplets.
Type 1: (3,0,2).  nums1[3]^2 = nums2[0] * nums2[2].
Type 2: (3,0,1).  nums2[3]^2 = nums1[0] * nums1[1].

```

**Example 4:** 

```
Input: nums1 = [4,7,9,11,23], nums2 = [3,5,1024,12,18]
Output: 0
Explanation: There are no valid triplets.

```



**Constraints:** 

-  *1 <= nums1.length, nums2.length <= 1000*  
-  *1 <= nums1[i], nums2[i] <= 10^5* 


# [1577. 数的平方等于两数乘积的方法数][cnTitle]

**中等**

给你两个整数数组  *nums1*  和  *nums2*  ，请你返回根据以下规则形成的三元组的数目（类型 1 和类型 2 ）：

- 类型 1：三元组  *(i, j, k)*  ，如果  *nums1[i]2 == nums2[j] * nums2[k]*  其中  *0 <= i < nums1.length*  且  *0 <= j < k < nums2.length*  
- 类型 2：三元组  *(i, j, k)*  ，如果  *nums2[i]2 == nums1[j] * nums1[k]*  其中  *0 <= i < nums2.length*  且  *0 <= j < k < nums1.length* 



**示例 1：** 

```
输入：nums1 = [7,4], nums2 = [5,2,8,9]
输出：1
解释：类型 1：(1,1,2), nums1[1]^2 = nums2[1] * nums2[2] (4^2 = 2 * 8)
```

**示例 2：** 

```
输入：nums1 = [1,1], nums2 = [1,1,1]
输出：9
解释：所有三元组都符合题目要求，因为 1^2 = 1 * 1
类型 1：(0,0,1), (0,0,2), (0,1,2), (1,0,1), (1,0,2), (1,1,2), nums1[i]^2 = nums2[j] * nums2[k]
类型 2：(0,0,1), (1,0,1), (2,0,1), nums2[i]^2 = nums1[j] * nums1[k]

```

**示例 3：** 

```
输入：nums1 = [7,7,8,3], nums2 = [1,2,9,7]
输出：2
解释：有两个符合题目要求的三元组
类型 1：(3,0,2), nums1[3]^2 = nums2[0] * nums2[2]
类型 2：(3,0,1), nums2[3]^2 = nums1[0] * nums1[1]

```

**示例 4：** 

```
输入：nums1 = [4,7,9,11,23], nums2 = [3,5,1024,12,18]
输出：0
解释：不存在符合题目要求的三元组

```



**提示：** 

-  *1 <= nums1.length, nums2.length <= 1000*  
-  *1 <= nums1[i], nums2[i] <= 10^5* 




# 算法思路

# 测试用例
```
1577. Number of Ways Where Square of Number Is Equal to Product of Two Numbers 1577. 数的平方等于两数乘积的方法数 Medium
```

[enTitle]: https://leetcode.com/problems/number-of-ways-where-square-of-number-is-equal-to-product-of-two-numbers/
[cnTitle]: https://leetcode-cn.com/problems/number-of-ways-where-square-of-number-is-equal-to-product-of-two-numbers/
