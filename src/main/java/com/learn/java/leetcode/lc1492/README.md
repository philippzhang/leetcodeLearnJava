# [1492. The kth Factor of n][enTitle]

**Medium**

Given two positive integers  *n*  and  *k* .

A factor of an integer  *n*  is defined as an integer  *i*  where  *n % i == 0* .

Consider a list of all factors of  *n*  sorted in **ascending order** , return  *the*  *kth*  *factor*  in this list or return **-1**  if  *n*  has less than  *k*  factors.



**Example 1:** 

```
Input: n = 12, k = 3
Output: 3
Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.

```

**Example 2:** 

```
Input: n = 7, k = 2
Output: 7
Explanation: Factors list is [1, 7], the 2nd factor is 7.

```

**Example 3:** 

```
Input: n = 4, k = 4
Output: -1
Explanation: Factors list is [1, 2, 4], there is only 3 factors. We should return -1.

```

**Example 4:** 

```
Input: n = 1, k = 1
Output: 1
Explanation: Factors list is [1], the 1st factor is 1.

```

**Example 5:** 

```
Input: n = 1000, k = 3
Output: 4
Explanation: Factors list is [1, 2, 4, 5, 8, 10, 20, 25, 40, 50, 100, 125, 200, 250, 500, 1000].

```



**Constraints:** 

-  *1 <= k <= n <= 1000* 


# [1492. n 的第 k 个因子][cnTitle]

**中等**

给你两个正整数  *n*  和  *k*  。

如果正整数  *i*  满足  *n % i == 0*  ，那么我们就说正整数  *i*  是整数  *n*  的因子。

考虑整数  *n*  的所有因子，将它们 **升序排列**  。请你返回第  *k*  个因子。如果  *n*  的因子数少于  *k*  ，请你返回 **-1**  。



**示例 1：** 

```
输入：n = 12, k = 3
输出：3
解释：因子列表包括 [1, 2, 3, 4, 6, 12]，第 3 个因子是 3 。

```

**示例 2：** 

```
输入：n = 7, k = 2
输出：7
解释：因子列表包括 [1, 7] ，第 2 个因子是 7 。

```

**示例 3：** 

```
输入：n = 4, k = 4
输出：-1
解释：因子列表包括 [1, 2, 4] ，只有 3 个因子，所以我们应该返回 -1 。

```

**示例 4：** 

```
输入：n = 1, k = 1
输出：1
解释：因子列表包括 [1] ，第 1 个因子为 1 。

```

**示例 5：** 

```
输入：n = 1000, k = 3
输出：4
解释：因子列表包括 [1, 2, 4, 5, 8, 10, 20, 25, 40, 50, 100, 125, 200, 250, 500, 1000] 。

```



**提示：** 

-  *1 <= k <= n <= 1000* 




# 算法思路

# 测试用例
```
1492. The kth Factor of n 1492. n 的第 k 个因子 Medium
```

[enTitle]: https://leetcode.com/problems/the-kth-factor-of-n/
[cnTitle]: https://leetcode-cn.com/problems/the-kth-factor-of-n/
