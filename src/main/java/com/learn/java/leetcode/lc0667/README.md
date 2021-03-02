# [667. Beautiful Arrangement II][enTitle]

**Medium**

Given two integers  *n*  and  *k* , you need to construct a list which contains  *n*  different positive integers ranging from  *1*  to  *n*  and obeys the following requirement:  Suppose this list is [a<sub>1</sub>, a<sub>2</sub>, a<sub>3</sub>, ... , a<sub>n</sub>], then the list [|a<sub>1</sub> - a<sub>2</sub>|, |a<sub>2</sub> - a<sub>3</sub>|, |a<sub>3</sub> - a<sub>4</sub>|, ... , |a<sub>n-1</sub> - a<sub>n</sub>|] has exactly  *k*  distinct integers.

If there are multiple answers, print any of them.

Example 1:

```
Input: n = 3, k = 1
Output: [1, 2, 3]
Explanation: The [1, 2, 3] has three different positive integers ranging from 1 to 3, and the [1, 1] has exactly 1 distinct integer: 1.

```



Example 2:

```
Input: n = 3, k = 2
Output: [1, 3, 2]
Explanation: The [1, 3, 2] has three different positive integers ranging from 1 to 3, and the [2, 1] has exactly 2 distinct integers: 1 and 2.

```



Note:

1. The  *n*  and  *k*  are in the range 1 <= k < n <= 10<sup>4</sup>.




# [667. 优美的排列 II][cnTitle]

**中等**

给定两个整数  *n*  和  *k* ，你需要实现一个数组，这个数组包含从  *1*  到  *n*  的  *n*  个不同整数，同时满足以下条件：

① 如果这个数组是 [a<sub>1</sub>, a<sub>2</sub>, a<sub>3</sub>, ... , a<sub>n</sub>] ，那么数组 [|a<sub>1</sub> - a<sub>2</sub>|, |a<sub>2</sub> - a<sub>3</sub>|, |a<sub>3</sub> - a<sub>4</sub>|, ... , |a<sub>n-1</sub> - a<sub>n</sub>|] 中应该有且仅有 k 个不同整数；.

② 如果存在多种答案，你只需实现并返回其中任意一种.

**示例 1:** 

```
输入: n = 3, k = 1
输出: [1, 2, 3]
解释: [1, 2, 3] 包含 3 个范围在 1-3 的不同整数， 并且 [1, 1] 中有且仅有 1 个不同整数 : 1

```



**示例 2:** 

```
输入: n = 3, k = 2
输出: [1, 3, 2]
解释: [1, 3, 2] 包含 3 个范围在 1-3 的不同整数， 并且 [2, 1] 中有且仅有 2 个不同整数: 1 和 2

```



**提示:** 

1.   *n*  和  *k*  满足条件 1 <= k < n <= 10<sup>4</sup>.






# 算法思路

# 测试用例
```
667. Beautiful Arrangement II 667. 优美的排列 II Medium
```

[enTitle]: https://leetcode.com/problems/beautiful-arrangement-ii/
[cnTitle]: https://leetcode-cn.com/problems/beautiful-arrangement-ii/
