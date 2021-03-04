# [1673. Find the Most Competitive Subsequence][enTitle]

**Medium**

Given an integer array  *nums*  and a positive integer  *k* , return  *the most competitive subsequence of*  *nums*   *of size*  *k* .

An array's subsequence is a resulting sequence obtained by erasing some (possibly zero) elements from the array.

We define that a subsequence  *a*  is more **competitive**  than a subsequence  *b*  (of the same length) if in the first position where  *a*  and  *b*  differ, subsequence  *a*  has a number **less**  than the corresponding number in  *b* . For example,  *[1,3,4]*  is more competitive than  *[1,3,5]*  because the first position they differ is at the final number, and  *4*  is less than  *5* .



**Example 1:** 

```
Input: nums = [3,5,2,6], k = 2
Output: [2,6]
Explanation: Among the set of every possible subsequence: {[3,5], [3,2], [3,6], [5,2], [5,6], [2,6]}, [2,6] is the most competitive.

```

**Example 2:** 

```
Input: nums = [2,4,3,3,5,4,9,6], k = 4
Output: [2,3,3,4]

```



**Constraints:** 

-  *1 <= nums.length <= 105*  
-  *0 <= nums[i] <= 109*  
-  *1 <= k <= nums.length* 


# [1673. 找出最具竞争力的子序列][cnTitle]

**中等**

给你一个整数数组  *nums*  和一个正整数  *k*  ，返回长度为  *k*  且最具 **竞争力**  的 *nums*  子序列。

数组的子序列是从数组中删除一些元素（可能不删除元素）得到的序列。

在子序列  *a*  和子序列  *b*  第一个不相同的位置上，如果  *a*  中的数字小于  *b*  中对应的数字，那么我们称子序列  *a*  比子序列  *b* （相同长度下）更具 **竞争力**  。 例如， *[1,3,4]*  比  *[1,3,5]*  更具竞争力，在第一个不相同的位置，也就是最后一个位置上，  *4*  小于  *5*  。



**示例 1：** 

```
输入：nums = [3,5,2,6], k = 2
输出：[2,6]
解释：在所有可能的子序列集合 {[3,5], [3,2], [3,6], [5,2], [5,6], [2,6]} 中，[2,6] 最具竞争力。

```

**示例 2：** 

```
输入：nums = [2,4,3,3,5,4,9,6], k = 4
输出：[2,3,3,4]

```



**提示：** 

-  *1 <= nums.length <= 105*  
-  *0 <= nums[i] <= 109*  
-  *1 <= k <= nums.length* 




# 算法思路

# 测试用例
```
1673. Find the Most Competitive Subsequence 1673. 找出最具竞争力的子序列 Medium
```

[enTitle]: https://leetcode.com/problems/find-the-most-competitive-subsequence/
[cnTitle]: https://leetcode-cn.com/problems/find-the-most-competitive-subsequence/
