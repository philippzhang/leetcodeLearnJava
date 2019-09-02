# [321. Create Maximum Number][enTitle]

**Hard**

Given two arrays of length  *m*  and  *n*  with digits  *0-9*  representing two numbers. Create the maximum number of length  *k <= m + n*  from digits of the two. The relative order of the digits from the same array must be preserved. Return an array of the  *k*  digits.

**Note:** You should try to optimize your time and space complexity.

Example 1:

```
Input:
nums1 = [3, 4, 6, 5]
nums2 = [9, 1, 2, 5, 8, 3]
k = 5
Output:
[9, 8, 6, 5, 3]
```

Example 2:

```
Input:
nums1 = [6, 7]
nums2 = [6, 0, 4]
k = 5
Output:
[6, 7, 6, 0, 4]
```

Example 3:

```
Input:
nums1 = [3, 9]
nums2 = [8, 9]
k = 3
Output:
[9, 8, 9]

```


# [321. 拼接最大数][cnTitle]

**困难**

给定长度分别为  *m*  和  *n*  的两个数组，其元素由  *0-9*  构成，表示两个自然数各位上的数字。现在从这两个数组中选出  *k (k <= m + n)*  个数字拼接成一个新的数，要求从同一个数组中取出的数字保持其在原数组中的相对顺序。

求满足该条件的最大数。结果返回一个表示该最大数的长度为  *k*  的数组。

**说明:** 请尽可能地优化你算法的时间和空间复杂度。

**示例 1:** 

```
输入:
nums1 = [3, 4, 6, 5]
nums2 = [9, 1, 2, 5, 8, 3]
k = 5
输出:
[9, 8, 6, 5, 3]
```

**示例 2:** 

```
输入:
nums1 = [6, 7]
nums2 = [6, 0, 4]
k = 5
输出:
[6, 7, 6, 0, 4]
```

**示例 3:** 

```
输入:
nums1 = [3, 9]
nums2 = [8, 9]
k = 3
输出:
[9, 8, 9]
```




# 算法思路

# 测试用例
```
321. Create Maximum Number 321. 拼接最大数 Hard
Solution.maxNumber
---
[3,4,6,5]
[9,1,2,5,8,3]
5

=[9,8,6,5,3]
---
[6,7]
[6,0,4]
5

=[6,7,6,0,4]
---
[3,9]
[8,9]
3

=[9,8,9]
```

[enTitle]: https://leetcode.com/problems/create-maximum-number/
[cnTitle]: https://leetcode-cn.com/problems/create-maximum-number/
